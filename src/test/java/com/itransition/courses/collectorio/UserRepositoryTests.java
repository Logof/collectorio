package com.itransition.courses.collectorio;

import static org.assertj.core.api.Assertions.assertThat;

import com.itransition.courses.collectorio.entity.Role;
import com.itransition.courses.collectorio.entity.User;
import com.itransition.courses.collectorio.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.annotation.Rollback;

import java.util.NoSuchElementException;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testCreateUser() {
        User user = new User();
        user.setEmail("sskibin@gmail.com");
        user.setPassword("skibin2020");
        user.setUserName("skibin2021");

        User savedUser = userRepository.save(user);
        User existUser = entityManager.find(User.class, savedUser.getId());

        assertThat(user.getEmail()).isEqualTo(existUser.getEmail());
    }

    @Test
    public void testAddRoleToNewUser() {
        User user = new User();
        user.setEmail("ss@gmail.com");
        user.setPassword(new BCryptPasswordEncoder().encode("123"));
        user.setUserName("ss");
        user.setEnabled(true);

        Role role = Role.USER;
        user.addRole(role);

        User savedUser = userRepository.save(user);
        User existUser = entityManager.find(User.class, savedUser.getId());

        assertThat(user.getEmail()).isEqualTo(existUser.getEmail());
        assertThat(user.getRoles()).isEqualTo(existUser.getRoles());
    }

    @Test
    public void testAddRoleToExistingUser() {
        String userEmail = "ss@gmail.com";
        User user = userRepository.findByEmail(userEmail).orElseThrow(NoSuchElementException::new);
        Role role = Role.ADMIN;
        user.addRole(role);

        User savedUser = userRepository.save(user);
        assertThat(savedUser.getRoles().size()).isEqualTo(2);
        assertThat(savedUser.getRoles()).contains(role);
    }
}
