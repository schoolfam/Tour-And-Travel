package com.tourAndTravel.guest.repository;



import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.tourAndTravel.guest.model.Role;

@RunWith(SpringRunner.class)
@DataJpaTest
public class RoleRepositoryTest 
{
	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private RoleRepository roleRepository;
	
	private Role getRole(String roleS)
	{
		Role role = new Role();
		role.setRole(roleS);
		return role;
	}
	
	@Test
	public void testSaveRole()
	{
		Role role = getRole("ADMIN");
		Role savedInDB = entityManager.persist(role);
		
		Role getFromDB = roleRepository.findByRole(savedInDB.getRole());
		
		assertThat(getFromDB).isEqualTo(savedInDB);
	}
	
	@Test
	public void testGetAllRoles()
	{
		Role role = getRole("ADMIN");
		
		Role role1 = getRole("USER");
		
		entityManager.persist(role);
		entityManager.persist(role1);
		
		Iterable<Role> allRoles = roleRepository.findAll();
		List<Role> roleList = new ArrayList<>();
		
		for(Role eachRole: allRoles)
		{
			roleList.add(eachRole);
		}
		
		assertThat(roleList.size()).isEqualTo(2);
	}
	
	@Test
	public void testdeleteByRole()
	{
		Role role = getRole("ADMIN");
		
		Role role1 = getRole("USER");
		
		entityManager.persist(role);
		Role role3 = entityManager.persist(role1);
		
		entityManager.remove(role3);
		
		Iterable<Role> allRoles = roleRepository.findAll();
		List<Role> roleList = new ArrayList<>();
		
		for(Role eachRole: allRoles)
		{
			roleList.add(eachRole);
		}
		
		assertThat(roleList.size()).isEqualTo(1);
	}
	
	@Test
	public void testfindByRole()
	{
		Role role = getRole("ADMIN");
		
		Role savedInDB = entityManager.persist(role);
		
		Role getFromDB = roleRepository.findByRole(savedInDB.getRole());
		
		assertThat(getFromDB).isEqualTo(savedInDB);
	}

}
