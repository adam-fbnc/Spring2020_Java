package Day23_Methods;

public class UniqueValues {
    public static void main(String[] args) {
        String[] arr={"A","B","A","C","B"};
        int counter=0;
        for (String each :arr) {
            for(String each2:arr){
                if(each.equals(each2)){
                    counter++;
                }
            }
            if(counter<2){
                System.out.println(each);

            }
            counter=0;
        }
    }
}
