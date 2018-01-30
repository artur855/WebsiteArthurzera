/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arthurzera.website.services;

import com.arthurzera.website.models.User;
import com.arthurzera.website.models.VerificationToken;

import java.util.List;

public interface IUserService {

    boolean authenticate(String username, String password);
    List<User> findAll();
    User findById(Long id);
    User findByUsername(String username);
    User findByEmail(String email);
    User create(User user);
    User edit(User user);
    void deleteById(Long id);
	void createVerificationToken(User user, String token);
	VerificationToken getVerificationToken(String token);
}
