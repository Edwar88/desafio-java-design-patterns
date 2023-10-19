
public class Singleton {
    private static Singleton instance;
    
    // Construtor privado para evitar instâncias externas
    private Singleton() {
        // Inicialização do Singleton
    }

    // Método público para obter a instância Singleton
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Métodos e propriedades da instância Singleton
    public void doSomething() {
        System.out.println("Fazendo algo no Singleton");
    }
}

