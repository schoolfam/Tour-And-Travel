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

import com.tourAndTravel.guest.model.Users;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest 
{
	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private UserRepository userRepository;
	
	private Users getUser()
	{
		Users user = new Users();
		user.setFirstName("firstName");
		user.setLastName("lastName");
		user.setEmail("FL@gmail.com");
		user.setUserName("cnku");
		user.setPassword("password");
		return user;
	}
	
	@Test
	public void testSaveUser()
	{
		Users user = getUser();
		Users savedInDB = entityManager.persist(user);
		
		Users getFromDB = userRepository.findByUserName(savedInDB.getUserName());
		
		assertThat(getFromDB).isEqualTo(savedInDB);
	}
	
	@Test
	public void testGetAllUser()
	{
		Users user = new Users();
		user.setFirstName("firstName1");
		user.setLastName("lastName1");
		user.setEmail("cnku@gmail1.com");
		
		user.setUserName("cnku1");
		user.setPassword("password1");
		
		Users user1 = new Users();
		user1.setFirstName("firstName2");
		user1.setLastName("lastName2");
		user1.setEmail("cnku@gmail2.com");
		user1.setUserName("cnku");
		user1.setPassword("password2");
		
		entityManager.persist(user);
		entityManager.persist(user1);
		
		Iterable<Users> allUsers = userRepository.findAll();
		List<Users> userList = new ArrayList<>();
		
		for(Users user3: allUsers)
		{
			userList.add(user3);
		}
		
		assertThat(userList.size()).isEqualTo(2);
	}
	
	@Test
	public void testdeleteByUserName()
	{
		Users user = new Users();
		user.setFirstName("firstName1");
		user.setLastName("lastName1");
		user.setEmail("FL@gmail1.com");
		
		user.setUserName("firlas1");
		user.setPassword("password1");
		
		Users user1 = new Users();
		user1.setFirstName("firstName2");
		user1.setLastName("lastName2");
		user1.setEmail("FL@gmail2.com");
		user1.setUserName("firlas2");
		user1.setPassword("password2");
		
		entityManager.persist(user);
		Users user3 = entityManager.persist(user1);
		
		entityManager.remove(user3);
		
		Iterable<Users> allUsers = userRepository.findAll();
		List<Users> userList = new ArrayList<>();
		
		for(Users user2: allUsers)
		{
			userList.add(user2);
		}
		
		assertThat(userList.size()).isEqualTo(1);
	}
	
	@Test
	public void testfindByUserName()
	{
		Users user = getUser();
		Users savedInDB = entityManager.persist(user);
		
		Users getFromDB = userRepository.findByUserName(savedInDB.getUserName());
		
		assertThat(getFromDB).isEqualTo(savedInDB);
	}
}
