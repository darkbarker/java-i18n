package test;

import java.awt.FlowLayout;
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
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Frame extends JFrame
{
	private List<Veiwer> viewers = new ArrayList<Veiwer>();
	
    public void showWindow()
    {    	
        this.getContentPane().setLayout( new FlowLayout() );
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
				//System.out.println( Locale.getDefault() );
				try
				{
					UIManager.setLookAndFeel(UIManager.getLookAndFeel());
				}
				catch( Exception e1 )
				{
					e1.printStackTrace();
				}				
				SwingUtilities.updateComponentTreeUI(Frame.this);
				Frame.this.repaint();				 
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
					Frame.this.setLocale( Locale.getDefault() );
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
