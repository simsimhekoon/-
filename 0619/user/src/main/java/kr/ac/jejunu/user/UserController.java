package kr.ac.jejunu.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    public final UserDao userDao;

    @GetMapping("/user/{id}")
    public User get(@PathVariable("id") Integer id) {
        return userDao.findById(id).get();
    }
}
