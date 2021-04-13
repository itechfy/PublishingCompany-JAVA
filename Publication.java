
public class Publication {
    private
            String title;
            int price;
            Book book;
            CD cd;
    public
            Publication(){
            title="";
            price=0;
            book=null;
            cd=null;
            }
            Publication(String t,int p){
            title=t;
            price=p;
            }
            void setTitle(String t){
            title = t;
            }
            void setPrice(int p){
            price = p;
            }
            String getTitle(){
            return title;
            }
            int getPrice(){
            return price;
            }
            
            @Override
            public String toString() {
            return String.format(title + " have price " + price + "\nHave a book of "+book.getPages()+" Pages\n"+"CD Playing time of "+cd.getPlayingTime());
            }
            void AddBook(Book b){
            book = b;
            }
            void AddCD(CD c){
            cd = c;
            }
}
