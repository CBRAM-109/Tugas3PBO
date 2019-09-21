
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Input {
    

   JFrame frame = new JFrame ("Java Swing"); 
   JLabel lawal = new JLabel("Masukkan data lengkap anda: ");
   
   JTextField fnama = new JTextField(10);
        JLabel lnama = new JLabel(" Nama Lengkap ");
   
   JTextField fnim = new JTextField(10);
        JLabel lnim = new JLabel(" NIM ");
        
   JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");
        JRadioButton rbPria = new JRadioButton(" Laki-Laki ");
        JRadioButton rbWanita = new JRadioButton("perempuan ");
        JRadioButton rbLainnya = new JRadioButton("Lainnya ");

   JLabel lagama = new JLabel(" Agama ");
        String[] namaAgama =
            {"Islam","Kristen","Katolik","Hindu","Budha","Konghuchu"};
        JComboBox cmbAgama = new JComboBox(namaAgama);

   JLabel lhobby = new JLabel(" Hobby ");
   JCheckBox cbSepakbola = new JCheckBox(" Sepakbola ");
   JCheckBox cbBasket = new JCheckBox(" Basket ");
   JCheckBox cbVoli = new JCheckBox(" Voli ");
   JCheckBox cbRenang = new JCheckBox(" Renang ");

   JButton btnSave = new JButton("OK");
    

   public Input () {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //kode agar aplikasi terhenti jika di tutup
        frame.setSize(450, 250); //Ukuran frame dari jendela aplikasi

	ButtonGroup group = new ButtonGroup();
	group.add(rbPria);
	group.add(rbWanita);

	frame.setLayout(null);
        frame.add(lawal);
        frame.add(lnim);
        frame.add(fnim);
	frame.add(lnama);
	frame.add(fnama);
	frame.add(ljeniskelamin);
	frame.add(rbPria);
	frame.add(rbWanita);
        frame.add(rbLainnya);
	frame.add(lagama);
	frame.add(cmbAgama);
	frame.add(lhobby);
	frame.add(cbSepakbola);
	frame.add(cbBasket);
        frame.add(cbVoli);
        frame.add(cbRenang);
	frame.add(btnSave);

       //Titik Koordinat lokasi field dan segala macamnya
        lawal.setBounds(5,5,200,20);
	lnama.setBounds(10,30,120,20);
	fnama.setBounds(130,30,150,20);
        lnim.setBounds(10, 55, 120, 20);
        fnim.setBounds(130, 55, 150, 20);       
	ljeniskelamin.setBounds(10,80,120,20);
	rbPria.setBounds(130,80,100,20);
	rbWanita.setBounds(230,80,100,20);
        rbLainnya.setBounds(330,80,100,20);
	lagama.setBounds(10,100,150,20);
	cmbAgama.setBounds(130,100,150,20);
	lhobby.setBounds(10,125,120,20);
	cbSepakbola.setBounds(130,125,100,20);
	cbBasket.setBounds(230,125,150,20);
        cbVoli.setBounds(130,145,100,20);
        cbRenang.setBounds(230,145,100,20);
	btnSave.setBounds(150,180,120,20);
	
        frame.setVisible(true);

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String nama = fnama.getText(); 
                
                String nim = fnim.getText();
                
                String jenkel = ""; 
                if(rbPria.isSelected()){jenkel = rbPria.getText(); }
                else if(rbWanita.isSelected()){jenkel = rbWanita.getText(); }
                
                String agama = cmbAgama.getSelectedItem().toString();
                
                String hobby = "";
                
             
                if(cbSepakbola.isSelected()){hobby = cbSepakbola.getText(); }
                if(cbBasket.isSelected()){hobby = cbBasket.getText(); }
                if(cbVoli.isSelected()) {hobby = cbVoli.getText(); }
                if(cbRenang.isSelected()) {hobby = cbRenang.getText(); }
                
                
                
                Keluaran output = new Keluaran(nama, nim, jenkel,agama,hobby); 
                frame.dispose(); 
            }
        });

    }
}
