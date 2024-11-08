public class Encapsulation{

    public static void main(String[] args){

        System.out.println("STUDENT:");
        Student s1 = new Student();
        s1.setId(14074);
        s1.setName("Tine");

        System.out.println("ID: " + s1.getId());
        System.out.println("Name: " + s1.getName());
        System.out.println();

        System.out.println("BOOK:");
        Book b1 = new Book();
        b1.setAuthor("MColeen Hoover");
        b1.setBookNumber(236);
        b1.setPrice(500.00);
        b1.setTitle("IT ENDS WITH US");

        System.out.println("BookNumber: " + b1.getBookNumber());
        System.out.println("Author: " + b1.getAuthor());
        System.out.println("Title: " + b1.getTitle());
        System.out.println("Price: " + b1.getPrice());
    }

}

class Student{
    private int Student_id;
    private String Name;

    public void setId(int s_id){
        this.Student_id = s_id;
    }

    public void setName(String s_name){
        this.Name = s_name;
    }

    public String getName(){
        return this.Name;
    }

    public Integer getId(){
        return this.Student_id;
    }
}


class Book{
    private Integer book_number;
    private String title, author;
    private Double price;

    public void setBookNumber(Integer bookNum){
        this.book_number = bookNum;
    }

    public void setTitle(String Title){
        this.title = Title;
    }

    public void setAuthor(String Author){
        this.author = Author;
    }

    public void setPrice(Double Price){
        this.price = Price;
    }

    public Integer getBookNumber(){
        return this.book_number;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public Double getPrice(){
        return this.price;
    }
}