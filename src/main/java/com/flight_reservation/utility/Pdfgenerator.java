package com.flight_reservation.utility;

import java.io.File;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Pdfgenerator {

	 private static final String FILE_NAME = "C:\\stsversion4.17\\flight_reservation_app\\pdfdoc\\sample1.pdf";


	    public  void writeUsingIText() {

	        Document document = new Document();

	        try {

	            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));

	            //open
	            document.open();

	            PdfPTable pdfPTable = new PdfPTable(4);
	            
	            //Create cells
	            PdfPCell pdfPCell1 = new PdfPCell(new Paragraph("ticket1"));
	            PdfPCell pdfPCell2 = new PdfPCell(new Paragraph("ticket2"));
	            PdfPCell pdfPCell3 = new PdfPCell(new Paragraph("ticket3"));
	            PdfPCell pdfPCell4 = new PdfPCell(new Paragraph("ticket4"));
	            PdfPCell pdfPCell5 = new PdfPCell(new Paragraph("ticket1"));
	            PdfPCell pdfPCell6 = new PdfPCell(new Paragraph("ticket2"));
	            PdfPCell pdfPCell7 = new PdfPCell(new Paragraph("ticket3"));
	            PdfPCell pdfPCell8 = new PdfPCell(new Paragraph("ticket4"));
	     
	            //Add cells to table
	            pdfPTable.addCell(pdfPCell1);
	            pdfPTable.addCell(pdfPCell2);
	            pdfPTable.addCell(pdfPCell3);
	            pdfPTable.addCell(pdfPCell4);
	            pdfPTable.addCell(pdfPCell5);
	            pdfPTable.addCell(pdfPCell6);
	            pdfPTable.addCell(pdfPCell7);
	            pdfPTable.addCell(pdfPCell8);
	     
	            //Add content to the document using Table objects.
	            document.add(pdfPTable);
	     
	            //Close document and outputStream.
	            document.close();
	           
	     
	            System.out.println("Pdf created successfully.");
	        } catch (Exception e) {
	    	e.printStackTrace();
	        
	        }
	    }
}