package view;


import javax.swing.JFrame;
import javax.swing.WindowConstants;
import view.AccountOverviewItemView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lipat
 */
public abstract class AccountOverviewItemListView extends javax.swing.JPanel {

    /**
     * Creates new form AccountOverviewItemListView
     */
    public AccountOverviewItemListView() {
        initComponents();
    }

    public static void main(String[] args) {
        JFrame tempFrame = new JFrame();
        tempFrame.setSize(500, 500);
        tempFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        AccountOverviewItemListView view =new AccountOverviewItemListView() {
            @Override
            public void itemClicked(int id, String name) {
                
            }
        };
        tempFrame.add(view);
        tempFrame.setVisible(true);
    }
    
    public void addItem(int id,String title){
        this.add(new AccountOverviewItemView(id,title, this));
    }
    
    public abstract void itemClicked(int id,String name);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}