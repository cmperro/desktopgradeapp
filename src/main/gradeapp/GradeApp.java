/*
 * GradeApp.java
 *
 * Created on Feb 9, 2010, 1:49:26 PM
 */

package gradeapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.border.TitledBorder;

/**
 *
 */
public class GradeApp extends javax.swing.JFrame {

    /** Creates new form GradeApp */

    public GradeApp() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loadButton = new javax.swing.JButton();
        emailButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        goodGradePanel = new javax.swing.JPanel();
        gradeSlider = new javax.swing.JSlider();
        noiseSliderPanel = new javax.swing.JPanel();
        noiseSlider = new javax.swing.JSlider();
        graphPanel = new javax.swing.JPanel();
        gRender = new gradeapp.GRender();
        helpButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Work Doer");

        loadButton.setText("Load *.xls");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        emailButton.setForeground(new java.awt.Color(0, 0, 255));
        emailButton.setText("Email");
        emailButton.setEnabled(false);
        emailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailButtonActionPerformed(evt);
            }
        });

        printButton.setText("Print");
        printButton.setEnabled(false);
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        goodGradePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Good Grade - " + Graph.DEFAULT_GOODGRADE));

        gradeSlider.setPaintLabels(true);
        gradeSlider.setValue((int)(Graph.DEFAULT_GOODGRADE));
        gradeSlider.setEnabled(false);
        gradeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                gradeSliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout goodGradePanelLayout = new javax.swing.GroupLayout(goodGradePanel);
        goodGradePanel.setLayout(goodGradePanelLayout);
        goodGradePanelLayout.setHorizontalGroup(
            goodGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(goodGradePanelLayout.createSequentialGroup()
                .addComponent(gradeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
                .addContainerGap())
        );
        goodGradePanelLayout.setVerticalGroup(
            goodGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(goodGradePanelLayout.createSequentialGroup()
                .addComponent(gradeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        noiseSliderPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Noise - " + Graph.DEFAULT_NOISE + "%"));

        noiseSlider.setValue((int)(Graph.DEFAULT_NOISE*100));
        noiseSlider.setEnabled(false);
        noiseSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                noiseSliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout noiseSliderPanelLayout = new javax.swing.GroupLayout(noiseSliderPanel);
        noiseSliderPanel.setLayout(noiseSliderPanelLayout);
        noiseSliderPanelLayout.setHorizontalGroup(
            noiseSliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noiseSliderPanelLayout.createSequentialGroup()
                .addComponent(noiseSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
                .addContainerGap())
        );
        noiseSliderPanelLayout.setVerticalGroup(
            noiseSliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noiseSliderPanelLayout.createSequentialGroup()
                .addComponent(noiseSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout graphPanelLayout = new javax.swing.GroupLayout(graphPanel);
        graphPanel.setLayout(graphPanelLayout);
        graphPanelLayout.setHorizontalGroup(
            graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gRender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
        );
        graphPanelLayout.setVerticalGroup(
            graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graphPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gRender, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
        );

        helpButton.setText("Help!");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.setEnabled(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(graphPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noiseSliderPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(goodGradePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(loadButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 641, Short.MAX_VALUE)
                        .addComponent(helpButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadButton)
                    .addComponent(emailButton)
                    .addComponent(printButton)
                    .addComponent(helpButton)
                    .addComponent(saveButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(goodGradePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noiseSliderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(graphPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        JFileChooser fc = new JFileChooser();
        if (fc.showOpenDialog(null) != JFileChooser.APPROVE_OPTION)
            return;
        File input = fc.getSelectedFile();
        try {
            Graph.createGraph(input);
            gRender.render();
            emailButton.setEnabled(true);
            saveButton.setEnabled(true);
            printButton.setEnabled(true);
            noiseSlider.setEnabled(true);
            gradeSlider.setMaximum(Graph.getGraph().getAnswerkey().size());
            gradeSlider.setValue((int) (Graph.getGraph().getAnswerkey().size() * 0.8f));
            gradeSlider.setEnabled(true);// TODO add your handling code here:
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GradeApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GradeApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GraphFormatException ex) {
            Logger.getLogger(GradeApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loadButtonActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        HelperButton.createAndShowGUI();
    }//GEN-LAST:event_helpButtonActionPerformed

    private void gradeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_gradeSliderStateChanged
        Graph.getGraph().setGoodgrade(gradeSlider.getValue());   
        String title = "Good Grade - ";
        ((TitledBorder)goodGradePanel.getBorder()).setTitle(title + gradeSlider.getValue() + "/" + Graph.getGraph().getAnswerkey().size());
        goodGradePanel.repaint();
        gRender.render();
    }//GEN-LAST:event_gradeSliderStateChanged

    private void noiseSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_noiseSliderStateChanged
        Graph.getGraph().setNoise(noiseSlider.getValue()/100.0f);
        String title = "Noise - ";
        ((TitledBorder)noiseSliderPanel.getBorder()).setTitle(title + noiseSlider.getValue() + "%");
        noiseSliderPanel.repaint();
        gRender.render();
    }//GEN-LAST:event_noiseSliderStateChanged


    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        GraphSave.saveImage(gRender.getGraph());
    }//GEN-LAST:event_saveButtonActionPerformed

    private void emailButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        File tmpFile = GraphSave.tempMaker(gRender.getGraph());
        // Thanks gRender private, had to pass in tmpFile
        // O Well
        // Its Static so I can pull this shit
        EmailSender.sentEmail(tmpFile);
    }                                           
    
    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailButtonActionPerformed
        GraphPrint.printComponent(gRender.getGraph());
    }//GEN-LAST:event_emailButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GradeApp gradeApp = new GradeApp();
                //Center the app by setting it relative to null. This is a
                //weird property of the "setLocationRelativeTo" method.
                gradeApp.setLocationRelativeTo(null);
                gradeApp.setVisible(true);
                gradeApp.setTitle("The Weeder");
                gradeApp.setDefaultCloseOperation(EXIT_ON_CLOSE);
                // Ask User For Confirmation of Close
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton emailButton;
    private gradeapp.GRender gRender;
    private javax.swing.JPanel goodGradePanel;
    private javax.swing.JSlider gradeSlider;
    private javax.swing.JPanel graphPanel;
    private javax.swing.JButton helpButton;
    private javax.swing.JButton loadButton;
    private javax.swing.JSlider noiseSlider;
    private javax.swing.JPanel noiseSliderPanel;
    private javax.swing.JButton printButton;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables

}
