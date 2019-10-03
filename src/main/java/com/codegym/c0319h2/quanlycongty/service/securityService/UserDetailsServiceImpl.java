package com.codegym.c0319h2.quanlycongty.service.securityService;


import com.codegym.c0319h2.quanlycongty.model.User;
import com.codegym.c0319h2.quanlycongty.repository.UserRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
//5
// co nhiem vu tim thay user trong bang users tu co so du lieu de xay dung 1 'userDetails' doi tuong de xac thuc

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserRepositoty userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        User user = userRepository.findByUserName(userName).orElseThrow(
                () -> new UsernameNotFoundException("User Not Found with -> username or email : " + userName));

        return UserPrinciple.build(user);
        // tra ve 1 user voi dinh dang la: UserPrinciple (khong phai la dinh dang User)
        // co quyen (authority) duoc lay ra tu ben class UserPrinciple
    }
}