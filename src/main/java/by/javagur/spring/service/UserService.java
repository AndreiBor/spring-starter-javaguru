package by.javagur.spring.service;

import by.javagur.spring.database.repository.UserRepository;
import by.javagur.spring.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class UserService {
    private final UserMapper userMapper;
    private final UserRepository userRepository;
}
