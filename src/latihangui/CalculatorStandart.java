/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihangui;

/** 
 * 
 * @author Windows 10
 */
public class CalculatorStandart extends javax.swing.JFrame {
String angka="";
double jumlah,angka1,angka2;
int pilih;
    public CalculatorStandart() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        satuperx = new javax.swing.JButton();
        akar = new javax.swing.JButton();
        persen = new javax.swing.JButton();
        ce = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        bagi = new javax.swing.JButton();
        tujuh = new javax.swing.JButton();
        delapan = new javax.swing.JButton();
        sembilan = new javax.swing.JButton();
        kali = new javax.swing.JButton();
        empat = new javax.swing.JButton();
        lima = new javax.swing.JButton();
        enam = new javax.swing.JButton();
        kurang = new javax.swing.JButton();
        satu = new javax.swing.JButton();
        dua = new javax.swing.JButton();
        tiga = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        kuranglebih = new javax.swing.JButton();
        nol = new javax.swing.JButton();
        titik = new javax.swing.JButton();
        samadengan = new javax.swing.JButton();
        display = new javax.swing.JTextField();
        pangkat = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Calculator");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 100, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("STANDARD");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 30, 130, 30);

        satuperx.setBackground(new java.awt.Color(102, 102, 102));
        satuperx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        satuperx.setText("1/x");
        getContentPane().add(satuperx);
        satuperx.setBounds(240, 230, 60, 60);

