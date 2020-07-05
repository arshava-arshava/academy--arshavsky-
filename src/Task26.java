public class Task26 {
    public static void main(String[] args){
        int mult = 1;
        for(int i = 10; i<=99; i++){
            if(i%2!=0 && i%13 ==0){
                mult = mult*i;
            }
        }
        System.out.println(mult);
    }
}
