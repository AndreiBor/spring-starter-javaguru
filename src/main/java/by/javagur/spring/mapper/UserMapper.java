package by.javagur.spring.mapper;

import by.javagur.spring.dto.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class UserMapper {
    private final UserDto userDto;
}
