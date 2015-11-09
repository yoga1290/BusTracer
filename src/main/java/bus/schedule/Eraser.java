/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.schedule;

import bus.repository.Bus;
import bus.repository.BusRepository;
import bus.repository.PMF;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.PreparedQuery;
import static java.lang.System.in;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author yoga1290
 */
@Controller
@RequestMapping("/cron")
public class Eraser {
    
    @Autowired
    private BusRepository buses;
    @Async
    @RequestMapping("/erase")
    private void erase(){
	Iterator<Bus> it=buses.findAll().iterator();
	com.google.appengine.api.datastore.DatastoreService 
		 		datastore = DatastoreServiceFactory.getDatastoreService();
	while(it.hasNext())
	    datastore.delete(KeyFactory.createKey("Bus", it.next().getId()));
    }
}
