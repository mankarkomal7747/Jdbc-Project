package com.qsp.controller;

import com.qsp.dao.InsertDao;
import com.qsp.dto.Pen;



public class InsertController {
	public static void main(String[] args) {
			Pen pen=new  Pen();
			pen.setId(2);
			pen.setName("Luxuryypen");
			pen.setBrand("Montblac");
			pen.setPrice(20);	
		InsertDao insertDao=new InsertDao();
		insertDao.insertPen(pen);
	}
}
