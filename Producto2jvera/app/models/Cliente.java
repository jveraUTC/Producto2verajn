package models;

import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.Model;

import play.data.validation.*;

import com.avaje.ebean.*;

/**
 *  entity managed by Ebean
 */
@Entity 

public class Cliente extends Model {
	 private static final long serialVersionUID = 1L;

	   @Id
	    public Long id;
	
	    @Constraints.Required
	    public String name;
	 
	    public String apellido;
	    
	    public String ncedula;
	    
	    public String  nmesa;
	    
	    public String  norden;
	    
	  	    
	   public static Find<Long,Cliente> find = new Find<Long,Cliente>(){};
		public static List<Cliente> listadoClientes() {
			// TODO Auto-generated method stub
			return find.all();
		}
	    

}
