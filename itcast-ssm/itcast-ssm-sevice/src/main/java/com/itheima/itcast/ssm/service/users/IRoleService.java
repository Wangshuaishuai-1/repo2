package com.itheima.itcast.ssm.service.users;

import com.itheima.itcast.ssm.domain.users.Permission;
import com.itheima.itcast.ssm.domain.users.Role;
import java.util.List;

public interface IRoleService {

    public List<Role> findAll() throws Exception;

    void save(Role role) throws Exception;

    Role findById(String roleId) throws  Exception;

    List<Permission> findOtherPermissions(String roleId) throws Exception;

    void addPermissionToRole(String roleId, String[] permissionIds) throws Exception;

    void deleteRoleById(String roleId) throws Exception;
}
