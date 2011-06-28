/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ImageUI.java
 *
 * Created on 23/06/2011, 18:18:47
 */
package image;

import javax.swing.JFileChooser;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DecimalFormat;
import javax.imageio.ImageIO;
import javax.swing.JTextField;

/**
 *
 * @author thullyo.ferreira
 */
public class ImageUI extends javax.swing.JFrame {

    /** Creates new form ImageUI */
    public ImageUI() {
        initComponents();
        
        strRate = "";
        jTextField1.setEditable(false);
        jTextArea1.setEditable(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblRateQuad1 = new javax.swing.JLabel();
        lblRateQuad3 = new javax.swing.JLabel();
        lblRateQuad2 = new javax.swing.JLabel();
        lblRateQuad4 = new javax.swing.JLabel();
        lblRateTotal = new javax.swing.JLabel();
        jtfRateQuad1 = new javax.swing.JTextField();
        jtfRateQuad3 = new javax.swing.JTextField();
        jtfRateQuad2 = new javax.swing.JTextField();
        jtfRateQuad4 = new javax.swing.JTextField();
        jtfRateTotal = new javax.swing.JTextField();
        lblPerCent = new javax.swing.JLabel();
        jtfPerCent = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Image Analyzer");

        jLabel1.setText("Path: ");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 14));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        lblRateQuad1.setText("Quadrant 1:");

        lblRateQuad3.setText("Quadrant 3:");

        lblRateQuad2.setText("Quadrant 2:");

        lblRateQuad4.setText("Quadrant 4:");

        lblRateTotal.setText("Total:");

