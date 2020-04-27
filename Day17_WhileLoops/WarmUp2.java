package Day17_WhileLoops;

public class WarmUp2 {
    public static void main(String[] args) {
        String result="";
        String piece="";
         for(int i=1; i<31; i++){
             piece=(i%15==0)? "FFINRA" :(i%5==0)? "RA": (i%3==0)? "FIN" : i+"";
             result +=piece;
         }
        System.out.println(result);
    }
}
