public class KTP {
    private String nama, telefon;
    private String[] tgl_lhr;

    public KTP(String nama) {
        this.nama = nama;
        this.telefon = "088888888888"; // Telefon default
        this.tgl_lhr = new String[]{"31", "12", "2012"}; // Tanggal lahir default
    }

    public void setTelefon(String telefon) {
        if (TelefonValid(telefon)) {
            this.telefon = telefon;
            System.out.println("Pergantian No Telepon Berhasil");
        } else {
            System.out.println("Nomor Telepon tidak valid");
        }
    }

    public void setTgl_lhr(String[] tgl_lhr) {
        if (TglLhrValid(tgl_lhr)) {
            this.tgl_lhr = tgl_lhr;
            System.out.println("Pergantian Tanggal Lahir Berhasil!");
        } else {
            System.out.println("Tanggal Lahir tidak valid");
        }
    }

    private boolean TelefonValid(String telefon) {
        return telefon.startsWith("0") && (telefon.length() == 12 || telefon.length() == 13);
    }

    private boolean TglLhrValid(String[] tgl_lhr) {
        int tanggal = Integer.parseInt(tgl_lhr[0]);
        int bulan = Integer.parseInt(tgl_lhr[1]);
        int tahun = Integer.parseInt(tgl_lhr[2]);
        if (bulan == 2 && tanggal > 28) {
            return false;
        } else if (tahun < 1900) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "KTP{" +
                "nama='" + nama + '\'' +
                ", telefon='" + telefon + '\'' +
                ", tgl_lhr='" + tgl_lhr[0] + "-" + tgl_lhr[1] + "-" + tgl_lhr[2] + '\'' +
                '}';
    }
}

