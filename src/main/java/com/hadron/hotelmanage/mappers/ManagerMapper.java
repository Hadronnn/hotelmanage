package com.hadron.hotelmanage.mappers;

import com.hadron.hotelmanage.entities.Permission;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Author Hadron
 * @date 2019/8/6 14:41
 */
@Component
public interface ManagerMapper {

    List<Permission> query(Integer userId);
    List<Permission> querych();
}
