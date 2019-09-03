package chu.service;

import chu.entity.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();

    public void addUser(User user);

    public void deleteById(Integer id);

    public User findById(Integer id);

    public void updateById(User user);
}
