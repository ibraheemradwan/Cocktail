/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cocktail;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author ibrah
 */
public class CocktailGUI extends javax.swing.JFrame {
    private Blender blender;
    private Cup cup;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ingredientNameLabel = new javax.swing.JLabel();
        ingredientCaloriesLabel = new javax.swing.JLabel();
        ingredientVolumeLabel = new javax.swing.JLabel();
        ingredientColorLabel = new javax.swing.JLabel();
        ingredientNameField = new javax.swing.JTextField();
        ingredientCaloriesField = new javax.swing.JTextField();
        ingredientVolumeField = new javax.swing.JTextField();
        ingredientColorField = new javax.swing.JTextField();
        addIngredientButton = new javax.swing.JButton();
        blendButton = new javax.swing.JButton();
        pourButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        blenderStatusArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ingredientNameLabel.setText("Ingredient Name: ");

        ingredientCaloriesLabel.setText("Calories: ");
        ingredientCaloriesLabel.setToolTipText("");

        ingredientVolumeLabel.setText("Volume: ");

        ingredientColorLabel.setText("Color: ");

        ingredientNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingredientNameFieldActionPerformed(evt);
            }
        });

        ingredientCaloriesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingredientCaloriesFieldActionPerformed(evt);
            }
        });

        ingredientVolumeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingredientVolumeFieldActionPerformed(evt);
            }
        });

        ingredientColorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingredientColorFieldActionPerformed(evt);
            }
        });

        addIngredientButton.setText("Add Ingredients");

        blendButton.setText("Blend");

        pourButton.setText("pour into cup");

        blenderStatusArea.setEditable(false);
        blenderStatusArea.setColumns(20);
        blenderStatusArea.setRows(5);
        jScrollPane1.setViewportView(blenderStatusArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ingredientNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ingredientNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ingredientVolumeLabel)
                            .addComponent(ingredientColorLabel))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ingredientVolumeField)
                            .addComponent(ingredientColorField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ingredientCaloriesLabel)
                        .addGap(53, 53, 53)
                        .addComponent(ingredientCaloriesField)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addIngredientButton)
                    .addComponent(blendButton, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pourButton, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ingredientNameLabel)
                            .addComponent(ingredientNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ingredientCaloriesLabel)
                            .addComponent(ingredientCaloriesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ingredientVolumeLabel)
                            .addComponent(ingredientVolumeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ingredientColorLabel)
                            .addComponent(ingredientColorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(36, 36, 36)
                .addComponent(addIngredientButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(blendButton)
                .addGap(12, 12, 12)
                .addComponent(pourButton)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    public CocktailGUI() {
        initComponents();
        customInitComponents();
        blender = new Blender(1000); // default capacity
        cup = new Cup(500); // default cup capacity
    }
    private void customInitComponents() {
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);

        addIngredientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = ingredientNameField.getText();
                int calories = Integer.parseInt(ingredientCaloriesField.getText());
                int volume = Integer.parseInt(ingredientVolumeField.getText());
                String colorName = ingredientColorField.getText();
                try {
                    Color color = Color.fromName(colorName);
                    Ingredients ingredient = new Ingredients(name, calories, volume, color);
                    blender.addIngredient(ingredient);
                    blenderStatusArea.setText(blender.toString());
                } catch (Exception ex) {
                    blenderStatusArea.setText("Error: " + ex.getMessage());
                }
            }
        });

        blendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    blender.blend();
                    blenderStatusArea.setText(blender.toString());
                } catch (Exception ex) {
                    blenderStatusArea.setText("Error: " + ex.getMessage());
                }
            }
        });

        pourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String result = blender.pour(cup);
                    blenderStatusArea.setText(result + "\n" + cup.toString());
                } catch (Exception ex) {
                    blenderStatusArea.setText("Error: " + ex.getMessage());
                }
            }
        });

        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    
    }
    private void ingredientNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingredientNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingredientNameFieldActionPerformed

    private void ingredientCaloriesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingredientCaloriesFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingredientCaloriesFieldActionPerformed

    private void ingredientVolumeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingredientVolumeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingredientVolumeFieldActionPerformed

    private void ingredientColorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingredientColorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingredientColorFieldActionPerformed

                           

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
            java.util.logging.Logger.getLogger(CocktailGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CocktailGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CocktailGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CocktailGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CocktailGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CocktailGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CocktailGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CocktailGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CocktailGUI().setVisible(true);
            }
        });
        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addIngredientButton;
    private javax.swing.JButton blendButton;
    private javax.swing.JTextArea blenderStatusArea;
    private javax.swing.JTextField ingredientCaloriesField;
    private javax.swing.JLabel ingredientCaloriesLabel;
    private javax.swing.JTextField ingredientColorField;
    private javax.swing.JLabel ingredientColorLabel;
    private javax.swing.JTextField ingredientNameField;
    private javax.swing.JLabel ingredientNameLabel;
    private javax.swing.JTextField ingredientVolumeField;
    private javax.swing.JLabel ingredientVolumeLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pourButton;
    // End of variables declaration//GEN-END:variables
}
