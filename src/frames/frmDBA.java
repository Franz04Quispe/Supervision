
package frames;

/**
 * @author Franz Joel Quispe Mamani, Rodrigo Escobar Condori
 */
public class frmDBA extends javax.swing.JFrame {
    
    Tiempo time = new Tiempo();

    /**
     * Creates new form frmDBA
     */
    public frmDBA() {
        initComponents();
        this.setLocationRelativeTo(this);//IMPORTANTE, coloca el formulario al centro
        mostrarTiempo();
    }
    
    public void mostrarTiempo(){
        labelFecha.setText(time.fechaCompleta);
        labelHora.setText(time.horaCompleta);
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
        vtEscritorio = new javax.swing.JDesktopPane();
        labelHora = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        opCarrerasInsertar = new javax.swing.JMenuItem();
        opDocentesInsertar = new javax.swing.JMenuItem();
        opMateriasInsertar = new javax.swing.JMenuItem();
        opLabInsertar = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        opNewtonInterp = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DBA");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("BIENVENIDO DBA");

        javax.swing.GroupLayout vtEscritorioLayout = new javax.swing.GroupLayout(vtEscritorio);
        vtEscritorio.setLayout(vtEscritorioLayout);
        vtEscritorioLayout.setHorizontalGroup(
            vtEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        vtEscritorioLayout.setVerticalGroup(
            vtEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 786, Short.MAX_VALUE)
        );

        labelHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelHora.setText("jLabel2");

        labelFecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelFecha.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("HORA:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("FECHA:");

        jMenu1.setText("CRUD");

        opCarrerasInsertar.setText("Carreras");
        opCarrerasInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCarrerasInsertarActionPerformed(evt);
            }
        });
        jMenu1.add(opCarrerasInsertar);

        opDocentesInsertar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opDocentesInsertar.setText("Docentes");
        opDocentesInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opDocentesInsertarActionPerformed(evt);
            }
        });
        jMenu1.add(opDocentesInsertar);

        opMateriasInsertar.setText("Materias");
        opMateriasInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opMateriasInsertarActionPerformed(evt);
            }
        });
        jMenu1.add(opMateriasInsertar);

        opLabInsertar.setText("Laboratorios");
        opLabInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLabInsertarActionPerformed(evt);
            }
        });
        jMenu1.add(opLabInsertar);

        jMenuBar1.add(jMenu1);

        jMenu5.setBackground(new java.awt.Color(204, 204, 255));
        jMenu5.setText("Analisis Numérico");

        opNewtonInterp.setText("Interpolación de Funciones");
        opNewtonInterp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opNewtonInterpActionPerformed(evt);
            }
        });
        jMenu5.add(opNewtonInterp);

        jMenuBar1.add(jMenu5);

        jMenu4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu4.setText("Acerca de");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vtEscritorio)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addComponent(labelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(vtEscritorio)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelHora)
                        .addComponent(labelFecha)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opDocentesInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDocentesInsertarActionPerformed
        vtDocentesInsertar verDCIn=new vtDocentesInsertar();
        vtEscritorio.add(verDCIn);
        verDCIn.show();
    }//GEN-LAST:event_opDocentesInsertarActionPerformed

    private void opNewtonInterpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opNewtonInterpActionPerformed
        vtNewtonInterp verNewton = new vtNewtonInterp();
        vtEscritorio.add(verNewton);
        verNewton.show();
    }//GEN-LAST:event_opNewtonInterpActionPerformed

    private void opCarrerasInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCarrerasInsertarActionPerformed
        vtCarrerasInsertar verCarreras = new vtCarrerasInsertar();
        vtEscritorio.add(verCarreras);
        verCarreras.show();
    }//GEN-LAST:event_opCarrerasInsertarActionPerformed

    private void opLabInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLabInsertarActionPerformed
        vtLabInsertar verLab = new vtLabInsertar();
        vtEscritorio.add(verLab);
        verLab.show();
    }//GEN-LAST:event_opLabInsertarActionPerformed

    private void opMateriasInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opMateriasInsertarActionPerformed
        vtMateriasInsertar verMat = new vtMateriasInsertar();
        vtEscritorio.add(verMat);
        verMat.show();
    }//GEN-LAST:event_opMateriasInsertarActionPerformed

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
            java.util.logging.Logger.getLogger(frmDBA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDBA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDBA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDBA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDBA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelHora;
    private javax.swing.JMenuItem opCarrerasInsertar;
    private javax.swing.JMenuItem opDocentesInsertar;
    private javax.swing.JMenuItem opLabInsertar;
    private javax.swing.JMenuItem opMateriasInsertar;
    private javax.swing.JMenuItem opNewtonInterp;
    private javax.swing.JDesktopPane vtEscritorio;
    // End of variables declaration//GEN-END:variables
}
