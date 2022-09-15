/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cp18101_thithu;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class Main {
    public static void main(String[] args) {
        QLSV ql = new QLSV();
        while (true) {
            System.out.println("Chon chuc nang muon thuc hien");
            System.out.println("1. Nhập 1 danh sách đối tượng");
            System.out.println("2. Xuất danh sách đối tượng");
            System.out.println("3. Tìm SV theo mã");
            System.out.println("4. Sắp xếp danh sách các SV theo thuộc tính chuyenNganh");
            System.out.println("5. Kê thua");
            System.out.println("0. Thoát");
            Scanner sc = new Scanner(System.in);
            int menu = sc.nextInt();
            switch(menu) {
                case 1 -> ql.nhapSv();
                case 2 -> ql.xuatDanhSach();
                case 3 -> ql.timSv();
                case 4 -> ql.sapXepSv();
                case 5 -> ql.kethua();
                case 0 -> System.exit(0);
            }
        }
    }
}
