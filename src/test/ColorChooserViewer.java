package test;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class ColorChooserViewer implements Veiwer
{
	@Override
	public void view( JFrame rootframe )
	{
	    JFrame frame = new JFrame("JColorChooser Popup");
	    JColorChooser colorChooser = new JColorChooser(Color.RED);
	    frame.getContentPane().add(colorChooser, BorderLayout.CENTER);
	    frame.pack();
	    frame.setVisible(true);
	}

	@Override
	public String getTitle()
	{
		return "ColorChooser";
	}
}
