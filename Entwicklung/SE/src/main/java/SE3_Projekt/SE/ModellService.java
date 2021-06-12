package SE3_Projekt.SE;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ModellService {

	private static final List<ModellEntry> entries= new ArrayList<>();
	
	public void addEntry(ModellEntry model) {
		entries.add(model);
	}
	
	public List<ModellEntry> getEntries(){
		return entries;
	}
}