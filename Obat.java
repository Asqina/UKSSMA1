public class Obat extends Barang{
        String Exp, jenis;  //jenis = bool?

        public Obat(int id, int jumlah, String nama, String exp, String jenis) {
            super(id, jumlah, nama);
            Exp = exp;
            this.jenis = jenis;
        }

        @Override
        String updateBarang() {
            super.updateBarang();
            System.out.println("jsdfhks" + this.Exp);
            return null;
        }
    }

