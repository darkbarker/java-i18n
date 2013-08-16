package test;

import java.awt.print.PrinterJob;

import javax.swing.JFrame;

public class PrintDialogVeiwer implements Veiwer
{
	@Override
	public void view( JFrame frame )
	{
		PrinterJob printerJob = PrinterJob.getPrinterJob();
		printerJob.printDialog();
	}

	@Override
	public String getTitle()
	{		
		return "Print Dialog";
	}
}
