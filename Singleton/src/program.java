public class program {
    public class Main {
        public static void main(String[] args) {
            Singleton singleton1 = Singleton.getInstance();
            Singleton singleton2 = Singleton.getInstance();
            
            // Ambos os objetos apontam para a mesma instância
            System.out.println(singleton1 == singleton2); // Deve imprimir true
            
            singleton1.doSomething();
        }
    }
}
