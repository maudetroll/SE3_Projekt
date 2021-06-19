package SE3_Projekt.SE;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.event.annotation.BeforeTestClass;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SeWwi18B3ApplicationTests {
	
	HerkunftslandRepository instance;
	Connection conn = null;
	ResultSet rs= null;
	Statement stm =null;
	
	
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

    @Test
    public final void testFindByName() {
    	//assertFalse))
    	assertFalse(instance.findByName("Chile")!= null);
    }
    
    @Test
    public final void testFindByGruendungsjahr() {
        assertTrue(instance.findByGruendungsjahr(1700)== null);
    }
    
    @BeforeAll
    public final void getConnectionToDatabase() {
        conn = null;
        
        try {
            Class.forName("org.h2.Driver");
            
            conn = DriverManager.getConnection(
                    "jdbc:h2:mem:testdb", "sa", ""); 

            DatabaseMetaData md = conn.getMetaData();
            stm = conn.createStatement();

        } catch (Exception e) {
        	System.err.print(e);
            if (rs==null) {
            	fail();
            }
        }
    }
    
    
    public ResultSet getResult(String tabelle) throws SQLException {
    	//stm= getConnectionToDatabase();
        String sql_select = tabelle;
        rs= stm.executeQuery(sql_select);
        return rs;
    }

    

    @BeforeAll
    @Test
    public final void testConnectiontoDatabase() throws SQLException {
    	ResultSet s1= getResult("SHOW TABLES");
    	ArrayList <Object> tables= new ArrayList<>();
    	String[] tabellen = {"HERKUNFTSLAND_ENTRY","MOBIL_TEL_HERSTELLER_ENTRY", "MODELL_ENTRY"};
    	List<Object> expected= Arrays.asList(tabellen);

    	
        while(s1.next()){
        	tables.add(s1.getString(1));
        }
        
        if(tables.size()<1) {
        	tables.add("TEST");
        	tables.add("TEST");
        }
        if(tables.size()<2) {
        	tables.add("TEST");
        }
       
        if(expected.get(0).equals(tables.get(0))&& expected.get(1).equals(tables.get(1))&&expected.get(2).equals(tables.get(2))) {
        	assertTrue(expected.get(0).equals(tables.get(0)));
        	
        } else {
        	fail();
        }
      

    }
    
    @Test
    public final void testGruendungsjahrUSA() throws SQLException{
    	ResultSet rs= getResult("SELECT * FROM HERKUNFTSLAND_ENTRY");
        while(rs.next()){
            if(rs.getString(2).contentEquals("USA")){
            	assertTrue(rs.getInt(4)==1776);
            }
        }
       
    }
    
    @Test
    public final void testGruendungsjahrChina() throws SQLException{
    	ResultSet rs= getResult("SELECT * FROM HERKUNFTSLAND_ENTRY");
        while(rs.next()){
            if(rs.getString(2).contentEquals("Volksrepublik China")){
            	assertTrue(rs.getInt(4)==1949);
            }
        }
        
    }
    
    @Test
    public final void testGruendungsjahrChinaNegativ() throws SQLException{
    	ResultSet rs= getResult("SELECT * FROM HERKUNFTSLAND_ENTRY");
        while(rs.next()){
            if(rs.getString(2).contentEquals("Volksrepublik China")){
            	assertFalse(rs.getInt(4)==1800);
            } 
        }
        
    }
    
    
    @Test
    public final void testSamsungMitarbeiter() throws SQLException{
    	ResultSet rs= getResult("SELECT * FROM MOBIL_TEL_HERSTELLER_ENTRY");
        while(rs.next()){
            if(rs.getString(3).contentEquals("Samsung")){
            	assertTrue(rs.getInt(5)==309630);
            } 
        }

    }
    
    @Test
    public final void testUmsatzHuawei() throws SQLException{
    	ResultSet rs= getResult("SELECT * FROM  MOBIL_TEL_HERSTELLER_ENTRY");
        while(rs.next()){
            if(rs.getString(3).contentEquals("Huawei")){
                System.out.println(rs.getInt(6));
            	assertEquals(122000000, rs.getInt(6));
            } 

        }
       
    }
    
    @Test
    public final void testUmsatzHuaweiNegativ() throws SQLException{
    	ResultSet rs= getResult("SELECT * FROM  MOBIL_TEL_HERSTELLER_ENTRY");
        while(rs.next()){
            if(rs.getString(3).contentEquals("Huawei")){
                System.out.println(rs.getInt(6));
            	assertFalse(rs.getInt(6)==1);
            } 

        }
        
    }
    @AfterAll
    public void closeConnection() throws SQLException {
    	conn.close();
    }
      
}
