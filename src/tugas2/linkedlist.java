package tugas2;
import java.util.LinkedList;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> nama = new LinkedList<>();
        nama.add("K");
        nama.add("H");
        nama.add("A");
        nama.add("I");
        nama.add("R");
        nama.add("U");
        nama.add("N");
        nama.add("N");
        nama.add("I");
        nama.add("S");
        nama.add("A");
        nama.add(" ");
        nama.add("S");
        nama.add("A");
        nama.add("L");
        nama.add("S");
        nama.add("A");
        nama.add("B");
        nama.add("I");
        nama.add("L");
        nama.add("A");

        System.err.println("\nDiketahui Nama Lengkap : ");
        System.out.println(nama+", Ukuran : " +nama.size());

        //1. add karakter lain yang anda inginkan

        nama.addFirst(" ");
        nama.addFirst("M");
        nama.addFirst("I");
        nama.addLast(" ");
        nama.addLast("H");
        nama.addLast("E");
        nama.addLast("L");
        nama.addLast("L");
        nama.addLast("O");

        System.err.println("\nOutput Tambah :");
        System.out.println(nama+", Ukuran : " +nama.size());

        //2. sisipkan karakter lain yang anda inginkan

        nama.set(15, "N");
        nama.set(16, " ");
        nama.set(17, "Y");
        nama.set(18, "O");
        nama.set(19, "U");
        nama.set(20, "R");
        nama.set(21, " ");
        nama.set(22, "N");
        nama.set(23, "A");
        nama.set(24, "M");
        nama.set(25, "E");
        nama.set(26, " ");
        nama.set(27, "I");
        nama.set(28, "S");
        nama.set(29, "?");

        System.err.println("\nOutput Sisip :");
        System.out.println(nama+", Ukuran : " +nama.size());

        //3. hapus beberapa karaker yang ingin anda hapus

        nama.remove(0);
        nama.remove(0);
        nama.remove(0);
        nama.remove(5);
        nama.remove(5);
        nama.remove(5);
        nama.remove(5);
        nama.remove(5);
        nama.remove(5);
        nama.remove(5);
        nama.remove(5);
        nama.remove(5);
        nama.remove(5);
        nama.remove(5);
        nama.remove(5);
        nama.remove(5);
        nama.remove(5);
        nama.remove(5);
        nama.remove(5);
        nama.remove(5);
        nama.remove(5);
        nama.remove(5);
        nama.remove(5);
        nama.remove(5);
        nama.remove(5);
      
        System.err.println("\nOutput Hapus :");
        System.out.println(nama+", Ukuran : " +nama.size());

        //4. buat fungsi POP dan PUSH pada project anda

        nama.pop();
        System.out.println("\nOutput Fungsi POP :");
        System.out.println(nama+", Ukuran : " +nama.size());
        System.out.println("");

        nama.push("C");
        System.out.println("Output Fungsi PUSH :");
        System.out.println(nama+", Ukuran : " +nama.size());
        System.out.println("");

    }
}
