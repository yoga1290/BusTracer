package bus.repository;

import java.util.Collection;
import java.util.List;
import javax.jdo.Query;
import org.springframework.stereotype.Service;

@Service
public class BusRepository extends JDOCrudRepository<Bus, String>{

	public BusRepository() {
		super(Bus.class);
	}

    public Bus findOne(int id) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	


}
