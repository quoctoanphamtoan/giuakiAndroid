package com.example.myapplication;

import android.view.inputmethod.InlineSuggestionsRequest;

public class SinhVien {
    private  String ma;
    private  String ten;
    private String maLop;
    private  String gioiTinh;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public SinhVien(String ma, String ten, String maLop, String gioiTinh) {
        this.ma = ma;
        this.ten = ten;
        this.maLop = maLop;
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return ma +"        "+ten;
    }
}
