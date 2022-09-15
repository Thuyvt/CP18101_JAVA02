/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cp18101_thithu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author ThuyVT
 */
public class QLSV {
    List<SinhVien> listStudent = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public QLSV() {
    }
    
    // Phuong thuc nhap thong tin Sinh vien
    public void nhapSv() {
        while(true) {
            // Khoi tao doi tuong Sinh vien, nhan gia tri nhap vao tu ban phim
            SinhVien sv = new SinhVien();
            System.out.println("Nhap ma sinh vien:");
            sv.setMaSV(sc.nextLine());
            System.out.println("Nhap ho va ten:");
            sv.setHoTen(sc.nextLine());
            System.out.println("Nhap chuyen nganh:");
            sv.setChuyenNganh(sc.nextLine());
            
            // Them doi tuong Sinh vien vao danh sach
            listStudent.add(sv);
            
            System.out.println("Ban co muon nhap tiep khong(Y/N)?");
            if (sc.nextLine().trim().equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    
    // Phuong thuc xuat danh sach sinh vien
    public void xuatDanhSach() {
        for (SinhVien sv: listStudent) {
           inThongTin(sv);
        }
        
//        for (int i = 0; i< listStudent.size(); i++) {
//            
//        }
    }
    
    // Phuong thuc tim sinh vien theo ma
    public void timSv() {
        System.out.println("Nhap maSv can tim");
        String maSv = sc.nextLine();
        // C1 
        List<SinhVien> result = listStudent.stream().filter(sv -> sv.getMaSV().equalsIgnoreCase(maSv))
                .collect(Collectors.toList());
        result.forEach(s -> inThongTin(s));
        // C2
//        for (SinhVien sv: listStudent) {
//            if (sv.getMaSV().equalsIgnoreCase(maSv)) {
//                inThongTin(sv);
//            }
//        }
    }
    
    // Phuong thuc sap xep danh sach sinh vien theo chuyen nganh
    public void sapXepSv() {
        Collections.sort(listStudent);
        xuatDanhSach();
    }
    
    // In thong tin sinh vien
    public void inThongTin(SinhVien sv) {
            System.out.printf("Ma sv: %s \n", sv.getMaSV());
            System.out.printf("Ho ten sv: %s \n", sv.getHoTen());
            System.out.printf("Chuyen nganh: %s \n", sv.getChuyenNganh());
            System.out.println("-----");
    }
    
    public void kethua() {
        SinhVienPoly poly = new SinhVienPoly(1, "bca", "Nguyen Anh Duy", "Che tao ten lua");
        poly.inThongTin();
    }
}
