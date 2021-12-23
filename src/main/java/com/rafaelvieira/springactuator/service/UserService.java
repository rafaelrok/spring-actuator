package com.rafaelvieira.springactuator.service;


import com.rafaelvieira.springactuator.entity.User;
import com.rafaelvieira.springactuator.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //BeanUtils.copyProperties(databaseUser, user); ele faz uma máscara de copiar os dados do banco para o objeto, comparando os dados do objeto com os do banco
    //dessa forma aqui no updater você pode informar qual campo vai ser atualizado, por exemplo, se você quiser atualizar apenas o nome, você pode fazer ignorar assim:
    //os campos que não deseja atualizar dessa forma, BeanUtils.copyProperties(user, databaseUser, "id", "createdAt", "updatedAt");
    public User update(String id, User user) {
        User databaseUser = this.userRepository.findById(id).orElseThrow();
        BeanUtils.copyProperties(user, databaseUser, "id", "createdAt", "updatedAt");
        return this.userRepository.save(databaseUser);
    }

    //databaseUser.isActive() ? false : true, se trata de um IF ternario que retorna o valor de uma expressão
    public void changeState(String id) {
        User databaseUser = this.userRepository.findById(id).orElseThrow();
        databaseUser.setActive(databaseUser.isActive() ? false : true);
        this.userRepository.save(databaseUser);
    }

    public void deleteById(String id) {
        User databaseUser = this.userRepository.findById(id).orElseThrow();
        this.userRepository.delete(databaseUser);
    }

}
