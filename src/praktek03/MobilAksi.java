package praktek03;
public class MobilAksi {
    public static void main(String[] args) {
        Mobil m = new Mobil();

        m.setMerk("Ferari");
        m.setWarna("Hitam");
        m.setHarga(6500000);
        
        m.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(m.getMerk());
        System.out.print("Warnanya \t: ");
        System.out.println(m.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(m.getHarga());
    }
}
