/**
 * 
 */
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Users;

/**
 * @author ClaudioJunior
 *
 */
public interface UsersRepository extends JpaRepository<Users, String>{

}
