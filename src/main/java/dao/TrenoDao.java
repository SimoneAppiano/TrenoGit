package dao;

import java.util.List;

import dto.TrenoDTO;
import dto.UtenteDTO;
import treno.Treno;

public interface TrenoDao{
	public TrenoDTO add(Treno treno, UtenteDTO utente);
	public void deleteTreno(int id);
	public List<TrenoDTO> listaTreni();
}
