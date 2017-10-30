/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;
import java.util.*;
import javax.swing.*;
import java.awt.*;

// textbox can contain upto 16 words
/**
 *
 * @author Meenakshi Sharma
 */
public class SortingApp extends javax.swing.JFrame {
   int sorted[];
   String string="";
   int rowCnt;
   JScrollPane sp;
   JFrame f= new JFrame();
      JPanel p=new JPanel();
     
      JTextArea a= new JTextArea();
       GridBagConstraints textFieldConstraints = new GridBagConstraints();
     
               
    
    
   
    /**
     * Creates new form SortingApp
     */
  
  public void intConverter(String[]n)
  {
    sorted = new int[n.length];
     for(int i = 0;i<n.length;i++)
     {
         sorted[i]=Integer.parseInt(n[i]);
         
     }
     rowCnt=sorted.length;
     for(int xy=0;xy<rowCnt;xy++){
                       
                        JTextField g=new JTextField();
                        g.setMaximumSize(new Dimension(50,10));
                       
                        g.setEditable(false);
                       g.setText(String.valueOf(sorted[xy]));
                         textFieldConstraints.fill = GridBagConstraints.NONE;
                        textFieldConstraints.weightx = 0.5;
                        textFieldConstraints.insets = new Insets(5,5,5,5);
                         
                       
                       p.add(g, textFieldConstraints);
                      
                       p.updateUI();
                      
             }a = new JTextArea(3, 50); p.add(a);
            /* if(sorted[1]<sorted[0])
             {
              string="swap "+sorted[1]+" with "+sorted[0];
             }
             else
             {
                 string =" not swap  "+sorted[1]+" with "+sorted[0];
             }
                a.append(string);*/
    
    
  }
  void selection_sort ()
  {  
       string="\t\tSELECTION SORT : \nThe selection sort is a combination of searching and sorting. During each pass, the unsorted element\n with the smallest (or largest) value is moved to its proper position in the array.\nIn the selection sort, the inner loop finds the next smallest (or largest) value and \nthe outer loop places that value into its proper location.Selecting the lowest element requires scanning \nall n elements  and then swapping it into the first position." ;
       a.append(string); 
      for (int i = 0; i <= rowCnt - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < rowCnt; j++)
                if (sorted[j] < sorted[index]) 
                    index = j;
      
            int smallerNumber = sorted[index];  
           for(int x=0;x<rowCnt;x++){
                       
                        JTextField g=new JTextField();
                        g.setMaximumSize(new Dimension(50,10));
                        g.setEditable(false);
                        g.setText(String.valueOf(sorted[x]));
                      
                        if(sorted[x]==smallerNumber)
                        {
                        g.setBackground(Color.red);
                        }
                    
                           if(sorted[x]==sorted[i])
                           {
                               g.setBackground(Color.yellow);
                           }
                        for(int l =0;l<i;l++)
                        {
                           if(sorted[x]== sorted[i-1-l])
                                g.setBackground(Color.gray);
                        }
                        
                     
                        textFieldConstraints.fill = GridBagConstraints.NONE;
                        textFieldConstraints.weightx = 0.5;
                        textFieldConstraints.insets = new Insets(5,5,5,5);
                         
                       
                       p.add(g, textFieldConstraints);
                      
                       p.updateUI();
                     }
                 a = new JTextArea(3, 50);
                 p.add(a);
   
           
        
            sorted[index] = sorted[i];
            if(sorted[index]==smallerNumber){
             string=smallerNumber+" is swapping itself "+ "----> ";
            }
            else{
            string="swap "+sorted[index]+ " with "+smallerNumber+" ----> ";}
            a.append(string);
            sorted[i] = smallerNumber;
  }
    string="\nSORTED ARRAY IS THIS   " ; a.append(string);     
        
    }
  void bubble_sort()
  {
    int i, j;
   Boolean swapped;
   
           
   for (i = 0; i < rowCnt-1; i++)
   {
     swapped = false;
     a = new JTextArea(3, 50);
     for (j = 0; j < rowCnt-i-1; j++)
     {  
         
         
        if (sorted[j] > sorted[j+1])
        {
           int temp = sorted[j];
           sorted[j]=sorted[j+1];
           
           sorted[j+1]=temp;
           string="swap "+sorted[j]+ " with "+sorted[j+1]+" ----> ";
            a.append(string);
           swapped = true;
        }
         for(int k=0;k<rowCnt;k++)
         {JTextField g=new JTextField();
                        g.setMaximumSize(new Dimension(50,10));
                        g.setEditable(false);
                        g.setText(String.valueOf(sorted[k]));
                      
                        if(sorted[k]==sorted[j])
                        {
                        g.setBackground(Color.red);
                        }
                     
                        if(sorted[k]==sorted[j+1])

                           {
                               g.setBackground(Color.yellow);
                           }
                        for(int l =0;l<i;l++)
                        {
                           if(sorted[k]== sorted[rowCnt-1-l])
                                g.setBackground(Color.gray);
                        }
                       
                        
                       //textFieldConstraints.gridx = 0;
                        // textFieldConstraints.gridy =x ;
                        textFieldConstraints.fill = GridBagConstraints.NONE;
                        textFieldConstraints.weightx = 0.5;
                        textFieldConstraints.insets = new Insets(5,5,5,5);
                         
                      
                       p.add(g, textFieldConstraints);
                      
         } JLabel l = new JLabel("<html>|<br>|<br>v<html>"); p.add(l); p.updateUI();
        
     }   
                 p.add(a);
 
     
     
     // IF no two elements were swapped by inner loop, then break
     if (swapped == false)
        break;
   }
   string="\tSORTED ARRAY IS THIS \n BUBBLE SORT :  " ; a.append(string);
  }
  void insertion_sort()
  {  
      for ( int j = 1; j <rowCnt ; j++) {
          int select_y[] = new int[j];
         int k=0;
          int  key = sorted[j];
          
            int i = j-1;    
            while ( (i > -1) && ( sorted [i] > key ) ) {
               select_y[k]=sorted[i];
              k++;
                sorted [i+1] = sorted [i];
                
             string="swap "+key+ " with "+sorted[i]+" ----> ";
              a.append(string);
                i--;
            }
           
      if(sorted[i+1]==key)
          { string=" "+key+" not swapped with"+sorted[i]+" ----> "; 
         a.append(string);
          }
            sorted[i+1] = key;
           
            
             for(int x=0;x<rowCnt;x++){
                       
                        JTextField g=new JTextField();
                        g.setMaximumSize(new Dimension(50,10));
                        g.setEditable(false);
                        g.setText(String.valueOf(sorted[x]));
                      
                        if(sorted[x]==key)
                        {
                        g.setBackground(Color.red);
                        }
                     for(int l=0;l<select_y.length;l++)
                       {
                           if(sorted[x]==select_y[l])
                           {
                               g.setBackground(Color.yellow);
                           }
                       }
                        
                     
                        textFieldConstraints.fill = GridBagConstraints.NONE;
                        textFieldConstraints.weightx = 0.5;
                        textFieldConstraints.insets = new Insets(5,5,5,5);
                         
                       
                       p.add(g, textFieldConstraints);
                      
                       p.updateUI();
                     }
                 a = new JTextArea(3, 50);
                 p.add(a);
   
           
        } string="SORTED ARRAY IS THIS \n INSERTION SORT :  " ; a.append(string);
       
      
  }
    public SortingApp()
    {
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

        checkbox1 = new java.awt.Checkbox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        checkbox1.setLabel("checkbox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("INSERTION SORT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("MERGE SORT");

        jButton3.setText("QUICK SORT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("RADIX SORT");

        jButton5.setText("HEAP SORT");

        jButton6.setText("SELECTION SORT ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("BUBBLE SORT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void input()
{
 String[] array = jTextField1.getText().split(" ");
     intConverter(array);
     
    
}
void add_frame()
{  
  p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
    

  
sp = new JScrollPane(p);		
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS );
                sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
              
		f.add(sp);
               //f.add(p);
               f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setSize(new Dimension(600, 700));
                f.setResizable(false);
               f.setVisible(true);
                   
}
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
                input();
                 dispose();
                insertion_sort();
                add_frame();     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     input();
     dispose();
bubble_sort();
add_frame();// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        input();
     dispose();
selection_sort();
add_frame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(SortingApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortingApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortingApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortingApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortingApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Checkbox checkbox1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

   
   
}
