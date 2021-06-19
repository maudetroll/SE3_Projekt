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
    
    @Column(length = 64)
    @NotNull(message = "Muss ungleich null sein")
	private double preis;
    
    
	public ModellEntry() {
		
	}
}