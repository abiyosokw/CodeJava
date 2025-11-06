package APK.APK_OOP;
public class MataKuliah {
    private String nama;
    private String hari;
    private String waktuMulai;
    private String waktuSelesai;
    private String ruangan;

    public MataKuliah(String nama, String hari, String waktuMulai, String waktuSelesai, String ruangan) {
        this.nama = nama;
        this.hari = hari;
        this.waktuMulai = waktuMulai;
        this.waktuSelesai = waktuSelesai;
        this.ruangan = ruangan;
    }

    public void setNama(String nama) { this.nama = nama; }
    public void setHari(String hari) { this.hari = hari; }
    public void setWaktuMulai(String waktuMulai) { this.waktuMulai = waktuMulai; }
    public void setWaktuSelesai(String waktuSelesai) { this.waktuSelesai = waktuSelesai; }
    public void setRuangan(String ruangan) { this.ruangan = ruangan; }

    public String getHari() { return hari; }
    public String toString() {
        return nama + " | " + hari + " | " + waktuMulai + "-" + waktuSelesai + " | " + ruangan;
    }
}

/* UML
+--------------------------------------------+
|               MataKuliah                   | 
+--------------------------------------------+
| - nama: String                             |
| - hari: String                             |
| - waktuMulai: String                       |
| - waktuSelesai: String                     |
| - ruangan: String                          |
+--------------------------------------------+
| + MataKuliah(String, String, String,       |
|   String, String)                          |
| + setNama(String): void                    |
| + setHari(String): void                    |
| + setWaktuMulai(String): void              |
| + setWaktuSelesai(String): void            |
| + setRuangan(String): void                 |
| + toString(): String                       |
+--------------------------------------------+
*/