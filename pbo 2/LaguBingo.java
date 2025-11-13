public class LaguBingo {

    // Constructor
    public LaguBingo() {
        cetakLirik();
    }

    private void cetakLirik() {
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        
        // Loop untuk pola BINGO
        for (int i = 0; i < 5; i++) {
            System.out.print("(clap)");
        }
        System.out.println("-N-G-O");

        // Pola kedua
        System.out.println("And Bingo was his name-o.");
        
        // Pola B-I-N
        System.out.println("B-I-N-G-O");
        
        // Pola ketiga
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        
        // Pola (clap)-I-N-G-O
        System.out.print("(clap)");
        System.out.println("-I-N-G-O");

        // Pola keempat
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");

        // Pola (clap)-(clap)-N-G-O
        System.out.print("(clap)(clap)");
        System.out.println("-N-G-O");

        // Pola kelima
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");

        // Pola (clap)(clap)(clap)-G-O
        System.out.print("(clap)(clap)(clap)");
        System.out.println("-G-O");

        // Pola keenam
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");

        // Pola (clap)(clap)(clap)(clap)-O
        System.out.print("(clap)(clap)(clap)(clap)");
        System.out.println("-O");
        
        // Pola terakhir
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        System.out.print("(clap)(clap)(clap)(clap)(clap)");
        System.out.println(""); // Baris kosong
        System.out.println("And Bingo was his name-o.");
    }

    public static void main(String[] args) {
        // Membuat objek (instance) otomatis akan menjalankan constructor dan mencetak lirik
        LaguBingo lirik = new LaguBingo(); 
    }
}