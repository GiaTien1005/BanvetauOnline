package net.javaguides.springboot.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ga_tau")
public class GaTau {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long maGT;

	@NotNull @Size(max = 20)
	private String tenGT;

	public GaTau() {
	}

	public GaTau(@NotNull @Size(max = 20) String tenGT) {
		this.tenGT = tenGT;
	}

	public long getMaGT() {
		return maGT;
	}

	public void setMaGT(long maGT) {
		this.maGT = maGT;
	}

	public String getTenGT() {
		return tenGT;
	}

	public void setTenGT(String tenGT) {
		this.tenGT = tenGT;
	}
}
