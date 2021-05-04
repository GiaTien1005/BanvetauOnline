package net.javaguides.springboot.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity
@Table(name = "tau")
public class Tau {

	@Id @Size(max = 10)
	private String maTau;

	@NotNull
	private Date thoiGianChay;

	@NotNull
	private float gia;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "ma_ga_di", nullable = false)
	private GaTau maGaDi;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "ma_ga_den", nullable = false)
	private GaTau maGaDen;

	public Tau() {
	}

	public Tau(@Size(max = 10) String maTau, @NotNull Date thoiGianChay, @NotNull float gia, GaTau maGaDi, GaTau maGaDen) {
		this.maTau = maTau;
		this.thoiGianChay = thoiGianChay;
		this.gia = gia;
		this.maGaDi = maGaDi;
		this.maGaDen = maGaDen;
	}

	public String getMaTau() {
		return maTau;
	}

	public void setMaTau(String maTau) {
		this.maTau = maTau;
	}

	public Date getThoiGianChay() {
		return thoiGianChay;
	}

	public void setThoiGianChay(Date thoiGianChay) {
		this.thoiGianChay = thoiGianChay;
	}

	public float getGia() {
		return gia;
	}

	public void setGia(float gia) {
		this.gia = gia;
	}

	public GaTau getMaGaDi() {
		return maGaDi;
	}

	public void setMaGaDi(GaTau maGaDi) {
		this.maGaDi = maGaDi;
	}

	public GaTau getMaGaDen() {
		return maGaDen;
	}

	public void setMaGaDen(GaTau maGaDen) {
		this.maGaDen = maGaDen;
	}
}
