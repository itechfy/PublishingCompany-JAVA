
public class Main {

    public static void main(String[] args) {
      PublicationCompany pc = new PublicationCompany("Riphah","i-14 Haji Camp",10); // name,address,total publications
      Book b = new Book(61); // throws exception here
      Book b2 = new Book(60);
      CD c1 = new CD(101); // throws Exception here
      CD c2 = new CD(100);
      Publication p1 = new Publication("CSS",550); // title,price
      p1.AddBook(b2);
      p1.AddCD(c2);
      pc.AddPublication(p1); // store publication in company;
      System.out.println(p1); //overloading toString data display
      System.out.println(pc);
    }
    
}
