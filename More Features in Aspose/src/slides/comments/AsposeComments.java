package slides.comments;

import com.aspose.slides.Comment;
import com.aspose.slides.CommentAuthor;
import com.aspose.slides.Comments;
import com.aspose.slides.Presentation;
import com.aspose.slides.Slide;

public class AsposeComments
{
	public static void main(String[] args)
	{
        //======================================
        // Adding Slide Comments
        //======================================
		Presentation pres = new Presentation();
		
		//Getting first slide
		Slide slide = pres.getSlides().get_Item(0);
		 
		//Adding Author
		CommentAuthor author = pres.getCommentAuthors().addAuthor("Aspose");
		
		//Position of comments
		java.awt.Point point = new  java.awt.Point(100,100);
		
		java.util.Date date = new java.util.Date();
		
		//Adding Slide comments
		slide.getSlideComments().addComment(author, "MF", "Hello User, this is slide comment", date, point);
		
		//Adding Empty slide
		slide = pres.addEmptySlide();
		
		//Position of comments
		java.awt.Point point2 = new java.awt.Point(500,1400);
		   
		//Adding Slide comments
		slide.getSlideComments().addComment(author,"MF","Hello User, this is second slide comment", date,point2);
		
		Comments comments = slide.getSlideComments();
		
		//Accessing the comment at index 0 for slide 1
		String str = comments.get_Item(0).getText();
		
		pres.write("data/AsposeComments.ppt");
        
        //Print Message
        System.out.println("Comments added successfully.");
        
        
        //======================================
        // Accessing Slide Comments
        //======================================
        
        java.text.DateFormat dateFormat = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        for (int i=1; i<=pres.getSlides().getLastSlidePosition();i++)
        {
        	slide = pres.getSlideByPosition(i);
        	Comments comments1 = slide.getSlideComments();
        	
        	for (int j = 0 ; j < comments1.getCount() ; j++ )
        	{
        		Comment comment = comments1.get_Item(j); 
        		System.out.println("\nSlide :" + Integer.toString(i)+ " has comment: " + comment.getText() + " with Author: " + comment.getAuthor().getName()  + "\nPosted on :" + dateFormat.format(comment.getCreatedTime()) + "\n");
        	}
        }
	}
}
