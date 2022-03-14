package com.ruoyi.system.mapper;

import com.ruoyi.system.api.domain.SysDictData;
import com.ruoyi.system.api.domain.SysRole;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class dictTest {
    @Autowired
    private SysDictDataMapper dictDataMapper;

    @Autowired
    private SysRoleMapper sysRoleMapper;


    @Test
    public void A(){
        SysDictData dictData = new SysDictData();
        dictDataMapper.selectDictDataList(dictData);
    }
    @Test
    public void B(){
        SysRole dictData = new SysRole();
        sysRoleMapper.selectRoleList(dictData);
    }
}
