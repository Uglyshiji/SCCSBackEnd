package cn.edu.guet.mapper;


import cn.edu.guet.model.Menu;

import java.util.List;

public interface MenuMapper {
    Menu getMenuById(String id);
    List<Menu> getAllMenu();
    void saveMenu(Menu menu) throws Exception;
    void deleteMenuById(String id) throws Exception;
    void updateMenu(Menu menu) throws Exception;
}