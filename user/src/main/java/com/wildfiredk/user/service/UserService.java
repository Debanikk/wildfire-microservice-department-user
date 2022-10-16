package com.wildfiredk.user.service;

import com.wildfiredk.user.entity.User;
import com.wildfiredk.user.repository.UserRepository;
import com.wildfiredk.user.valueObjects.Department;
import com.wildfiredk.user.valueObjects.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    public UserRepository userRepository;

    public User saveUserData(User userData) {
        log.info("Inside saveUserData Service method of UserService");
        return userRepository.save(userData);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        log.info("Inside getUserWithDepartment Service method of UserService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);
        Department department = restTemplate.getForObject("http://Department/departments/getDepartment/" + user.getDepartmentId(), Department.class);

        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }
}
