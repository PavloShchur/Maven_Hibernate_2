package shchur_pavlo.Hibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "region")
public class Region implements Serializable {

	private static final long serialVersionUID = -5060019904829164242L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@Column(name = "nameOfRegion", length = 50)
	private String nameOfRegion;

	public Region() {
		super();
	}

	public Region(long id) {
		super();
		this.id = id;
	}

	public Region(String nameOfRegion) {
		super();
		this.nameOfRegion = nameOfRegion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameOfRegion() {
		return nameOfRegion;
	}

	public void setNameOfRegion(String nameOfRegion) {
		this.nameOfRegion = nameOfRegion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Region [id=" + id + ", nameOfRegion=" + nameOfRegion + "]";
	}

}
