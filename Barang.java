public class Barang {
    int id, jumlah;
    String nama;

    public Barang(){

    }
    public Barang(int id, int jumlah, String nama) {
        this.id = id;
        this.jumlah = jumlah;
        this.nama = nama;
    }

    String updateBarang(){
        System.out.println("ID barang   : " + this.id);
        System.out.println("Nama        : " + this.nama);
        System.out.println("Stok barang : " + this.jumlah);
        return null;
    }
}
