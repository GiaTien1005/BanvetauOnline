package net.javaguides.springboot.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity
@Table(name = "ve_tau")
public class VeTau {

	@Id @Size(max = 10)
	private String maVeTau;

	@NotNull @Size(max = 20)
	private String loaiVe;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "ma_khach_hang", nullable = false)
	private KhachHang maKhachHang;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "ma_tau", nullable = false)
	private Tau maTau;

	public VeTau() {
	}

	public VeTau(@Size(max = 10) String maVeTau, @NotNull @Size(max = 20) String loaiVe, KhachHang maKhachHang, Tau maTau) {
		this.maVeTau = maVeTau;
		this.loaiVe = loaiVe;
		this.maKhachHang = maKhachHang;
		this.maTau = maTau;
	}

	public String getMaVeTau() {
		return maVeTau;
	}

	public void setMaVeTau(String maVeTau) {
		this.maVeTau = maVeTau;
	}

	public String getLoaiVe() {
		return loaiVe;
	}

	public void setLoaiVe(String loaiVe) {
		this.loaiVe = loaiVe;
	}

	public KhachHang getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(KhachHang maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public Tau getMaTau() {
		return maTau;
	}

	public void setMaTau(Tau maTau) {
		this.maTau = maTau;
	}
}
