/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *    l_ IDBManager
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 * 
 * @author : pengfox
 * @version : 1.0
 */
public interface IDBManager {
	String ORACLE_DATABASE = "ORACLE";
	String SYBASE_DATABASE = "SYBASE";
	public void insert();
	public void search();
	public void update();
	public void delete();
	static IDBManager getDBObject(String database) {
		if (database.equals(ORACLE_DATABASE)) {
			return new OracleDB();
		} else if (database.equals(SYBASE_DATABASE)) {
			return new SybaseDB();
		} else return null;
	}
	
}
