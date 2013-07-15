package test;

import java.awt.print.PrinterJob;

import javax.swing.JFrame;

public class PageDialogVeiwer implements Veiwer
{
	@Override
	public void view( JFrame frame )
	{
		PrinterJob printerJob = PrinterJob.getPrinterJob();
		printerJob.pageDialog( printerJob.defaultPage() );
	}

	@Override
	public String getTitle()
	{		
		return "Page Dialog";
	}
}
