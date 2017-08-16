package shchur_pavlo.Hibernate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City implements Serializable {

	private static final long serialVersionUID = -4264271530358773255L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@Column(name = "nameOfCity", length = 50)
	private String nameOfCity;

	@OneToMany(mappedBy = "city")
	private List<Region> regions = new ArrayList<Region>();

	@OneToOne
	@PrimaryKeyJoinColumn
	private Council council;

	public City() {
		super();
	}

	public City(long id) {
		super();
		this.id = id;
	}

	public City(long id, String nameOfCity, Council council) {
		super();
		this.id = id;
		this.nameOfCity = nameOfCity;
		this.council = council;
	}

	public City(long id, String nameOfCity, List<Region> regions, Council council) {
		super();
		this.id = id;
		this.nameOfCity = nameOfCity;
		this.regions = regions;
		this.council = council;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	public String getNameOfCity() {
		return nameOfCity;
	}

	public void setNameOfCity(String nameOfCity) {
		this.nameOfCity = nameOfCity;
	}

	public Council getCouncil() {
		return council;
	}

	public void setCouncil(Council council) {
		this.council = council;
	}
	
	

	@Override
	public String toString() {
		return "City [id=" + id + ", nameOfCity=" + nameOfCity + "]";
	}

}
