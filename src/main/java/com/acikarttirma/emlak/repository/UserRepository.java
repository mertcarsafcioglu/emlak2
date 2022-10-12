package com.acikarttirma.emlak.repository;

import com.taputeklif.emlak.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findFirstByUserNameAndPassword(String userName,String password);

    Optional<User> findFirstByUserName(String userName);
}
