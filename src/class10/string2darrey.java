package class10;

public class string2darrey {
    public static void main(String[] args) {
        String[][] names2darrey = {
                {"alo", "begun", "peyaj", "donia", "morich"},
                {"potol", "sutki", "doi", "misti"}
        };

        for(String[] name1darr:names2darrey){
            for(String name:name1darr){                //enhanced loop//
                System.out.print(name+"   ");
            }
        }
    }
}