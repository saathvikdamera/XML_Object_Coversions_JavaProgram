package com.Damera.client;

import com.Damera.conversion.ObjectToXml;
import com.Damera.conversion.XmlToObject;
import com.Damera.entity.Employee;

public class Tester {

	public static void main(String[] args) {
		
//		Employee employee = new Employee(1155,"saathvik",50000.0,10);
//		
//		ObjectToXml.jaxbObjectToXml(employee);
		
		String fileName = "D:\\\\19-JFSD\\\\Java RealTime Project\\\\JRTP Workspace\\\\employee.xml";
		
		XmlToObject.jaxbXmlFileToObject(fileName);

	}

}
