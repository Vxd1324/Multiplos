public class Main {
    public static void main(String[] args) {
        for (int i = 5; i <= 100; i++){
            System.out.println(i);
            if (i % 5 == 0){
                System.out.println("primero "+i);
            }
        }
        for (int i = 5; i <= 100; i=i+5){
            System.out.println("segundo "+i);
        }
    }

}