package slides.convert;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class AsposeConverter
{
	public static void main(String[] args)
	{
        // 1. Conversion to PDF using default options.

		//Instantiate a Presentation object that represents a PPT file
		Presentation pres = new Presentation("data/presentation.ppt");
		
		//Saving the presentation to PDF document
		pres.save("data/AsposeConvert.pdf", SaveFormat.Pdf);
		
		//Display result of conversion.
		System.out.println("Conversion to PDF performed successfully with default options!");
        
        // 2. Conversion to PDF using custom options.

        //Instantiate the PdfOptions class
        com.aspose.slides.PdfOptions opts = new com.aspose.slides.PdfOptions();

        //Set JPEG Quality
        opts.setJpegQuality((byte)90);

        //Define behavior for meta files
        opts.setSaveMetafilesAsPng(true);

        //Set Text Compression level
        opts.setTextCompression(com.aspose.slides.PdfTextCompression.Flate);

        //Define the PDF standard
        opts.setCompliance(com.aspose.slides.PdfCompliance.Pdf15);

        //Save the presentation to PDF with specified options
        pres.save("data/AsposeConvert2.pdf", SaveFormat.Pdf,opts);

        //Display result of conversion.
        System.out.println("Conversion to PDF performed successfully with custom options!");
	}
}
