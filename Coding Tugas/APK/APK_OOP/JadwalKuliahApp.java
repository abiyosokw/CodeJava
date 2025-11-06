package APK.APK_OOP;
import java.util.ArrayList;
import java.util.Scanner;

public class JadwalKuliahApp {
    private static ArrayList<MataKuliah> listJadwal = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    
    public static void tambahJadwal() {
        System.out.print("Nama Mata Kuliah          : ");
        String nama = sc.nextLine();
        System.out.print("Hari                      : ");
        String hari = sc.nextLine();
        System.out.print("Waktu Mulai (ex: 13.00)   : ");
        String waktuMulai = sc.nextLine();
        System.out.print("Waktu Selesai (ex: 13.00) : ");
        String waktuSelesai = sc.nextLine();
        System.out.print("Ruangan                   : ");
        String ruangan = sc.nextLine();
        listJadwal.add(new MataKuliah(nama, hari, waktuMulai, waktuSelesai, ruangan));
        System.out.println("Jadwal berhasil ditambahkan!\n");
    }

    public static void tampilJadwalPerHari() {
        System.out.print("Masukkan hari yang ingin dilihat: ");
        String hariCari = sc.nextLine();
        boolean ada = false;
        System.out.println("\n=== Jadwal Hari " + hariCari + " ===");
        for (MataKuliah mk : listJadwal) {
            if (mk.getHari().equalsIgnoreCase(hariCari)) {
                System.out.println(mk);
                ada = true;
            }
        }
        if (!ada) System.out.println("Tidak ada jadwal pada hari tersebut.\n");
        System.out.println();
    }

    public static void tampilSemuaJadwal() {
        if (listJadwal.isEmpty()) {
            System.out.println("Jadwal masih kosong.\n");
            return;
        }
        System.out.println("===================== Daftar Jadwal =====================");
        for (int i = 0; i < listJadwal.size(); i++) {
            System.out.println((i + 1) + ". " + listJadwal.get(i));
        }
        System.out.println();
    }

    public static void editJadwal() {
    tampilSemuaJadwal();
    if (listJadwal.isEmpty()) return;
    System.out.print("Pilih nomor jadwal yang akan diedit: ");
    int idx = sc.nextInt(); sc.nextLine();
    if (idx < 1 || idx > listJadwal.size()) {
        System.out.println("Nomor tidak valid.\n");
        return;
    }
    MataKuliah mk = listJadwal.get(idx - 1);

    System.out.print("Nama Mata Kuliah (" + mk.toString().split(" \\| ")[0] + "): ");
    String namaBaru = sc.nextLine();
    System.out.print("Hari (" + mk.toString().split(" \\| ")[1] + "): ");
    String hariBaru = sc.nextLine();
    String[] waktu = mk.toString().split(" \\| ")[2].split("-");
    System.out.print("Waktu Mulai (" + waktu[0] + "): ");
    String waktuMulaiBaru = sc.nextLine();
    System.out.print("Waktu Selesai (" + waktu[1] + "): ");
    String waktuSelesaiBaru = sc.nextLine();
    System.out.print("Ruangan (" + mk.toString().split(" \\| ")[3] + "): ");
    String ruanganBaru = sc.nextLine();

    // Update data jika input tidak kosong
    if (!namaBaru.isEmpty()) mk.setNama(namaBaru);
    if (!hariBaru.isEmpty()) mk.setHari(hariBaru);
    if (!waktuMulaiBaru.isEmpty()) mk.setWaktuMulai(waktuMulaiBaru);
    if (!waktuSelesaiBaru.isEmpty()) mk.setWaktuSelesai(waktuSelesaiBaru);
    if (!ruanganBaru.isEmpty()) mk.setRuangan(ruanganBaru);

    System.out.println("Jadwal berhasil diubah!\n");
}

    public static void hapusJadwal() {
        tampilSemuaJadwal();
        if (listJadwal.isEmpty()) return;
        System.out.print("Pilih nomor jadwal yang akan dihapus: ");
        int idx = sc.nextInt(); sc.nextLine();
        if (idx < 1 || idx > listJadwal.size()) {
            System.out.println("Nomor tidak valid.\n");
            return;
        }
        listJadwal.remove(idx - 1);
        System.out.println("Jadwal berhasil dihapus!\n");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("===== Menu Jadwal Mata Kuliah =====");
            System.out.println("1. Tambah Jadwal");
            System.out.println("2. Lihat Jadwal Perhari");
            System.out.println("3. Lihat Semua Jadwal");
            System.out.println("4. Edit Jadwal");
            System.out.println("5. Hapus Jadwal");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt(); sc.nextLine();
            switch (menu) {
                case 1: tambahJadwal(); break;
                case 2: tampilJadwalPerHari(); break;
                case 3: tampilSemuaJadwal(); break;
                case 4: editJadwal(); break;
                case 5: hapusJadwal(); break;
                case 6: System.out.println("Terima kasih!"); return;
                default: System.out.println("Menu tidak valid.\n");
            }
        }
    }
}
