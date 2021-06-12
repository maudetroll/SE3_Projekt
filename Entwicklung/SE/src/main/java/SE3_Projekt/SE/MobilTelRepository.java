package SE3_Projekt.SE;


import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "MobiltelefonHersteller", path = "MobiltelefonHersteller", itemResourceRel="mobilTelHersteller")
public interface MobilTelRepository extends PagingAndSortingRepository<MobilTelHerstellerEntry, Long> {
	
	List <MobilTelHerstellerEntry> findByName(@Param("Name") String name);
	
	List <MobilTelHerstellerEntry> findByGruendungsjahr(@Param("Gruendungsjahr") int gruendungsjahr);
	

}