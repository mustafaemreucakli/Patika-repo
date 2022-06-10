package Projects;

public class Main {

    static boolean isFind(int []arr,int value){

        for (int i: arr){
            if (i==value){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        int [] list = {3,5,6,1,2,4,6,3,6,6,2,8,8};
        int [] evennumber = new int[list.length];
        int start=0;

        for (int i = 0;i< list.length;i++){

            for (int j= 0 ;j<list.length;j++){

                if ((i != j) && (list[i] == list[j])) {
                    if(!isFind(evennumber,list[i])){
                        evennumber[start++] = list[i];
                        break;
                    }
                }
            }
        }
        for (int value: evennumber) {
            if ((value!= 0) && (value%2!=1)) {
                System.out.println(value);
            }
        }

    }
}