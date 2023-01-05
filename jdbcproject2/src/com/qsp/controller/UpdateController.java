package com.qsp.controller;


import com.qsp.dao.UpdateDao;
import com.qsp.dto.Pen;

public class UpdateController {
	public static void main(String[] args) {
		Pen pen=new  Pen();
		pen.setId(3);
		pen.setName("Luxuryypen");
		pen.setBrand("ontblac");
		pen.setPrice(20);	
	UpdateDao updateDao=new UpdateDao();
	updateDao.updatePen(pen);
}
}


