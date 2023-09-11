/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package demo;

import java.util.ArrayList;

public interface DAOInterface<T> {
    	public ArrayList<T> selectAll();
        
        public T selectById(T t);
 
	public int insert(T t);
        
	public int update(T t, String mssv);
        
	public int delete(String mssv);
}

