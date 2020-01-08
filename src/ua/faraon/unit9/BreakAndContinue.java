package ua.faraon.unit9;

public class BreakAndContinue {
    public static void main(String[] args) {
        /*int i = 0;
        while(true){
            if(i==15){
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("out with loop");   */
        for(int i = 0;i<=15;i++){
            if(i%2==0){
                continue;
            }
            System.out.println("this is odd number "+i);
        }
    }
}
