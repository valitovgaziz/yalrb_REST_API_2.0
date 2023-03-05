package ru.yalrb.entity.DTO.requestResponseObjects;

import ru.yalrb.entity.models.*;
import ru.yalrb.entity.models.account.Account;
import ru.yalrb.entity.models.yalObject.*;

import java.util.HashSet;
import java.util.UUID;
import java.util.Calendar;

public record YalObjectDTO(
        UUID id,
        YalObjectType yalObjectType,
        HashSet<LeisureType> leisureTypes,
        HashSet<LeisureSubType> leisureSubTypes,
        Contact contact,
        Rate rate,
        Point point,
        HashSet<FeetBack> feetBacks,
        String name,
        Account account,
        String longName,
        String shortDescription,
        String fullDescription,
        State state,
        Calendar dateTimeCreated,
        Calendar dateTimeStartEvent,
        Calendar dateTimeEndEvent,
        Availability availability,
        WorkLoadState workLoadState,
        HashSet<Photo> photos,
        HashSet<AgeRange> ageRanges
) {}
