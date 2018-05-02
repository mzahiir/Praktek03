package praktek03;

public class MobilBalap extends Mobil {
    private String jenisMobil;
    
    void throttle(){
        System.out.println("Brrruuuumm..... zzz... zzz...");
    }

    public String getJenisMobil() {
        return jenisMobil;
    }

    public void setJenisMobil(String jenisMobil) {
        this.jenisMobil = jenisMobil;
    }
    
    
}
