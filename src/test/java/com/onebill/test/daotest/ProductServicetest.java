package com.onebill.test.daotest;
import static org.mockito.Mockito.when;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.BeanUtils;
import com.onebill.customizer.dao.ProductDAO;
import com.onebill.customizer.entities.Company;
import com.onebill.customizer.entities.Products;
import com.onebill.customizer.service.ProductServiceImpl;


@RunWith(MockitoJUnitRunner.class)
public class ProductServicetest {
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	@Mock
	private ProductDAO productDao;
	
	@InjectMocks
	private static ProductServiceImpl service = new ProductServiceImpl();
	
	private Products product;
	
	@Test
	public void TestaddProduct(){
		product=new Products();
		product.setProductDescription("egvr");
		product.setProductId(233);
		product.setProductName("evgg");
		
		Company p=new Company();
		p.setCompanyAddress("gbara");
		p.setCompanyName("ebwt");
		p.setCompanyPhone(3464576l);

		product.setCompany(p);
		Products res = new Products();
		BeanUtils.copyProperties(res ,product );
		
		when(productDao.addproduct(p,product)).thenReturn(product);

	}
	
	@Test
	public void TestUpdateProduct(){
		product=new Products();
		product.setProductDescription("egvr");
		product.setProductId(233);
		product.setProductName("evgg");
		
		Company p=new Company();
		p.setCompanyAddress("gbara");
		p.setCompanyName("ebwt");
		p.setCompanyPhone(3464576l);

		product.setCompany(p);
	
		Products res = new Products();
		BeanUtils.copyProperties(res ,product );
		
		when(productDao.updateProduct(product)).thenReturn(product);

	}

}
