package Frames;

import BeanClasses.BookIssueBean;
import BeanClasses.Decoder;
import BeanClasses.StudentBean;
import DBConnections.DatabaseManager;
import QRCode.QrCodeGUI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.Vector;
import javax.swing.ImageIcon;


public class DefaulterListPrint{
    
    Vector v;
    BookIssueBean  bookIssueBean[]; 
    int index=-1;
    
    public DefaulterListPrint(Vector v) throws Exception{
        
        this.v = v;
        
        try{

            Book book= new Book();
                
            PageFormat pageFormat=getPageFormat();
              
    
            int numOfStds=v.size();
            int perPageStds=25;
            int totalPages=numOfStds/perPageStds;
            int lastPageStd=numOfStds%perPageStds;

            for(int i=1;i<=totalPages;i++){
                
                bookIssueBean = new BookIssueBean[perPageStds];
                
                for(int j=0;j<perPageStds;j++){    
                    index++;
                    bookIssueBean[j]=(BookIssueBean)v.elementAt(index);
                }
                
                DocumentText doc=new DocumentText(bookIssueBean);   
                book.append(doc,pageFormat);
            }
            
            
            BookIssueBean bookIssueBean[]=new BookIssueBean[lastPageStd];
            
            for(int j=0;j<lastPageStd;j++){
                index++;
                bookIssueBean[j]=(BookIssueBean)v.elementAt(index);
            }
            
            DocumentText doc=new  DocumentText(bookIssueBean);
            book.append(doc,pageFormat);
             
            PrinterJob printJob=PrinterJob.getPrinterJob();
            printJob.setPageable(book);
            
             if(printJob.printDialog())
             printJob.print();
                
            }catch(PrinterException e){
                e.printStackTrace();
        }
    }

private static PageFormat getPageFormat(){
    
            double PIXEL_PER_INCH=72;
            
            double PAPER_WIDTH=10.72*PIXEL_PER_INCH;
            double PAPER_HEIGHT=10.69*PIXEL_PER_INCH;
            
            double LEFT_MARGIN=0.01*PIXEL_PER_INCH;
            double RIGHT_MARGIN=0.01*PIXEL_PER_INCH;
            
            double TOP_MARGIN=0.01*PIXEL_PER_INCH;
            double BOTTOM_MARGIN=0.01*PIXEL_PER_INCH;
            
            Paper paper= new Paper();
            paper.setSize(PAPER_WIDTH, PAPER_HEIGHT);
           
            paper.setImageableArea(LEFT_MARGIN, TOP_MARGIN, (paper.getWidth())- (LEFT_MARGIN + RIGHT_MARGIN),(paper.getHeight())-(TOP_MARGIN +BOTTOM_MARGIN));
 
            
            PageFormat pageFormat=new PageFormat();
            pageFormat.setPaper(paper);
    
            
            pageFormat.setOrientation(PageFormat.PORTRAIT);
               
            return pageFormat; 
    }
    
class DocumentText extends Component implements Printable{
    
    BookIssueBean bookIssueBean[];    
    
    public DocumentText(BookIssueBean[] bookIssueBean){
        this.bookIssueBean = bookIssueBean;
    }
        public DocumentText(){
            
        }
        
        
        @Override
        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
            
            try{
                
                Graphics2D g2d= (Graphics2D)graphics;
                g2d.translate(pageFormat.getImageableX(),pageFormat.getImageableY());
                g2d.setPaint(Color.BLACK);
                g2d.setColor(Color.BLACK);
                
           
                Font f=new Font("Arial",Font.BOLD,10);
                graphics.setFont(f);
                
                graphics.drawString("DEFAULTER LIST", 216, 20);
                g2d.drawLine(0, 36, 616, 36);
				
			
                Font f2=new Font("Arial",Font.BOLD,8);
                graphics.setFont(f2);
                
                int x=40;
                int z=5;

                
                graphics.drawString("S.No", 6, 46+z);
                graphics.drawString("Q.R", 10+x, 46+z);
                graphics.drawString("ROLL NO", 60+x, 46+z);
                graphics.drawString("NAME", 140+x, 46+z);
                graphics.drawString("F.NAME", 220+x, 46+z);
                graphics.drawString("SURNAME", 300+x, 46+z);
                graphics.drawString("Date Of Issue", 370+x, 46+z);
                graphics.drawString("Book Tittle", 450+x, 46+z);
                graphics.drawString("Author", 520+x, 46+z);
                
                int y=77;
                int y2 = 65;
                graphics.drawLine(0, 66, 616, 66);
		System.out.println(bookIssueBean.length);
                for(int i=0; i<bookIssueBean.length; i++){
                                
                    if(bookIssueBean == null)
                        break;
                  
                    ImageIcon icon = QrCodeGUI.createQRImage(bookIssueBean[i].getStudentName());
                    Image img = icon.getImage();
                
                    graphics.drawString(""+(bookIssueBean[i].getCount()), 6, y+z);
                    graphics.drawImage(img, 10+x, y2+z, this);
                    graphics.drawString(bookIssueBean[i].getRollNo(), 60+x, y+z);
                    graphics.drawString(bookIssueBean[i].getStudentName(), 140+x, y+z);
                    graphics.drawString(bookIssueBean[i].getFatherName(), 220+x, y+z);
                    graphics.drawString(bookIssueBean[i].getStudentName(), 300+x, y+z);
                    graphics.drawString(Decoder.getDateFormat(bookIssueBean[i].getDateOfIssue()), 370+x, y+z);
                    graphics.drawString(bookIssueBean[i].getBookName(), 450+x, y+z);
                    graphics.drawString(bookIssueBean[i].getAuthor(), 520+x, y+z);
                    
                    y+=29;
                    y2+=27;
                } 
           
            }catch(Exception e){
              e.printStackTrace();
            }
            return PAGE_EXISTS;
        }// print Method       
    }// Documents Class


	
}// Main Class    

