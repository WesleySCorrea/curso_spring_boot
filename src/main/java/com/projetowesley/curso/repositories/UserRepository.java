package com.projetowesley.curso.repositories;

import com.projetowesley.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
