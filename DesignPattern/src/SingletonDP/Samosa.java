package SingletonDP;

public class Samosa {
    private static Samosa samosa;
   //Constructor
    private Samosa(){

    }
    public static Samosa getSamosa(){
       if (samosa == null){
           synchronized (Samosa.class){
               if (samosa == null){
                   samosa =  new Samosa();
               }
           }
       }
       return samosa;
    }
}
