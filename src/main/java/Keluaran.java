import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Keluaran {
    
public Keluaran(String nama, String nim, String jk, String agama,String hobi ){
        JFrame frame = new JFrame("Java Swing");
        JLabel lawal = new JLabel(" Data Anda:");
        JLabel lnama = new JLabel(" Nama Lengkap ");
        JLabel dnama = new JLabel(nama);
        JLabel lnim = new JLabel(" NIM ");
        JLabel dnim = new JLabel(nim);
        JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");
        JLabel djeniskelamin = new JLabel(jk);
        JLabel lagama = new JLabel(" Agama ");
        JLabel dagama = new JLabel(agama);
        JLabel lhobby = new JLabel(" Hobi ");
        JLabel dhobby = new JLabel(hobi);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200); //Ukuran jendelatampilan
        frame.setVisible(true);//kode agar tampilan jendela aplikasi transparan atau tidak
        
        frame.setLayout(null);
        frame.add(lawal);
        frame.add(lnama);
        frame.add(dnama);
        frame.add(lnim);
        frame.add(dnim);
        frame.add(ljeniskelamin);
        frame.add(djeniskelamin);
        frame.add(lagama);
        frame.add(dagama);
        frame.add(lhobby);
        frame.add(dhobby);

        lawal.setBounds(10,2,120,20);
        lnama.setBounds(10, 20, 120, 20);
        dnama.setBounds(130, 20, 150, 20);
        lnim.setBounds(10, 40, 150, 20);
        dnim.setBounds(130, 40, 150, 20);
        ljeniskelamin.setBounds(10, 60, 120, 20);
        djeniskelamin.setBounds(130, 60, 100, 20);
        lagama.setBounds(10, 80, 150, 20);
        dagama.setBounds(130, 80, 150, 20);
        lhobby.setBounds(10, 100, 120, 20);
        dhobby.setBounds(130, 100, 100, 20);
        
    }
}
