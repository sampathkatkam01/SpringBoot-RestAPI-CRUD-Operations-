package in.sampath.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "producttable")
public class productEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer PId;

	private String Pname;

	private String Pcategery;

	private Long Pprice;
	
	public productEntity() {
		// TODO Auto-generated constructor stub
	}
	

	public productEntity(Integer pId, String pname, String pcategery, Long pprice) {
		super();
		PId = pId;
		Pname = pname;
		Pcategery = pcategery;
		Pprice = pprice;
	}


	public Integer getPId() {
		return PId;
	}

	public void setPId(Integer pId) {
		PId = pId;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public String getPcategery() {
		return Pcategery;
	}

	public void setPcategery(String pcategery) {
		Pcategery = pcategery;
	}

	public Long getPprice() {
		return Pprice;
	}

	public void setPprice(Long pprice) {
		Pprice = pprice;
	}

	@Override
	public String toString() {
		return "productEntity [PId=" + PId + ", Pname=" + Pname + ", Pcategery=" + Pcategery + ", Pprice=" + Pprice
				+ "]";
	}

}
