package shchur_pavlo.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "council")
public class Council {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@Column(name = "nameOfCouncil", length = 50)
	private String nameOfCouncil;

	@OneToOne(mappedBy = "council")
	private City city;

	public Council() {
		super();
	}

	public Council(long id) {
		super();
		this.id = id;
	}

	public Council(long id, String nameOfCouncil) {
		super();
		this.id = id;
		this.nameOfCouncil = nameOfCouncil;
	}

	public Council(long id, String nameOfCouncil, City city) {
		super();
		this.id = id;
		this.nameOfCouncil = nameOfCouncil;
		this.city = city;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameOfCouncil() {
		return nameOfCouncil;
	}

	public void setNameOfCouncil(String nameOfCouncil) {
		this.nameOfCouncil = nameOfCouncil;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

}
