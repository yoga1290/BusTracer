package bus.repository;

import java.util.Objects;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;


@PersistenceCapable
public class Bus {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private String id;
	

	@Persistent
	private double lat;
	@Persistent
	private double lng;

	
	public Bus(){

	}
	public Bus(String id){
		this.id=id;
	}
	





	
	public String getId() {
		return this.id;
	}
public void setId(String id) {
		this.id = id;
	}

    public double getLat() {
	return lat;
    }

    public double getLng() {
	return lng;
    }

    public void setLat(double lat) {
	this.lat = lat;
    }

    public void setLng(double lng) {
	this.lng = lng;
    }



}
		