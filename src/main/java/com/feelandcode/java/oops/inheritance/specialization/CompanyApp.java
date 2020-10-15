package com.feelandcode.java.oops.inheritance.specialization;

import java.util.ArrayList;
import java.util.List;
/**
 * Application class that demonstrates Inheritance for specialization
 * Instances of subclasses behave like subclass and they have Is-A relationship to the superclass
 */
public class CompanyApp {

	public static void main(String[] args) {

		// Software company details
		List<String> solutions = new ArrayList();
		solutions.add("Artificial Intelligence");
		solutions.add("Analytics");
		solutions.add("Digital");
		SoftwareCompany swCompany = new SoftwareCompany();
		swCompany.setSolutions(solutions);
		System.out.println(swCompany.getSolutions());

		// check if instance of SoftwareCompany has Is-A relationship to the company 
		if (swCompany instanceof Company)
			System.out.println("SoftwareCompany Is-A Company");

		// -----------------------------------------------

		// Textile company details
		List<String> brands = new ArrayList();
		brands.add("BrandX");
		brands.add("BrandY");
		brands.add("BrandZ");
		TextileCompany ttCompany = new TextileCompany();
		ttCompany.setBrands(brands);
		System.out.println(ttCompany.getBrands());

		// check if instance of TextileCompany has Is-A relationship to the company
		if (ttCompany instanceof Company)
			System.out.println("TextileCompany Is-A Company");
	}

}
