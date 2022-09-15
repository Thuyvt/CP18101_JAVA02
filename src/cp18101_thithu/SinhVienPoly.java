/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cp18101_thithu;

/**
 *
 * @author ThuyVT
 */
public class SinhVienPoly extends SinhVien {
    int chuyenNganhHep; // (1:Java;2:C#)

    public SinhVienPoly(int chuyenNganhHep) {
        this.chuyenNganhHep = chuyenNganhHep;
    }

    public SinhVienPoly(int chuyenNganhHep, String maSV, String hoTen, String chuyenNganh) {
        super(maSV, hoTen, chuyenNganh);
        this.chuyenNganhHep = chuyenNganhHep;
    }

    public int getChuyenNganhHep() {
        return chuyenNganhHep;
    }

    public void setChuyenNganhHep(int chuyenNganhHep) {
        this.chuyenNganhHep = chuyenNganhHep;
    }
    
    public void inThongTin() {
    //...
    }
    
}
