public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));


    }

    private static boolean isCatPlaying(boolean isSummer, int temperature){
        if(temperature >= 25 && temperature <= 45){
            return true;
        }else if(temperature >= 25 && temperature <= 35){
            return true;
        }else{
            return false;
        }
    }





}
