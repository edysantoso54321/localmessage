/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import view.main;

/**
 *
 * @author Administrator
 */
public class main_kontroler implements MouseListener{
    private main gui;
    private String nama;
    public main_kontroler(String x){
        nama = x;
        gui = new main(x);
        gui.setVisible(true);
        gui.addlistener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
        if (source.equals(gui.getExit())){
            gui.dispose();
            new login_kontroler();
        }else if(source.equals(gui.getTambahuser())){
            gui.dispose();
            new addUser_kontroler(nama);
        }else if(source.equals(gui.getTambah())){
            gui.dispose();
            new tambahdata_kontroler(nama);
        }else if(source.equals(gui.getHapus())){
            gui.dispose();
            new hapusdata_kontroler(nama);
        }else if(source.equals(gui.getLihat())){
            gui.dispose();
            new lihatdata_kontroler(nama);
        }else if(source.equals(gui.getPrediksi())){
            gui.dispose();
            new prediksi_kontroler(nama);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
