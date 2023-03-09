package ru.yalrb.services;

import lombok.Data;
import org.springframework.stereotype.Service;
import ru.yalrb.entity.token.Token;
import ru.yalrb.repository.TokenRepository;

import java.util.Optional;

@Service
@Data
public class TokenService {

    private final TokenRepository tokenRepository;


    public Optional<Token> findByToken(String jwt) {
        return tokenRepository.findByToken(jwt);
    }
}
