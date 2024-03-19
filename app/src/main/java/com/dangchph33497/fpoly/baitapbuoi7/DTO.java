package com.dangchph33497.fpoly.baitapbuoi7;

public class DTO {
    private String tenXe;
    private double gia;
    private String anh;
    private String loaiXe;

    public DTO() {
    }

    public DTO(String tenXe, double gia, String anh, String loaiXe) {
        this.tenXe = tenXe;
        this.gia = gia;
        this.anh = anh;
        this.loaiXe = loaiXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    @Override
    public String toString() {
        return "DTO{" +
                "tenXe='" + tenXe + '\'' +
                ", gia=" + gia +
                ", anh='" + anh + '\'' +
                ", loaiXe='" + loaiXe + '\'' +
                '}';
    }
}
