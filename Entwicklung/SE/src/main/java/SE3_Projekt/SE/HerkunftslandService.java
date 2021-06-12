package SE3_Projekt.SE;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class HerkunftslandService {

	private static ArrayList<HerkunftslandEntry> entries= new ArrayList<>();
	
	public void addEntry(HerkunftslandEntry herkunftsland) {
		entries.add(herkunftsland);
	}
	
	public ArrayList<HerkunftslandEntry> getEntries(){
		return entries;
	}
}