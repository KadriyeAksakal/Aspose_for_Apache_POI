package slides.addslides;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class AsposeAddSlides
{
	public static void main(String[] args) throws Exception
	{
		//Instantiate a PresentationEx object that represents a PPTX file
		Presentation pres = new Presentation("data/presentation.pptx");
		
	    //Add the title slide
	    ISlide slide = pres.getSlides().addEmptySlide(pres.getLayoutSlides().get_Item(0));
		
		//Save the presentation
		pres.save("data/SlidesAdded_Aspose.pptx", SaveFormat.Pptx);
		
		System.out.println("Slide Added and Saved.");
	}
}
