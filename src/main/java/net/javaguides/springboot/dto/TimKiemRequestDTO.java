package net.javaguides.springboot.dto;

import java.sql.Date;

public class TimKiemRequestDTO {
    private long maGaDi;
    private long maGaDen;
    private String loaiVe;
    private Date thoiGianDi;
    private Date thoiGianVe;

    public TimKiemRequestDTO() {
    }

    public long getMaGaDi() {
        return maGaDi;
    }

    public void setMaGaDi(long maGaDi) {
        this.maGaDi = maGaDi;
    }

    public long getMaGaDen() {
        return maGaDen;
    }

    public void setMaGaDen(long maGaDen) {
        this.maGaDen = maGaDen;
    }

    public String getLoaiVe() {
        return loaiVe;
    }

    public void setLoaiVe(String loaiVe) {
        this.loaiVe = loaiVe;
    }

    public Date getThoiGianDi() {
        return thoiGianDi;
    }

    public void setThoiGianDi(Date thoiGianDi) {
        this.thoiGianDi = thoiGianDi;
    }

    public Date getThoiGianVe() {
        return thoiGianVe;
    }

    public void setThoiGianVe(Date thoiGianVe) {
        this.thoiGianVe = thoiGianVe;
    }

    @Override
    public String toString() {
        return "TimKiemRequestDTO{" +
                "maGaDi=" + maGaDi +
                ", maGaDen=" + maGaDen +
                ", loaiVe='" + loaiVe + '\'' +
                ", thoiGianDi=" + thoiGianDi +
                ", thoiGianVe=" + thoiGianVe +
                '}';
    }
}
