public class Main {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>(5);

        lista.add("Ana");
        lista.add("Bia");
        lista.add("Caio");

        System.out.println("Lista após add =" + lista);

        lista.add(1, "Maria");
        System.out.println("\nApós add(1, Maria) = " + lista);

        System.out.println("\nget(2) = " + lista.get(2));

        lista.set(2, "Pedro");
        System.out.println("\nApós set(2, Pedro) = " + lista);

        System.out.println("\ncontains(\"Ana\") = " + lista.contains("Ana"));
        System.out.println("indexOf(\"Maria\") = " + lista.indexOf("Maria"));

        lista.remove(1);
        System.out.println("\nApós remove(1) = " + lista);

        lista.remove("Pedro");
        System.out.println("\nApós remove(\"Pedro\") = " + lista);

    }
}