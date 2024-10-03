/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.lucio.pe.cpresentacion;

import java.awt.BorderLayout;

/**
 *
 * @author Alumno-PB203
 */
public class Calculadora extends javax.swing.JPanel {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        
        this.textfieldresultado.setText("");
 
                   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void operacion(String sentecia){
        if(sentecia.contains("+")){
            this.numeroOperable(sentecia,"\\+","+");
        }else if(sentecia.contains("-")){
            this.numeroOperable(sentecia,"\\-","-");
        }else if(sentecia.contains("*")){
            this.numeroOperable(sentecia,"\\*","*");
        }else if(sentecia.contains("/")){
            this.numeroOperable(sentecia,"\\/","/");
        }
    }
    
    public void numeroOperable(String Sentencia,String simbolo,String valida){
        String[] cortar = Sentencia.split("");
        String[] numero;
        float primerNumero = 0;
        float segundoNumero = 0;
        if(cortar[0].contains(valida)){
            numero =  Sentencia.substring(1,Sentencia.length()).split(simbolo) ;
            primerNumero =  Float.parseFloat(numero[0])-Float.parseFloat(numero[0])*2;
            segundoNumero = 0;
        }else{
         numero = Sentencia.split(simbolo);
         primerNumero = Float.parseFloat(numero[0]);
         segundoNumero = Float.parseFloat(numero[1]);
        }
        float resultado = 0;
        if (simbolo.equals("\\+")){
           resultado = primerNumero + segundoNumero;
         }else if(simbolo.equals("\\-")){
           resultado = primerNumero - segundoNumero;
         }else if(simbolo.equals("\\*")){
           resultado = primerNumero * segundoNumero;
         }else if(simbolo.equals("\\/")){
           resultado = primerNumero / segundoNumero;
         }
         this.textfieldresultado.setText(String.valueOf(resultado));
    
    }
        
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textfieldresultado = new javax.swing.JTextField();
        btnDivision = new javax.swing.JButton();
        btnPorcentaje = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnCC = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnarroba = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel1.setText("calcuadora");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        textfieldresultado.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        textfieldresultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textfieldresultado.setText("0");
        textfieldresultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldresultadoActionPerformed(evt);
            }
        });
        jPanel1.add(textfieldresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 340, 117));

        btnDivision.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        jPanel1.add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 70, 70));

        btnPorcentaje.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPorcentaje.setText("%");
        btnPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentajeActionPerformed(evt);
            }
        });
        jPanel1.add(btnPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 70, 70));

        btnCE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCE.setText("CE");
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });
        jPanel1.add(btnCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 70, 70));

        btnCC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCC.setText("CC");
        btnCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCCActionPerformed(evt);
            }
        });
        jPanel1.add(btnCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 70, 70));

        btnMultiplicacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMultiplicacion.setText("*");
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 70, 70));

        btn7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 70, 70));

        btn8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 70, 70));

        btn9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 70, 70));

        btnResta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnResta.setText("-");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        jPanel1.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 70, 70));

        btn5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 70, 70));

        btn4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 70, 70));

        btn6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 70, 70));

        btnSuma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSuma.setText("+");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 70, 70));

        btn3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 70, 70));

        btn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 70, 70));

        btn2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 70, 70));

        btnarroba.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnarroba.setText("@");
        btnarroba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnarrobaActionPerformed(evt);
            }
        });
        jPanel1.add(btnarroba, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 70, 70));

        btn0.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, 70, 70));

        btnPunto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPunto.setText(".");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        jPanel1.add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 70, 70));

        btnIgual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        jPanel1.add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, 70, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textfieldresultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldresultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldresultadoActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        this.operacion(this.textfieldresultado.getText()); 
        this.textfieldresultado.setText(this.textfieldresultado.getText()+"/");   
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPorcentajeActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        int tamanio = this.textfieldresultado.getText().length();
        this.textfieldresultado.setText(this.textfieldresultado.getText().substring(0,tamanio-1));
    }//GEN-LAST:event_btnCEActionPerformed

    private void btnCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCCActionPerformed
        this.textfieldresultado.setText("");
    }//GEN-LAST:event_btnCCActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        this.operacion(this.textfieldresultado.getText()); 
        this.textfieldresultado.setText(this.textfieldresultado.getText()+"*");    
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        this.textfieldresultado.setText(this.textfieldresultado.getText()+"7");    
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
         this.textfieldresultado.setText(this.textfieldresultado.getText()+"8");   
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        this.textfieldresultado.setText(this.textfieldresultado.getText()+"9");   
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        this.operacion(this.textfieldresultado.getText()); 
        this.textfieldresultado.setText(this.textfieldresultado.getText()+"-");   
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
          this.textfieldresultado.setText(this.textfieldresultado.getText()+"5");   
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
          this.textfieldresultado.setText(this.textfieldresultado.getText()+"4");   
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
         this.textfieldresultado.setText(this.textfieldresultado.getText()+"6");                                     
    }//GEN-LAST:event_btn6ActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        this.operacion(this.textfieldresultado.getText());
        this.textfieldresultado.setText(this.textfieldresultado.getText()+"+");                                       
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
         this.textfieldresultado.setText(this.textfieldresultado.getText()+"3");    
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        this.textfieldresultado.setText(this.textfieldresultado.getText()+"1");     
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
         this.textfieldresultado.setText(this.textfieldresultado.getText()+"2");     
    }//GEN-LAST:event_btn2ActionPerformed

    private void btnarrobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnarrobaActionPerformed
       this.textfieldresultado.setText("@");  
    }//GEN-LAST:event_btnarrobaActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        this.textfieldresultado.setText(this.textfieldresultado.getText()+"0");     
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        this.textfieldresultado.setText(this.textfieldresultado.getText()+".");    
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
         this.operacion(this.textfieldresultado.getText());  
    }//GEN-LAST:event_btnIgualActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnCC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnPorcentaje;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btnarroba;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textfieldresultado;
    // End of variables declaration//GEN-END:variables
}
