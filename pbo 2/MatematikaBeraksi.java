public class MatematikaBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari class Matematika
        Matematika mtk = new Matematika();

        System.out.println("===== Hasil Operasi Matematika =====");
        
        // Pertambahan: 20 + 10 = 30
        int hasilTambah = mtk.pertambahan(20, 10);
        System.out.println("Pertambahan : 20 + 10 = " + hasilTambah);

        // Pengurangan: 10 - 5 = 5
        int hasilKurang = mtk.pengurangan(10, 5);
        System.out.println("Pengurangan : 10 - 5 = " + hasilKurang);

        // Perkalian: 10 * 3 = 30
        int hasilKali = mtk.perkalian(10, 3);
        System.out.println("Perkalian   : 10 * 3 = " + hasilKali);

        // Pembagian: 21 / 2 = 10 (Integer division)
        int hasilBagi = mtk.pembagian(21, 2);
        System.out.println("Pembagian   : 21 / 2 = " + hasilBagi);
        
        System.out.println("====================================");
    }
}