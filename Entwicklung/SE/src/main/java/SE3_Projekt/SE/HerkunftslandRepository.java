package SE3_Projekt.SE;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Herkunftslaender", path = "Herkunftslaender")
public interface HerkunftslandRepository extends PagingAndSortingRepository<HerkunftslandEntry, Long> 
{
	List <HerkunftslandEntry> findByName(@Param("name") String name);
	
	List <HerkunftslandEntry> findByGruendungsjahr(@Param("Jahr") int jahr);

}
