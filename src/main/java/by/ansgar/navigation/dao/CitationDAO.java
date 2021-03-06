package by.ansgar.navigation.dao;

import java.sql.SQLException;
import java.util.List;

import by.ansgar.navigation.entity.Citation;

public interface CitationDAO {
	
	public void addCitation (Citation citation) throws SQLException;
	
	public void editCitation (Citation citation) throws SQLException;
	
	public void deleteCitation (Citation citation) throws SQLException;
	
	public List<Citation> getAllCitation () throws SQLException;
	
	public List<Citation> getAllCitation (int page) throws SQLException;
	
	public List<Citation> getLikedCitation (int page) throws SQLException;

	public Citation getCitationById(long id) throws SQLException;
	
	public List<Citation> getLastAdded () throws SQLException;

}
