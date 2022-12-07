package com.assessment.ekos.controller;import com.assessment.ekos.dto.UserDto;import com.assessment.ekos.resource.UserResource;import com.assessment.ekos.service.AuthorizationService;import com.assessment.ekos.service.UserService;import lombok.RequiredArgsConstructor;import org.springframework.security.crypto.password.PasswordEncoder;import org.springframework.web.bind.annotation.PostMapping;import org.springframework.web.bind.annotation.RequestBody;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RestController;@RestController@RequiredArgsConstructor@RequestMapping("/user")public class UserController {    private final PasswordEncoder encoder;    private final UserService userService;    private final AuthorizationService authorizationService;    @PostMapping    public UserResource save(@RequestBody UserDto dto) {        dto.setPassword(encoder.encode(dto.getPassword()));        return save(dto);    }}