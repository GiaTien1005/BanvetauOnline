package net.javaguides.springboot.model;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "khach_hang")
public class KhachHang {

	@Id @Size(max = 10)
	private String maKhachHang;

	@NotNull @Size(max = 20)
	private String doiTuong;

	@NotNull @Size(max = 50)
	private String hoTen;

	@NotNull
	private String cmnd;

	@NotNull @Size(max = 50)
	private String email;

	@NotNull @Size(max = 15)
	private String sdt;

	public KhachHang() {
	}

	public KhachHang(@Size(max = 10) String maKhachHang, @NotNull @Size(max = 20) String doiTuong, @NotNull @Size(max = 50) String hoTen, @NotNull String cmnd, @NotNull @Size(max = 50) String email, @NotNull @Size(max = 15) String sdt) {
		this.maKhachHang = maKhachHang;
		this.doiTuong = doiTuong;
		this.hoTen = hoTen;
		this.cmnd = cmnd;
		this.email = email;
		this.sdt = sdt;
	}

	public String getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public String getDoiTuong() {
		return doiTuong;
	}

	public void setDoiTuong(String doiTuong) {
		this.doiTuong = doiTuong;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	@Override
	public String toString() {
		return "KhachHang{" +
				"maKhachHang='" + maKhachHang + '\'' +
				", doiTuong='" + doiTuong + '\'' +
				", hoTen='" + hoTen + '\'' +
				", cmnd=" + cmnd +
				", email='" + email + '\'' +
				", sdt='" + sdt + '\'' +
				'}';
	}
}
