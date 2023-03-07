package frames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main_Frame extends JFrame {

    public Main_Frame() {
        initComponents();

        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Herramienta - Estadistica");

        this.rangeField.setEditable(false);
        this.frecuencyArea.setEditable(false);
        this.orderArea.setEditable(false);
        this.totalFrecuencyLabel.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        valuesArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        ascentOrder = new javax.swing.JRadioButton();
        DecreementOrder = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rangeField = new javax.swing.JTextField();
        calculateButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        frecuencyArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderArea = new javax.swing.JTextArea();
        clearButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        totalFrecuencyLabel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese los valores: (Separados por coma)");

        valuesArea.setColumns(20);
        valuesArea.setRows(5);
        jScrollPane1.setViewportView(valuesArea);

        jLabel2.setText("Ordenamiento:");

        ascentOrder.setText("Ascendente");

        DecreementOrder.setText("Descendente");

        jLabel3.setText("Rango:");

        calculateButton.setText("Calcular");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        frecuencyArea.setColumns(20);
        frecuencyArea.setRows(5);
        jScrollPane2.setViewportView(frecuencyArea);

        jLabel4.setText("Ordenamiento:");

        jLabel5.setText("Frecuencia:");

        orderArea.setColumns(20);
        orderArea.setRows(5);
        jScrollPane3.setViewportView(orderArea);

        clearButton.setText("Limpiar");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Suma de las frecuencias: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ascentOrder)
                        .addGap(18, 18, 18)
                        .addComponent(DecreementOrder))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(calculateButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rangeField, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(117, 117, 117)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(totalFrecuencyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 214, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clearButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                    .addGap(554, 554, 554)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(DecreementOrder)
                    .addComponent(ascentOrder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calculateButton)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rangeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton)
                    .addComponent(jLabel6)
                    .addComponent(totalFrecuencyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(338, 338, 338)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(61, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        if (!this.valuesArea.getText().isEmpty()) {
            if (this.ascentOrder.isSelected() || this.DecreementOrder.isSelected()) {
                String[] split = this.valuesArea.getText().split("\\,");
                try {
                    ArrayList<Integer> int_list = new ArrayList<>();
                    HashMap<Integer, Integer> frecuency_map = new HashMap<>();
                    for (String s : split) {
                        String newNumber = s.trim();
                        Integer i = Integer.parseInt(newNumber);
                        int_list.add(i);
                        if (!frecuency_map.containsKey(i)) {
                            frecuency_map.put(i, 0);
                        }
                    }
                    TreeSet<Integer> newSet = new TreeSet<>();
                    int helper;
                    for (int i = 0; i < int_list.size(); i++) {
                        helper = int_list.get(i);
                        if (helper == int_list.get(i)) {
                            int newValue = frecuency_map.get(int_list.get(i)) + 1;
                            frecuency_map.remove(int_list.get(i));
                            frecuency_map.put(int_list.get(i), newValue);
                        }
                    }
                    if (this.ascentOrder.isSelected()) {
                        Collections.sort(int_list);
                        newSet.addAll(int_list);
                    } else {
                        int_list.sort(Collections.reverseOrder());
                        newSet.addAll(int_list);
                    }
                    int min = Collections.min(newSet);
                    int max = Collections.max(newSet);
                    int range = max - min;
                    
                    this.rangeField.setText("Valor minimo: " + min + " | Valor maximo: " + max + " | Rango de los datos: " + range);
                    StringBuilder sb = new StringBuilder();
                    for (int i : int_list) {
                        sb.append(i).append(", ");
                    }
                    String orderString = sb.toString().substring(0, sb.toString().length() - 2);
                    this.orderArea.setText(orderString);
                    
                    StringBuilder sb_frecuency = new StringBuilder();
                    for (int i : newSet) {
                        if (frecuency_map.containsKey(i)) {
                            sb_frecuency.append(i).append("=").append(frecuency_map.get(i)).append(", ");
                        }
                    }
                    String frecuency_string = sb_frecuency.toString().substring(0, sb_frecuency.toString().length() - 2);
                    this.frecuencyArea.setText(frecuency_string);
                    this.valuesArea.setEditable(false);
                    this.calculateButton.setEnabled(false);
                    
                    int total_frecuency = 0;
                    for (int i : frecuency_map.values()) {
                        total_frecuency += i;
                    }
                    this.totalFrecuencyLabel.setText(String.valueOf(total_frecuency));
                    
                    this.ascentOrder.setEnabled(false);
                    this.DecreementOrder.setEnabled(false);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Numero no valido", "Se ha introducido un elemento que no se reconoce como numero", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        this.valuesArea.setText("");
        this.frecuencyArea.setText("");
        this.rangeField.setText("");
        this.orderArea.setText("");
        this.totalFrecuencyLabel.setText("");
        this.valuesArea.setEditable(true);
        this.calculateButton.setEnabled(true);
        this.ascentOrder.setEnabled(true);
        this.DecreementOrder.setEnabled(true);
    }//GEN-LAST:event_clearButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton DecreementOrder;
    private javax.swing.JRadioButton ascentOrder;
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextArea frecuencyArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea orderArea;
    private javax.swing.JTextField rangeField;
    private javax.swing.JTextField totalFrecuencyLabel;
    private javax.swing.JTextArea valuesArea;
    // End of variables declaration//GEN-END:variables

}
