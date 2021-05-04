package net.javaguides.springboot.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity
@Table(name = "toa_tau")
public class ToaTau {

	@Id @Size(max = 10)
	private String maToaTau;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "ma_tau", nullable = false)
	private Tau maTau;

	public ToaTau() {
	}

	public ToaTau(@Size(max = 10) String maToaTau, Tau maTau) {
		this.maToaTau = maToaTau;
		this.maTau = maTau;
	}

	public String getMaToaTau() {
		return maToaTau;
	}

	public void setMaToaTau(String maToaTau) {
		this.maToaTau = maToaTau;
	}

	public Tau getMaTau() {
		return maTau;
	}

	public void setMaTau(Tau maTau) {
		this.maTau = maTau;
	}
}
