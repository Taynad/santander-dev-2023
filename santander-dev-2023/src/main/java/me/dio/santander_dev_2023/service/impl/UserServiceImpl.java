package me.dio.santander_dev_2023.service.impl;

import me.dio.santander_dev_2023.domain.model.User;
import me.dio.santander_dev_2023.domain.model.repository.UserRepository;
import me.dio.santander_dev_2023.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {
    //precisamos criar o construtor para injetar o UserRepository
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository= userRepository;
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(userToCreate);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
}