        akar.setBackground(new java.awt.Color(102, 102, 102));
        akar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        akar.setText("√");
        akar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akarActionPerformed(evt);
            }
        });
        getContentPane().add(akar);
        akar.setBounds(240, 350, 60, 60);

        persen.setBackground(new java.awt.Color(102, 102, 102));
        persen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        persen.setText("%");
        persen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persenActionPerformed(evt);
            }
        });
        getContentPane().add(persen);
        persen.setBounds(240, 170, 60, 60);

        ce.setBackground(new java.awt.Color(102, 102, 102));
        ce.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ce.setText("MOD");
        ce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceActionPerformed(evt);
            }
        });
        getContentPane().add(ce);
        ce.setBounds(0, 170, 60, 60);

        clear.setBackground(new java.awt.Color(102, 102, 102));
        clear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear);
        clear.setBounds(60, 170, 60, 60);

        hapus.setBackground(new java.awt.Color(102, 102, 102));
        hapus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hapus.setText("<||");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus);
        hapus.setBounds(120, 170, 60, 60);

        bagi.setBackground(new java.awt.Color(102, 102, 102));
        bagi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bagi.setText(":");
        bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiActionPerformed(evt);
            }
        });
        getContentPane().add(bagi);
        bagi.setBounds(180, 170, 60, 60);

        tujuh.setBackground(new java.awt.Color(102, 153, 255));
        tujuh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tujuh.setText("7");
        tujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuhActionPerformed(evt);
            }
        });
        getContentPane().add(tujuh);
        tujuh.setBounds(0, 230, 60, 60);

        delapan.setBackground(new java.awt.Color(102, 153, 255));
        delapan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        delapan.setText("8");
        delapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delapanActionPerformed(evt);
            }
        });
        getContentPane().add(delapan);
        delapan.setBounds(60, 230, 60, 60);

        sembilan.setBackground(new java.awt.Color(102, 153, 255));
        sembilan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sembilan.setText("9");
        sembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sembilanActionPerformed(evt);
            }
        });
        getContentPane().add(sembilan);
        sembilan.setBounds(120, 230, 60, 60);

        kali.setBackground(new java.awt.Color(102, 102, 102));
        kali.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kali.setText("X");
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });
        getContentPane().add(kali);
        kali.setBounds(180, 230, 60, 60);

        empat.setBackground(new java.awt.Color(102, 153, 255));
        empat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        empat.setText("4");
        empat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empatActionPerformed(evt);
            }
        });
        getContentPane().add(empat);
        empat.setBounds(0, 290, 60, 60);

        lima.setBackground(new java.awt.Color(102, 153, 255));
        lima.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lima.setText("5");
        lima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limaActionPerformed(evt);
            }
        });
        getContentPane().add(lima);
        lima.setBounds(60, 290, 60, 60);

        enam.setBackground(new java.awt.Color(102, 153, 255));
        enam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enam.setText("6");
        enam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enamActionPerformed(evt);
            }
        });
        getContentPane().add(enam);
        enam.setBounds(120, 290, 60, 60);

        kurang.setBackground(new java.awt.Color(102, 102, 102));
        kurang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kurang.setText("-");
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });
        getContentPane().add(kurang);
        kurang.setBounds(180, 290, 60, 60);

        satu.setBackground(new java.awt.Color(102, 153, 255));
        satu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        satu.setText("1");
        satu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satuActionPerformed(evt);
            }
        });
        getContentPane().add(satu);
        satu.setBounds(0, 350, 60, 60);

        dua.setBackground(new java.awt.Color(102, 153, 255));
        dua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dua.setText("2");
        dua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duaActionPerformed(evt);
            }
        });
        getContentPane().add(dua);
        dua.setBounds(60, 350, 60, 60);

        tiga.setBackground(new java.awt.Color(102, 153, 255));
        tiga.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tiga.setText("3");
        tiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tigaActionPerformed(evt);
            }
        });
        getContentPane().add(tiga);
        tiga.setBounds(120, 350, 60, 60);

        tambah.setBackground(new java.awt.Color(102, 102, 102));
        tambah.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tambah.setText("+");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        getContentPane().add(tambah);
        tambah.setBounds(180, 350, 60, 60);

        kuranglebih.setBackground(new java.awt.Color(102, 102, 102));
        kuranglebih.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kuranglebih.setText("±");
        kuranglebih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kuranglebihActionPerformed(evt);
            }
        });
        getContentPane().add(kuranglebih);
        kuranglebih.setBounds(90, 410, 60, 60);

        nol.setBackground(new java.awt.Color(102, 153, 255));
        nol.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nol.setText("0");
        nol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nolActionPerformed(evt);
            }
        });
        getContentPane().add(nol);
        nol.setBounds(0, 410, 90, 60);

        titik.setBackground(new java.awt.Color(102, 102, 102));
        titik.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titik.setText(",");
        titik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titikActionPerformed(evt);
            }
        });
        getContentPane().add(titik);
        titik.setBounds(150, 410, 60, 60);

        samadengan.setBackground(new java.awt.Color(102, 102, 102));
        samadengan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        samadengan.setText("=");
        samadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samadenganActionPerformed(evt);
            }
        });
        getContentPane().add(samadengan);
        samadengan.setBounds(210, 410, 90, 60);

        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        getContentPane().add(display);
        display.setBounds(-1, 60, 300, 70);

        pangkat.setBackground(new java.awt.Color(102, 102, 102));
        pangkat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pangkat.setText("x²");
        pangkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pangkatActionPerformed(evt);
            }
        });
        getContentPane().add(pangkat);
        pangkat.setBounds(240, 290, 60, 60);

        jButton2.setText("MC");
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 140, 60, 30);

        jButton3.setText("MR");
        getContentPane().add(jButton3);
        jButton3.setBounds(60, 140, 60, 30);

        jButton8.setText("M+");
        getContentPane().add(jButton8);
        jButton8.setBounds(120, 140, 60, 30);

        jButton13.setText("M-");
        getContentPane().add(jButton13);
        jButton13.setBounds(180, 140, 60, 30);

        jButton18.setText("MS");
        getContentPane().add(jButton18);
        jButton18.setBounds(240, 140, 60, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/latihangui/Windows_10_Art_Logo_3840x2160.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-6, 0, 310, 470);

        setSize(new java.awt.Dimension(316, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        display.setText("-");
        angka="";
        pilih=2;
    }//GEN-LAST:event_kurangActionPerformed

    private void persenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persenActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        jumlah=angka1 *1/100;
        angka = Double.toString(jumlah);
        display.setText(angka);
    }//GEN-LAST:event_persenActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        display.setText("+");
        angka="";
        pilih=1;
    }//GEN-LAST:event_tambahActionPerformed

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        display.setText("*");
        angka="";
        pilih=3;
    }//GEN-LAST:event_kaliActionPerformed

    private void bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        display.setText("/");
        angka="";
        pilih=4;
    }//GEN-LAST:event_bagiActionPerformed

    private void samadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samadenganActionPerformed
        // TODO add your handling code here:
        switch(pilih){
        case 1:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 + angka2;
            angka = Double.toString(jumlah);
            display.setText(angka);
            break;
        case 2:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 - angka2;
            angka = Double.toString(jumlah);
            display.setText(angka);
            break;
        case 3:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 * angka2;
            angka = Double.toString(jumlah);
            display.setText(angka);
            break;
        case 4:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 / angka2;
            angka = Double.toString(jumlah);
            display.setText(angka);
            break;
            default:
            break;
} 
    }//GEN-LAST:event_samadenganActionPerformed

    private void satuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satuActionPerformed
        // TODO add your handling code here:
        angka += "1";
        display.setText(angka);
    }//GEN-LAST:event_satuActionPerformed

    private void duaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duaActionPerformed
        // TODO add your handling code here:
        angka += "2";
        display.setText(angka);
    }//GEN-LAST:event_duaActionPerformed

    private void tigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tigaActionPerformed
        // TODO add your handling code here:
        angka += "3";
        display.setText(angka);
    }//GEN-LAST:event_tigaActionPerformed

    private void empatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empatActionPerformed
        // TODO add your handling code here:
        angka += "4";
        display.setText(angka);
    }//GEN-LAST:event_empatActionPerformed

    private void limaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limaActionPerformed
        // TODO add your handling code here:
        angka += "5";
        display.setText(angka);
    }//GEN-LAST:event_limaActionPerformed

    private void enamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enamActionPerformed
        // TODO add your handling code here:
        angka += "6";
        display.setText(angka);
    }//GEN-LAST:event_enamActionPerformed

    private void tujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuhActionPerformed
        // TODO add your handling code here:
        angka += "7";
        display.setText(angka);
    }//GEN-LAST:event_tujuhActionPerformed

    private void delapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delapanActionPerformed
        // TODO add your handling code here:
        angka += "8";
        display.setText(angka);
    }//GEN-LAST:event_delapanActionPerformed

    private void sembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sembilanActionPerformed
        // TODO add your handling code here:
        angka += "9";
        display.setText(angka);
    }//GEN-LAST:event_sembilanActionPerformed

    private void nolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nolActionPerformed
        // TODO add your handling code here:
        angka += "0";
        display.setText(angka);
    }//GEN-LAST:event_nolActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_displayActionPerformed

    private void titikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titikActionPerformed
        // TODO add your handling code here:
        angka += ".";
        display.setText(angka);
    }//GEN-LAST:event_titikActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        display.setText("");
        angka1=0.0;
        angka2=0.0;
        jumlah=0.0;  
        angka="";
    }//GEN-LAST:event_clearActionPerformed

    private void pangkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pangkatActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        display.setText("");
        angka ="";
        pilih=6;
    }//GEN-LAST:event_pangkatActionPerformed

    private void akarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akarActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        angka2= 2.0;
        jumlah=Math.sqrt(angka1);
        angka = Double.toString(jumlah);
        display.setText(angka);
    }//GEN-LAST:event_akarActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        display.getText().length();
        StringBuilder all = new StringBuilder (display.getText());
        char end = all.charAt(all.length()-1);
        all.deleteCharAt(all.length()-1);
        display.setText(all.toString());
        angka = display.getText();
        if(display.getText().length() == 0){
            hapus.setEnabled(false);
            titik.setEnabled(false);
            bagi.setEnabled(false);
            kali.setEnabled(false);
            tambah.setEnabled(false);
            
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void ceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        display.setText("%");
        angka="";
        pilih=5;
    }//GEN-LAST:event_ceActionPerformed

    private void kuranglebihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kuranglebihActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        display.setText("-"+angka1);
        angka ="";
        pilih =8;
    }//GEN-LAST:event_kuranglebihActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculatorStandart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorStandart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorStandart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorStandart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorStandart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akar;
    private javax.swing.JButton bagi;
    private javax.swing.JButton ce;
    private javax.swing.JButton clear;
    private javax.swing.JButton delapan;
    private javax.swing.JTextField display;
    private javax.swing.JButton dua;
    private javax.swing.JButton empat;
    private javax.swing.JButton enam;
    private javax.swing.JButton hapus;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton kali;
    private javax.swing.JButton kurang;
    private javax.swing.JButton kuranglebih;
    private javax.swing.JButton lima;
    private javax.swing.JButton nol;
    private javax.swing.JButton pangkat;
    private javax.swing.JButton persen;
    private javax.swing.JButton samadengan;
    private javax.swing.JButton satu;
    private javax.swing.JButton satuperx;
    private javax.swing.JButton sembilan;
    private javax.swing.JButton tambah;
    private javax.swing.JButton tiga;
    private javax.swing.JButton titik;
    private javax.swing.JButton tujuh;
    // End of variables declaration//GEN-END:variables
}
