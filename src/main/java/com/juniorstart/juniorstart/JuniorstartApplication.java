package com.juniorstart.juniorstart;

import com.juniorstart.juniorstart.repository.ChatMessageRepository;
import com.juniorstart.juniorstart.service.ChatMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
@RequiredArgsConstructor
public class JuniorstartApplication implements CommandLineRunner {

    final private ChatMessageRepository chatMessageRepository;

    @PostConstruct
    void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

    public static void main(String[] args) {
        SpringApplication.run(JuniorstartApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        chatMessageRepository.deleteAll();
    }
}
