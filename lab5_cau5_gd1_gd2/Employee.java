/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_cau5_gd1_gd2;

import java.io.Serializable;

/**
 *
 * @author home
 */
public class Employee implements Serializable{

    private String maNV;
    private String hoTen;
    private int tuoi;

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) throws Exception {
        
        //1. Tên phải khác rỗng mới hợp lệ
        if (hoTen.equals(""))
        {
            // ném ra lỗi bằng tiếng việt để bên hàm main bắt lại
            throw new Exception("Tên không được rỗng! ");
        }
        else
        {
            this.hoTen = hoTen; // hợp lệ
        }       
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) throws Exception {
        
        //1. Chỉ được nhập tuổi đi làm từ 17 đến 65
        if ((tuoi <17 )||( tuoi > 65))
        {
            throw new Exception("Tuổi phải từ 17 đến 65.");
        }
        else
        {
            this.tuoi = tuoi; // hợp lệ.
        }
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }
    private String email;
    private int luong;

    public Employee() {

    }

    public Employee(String maNV, String hoTen, int tuoi, String email, int luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.email = email;
        this.luong = luong;
    }
}
