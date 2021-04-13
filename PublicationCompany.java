
public class PublicationCompany {
    private 
            String name;
            String address;
            int counter;
            Publication p[];
    public
            PublicationCompany(){
            name = "";
            address = "";
            p=null;
            counter = -1;
            }
            PublicationCompany(String n,String a,int size){
            name = n;
            address = a;
            p = new Publication[size];
            }
            void AddPublication(Publication pub){
            if(counter<p.length){
                counter++;
                p[counter]=pub;
            }
          }
             @Override
            public String toString() {
            return String.format(name+" "+address);
            }
}