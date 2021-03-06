package shchur_pavlo.Hibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Country implements Serializable {

	private static final long serialVersionUID = 2816338468975707972L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long id;
	@Column(name="nameOfCountry", length = 50)
	private String nameOfCountry;

	public Country() {
		super();
	}

	public Country(long id) {
		super();
		this.id = id;
	}

	public Country(String nameOfCountry) {
		super();
		this.nameOfCountry = nameOfCountry;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameOfCountry() {
		return nameOfCountry;
	}

	public void setNameOfCountry(String nameOfCountry) {
		this.nameOfCountry = nameOfCountry;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", nameOfCountry=" + nameOfCountry + "]";
	}

}
