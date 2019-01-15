package com.tourAndTravel.guest.repository;

import com.tourAndTravel.guest.model.Role;
import com.tourAndTravel.guest.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long>
{

    Role findByRole(String role_name);
}
