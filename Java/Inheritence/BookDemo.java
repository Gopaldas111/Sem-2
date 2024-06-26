public class BookDemo{
    public static void main(String[] args) {
        Book b;
        if("book".equals(args[2])){
            b=new book_publication(args[0],args[1]);
        }
        else if("paper".equals(args[2])){
            b=new paper_publication(args[0],args[1]);
        }
        else{
            System.out.println("Invalid publication type");
            return;
        }
        b.print();
    }
}
