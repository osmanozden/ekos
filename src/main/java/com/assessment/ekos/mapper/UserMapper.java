package com.assessment.ekos.mapper;import com.assessment.ekos.dto.UserDto;import com.assessment.ekos.model.User;import com.assessment.ekos.resource.UserResource;import org.mapstruct.Mapper;import org.springframework.data.domain.Page;import org.springframework.stereotype.Component;@Mapper(componentModel = "spring")public interface UserMapper extends Converter<UserDto, User, UserResource> {    default Page<UserResource> toResource(Page<User> entities) {        if (entities == null) {            return null;        }        return entities.map(o -> toResource(o));    }}