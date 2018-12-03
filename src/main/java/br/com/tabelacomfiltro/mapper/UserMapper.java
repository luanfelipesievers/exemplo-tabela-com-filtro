package br.com.tabelacomfiltro.mapper;

import br.com.tabelacomfiltro.model.User;

import java.util.List;

public interface UserMapper {

    List<User> findAll();
    List<User> findAllBy(User user);
}
