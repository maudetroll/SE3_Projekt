package SE3_Projekt.SE;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class MobilTelService {

	private static ArrayList<MobilTelHerstellerEntry> entries= new ArrayList<>();
	
	public void addEntry(MobilTelHerstellerEntry hersteller) {
		entries.add(hersteller);
	}
	
	public ArrayList<MobilTelHerstellerEntry> getEntries(){
		return entries;
	}
}