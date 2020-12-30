package cn.andylhl.crowd.service.impl;

import cn.andylhl.crowd.entity.Menu;
import cn.andylhl.crowd.entity.MenuExample;
import cn.andylhl.crowd.mapper.MenuMapper;
import cn.andylhl.crowd.service.MenuService;
import cn.andylhl.crowd.web.controller.MenuController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 * @Title: MenuServiceImpl
 * @Description: 菜单业务实现类
 * @author: lhl
 * @date: 2020/12/30 9:48
 */

@Service
public class MenuServiceImpl implements MenuService {

    private Logger logger = LoggerFactory.getLogger(MenuServiceImpl.class);

    @Autowired
    private MenuMapper menuMapper;

    /**
     * 查询全部的menu对象
     * @return
     */
    @Override
    public List<Menu> getAll() {

        return menuMapper.selectByExample(new MenuExample());
    }
}
