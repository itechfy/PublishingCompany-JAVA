
public class Book{
    private int TotalPages;
    public 
       Book(){
       TotalPages=0;
    }
       Book(int p){
       try{   
           if(p>-1&&p<101){
               TotalPages=p;
           }
           else{
               throw new OversizedExcetion();  
           }
       }
       catch(OversizedExcetion e){
        System.out.println("Book Oversized!");
       } 
       }
       int getPages(){
       return TotalPages;
       }
}
