package class10;

public class boolean2darrey {
    public static void main(String[] args) {
        boolean[][]myboolean={
                {true,false,true,true,false},
                { true,false,false,false,false}
        };
        int counter = 0;
        for(boolean[] arr1:myboolean){
            for(boolean bool:arr1){
                if(bool){
                    counter++;
                }

            }
        }
    }
}
