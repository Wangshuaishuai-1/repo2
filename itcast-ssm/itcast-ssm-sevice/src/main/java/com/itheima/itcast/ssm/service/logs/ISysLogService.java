package com.itheima.itcast.ssm.service.logs;

import com.itheima.itcast.ssm.domain.logs.SysLog;

import java.util.List;

public interface ISysLogService {

    public void save(SysLog sysLog) throws Exception;

    List<SysLog> findAll() throws Exception;
}
