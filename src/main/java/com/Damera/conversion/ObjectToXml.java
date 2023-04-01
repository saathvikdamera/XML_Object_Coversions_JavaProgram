package com.Damera.conversion;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.Damera.entity.Employee;

public class ObjectToXml {
	
	public static void jaxbObjectToXml(Employee employee) {
		
		try {
			JAXBContext jaxbContent = JAXBContext.newInstance(Employee.class);
			
			Marshaller marshaller = jaxbContent.createMarshaller();
			
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			File file = new File("D:\\19-JFSD\\Java RealTime Project\\JRTP Workspace\\employee.xml");
			
			marshaller.marshal(employee, file);
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
	}

}
