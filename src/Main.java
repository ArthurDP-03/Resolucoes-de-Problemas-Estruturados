public class Main {

    public static void main(String[] args) {

//        ArrayList<String> lista = new ArrayList<>(5);
//
//        lista.add("Ana"); // Teste ADD
//        lista.add("Bia");
//        lista.add("Caio");
//        System.out.println("Lista após add = " + lista);
//
//        lista.add(1, "Maria"); // Teste ADD com ÍNDICE
//        System.out.println("\nApós add(1, Maria) = " + lista);
//
//        System.out.println("\nget(2) = " + lista.get(2)); // teste GET
//
//        lista.set(2, "Pedro"); // teste SET
//        System.out.println("\nApós set(2, Pedro) = " + lista);
//
//        System.out.println("\ncontains(\"Ana\") = " + lista.contains("Ana")); // teste CONTAINS
//        System.out.println("indexOf(\"Maria\") = " + lista.indexOf("Maria")); // teste INDEXOF
//
//        lista.remove(1); // teste REMOVE por ÍNDICE
//        System.out.println("\nApós remove(1) = " + lista);
//
//        lista.remove("Pedro"); // teste REMOVE por OBJETO
//        System.out.println("\nApós remove(\"Pedro\") = " + lista);
//
//        String resultado = lista.toString(); // teste TO STRING
//        System.out.println("\nTeste direto do toString = " + resultado);
//
//        System.out.println("\nTeste do toArray = ");
//        Object[] array = lista.toArray(); // teste do TO ARRAY
//        for (Object item : array) {
//            if (item != null) {
//                System.out.println(item);
//            }
//        }

//        Stack<String> stack = new Stack<>();
//
//        stack.push("Ana"); // teste PUSH
//        stack.push("Bia");
//        stack.push("Caio");
//
//        System.out.println("\nStack: " + stack);
//
//        System.out.println("\nTopo: " + stack.top()); // teste TOP
//
//        System.out.println("\nPop: " + stack.pop()); // teste POP
//        System.out.println("\nApós pop: " + stack);
//
//        System.out.println("\nTamanho: " + stack.size()); // teste SIZE
//
//        System.out.println("\nEstá vazia? " + stack.isEmpty()); // teste IS EMPTY
//
//        System.out.println("\nArray:");
//        Object[] arr = stack.toArray();// teste TO ARRAY
//        for (Object o : arr) {
//            System.out.println(o);
//        }
//
//        stack.clear(); // teste CLEAR
//        System.out.println("\nApós clear: " + stack);

        Queue<Integer> fila = new Queue<>();

        // 🔹 Teste isEmpty
        System.out.println("Fila está vazia? " + fila.isEmpty());

        // 🔹 Teste enqueue
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        System.out.println("Fila após enqueue: " + fila);

        // 🔹 Teste size
        System.out.println("Tamanho da fila: " + fila.size());

        // 🔹 Teste front
        System.out.println("Primeiro elemento (front): " + fila.front());

        // 🔹 Teste toArray
        Object[] array = fila.toArray();
        System.out.print("Fila em array: ");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();

        // 🔹 Teste dequeue
        System.out.println("Removido (dequeue): " + fila.dequeue());
        System.out.println("Fila após dequeue: " + fila);

        System.out.println("Removido (dequeue): " + fila.dequeue());
        System.out.println("Fila após dequeue: " + fila);

        // 🔹 Teste front novamente
        System.out.println("Novo front: " + fila.front());

        // 🔹 Teste clear
        fila.clear();
        System.out.println("Fila após clear: " + fila);

        // 🔹 Teste isEmpty novamente
        System.out.println("Fila está vazia? " + fila.isEmpty());

        // 🔹 Teste erro (opcional)
        try {
            fila.dequeue();
        } catch (RuntimeException e) {
            System.out.println("Erro ao remover: " + e.getMessage());
        }
    }
}