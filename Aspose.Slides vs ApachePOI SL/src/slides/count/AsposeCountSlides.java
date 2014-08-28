package slides.count;

import com.aspose.slides.Presentation;

public class AsposeCountSlides
{
	public static void main(String[] args)
	{
		//Instantiate a PresentationEx object that represents a PPTX file
		Presentation pres = new Presentation("data/presentation.pptx");

		System.out.println("Total Slides in Count: " + pres.getSlides().size());
	}
}
