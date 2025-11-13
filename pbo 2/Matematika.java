public class Matematika implements OperasiMatematika {

    @Override
    public int pertambahan(int a, int b) {
        return a + b;
    }

    @Override
    public int pengurangan(int a, int b) {
        return a - b;
    }

    @Override
    public int perkalian(int a, int b) {
        return a * b;
    }

    @Override
    public int pembagian(int a, int b) {
        // Karena input dan output int, kita menggunakan integer division
        return a / b; 
    }
}