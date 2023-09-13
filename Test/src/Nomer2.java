import java.util.List;
public class Nomer2 {

    /*
    No 2. Buatlah code program dengan Bahasa Pemograman apa saja untuk menampilkan data
          karyawan tersebut diatas menggunakan sebuah fungsi rekursif.
            Catatan:
            Untuk menghemat waktu, Anda tidak perlu menuliskan lagi data JSON diatas, cukup
            asumsikan bahwa data JSON tersebut diatas telah disimpan dalam sebuah VARIABEL
            dan anda tinggal menggunakannya saja untuk ditampilkan.
     */

    private String nama;
    private String jabatan;
    private List<Nomer2> karyawan;
    public Nomer2(String nama, String jabatan, List<Nomer2> karyawan) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.karyawan = karyawan;
    }
    public String getNama() {
        return nama;
    }
    public String getJabatan() {
        return jabatan;
    }
    public List<Nomer2> getKaryawan() {
        return karyawan;
    }
    public static void displayEmployeeDetails(Nomer2 employee) {
        System.out.println("[");
        System.out.println("{");
        System.out.println("Nama: " + employee.getNama());
        System.out.println("jabatan: " + employee.getJabatan());

        if (employee.getKaryawan().size() > 0) {
            System.out.println("  \"Karyawan\": [");
            for (Nomer2 subordinate : employee.getKaryawan()) {
                displayEmployeeDetails(subordinate);
            }

            System.out.println("}");
            System.out.println("]");
        }
    }
    public static void main(String[] args) {
        Nomer2 CEO = new Nomer2("Agus Sasmito", "Direktur Utama", List.of(
                new Nomer2("Sutejo Adi", "Direktur Keuangan", List.of(
                        new Nomer2("Alvin", "Akuntan", List.of())

                )),
                new Nomer2("Maman Supeno", "Direktur Operasional", List.of(
                        new Nomer2("Bela", "Programmer", List.of())

                ))
        ));
        displayEmployeeDetails(CEO);
        displayEmployeeDetails(CEO);
    }
}