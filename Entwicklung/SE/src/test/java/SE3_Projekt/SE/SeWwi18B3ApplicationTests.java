package SE3_Projekt.SE;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.event.annotation.BeforeTestClass;

@SpringBootTest
class SeWwi18B3ApplicationTests {
	
	HerkunftslandRepository instance;
	
	@BeforeEach
	public void preparation() {
	instance= new HerkunftslandRepository() {
		
		@Override
		public <S extends HerkunftslandEntry> Iterable<S> saveAll(Iterable<S> entities) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <S extends HerkunftslandEntry> S save(S entity) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Optional<HerkunftslandEntry> findById(Long id) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Iterable<HerkunftslandEntry> findAllById(Iterable<Long> ids) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Iterable<HerkunftslandEntry> findAll() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean existsById(Long id) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public void deleteById(Long id) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void deleteAllById(Iterable<? extends Long> ids) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void deleteAll(Iterable<? extends HerkunftslandEntry> entities) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void deleteAll() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void delete(HerkunftslandEntry entity) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public long count() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public Page<HerkunftslandEntry> findAll(Pageable pageable) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Iterable<HerkunftslandEntry> findAll(Sort sort) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public List<HerkunftslandEntry> findByName(String name) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public List<HerkunftslandEntry> findByGruendungsjahr(int jahr) {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	}
//	@Test
//	void contextLoads() {
//		SeWwi18B3Application a= new SeWwi18B3Application();
//	}
	
//	@BeforeEach
//    public void preparation() {
//		HerkunftslandRepository instance= createInstance();
//	}
    

    @Test
    public final void testFindByName() {
        assertFalse(instance.findByName("USA").isEmpty());
    }
    
    @Test
    public final void testFindByGruendungsjahr() {
        assertFalse(instance.findByGruendungsjahr(1776).isEmpty());
    }

}
