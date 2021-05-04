package net.javaguides.springboot.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cho_ngoi")
public class ChoNgoi {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long maCN;

	@NotNull @Size(max = 10)
	private String tenCN;

	@NotNull @Size(max = 50)
	private String loaiGhe;

	@NotNull @Size(max = 20)
	private String tinhTrang;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "ma_toa_tau", nullable = false)
	private ToaTau maToaTau;

	public ChoNgoi() {
	}

	public ChoNgoi(@NotNull @Size(max = 10) String tenCN, @NotNull @Size(max = 50) String loaiGhe, @NotNull @Size(max = 20) String tinhTrang, ToaTau maToaTau) {
		this.tenCN = tenCN;
		this.loaiGhe = loaiGhe;
		this.tinhTrang = tinhTrang;
		this.maToaTau = maToaTau;
	}

	public long getMaCN() {
		return maCN;
	}

	public void setMaCN(long maCN) {
		this.maCN = maCN;
	}

	public String getTenCN() {
		return tenCN;
	}

	public void setTenCN(String tenCN) {
		this.tenCN = tenCN;
	}

	public String getLoaiGhe() {
		return loaiGhe;
	}

	public void setLoaiGhe(String loaiGhe) {
		this.loaiGhe = loaiGhe;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public ToaTau getMaToaTau() {
		return maToaTau;
	}

	public void setMaToaTau(ToaTau maToaTau) {
		this.maToaTau = maToaTau;
	}
}
