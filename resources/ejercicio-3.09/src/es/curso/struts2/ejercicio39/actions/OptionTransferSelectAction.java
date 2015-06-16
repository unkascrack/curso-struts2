package es.curso.struts2.ejercicio39.actions;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class OptionTransferSelectAction extends ActionSupport {

	private static final long serialVersionUID = -5023766398807447034L;

	public String submit() throws Exception {
		return SUCCESS;
	}

	private List<String> cochesFavoritos;
	private List<String> cochesNoFavoritos;

	public List<String> getCochesFavoritos() {
		return cochesFavoritos;
	}

	public void setCochesFavoritos(List<String> cochesFavoritos) {
		this.cochesFavoritos = cochesFavoritos;
	}

	public List<String> getCochesNoFavoritos() {
		return cochesNoFavoritos;
	}

	public void setCochesNoFavoritos(List<String> cochesNoFavoritos) {
		this.cochesNoFavoritos = cochesNoFavoritos;
	}

	public Map<String, String> getCochesFavoritosDefecto() {
		Map<String, String> m = new LinkedHashMap<String, String>();
		m.put("alfaromeo", "Alfa Romeo");
		m.put("audi", "Audi");
		m.put("bmw", "BMW");
		m.put("mitsubitshi", "Mitsubitshi");
		m.put("porsche", "Porsche");
		m.put("toyota", "Toyota");
		return m;
	}

	public Map<String, String> getCochesNoFavoritosDefecto() {
		Map<String, String> m = new LinkedHashMap<String, String>();
		m.put("fiat", "Fiat");
		m.put("ford", "Ford");
		m.put("landrover", "Land Rover");
		m.put("mercedes", "Mercedes");
		m.put("seat", "Seat");
		m.put("subaru", "Subaru");
		return m;
	}
}
