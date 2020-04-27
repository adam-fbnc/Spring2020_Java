package Day19_Arrays;

public class Arrays_Intro {
    public static void main(String[] args) {
        String myFriends[]={"Sam","Mike","Mehmet","Natalya","Madina","Dovran","Yucel"};
        String[] emails={"sam@yahoo", "mike@mail.com","mehmet@gmail.com","natalya@it.it","madina@aol.com","dovran@gmail.com","yucel@eposta.com.tr"};


        for(int i=0;i<7;i++){
            if(emails[i].endsWith("@gmail.com")){
            System.out.println(myFriends[i]);
            System.out.println(emails[i]);
            }
        }
    }
}
