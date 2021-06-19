package SE3_Projekt.SE;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
@Entity
@Data
public class MobilTelHerstellerEntry implements Serializable {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private long id;
	
	@ManyToOne
    private HerkunftslandEntry herkunftsland;
    
    @Column(length = 64)
    @Size(min = 1, max = 64, message = "1<L�nge>=64")
    @NotNull(message = "Muss ungleich null sein")
    private String name = "";
    
    
    @Column(length = 64)
    @NotNull(message = "Muss ungleich null sein")
	private int gruendungsjahr;
    
    @Column(length = 64)
    @NotNull(message = "Muss ungleich null sein")
	private int mitarbeiteranzahl;
    
    @Column(length = 64)
    @NotNull(message = "Muss ungleich null sein")
	private int umsatz;
    
    @OneToMany(mappedBy="mobilTelHersteller")
    private List<ModellEntry> modelle = new ArrayList<>();
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getGruendungsjahr() {
		return gruendungsjahr;
	}
	
	public void setGruendungsjahr(int gruendungsjahr) {
		this.gruendungsjahr = gruendungsjahr;
	}
	
	public int getMitarbeiteranzahl() {
		return mitarbeiteranzahl;
	}
	
	public void setMitarbeiteranzahl(int mitarbeiteranzahl) {
		this.mitarbeiteranzahl = mitarbeiteranzahl;
	}
	
	public int getUmsatz() {
		return umsatz;
	}
	
	public void setUmsatz(int umsatz) {
		this.umsatz = umsatz;
	}

}