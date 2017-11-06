package com.theatrix.repository;

import com.theatrix.domain.AdminUser;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by aubrey on 07/08/2017.
 */
public interface AdminUserRepository extends CrudRepository<AdminUser,Long> {

}
