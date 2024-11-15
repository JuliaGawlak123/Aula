
public class Exemplo {
    private static void sayHelloManyTimes(int times){
        for(int i = 0; i< times;i++){
            say();
            sayHello();
        }
    }

    private static void sayHello(){
        System.out.println("Olá mundo");
    }

    private static void say(){
        System.out.println("Julia Linda");
    }
    public static void main(String[] args) {
        sayHelloManyTimes(5);
    }
}
