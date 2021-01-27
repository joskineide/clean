package com.jsk.clean.controller;

import com.jsk.clean.controller.converter.user.UserResourceRequestToUserRequestConverter;
import com.jsk.clean.controller.converter.user.UserToUserResourceResponseConverter;
import com.jsk.clean.controller.resource.user.request.UserResourceRequest;
import com.jsk.clean.controller.resource.user.response.UserResourceResponse;
import com.jsk.clean.usecase.user.*;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Api(tags = "User")
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserToUserResourceResponseConverter userToUserResourceResponseConverter;
    private final UserResourceRequestToUserRequestConverter userResourceRequestToUserRequestConverter;

    private final ListUserUseCase listUserUseCase;
    private final GetUserByIdUseCase getUserByIdUseCase;
    private final InsertUserUseCase insertUserUseCase;
    private final UpdateUserUseCase updateUserUseCase;
    private final DeleteUserUseCase deleteUserUseCase;

    @GetMapping
    public ResponseEntity<List<UserResourceResponse>> list(){
        System.out.println("Requesting user list");
        return new ResponseEntity<>(listUserUseCase.execute().stream()
                    .map(userToUserResourceResponseConverter::convert)
                    .collect(Collectors.toList()),
                HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResourceResponse> getById(@PathVariable String id){
        System.out.println("Requesting user by Id: " + id);
        return new ResponseEntity<>(userToUserResourceResponseConverter
                    .convert(getUserByIdUseCase.execute(id)),
                HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserResourceResponse> insert(@RequestBody UserResourceRequest user){
        System.out.println("Inserting new user");
        return new ResponseEntity<>(userToUserResourceResponseConverter
                    .convert(insertUserUseCase
                            .execute(userResourceRequestToUserRequestConverter.convert(user))),
                HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserResourceResponse> update(@RequestBody UserResourceRequest user,
                                                       @PathVariable String id){
        System.out.println("Updating user " + id);
        return new ResponseEntity<>(userToUserResourceResponseConverter
                .convert(updateUserUseCase
                        .execute(userResourceRequestToUserRequestConverter.convert(user), id)),
                HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){
        System.out.println("Deleting user " + id);
        deleteUserUseCase.execute(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
