package Day19_Arrays;

public class Frequency {
    public static void main(String[] args) {
        String str="ABCDDDEEFGGGHHHHHHHHH";
        String noDup="";
        String result="";

        for(int i=0;i<=str.length()-1;i++){
            if(!noDup.contains((str.charAt(i)+""))){
                noDup+=(str.charAt(i));
            }

        }
        System.out.println(str.length());
        System.out.println(noDup);


        for(int j=0; j<noDup.length();j++){
            int count=0;
            result+=noDup.charAt(j);
            for(int k=0; k<str.length();k++){
                if(noDup.charAt(j)==str.charAt(k)){
                    count++;
                }
            }
            result+=count;
        }
        System.out.println(result);
    }
}
