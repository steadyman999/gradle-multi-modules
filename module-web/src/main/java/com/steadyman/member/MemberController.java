package com.steadyman.member;

import com.steadyman.domain.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @GetMapping("/")
    public Member get() {
        return new Member("steadyman", "steadyman@gmail.com");
    }
}
