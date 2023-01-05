package com.qsp.controller;

import com.qsp.dao.DeleteDao;
import com.qsp.dto.Pen;

public class DeleteController {
	public static void main(String[] args) {
		Pen pen=new  Pen();
		pen.setId(2);
		pen.setName("Luxuryypen");
		pen.setBrand("Montblac");
		pen.setPrice(20);	
	DeleteDao deleteDao=new DeleteDao();
	deleteDao.deletePen(pen);
}
}


