package com.example.SEENEMA.user.service;

import com.example.SEENEMA.user.domain.User;
import com.example.SEENEMA.user.dto.MyPageDto;
import com.example.SEENEMA.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Transactional
@RequiredArgsConstructor
@Service
public class MyPageServiceImpl implements MyPageService{
    private final UserRepository userRepo;
    @Override
    public MyPageDto.MyPageResponse loadMyPage(User user) {
        MyPageDto.MyPageResponse response = new MyPageDto.MyPageResponse(user);
        return response;
    }

    @Override
    public String checkNickname(User user, MyPageDto.EditProfileRequest request) {
        if(user.getNickname().equals(request.getNickname()))
            return "기존 닉네임과 동일합니다.";
        List<User> allUser = userRepo.findAll();
        for(User u : allUser){
            if(u.getNickname().equals(request.getNickname()))
                return "이미 존재하는 닉네임입니다.";
        }
        return "사용할 수 있는 닉네임입니다.";
    }

    @Override
    public MyPageDto.MyPageResponse editProfile(User user, MyPageDto.EditProfileRequest request) {
        // 프로필 수정
        User origin = userRepo.findById(user.getUserId()).get();
        origin.setNickname(request.getNickname());
        userRepo.save(origin);

        MyPageDto.MyPageResponse response = new MyPageDto.MyPageResponse(origin);
        return response;
    }
}
