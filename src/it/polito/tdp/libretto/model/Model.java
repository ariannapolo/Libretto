package it.polito.tdp.libretto.model;

import java.util.ArrayList;
import java.util.List;

public class Model {
	private List<Esame> esami;
	
	public Model(){
		this.esami = new ArrayList<Esame>();
	}
	/**
	 * Aggiunge un nuovo esame agli esami presenti,
	 * verificando che non ci sia gi�
	 * @param e
	 * @return true se l'ha inserito, false se esisteva gi� e quindi non � stato inserito
	 */
	public boolean addEsame(Esame e){
		if(!esami.contains(e)){ //qui ci serve equals
			esami.add(e);
			return true;
		}else
			return false;
	}
	/**
	 * Ricerca se esiste un esame con il codice specificato.
	 * Se esiste lo restituisce, altrimenti restituisce null.
	 * @param codice codice dell'esame da cercare
	 * @return l'esame trovato, oppure null se non trovato
	 */
	public Esame trovaEsame(String codice){
		//creo un oggetto esame "finto" con quel codice
		int pos = esami.indexOf(new Esame(codice, null, null));
		if(pos == -1){
			return null;
		}else{
			return esami.get(pos);
		}
	}

}