        jtfRateQuad1.setEditable(false);
        jtfRateQuad1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jtfRateQuad1.setForeground(new java.awt.Color(255, 255, 255));
        jtfRateQuad1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfRateQuad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRateQuad1ActionPerformed(evt);
            }
        });

        jtfRateQuad3.setEditable(false);
        jtfRateQuad3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jtfRateQuad3.setForeground(new java.awt.Color(255, 255, 255));
        jtfRateQuad3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfRateQuad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRateQuad3ActionPerformed(evt);
            }
        });

        jtfRateQuad2.setEditable(false);
        jtfRateQuad2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jtfRateQuad2.setForeground(new java.awt.Color(255, 255, 255));
        jtfRateQuad2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfRateQuad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRateQuad2ActionPerformed(evt);
            }
        });

        jtfRateQuad4.setEditable(false);
        jtfRateQuad4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jtfRateQuad4.setForeground(new java.awt.Color(255, 255, 255));
        jtfRateQuad4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfRateQuad4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRateQuad4ActionPerformed(evt);
            }
        });

        jtfRateTotal.setEditable(false);
        jtfRateTotal.setFont(new java.awt.Font("Tahoma", 1, 11));
        jtfRateTotal.setForeground(new java.awt.Color(255, 255, 255));
        jtfRateTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfRateTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRateTotalActionPerformed(evt);
            }
        });

        lblPerCent.setText("Rate (%): ");
        lblPerCent.setToolTipText("Valor da Amostra + Taxa");

        jtfPerCent.setFont(new java.awt.Font("Tahoma", 1, 11));
        jtfPerCent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPerCentActionPerformed(evt);
            }
        });
        jtfPerCent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPerCentKeyTyped(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Upload Standard");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Upload Sample");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRateQuad3)
                                    .addComponent(lblRateQuad1)
                                    .addComponent(jLabel1)
                                    .addComponent(lblPerCent))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtfPerCent, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE))
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jtfRateQuad3)
                                            .addComponent(jtfRateQuad1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblRateQuad2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtfRateQuad2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblRateQuad4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtfRateQuad4)))))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblRateTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfRateTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerCent)
                    .addComponent(jtfPerCent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRateQuad1)
                            .addComponent(jtfRateQuad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRateQuad3)
                            .addComponent(jtfRateQuad3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRateQuad2)
                            .addComponent(jtfRateQuad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRateQuad4)
                            .addComponent(jtfRateQuad4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRateTotal)
                    .addComponent(jtfRateTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChoose = new JFileChooser(System.getProperty("user.dir"));
        String path = "";
        
        fileChoose.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        if (fileChoose.showOpenDialog(fileChoose) == JFileChooser.APPROVE_OPTION) {
            path = fileChoose.getSelectedFile().getPath();
            
            jTextField1.setText(path);
                        
            try {
                BufferedImage image = ImageIO.read(new File(path));
                
                String newPath = "";
                                
                newPath = path.replace("\\", "/");
                
                LabelFrame labelFrame = new LabelFrame(newPath, path);
                labelFrame.setSize(800, 600);                        
                labelFrame.setVisible(true);
                
                PixelARGB pixelARGB = new PixelARGB();
                
                strRate += pixelARGB.marchThroughImage(image);
                
                strRate += "Image " + path.substring(path.lastIndexOf("\\") + 1) + " =>\n";
                strRate += pixelARGB.getQuadr().stringRate();
                
                jTextArea1.setText(strRate);
                
                _rtQd1 = pixelARGB.getQuadr().getRateQuad1();
                _rtQd2 = pixelARGB.getQuadr().getRateQuad2();
                _rtQd3 = pixelARGB.getQuadr().getRateQuad3();
                _rtQd4 = pixelARGB.getQuadr().getRateQuad4();
                _rtTotal = pixelARGB.getQuadr().getRateTotal();
                
                upDateJTFs();
                
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jtfRateQuad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRateQuad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfRateQuad1ActionPerformed

    private void jtfRateQuad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRateQuad3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfRateQuad3ActionPerformed

    private void jtfRateQuad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRateQuad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfRateQuad2ActionPerformed

    private void jtfRateQuad4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRateQuad4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfRateQuad4ActionPerformed

    private void jtfRateTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRateTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfRateTotalActionPerformed

    private void jtfPerCentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPerCentKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {  
            evt.consume();
        }  
    }//GEN-LAST:event_jtfPerCentKeyTyped

    private void jtfPerCentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPerCentActionPerformed
        // TODO add your handling code here:
        if (!jTextField1.getText().isEmpty()) {
            upDateJTFs();
        }
    }//GEN-LAST:event_jtfPerCentActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChoose = new JFileChooser(System.getProperty("user.dir"));
        String path = "";
        
        fileChoose.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        if (fileChoose.showOpenDialog(fileChoose) == JFileChooser.APPROVE_OPTION) {
            path = fileChoose.getSelectedFile().getPath();
            
            jTextField1.setText(path);
                        
            try {
                BufferedImage image = ImageIO.read(new File(path));
                
                String newPath = "";
                                
                newPath = path.replace("\\", "/");
                
                LabelFrame labelFrame = new LabelFrame(newPath, path);
                labelFrame.setSize(800, 600);                        
                labelFrame.setVisible(true);
                
                PixelARGB pixelARGB = new PixelARGB();
                
                strRate += pixelARGB.marchThroughImage(image);
                
                strRate += "Image " + path.substring(path.lastIndexOf("\\") + 1) + " =>\n";
                strRate += pixelARGB.getQuadr().stringRate();
                
                jTextArea1.setText(strRate);
                
                _rtQd1S = pixelARGB.getQuadr().getRateQuad1();
                _rtQd2S = pixelARGB.getQuadr().getRateQuad2();
                _rtQd3S = pixelARGB.getQuadr().getRateQuad3();
                _rtQd4S = pixelARGB.getQuadr().getRateQuad4();
                _rtTotalS = pixelARGB.getQuadr().getRateTotal();
                
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ImageUI().setVisible(true);
            }
        });
    }
    
    private void upDateJTFs() {
        this.updateJTField(_rtQd1, 1, jtfRateQuad1);
        this.updateJTField(_rtQd2, 2, jtfRateQuad2);
        this.updateJTField(_rtQd3, 3, jtfRateQuad3);
        this.updateJTField(_rtQd4, 4, jtfRateQuad4);
        this.updateJTField(_rtTotal, 0, jtfRateTotal);
    }
    
    private void updateJTField(double rate, int quad, JTextField jtfQuad) {
        double rateComp = 0;
        double rateText = 0;
        
        if (!jtfPerCent.getText().equalsIgnoreCase("")) {
            rateText = Double.parseDouble(jtfPerCent.getText());
        }
        
        switch (quad) {
            case 1:
                rateComp = _rtQd1S;
                break;
            case 2:
                rateComp = _rtQd2S;
                break;
            case 3:
                rateComp = _rtQd3S;
                break;
            case 4:
                rateComp = _rtQd4S;
                break;
            default:
                rateComp = _rtTotalS;
        }
        
        if (rate <= (rateComp*(1 + rateText/100))) {
            jtfQuad.setText("GOOD");
            jtfQuad.setBackground(java.awt.Color.BLUE);
        } else {
            DecimalFormat frmt = new DecimalFormat("0.0000");
            
            jtfQuad.setText("NO GOOD - " + frmt.format((rate / rateComp)*100 - 100).replace(".", ",") + "%");
            jtfQuad.setBackground(java.awt.Color.RED);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jtfPerCent;
    private javax.swing.JTextField jtfRateQuad1;
    private javax.swing.JTextField jtfRateQuad2;
    private javax.swing.JTextField jtfRateQuad3;
    private javax.swing.JTextField jtfRateQuad4;
    private javax.swing.JTextField jtfRateTotal;
    private javax.swing.JLabel lblPerCent;
    private javax.swing.JLabel lblRateQuad1;
    private javax.swing.JLabel lblRateQuad2;
    private javax.swing.JLabel lblRateQuad3;
    private javax.swing.JLabel lblRateQuad4;
    private javax.swing.JLabel lblRateTotal;
    // End of variables declaration//GEN-END:variables
    
    private String strRate;
    
    private double _rtQd1 = 0;
    private double _rtQd2 = 0;
    private double _rtQd3 = 0;
    private double _rtQd4 = 0;
    private double _rtTotal = 0;
    
    private double _rtQd1S = 0;
    private double _rtQd2S = 0;
    private double _rtQd3S = 0;
    private double _rtQd4S = 0;
    private double _rtTotalS = 0;
}
