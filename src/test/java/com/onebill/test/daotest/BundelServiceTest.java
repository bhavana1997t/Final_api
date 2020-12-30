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

import com.onebill.customizer.dao.BundelDAO;
import com.onebill.customizer.entities.Bundel;
import com.onebill.customizer.service.BundelServiceImpl;


@RunWith(MockitoJUnitRunner.class)
public class BundelServiceTest {
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	@Mock
	private BundelDAO bundelDao;
	
	@InjectMocks
	private static BundelServiceImpl service=new BundelServiceImpl();
	
	private Bundel bundel;
	
	@Test
	public void TestaddBundel() {
		bundel=new Bundel();
		bundel.setBundelDescription("wrv");
		bundel.setBundelId(123);
		bundel.setBundelName("vrt");
	    Bundel res=new Bundel();
		BeanUtils.copyProperties(res ,bundel );
		when(bundelDao.addBundel(bundel)).thenReturn(bundel);
		
	}
	
	@Test
	public void TestUpdateBundel() {
		bundel=new Bundel();
		bundel.setBundelDescription("wrvfsg");
		bundel.setBundelId(123);
		bundel.setBundelName("vrt");
	    Bundel res=new Bundel();
		BeanUtils.copyProperties(res ,bundel );
		when(bundelDao.addBundel(bundel)).thenReturn(bundel);
		
	}

}
