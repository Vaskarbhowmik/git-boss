package localinstancestaticclass16;

public class moreexample3 {

        int sumArray(int [] arr){
            int sum=0;
            for(int num:arr){
                sum=sum+num;
            }
            return sum;
        }

        public static void main(String[] args) {
            moreexample3 task1=new moreexample3();
            int result=task1.sumArray(new int []{10,10,10});
            System.out.println(result);
        }
}
