package helper;

public class Demohelper {

    public static void pause(){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
