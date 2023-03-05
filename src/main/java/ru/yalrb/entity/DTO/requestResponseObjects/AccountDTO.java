package ru.yalrb.entity.DTO.requestResponseObjects;

import ru.yalrb.entity.models.Photo;
import ru.yalrb.entity.models.account.Role;

public record AccountDTO(
        Long id,
        Photo photo,
        String login,
        Role nickName
) {}
