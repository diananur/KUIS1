package kuis_sehat;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author Lenovo
 */
public class kuis_sehatController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button buttonproses;
    @FXML
    private Button buttonreset;
    @FXML
    private JFXTextField editnama;
    @FXML
    private JFXTextField edittinggi;
    @FXML
    private RadioButton rdl;
    @FXML
    private ToggleGroup pilihanjk;
    @FXML
    private RadioButton rdp;
    @FXML
    private TextArea hasil;
    @FXML
    private TextArea saran;
    @FXML
    private TextField ideal;
    @FXML
    private JFXTextField editberat;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        int Ideal = 0;
        String analisa = hasil.getText();
        String sarann = "";
        String nama = editnama.getText();
        String Tinggi = edittinggi.getText();
        String Berat = editberat.getText();
        int tinggii = Integer.parseInt(edittinggi.getText());
        int beratt = Integer.parseInt(editberat.getText());
        if(rdl.isSelected()){
                Ideal = tinggii - 105;
                if(Ideal == beratt){
                    analisa = "Ideal";
                    sarann = "Beran badan anda sudah cukup baik dan baik untuk kesehatan anda";
                }else if(Ideal > beratt){
                    analisa = "Underwight";
                    sarann = "Berat badan anda kurang maksimal, perbaiki pola makan anda dan pertambah";
                }else{
                    analisa = "Overweight";
                    sarann = "Berat badan anda terlalu berat, perbaiki pola makan dengan mengurani porsi makan";
                }
        } 
        
        if(rdp.isSelected()){
                Ideal = tinggii - 110;
                if(Ideal == beratt){
                    analisa = "Ideal";
                    sarann = "Beran badan anda sudah cukup baik dan baik untuk kesehatan anda";
                }else if(Ideal > beratt){
                    analisa = "Underwight";
                    sarann = "Berat badan anda kurang maksimal, perbaiki pola makan anda dan pertambah";
                }else{
                    analisa = "Overweight";
                    sarann = "Berat badan anda terlalu berat, perbaiki pola makan dengan mengurani porsi makan";
                }
        }
        
        ideal.setText("" + Ideal);
        hasil.setText("Nama : "+nama+"\nTinggi : "+Tinggi+"\nBerat Badan : "+Berat+"\nanda Teranalisa :" + analisa);
        saran.setText(sarann);
    }

    @FXML
    private void hapus(ActionEvent event) {
        editnama.setText("");
        edittinggi.setText("");
        editberat.setText("");
        ideal.setText("");
        hasil.setText("");
        saran.setText("");
        rdl.setSelected(false);
        rdp.setSelected(false);
    }
    
}
