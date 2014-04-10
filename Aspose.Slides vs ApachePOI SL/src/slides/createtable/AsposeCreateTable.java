package slides.createtable;

import com.aspose.slides.CellEx;
import com.aspose.slides.FillTypeEx;
import com.aspose.slides.PresentationEx;
import com.aspose.slides.RowEx;
import com.aspose.slides.SlideEx;
import com.aspose.slides.TableEx;

public class AsposeCreateTable
{
	public static void main(String[] args)
	{
		//Instantiate PresentationEx class that represents PPTX file
		PresentationEx pres = new PresentationEx();
		
		//Access first slide
		SlideEx sld = pres.getSlides().get_Item(0);
		
		//Define columns with widths and rows with heights
		double[] dblCols = { 50,50,50 };
		double[] dblRows = { 50,30,30,30,30 };
		
		//Add table shape to slide
		int idx = sld.getShapes().addTable(100, 50, dblCols, dblRows);
		TableEx tbl = (TableEx)sld.getShapes().get_Item(idx);
		
		RowEx row=null;
		CellEx cell=null;
		//Set border format for each cell
		for ( int i=0;i< tbl.getRows().getCount();i++ )
		{
		    row=tbl.getRows().get_Item(i);
		
		    for (int j=0;j< row.size();j++)
		    {
		        cell=row.get_Item(j);
		        cell.getBorderTop().getFillFormat().setFillType ( FillTypeEx.Solid);
		        cell.getBorderTop().getFillFormat().getSolidFillColor().setColor(java.awt. Color.red);
		        cell.getBorderTop().setWidth(5);
		
		        cell.getBorderBottom().getFillFormat().setFillType( FillTypeEx.Solid);
		        cell.getBorderBottom().getFillFormat().getSolidFillColor().setColor( java.awt.Color.red);
		        cell.getBorderBottom().setWidth (5);
		
		        cell.getBorderLeft().getFillFormat().setFillType(FillTypeEx.Solid);
		        cell.getBorderLeft().getFillFormat().getSolidFillColor().setColor(java.awt.Color.red);
		        cell.getBorderLeft().setWidth( 5);
		
		        cell.getBorderRight().getFillFormat().setFillType(FillTypeEx.Solid);
		        cell.getBorderRight().getFillFormat().getSolidFillColor().setColor(java.awt.Color.red);
		        cell.getBorderRight().setWidth( 5);
		    }
		}
		//Merge cells 1 & 2 of row 1
		tbl.mergeCells(tbl.get_Item(0, 0), tbl.get_Item(1, 0), false);
		
		//Add text to the merged cell
		tbl.get_Item(0, 0).getTextFrame().setText("Merged Cells");

        //Write PPTX to Disk
        pres.write("data/Table_Aspose.pptx");

        // Status
        System.out.println("Table created successfully.");
	} 
}
