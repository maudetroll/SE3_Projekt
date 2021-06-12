package SE3_Projekt.SE;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Modelle", path = "Modelle")
public interface ModellRepository extends PagingAndSortingRepository<ModellEntry, Long> {
	
	List <ModellEntry> findByModellName(@Param("ModellName") String modellName);
	
	List <ModellEntry> findByPreis(@Param("Preis") double preis);

}
