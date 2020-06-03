/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashraf Habromman
 */
public class Book {
    
    String bookName ;
    String ISBN ;
    String author ;
    String publicationDate ;
    String numberOfPages ;
    String price ;
    
    public Book(String bookName ,String ISBN ,String author ,String publicationDate ,String numberOfPages,String price)
    {
        this.bookName = bookName;
        this.ISBN = ISBN;
        this.author = author ;
        this.publicationDate = publicationDate;
        this.numberOfPages = numberOfPages ;
        this.price = price ;
        
    }
    
    public void setName(String bookName){
        this.bookName=bookName;
    }
    public void setISBN(String iSBN){
        this.ISBN=iSBN;
    }
    public void setAuthor(String author){
        this.author= author;
    }
    public void setPublicationDate(String date){
        this.publicationDate=date;
    }
    public void setNumberOfPages(String number){
        this.numberOfPages = number;
    }
    public void setPrice(String price){
        this.price=price;
    }
    
    @Override
    public String toString(){
      return this.bookName + "," + this.ISBN + "," + this.author + "," + this.publicationDate + "," +
              this.numberOfPages + "," + this.price+"\n";
    }
}
