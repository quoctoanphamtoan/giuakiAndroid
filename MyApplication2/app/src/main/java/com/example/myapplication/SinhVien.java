package com.example.myapplication;

public class SinhVien {
    private  String maSinhVien;
    private  String tenSinhVien;
    private  String gioiTinh;
    private  String maLop;

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public SinhVien(String maSinhVien, String tenSinhVien, String gioiTinh, String maLop) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.gioiTinh = gioiTinh;
        this.maLop = maLop;
    }

    public SinhVien() {
    }

    @Override
    public String toString() {
        return maSinhVien+"\t"+tenSinhVien;
    }
}
