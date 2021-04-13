
public class CD {
    private int playingTime;
    public
            CD(){
            playingTime=0;
            }
            CD(int t){
                try{
            if(t>0&&t<61){
            playingTime=t;
                }
            else{
                throw new OversizedExcetion();
            }
                }
                 catch(OversizedExcetion e){
                System.out.println("CD Oversized by time!");
             } 
             }
            int getPlayingTime(){
            return playingTime;
            }
        
}
