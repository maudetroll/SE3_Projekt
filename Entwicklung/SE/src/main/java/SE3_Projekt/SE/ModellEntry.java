package SE3_Projekt.SE;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
public class ModellEntry implements Serializable {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private long id;
	
	
    @ManyToOne
    private MobilTelHerstellerEntry mobilTelHersteller;
	
    @Column(length = 64)
    @Size(min = 1, max = 64, message = "1<L�nge>=64")
    @NotNull(message = "Muss ungleich null sein")
	private String modellName;
    
    @Column(length = 64)
    @NotNull(message = "Muss ungleich null sein")
	private double displayGroesse;
    
    @Column(length = 64)
    @Size(min = 1, max = 64, message = "1<L�nge>=64")
    @NotNull(message = "Muss ungleich null sein")
	private String prozessorName;
    
    public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public double getDisplayGroesse() {
		return displayGroesse;
	}



	public void setDisplayGroesse(double displayGroesse) {
		this.displayGroesse = displayGroesse;
	}



	@Column(length = 64)
    @NotNull(message = "Muss ungleich null sein")
	private double preis;
	
	@Column(length = 200)
    	@Size(min = 1, max = 200, message = "1<Lï¿½nge>=200")
       @NotNull(message = "Muss ungleich null sein")
	private String urlBild;
	
	public String getUrlBild() {
		return urlBild;
	}


	public void setUrlBild(String urlBild) {
		this.urlBild = urlBild;
	}
    
    
    
	public MobilTelHerstellerEntry getMobilTelHersteller() {
		return mobilTelHersteller;
	}



	public void setMobilTelHersteller(MobilTelHerstellerEntry mobilTelHersteller) {
		this.mobilTelHersteller = mobilTelHersteller;
	}



	public String getModellName() {
		return modellName;
	}



	public void setModellName(String modellName) {
		this.modellName = modellName;
	}



	public String getProzessorName() {
		return prozessorName;
	}



	public void setProzessorName(String prozessorName) {
		this.prozessorName = prozessorName;
	}



	public double getPreis() {
		return preis;
	}



	public void setPreis(double preis) {
		this.preis = preis;
	}



	public ModellEntry() {
		
	}
}
