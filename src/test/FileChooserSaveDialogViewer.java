package test;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileChooserSaveDialogViewer implements Veiwer 
{
	@Override
	public void view( JFrame frame )
	{
		JFileChooser f = new JFileChooser();
		f.showSaveDialog( frame );		
	}

	@Override
	public String getTitle()
	{
		return "FileChooser Save";
	}
}
