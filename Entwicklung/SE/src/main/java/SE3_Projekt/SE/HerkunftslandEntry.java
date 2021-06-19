package SE3_Projekt.SE;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class HerkunftslandEntry implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private long id;
    
    @Column(length = 64)
    @Size(min = 1, max = 64, message = "1<L�nge>=64")
    @NotNull(message = "Muss ungleich null sein")
    private String name = "";
    
    
    @Column(length = 64)
    @NotNull(message = "Muss ungleich null sein")
	private long einwohnerzahl;
    
    @OneToMany(mappedBy="herkunftsland")
    private List<MobilTelHerstellerEntry> hersteller = new ArrayList<>();

	@Column(length = 64)
    @NotNull(message = "Muss ungleich null sein")
	private int gruendungsjahr;
	
	
	public HerkunftslandEntry() {
		
	}
}
