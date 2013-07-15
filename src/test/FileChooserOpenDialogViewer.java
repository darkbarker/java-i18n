package test;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileChooserOpenDialogViewer implements Veiwer 
{
	@Override
	public void view( JFrame frame )
	{
		JFileChooser f = new JFileChooser();
		f.showOpenDialog( frame );
	}

	@Override
	public String getTitle()
	{
		return "FileChooser Open";
	}
}
