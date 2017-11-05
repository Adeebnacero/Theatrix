package com.theatrix.service.OnlineMovie.ImplService;

import com.theatrix.domain.AdminUser;
import com.theatrix.repository.AdminUserRepository;
import com.theatrix.service.OnlineMovie.AdminUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * Created by aubrey on 08/08/2017.
 */
@Component
public class AdminUserServicesImpl implements AdminUserServices {

    @Autowired
    private AdminUserRepository adminUserRepository;

    @Override
    public AdminUser save(AdminUser id) {
        return adminUserRepository.save(id);
    }

    @Override
    public AdminUser findById(Long aLong) {
        return adminUserRepository.findOne(aLong);
    }

    @Override
    public AdminUser update(AdminUser id) {
        return adminUserRepository.save(id);
    }

    @Override
    public void delete(AdminUser id) {
        adminUserRepository.delete(id);
    }
}
