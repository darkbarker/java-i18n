package test;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPaneViewer implements Veiwer
{
	@Override
	public void view( JFrame rootframe )
	{
		JOptionPane.showConfirmDialog(rootframe, "ConfirmDialog");
		JOptionPane.showConfirmDialog(rootframe, "ConfirmDialog", "ConfirmDialog", JOptionPane.YES_NO_CANCEL_OPTION );
		JOptionPane.showConfirmDialog(rootframe, "ConfirmDialog", "ConfirmDialog", JOptionPane.OK_CANCEL_OPTION );
		JOptionPane.showInputDialog("InputDialog");
		JOptionPane.showMessageDialog(rootframe, "MessageDialog");
	}

	@Override
	public String getTitle()
	{
		return "OptionPane";
	}
}
