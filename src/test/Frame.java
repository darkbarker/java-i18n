package test;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Frame extends JFrame
{
	private List<Veiwer> viewers = new ArrayList<Veiwer>();
	
    public void showWindow()
    {    	
        this.getContentPane().setLayout( new GridLayout(0,2) );
        //
        final LookAndFeelInfo[] lafis = UIManager.getInstalledLookAndFeels();
        final JComboBox<LookAndFeelInfo> cbLafs = new JComboBox<LookAndFeelInfo>();
        cbLafs.setRenderer( new LookAndFeelInfoRenderer(cbLafs.getRenderer()) );  
        for( LookAndFeelInfo lafi : lafis)
        {
        	cbLafs.addItem( lafi );
        }
		for( LookAndFeelInfo lafi : lafis) // setSelectedItem
        {
        	if( lafi.getName().equals( UIManager.getLookAndFeel().getName() ))
        	{
        		cbLafs.setSelectedItem( lafi );
        	}
        }
        cbLafs.addActionListener( new ActionListener()
		{			
			@Override
			public void actionPerformed( ActionEvent e )
			{
				try
				{
					UIManager.setLookAndFeel( ((LookAndFeelInfo)cbLafs.getSelectedItem()).getClassName() );
				}
				catch (Exception ex)
				{
					throw new RuntimeException(ex);
				}
				SwingUtilities.updateComponentTreeUI(Frame.this);
				Frame.this.repaint();
				Frame.this.pack();
			}
		});
        this.getContentPane().add( cbLafs );
        //
        Locale[] locales = Locale.getAvailableLocales();
        Arrays.sort( locales, new LocaleComparator() );
        final JComboBox<Locale> cbLocales = new JComboBox<Locale>();
        for( Locale locale : locales)
        {
        	cbLocales.addItem( locale );
        }
        cbLocales.setSelectedItem( Locale.getDefault() );
        cbLocales.addActionListener( new ActionListener()
		{			
			@Override
			public void actionPerformed( ActionEvent e )
			{
				Locale.setDefault( (Locale)(cbLocales.getSelectedItem()) );
				Frame.this.setLocale( Locale.getDefault() );
				JComponent.setDefaultLocale( Locale.getDefault() );
				System.setProperty("user.language", Locale.getDefault().getLanguage());
				System.setProperty("user.country", Locale.getDefault().getCountry());
				System.setProperty("user.variant", Locale.getDefault().getVariant());
				try
				{
					UIManager.setLookAndFeel(UIManager.getLookAndFeel());
				}
				catch( Exception ex )
				{
					throw new RuntimeException(ex);
				}				
				SwingUtilities.updateComponentTreeUI(Frame.this);
				Frame.this.repaint();
				Frame.this.pack();
			}
		});
        this.getContentPane().add( cbLocales );
        //
        for( final Veiwer viewer : viewers )
        {
        	JButton doViewButton = new JButton( viewer.getTitle() );
        	doViewButton.addActionListener( new ActionListener()
			{				
				@Override
				public void actionPerformed( ActionEvent e )
				{
					viewer.view( Frame.this );
				}
			});
        	this.getContentPane().add( doViewButton );
        }
        //
        this.setDefaultCloseOperation( EXIT_ON_CLOSE );
        //
        pack();
        //setSize( 500, 700 );
        //setLocationRelativeTo( null );
        setVisible( true );
    }

	private void addViewer( Veiwer veiwer )
	{
		viewers.add( veiwer );
	}
	
    public static void main( String[] args )
    {
        Frame mf = new Frame();
        mf.addViewer( new PrintDialogVeiwer() );
        mf.addViewer( new PageDialogVeiwer() );
        mf.addViewer( new FileChooserOpenDialogViewer() );
        mf.addViewer( new FileChooserSaveDialogViewer() );
        mf.addViewer( new ColorChooserViewer() );
        mf.addViewer( new OptionPaneViewer() );
        mf.showWindow();
    }
}

class LocaleComparator implements Comparator<Locale>
{
	@Override
	public int compare( Locale o1, Locale o2 )
	{		
		return o1.toString().compareTo( o2.toString() );
	}	
}

class LookAndFeelInfoRenderer
	implements ListCellRenderer<LookAndFeelInfo>
{  
    private final ListCellRenderer<? super LookAndFeelInfo> delegate;

    public LookAndFeelInfoRenderer(ListCellRenderer<? super LookAndFeelInfo> delegate)
    {
        this.delegate = delegate;
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends LookAndFeelInfo> list, LookAndFeelInfo value, int index, boolean isSelected, boolean cellHasFocus)
    {
        Component component = delegate.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        boolean isSystem = UIManager.getSystemLookAndFeelClassName().equals(value.getClassName());
    	boolean isCrossPlatform = UIManager.getCrossPlatformLookAndFeelClassName().equals(value.getClassName());
        if (component instanceof JLabel)
        {
            ((JLabel) component).setText(String.format("%s %s %s", value.getName(), isSystem?"[system]":"", isCrossPlatform?"[crossplatform]":""));
        }
        return component;
    }
}  