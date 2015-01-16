package pkgclass.skeleton.generator;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;


public class GUIMain extends javax.swing.JFrame
{
    public static GUIMain _instance;
    private ArrayList<Variable> _vars;
    private ArrayList<javax.swing.JLabel> _labels;
    private ArrayList<javax.swing.JButton> _Removebutton;
    private ArrayList<javax.swing.JButton> _Editbutton;
    private int gap;
    
    public GUIMain()
    {
        _vars = new ArrayList<>();
        _labels = new ArrayList<>();
        _Removebutton = new ArrayList<>();
        _Editbutton = new ArrayList<>();
        initComponents();
        _instance = this;
    }

    public void AddVar(String Type, String Name, boolean array, boolean arrayList, boolean get, boolean set, boolean retrievable)
    {
         _vars.add(Variable.Create(Type, Name, array, arrayList, get, set, retrievable, ClassNameText.getText()));
         
         repaintVars();
    }
    private void repaintVars()
    {
        //gap = 80;
        gap = 10;
        Variables.removeAll();
        _Removebutton.clear();
        _Editbutton.clear();
        _labels.clear();
        if(_vars.size()>0)
        {
            for(Variable v: _vars)
            {
                addComponent(v.getName());
                gap += 30;
            }
        }
        else
        {
            addEmptyComponent();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel2 = new javax.swing.JLabel();
        CreateButton = new javax.swing.JButton();
        ProjectNameLabel = new javax.swing.JLabel();
        ProjectNameText = new javax.swing.JTextField();
        ClassNameLabel = new javax.swing.JLabel();
        ClassNameText = new javax.swing.JTextField();
        FileLocationLabel = new javax.swing.JLabel();
        FileLocationText = new javax.swing.JTextField();
        Variables = new javax.swing.JPanel();
        AddVarButton = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CreateButton.setText("Create");
        CreateButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CreateButtonActionPerformed(evt);
            }
        });

        ProjectNameLabel.setText("Project Name");

        ProjectNameText.setText("ProjectName");

        ClassNameLabel.setText("Class Name");

        ClassNameText.setText("MyClass");

        FileLocationLabel.setText("File Location");

        FileLocationText.setText("/Users/agnieszkapiszcz/Desktop/test2.txt");
        FileLocationText.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                FileLocationTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VariablesLayout = new javax.swing.GroupLayout(Variables);
        Variables.setLayout(VariablesLayout);
        VariablesLayout.setHorizontalGroup(
            VariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );
        VariablesLayout.setVerticalGroup(
            VariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        AddVarButton.setText("Add Variable");
        AddVarButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AddVarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ProjectNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ProjectNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ClassNameLabel)
                            .addGap(21, 21, 21)
                            .addComponent(ClassNameText))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(FileLocationLabel)
                            .addGap(18, 18, 18)
                            .addComponent(FileLocationText, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)))
                    .addComponent(Variables, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddVarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(CreateButton)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProjectNameLabel)
                    .addComponent(ProjectNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClassNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClassNameLabel))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FileLocationLabel)
                    .addComponent(FileLocationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CreateButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddVarButton)
                            .addComponent(Variables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CreateButtonActionPerformed
    {//GEN-HEADEREND:event_CreateButtonActionPerformed
//        try
//        {
//            //new ConstructorWindow(_vars).setVisible(true);
//            ClassSkeletonGenerator.outPut(FileLocationText.getText(), ProjectNameText.getText(), ClassNameText.getText(), InheritanceText.getText(), _vars);
//        }
//        catch (FileNotFoundException ex)
//        {
//            Logger.getLogger(GUIMain.class.getName()).log(Level.SEVERE, null, ex);
//        }
        System.exit(0);
    }//GEN-LAST:event_CreateButtonActionPerformed

    private void addComponent(String Name)
    {
        javax.swing.JButton RemoveBut = new javax.swing.JButton("Remove");
        javax.swing.JButton EditBut = new javax.swing.JButton("Edit");
        javax.swing.JLabel VarNameLab = new javax.swing.JLabel(Name);
        RemoveBut.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RemoveButActionPerformed(evt, RemoveBut);
            }
        });
        EditBut.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                EditButActionPerformed(evt, EditBut);
            }
        });
        javax.swing.GroupLayout VariablesLayout = new javax.swing.GroupLayout(Variables);
        Variables.setLayout(VariablesLayout);
        VariablesLayout.setHorizontalGroup(
            VariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VariablesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(RemoveBut)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(VariablesLayout.createSequentialGroup()
                .addGap(0, 250, Short.MAX_VALUE)
                .addComponent(EditBut)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(VariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VariablesLayout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(VarNameLab)
                    .addGap(0, 250, Short.MAX_VALUE)))
                    
        );
        VariablesLayout.setVerticalGroup(
            VariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VariablesLayout.createSequentialGroup()
                .addGap(gap-7)
                .addComponent(RemoveBut)
                .addGap(0))
            .addGroup(VariablesLayout.createSequentialGroup()
                .addGap(gap-7)
                .addComponent(EditBut)
                .addGap(0))
            .addGroup(VariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VariablesLayout.createSequentialGroup()
                    .addGap(gap)
                    .addComponent(VarNameLab)
                    .addGap(0)))
        );
        _labels.add(VarNameLab);
        _Removebutton.add(RemoveBut);
        _Editbutton.add(EditBut);
        pack();
    }
    
    private void addEmptyComponent()
    {
        javax.swing.JLabel VarNameLab = new javax.swing.JLabel("");
        javax.swing.GroupLayout VariablesLayout = new javax.swing.GroupLayout(Variables);
        Variables.setLayout(VariablesLayout);
        VariablesLayout.setHorizontalGroup(
            VariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VariablesLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(VarNameLab)
                    .addGap(0, 2, Short.MAX_VALUE)))
        );
        VariablesLayout.setVerticalGroup(
            VariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VariablesLayout.createSequentialGroup()
                    .addGap(gap)
                    .addComponent(VarNameLab)
                    .addGap(0)))
        );
    }
    
    
    private void FileLocationTextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_FileLocationTextActionPerformed
    {//GEN-HEADEREND:event_FileLocationTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FileLocationTextActionPerformed

    
    private void AddVarButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AddVarButtonActionPerformed
    {//GEN-HEADEREND:event_AddVarButtonActionPerformed
        new VariableWindow().setVisible(true);
    }//GEN-LAST:event_AddVarButtonActionPerformed

    private void RemoveButActionPerformed(java.awt.event.ActionEvent evt, javax.swing.JButton b)                                         
    {                                             
        int index = _Removebutton.indexOf(b);
        removeFromList(index);
        repaintVars();
    } 
    private void EditButActionPerformed(java.awt.event.ActionEvent evt, javax.swing.JButton b)                                         
    {
        int index = _Editbutton.indexOf(b);
        Variable v = _vars.get(index);
        Variable.Remove(v);
        removeFromList(index);
        VariableWindow win = new VariableWindow();
        win.setVisible(true);
        String[] types = {"String", "int", "double", "float", "boolean", "Integer", "Boolean"};
        boolean hasCustom = true;
        for(String s: types)
        {
            if(v.getType() == s)
            {
                hasCustom = false;
            }
        }
        if(hasCustom)
            win.preSet(v.getName(),"Custom", v.getType(), v.getArray(), v.getArrayList(), v.getGet(), v.getSet(), v.getRetrievable());
        else
            win.preSet(v.getName(), v.getType(), v.getArray(), v.getArrayList(), v.getGet(), v.getSet(), v.getRetrievable());
        removeFromList(index);
    }
    private void removeFromList(int index)
    {
        _Editbutton.remove(index);
        _Removebutton.remove(index);
        _labels.remove(index);
        _vars.remove(index);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                GUIMain main = new GUIMain();
                main.setVisible(true);

                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddVarButton;
    private javax.swing.JLabel ClassNameLabel;
    private javax.swing.JTextField ClassNameText;
    private javax.swing.JButton CreateButton;
    private javax.swing.JLabel FileLocationLabel;
    private javax.swing.JTextField FileLocationText;
    private javax.swing.JLabel ProjectNameLabel;
    private javax.swing.JTextField ProjectNameText;
    private javax.swing.JPanel Variables;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
