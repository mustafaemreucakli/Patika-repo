package Projects;

public class Main {
    public static void main(String[] args) {

        int count = 0;
        for(int number = 2 ;number <= 100 ;number++)
        {
            int control = 0;
            for (int i = 2; i < number; i++)
            {
                if (number % i == 0)
                {
                    control = 1;
                    break;
                }
            }

            if(control==0)
            {
                System.out.print(number + "\n");
                count++;
            }
        }
    }
}