public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, Arthur!");
        StringArrayList b = new StringArrayList(10);

//        b.add(0, "teste");
//        System.out.println(b);
//        b.remove(0);
//        System.out.println(b);


    for(int i = 0; i <= 9; i++){
        b.add(0,"a" + i);
        System.out.println(b + "\n");
    }
        for(int i = 0; i <= 9; i++){
        b.remove(0);
        System.out.println(b + "\n");
    }
    }
}