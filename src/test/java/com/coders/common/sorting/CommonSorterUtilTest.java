package com.coders.common.sorting;

import java.util.Arrays;
import java.util.List;

import com.coders.common.model.Customer;
import com.coders.common.model.Product;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class to assert methods in {@link CommonSorterUtil}.
 *
 * @author chinthakad
 */
public class CommonSorterUtilTest {
	
	private CommonSorterUtil sorterUtil;
	@Before
	public void setUP() {
		sorterUtil = new CommonSorterUtil();
	}

	@Test
	public void testSortByCustomerId() {
		Customer custa = new Customer();
		custa.setId(934);
		custa.setName("Eric");
		custa.setCompany("99XT");
		
		Customer custb = new Customer();
		custb.setId(734);
		custb.setName("Joe");
		custb.setCompany("Visolit");
		
		Customer custc = new Customer();
		custc.setId(134);
		custc.setName("Carl");
		custc.setCompany("IBM");
		List<Customer> inputCustomerList = Arrays.asList(new Customer[]{custa, custb, custc});
		List<Customer> sortedCustomerList = sorterUtil.sortByCustomerId(inputCustomerList);
		
		assertTrue("Sorted customer List - By ID: first item is wrong !", sortedCustomerList.get(0).equals(custc));
		assertTrue("Sorted customer List - By ID: second item is wrong !", sortedCustomerList.get(1).equals(custb));
		assertTrue("Sorted customer List - By ID: third item is wrong !", sortedCustomerList.get(2).equals(custa));
	}
	
	@Test
	public void testSortByProductCode() {
		Product proda = new Product();
		proda.setProdCode("Amber");
		proda.setDescription("Plastic bag");
		
		Product prodb = new Product();
		prodb.setProdCode("Zeos");
		prodb.setDescription("Fibre bag");
		
		
		Product prodc = new Product();
		prodc.setProdCode("Kenwood");
		prodc.setDescription("Wood");
		List<Product> inputProductList = Arrays.asList(new Product[]{proda, prodb, prodc});
		List<Product> sortedProductList = sorterUtil.sortByProductCode(inputProductList);
		
		assertTrue("Sorted Product List - By CODE: first item is wrong !", sortedProductList.get(0).equals(proda));
		assertTrue("Sorted Product List - By CODE: second item is wrong !", sortedProductList.get(1).equals(prodc));
		assertTrue("Sorted Product List - By CODE: third item is wrong !", sortedProductList.get(2).equals(prodb));
	}

}
