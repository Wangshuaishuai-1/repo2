package com.itheima.itcast.ssm.service.Impl.logs;

import com.itheima.itcast.ssm.dao.logs.ISysLogDao;
import com.itheima.itcast.ssm.domain.logs.SysLog;
import com.itheima.itcast.ssm.service.logs.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SysLogServiceImpl implements ISysLogService {

    @Autowired
    private ISysLogDao sysLogDao;

    @Override
    public List<SysLog> findAll() throws Exception {
        return sysLogDao.findAll();
    }

    @Override
    public void save(SysLog sysLog) throws Exception {
        sysLogDao.save(sysLog);
    }
}
