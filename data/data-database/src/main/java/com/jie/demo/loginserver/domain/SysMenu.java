package com.jie.demo.loginserver.domain;

import javax.persistence.*;

@Table(name = "mytest2..sys_menu")
public class SysMenu {
    @Id
    @Column(name = "MENU_ID")
    private Integer menuId;

    @Column(name = "MENU_NAME")
    private String menuName;

    @Column(name = "MENU_URL")
    private String menuUrl;

    @Column(name = "PARENT_ID")
    private String parentId;

    @Column(name = "MENU_ORDER")
    private String menuOrder;

    @Column(name = "MENU_ICON")
    private String menuIcon;

    @Column(name = "MENU_TYPE")
    private String menuType;

    /**
     * 是否启用桌面
     */
    @Column(name = "IS_DESKTOP")
    private String isDesktop;

    /**
     * 菜单代码
     */
    @Column(name = "MENU_CODE")
    private String menuCode;

    /**
     * 菜单PNG图片
     */
    @Column(name = "MENU_PNG")
    private String menuPng;

    /**
     * @return MENU_ID
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * @param menuId
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * @return MENU_NAME
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * @param menuName
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * @return MENU_URL
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * @param menuUrl
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     * @return PARENT_ID
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * @return MENU_ORDER
     */
    public String getMenuOrder() {
        return menuOrder;
    }

    /**
     * @param menuOrder
     */
    public void setMenuOrder(String menuOrder) {
        this.menuOrder = menuOrder;
    }

    /**
     * @return MENU_ICON
     */
    public String getMenuIcon() {
        return menuIcon;
    }

    /**
     * @param menuIcon
     */
    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    /**
     * @return MENU_TYPE
     */
    public String getMenuType() {
        return menuType;
    }

    /**
     * @param menuType
     */
    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    /**
     * 获取是否启用桌面
     *
     * @return IS_DESKTOP - 是否启用桌面
     */
    public String getIsDesktop() {
        return isDesktop;
    }

    /**
     * 设置是否启用桌面
     *
     * @param isDesktop 是否启用桌面
     */
    public void setIsDesktop(String isDesktop) {
        this.isDesktop = isDesktop;
    }

    /**
     * 获取菜单代码
     *
     * @return MENU_CODE - 菜单代码
     */
    public String getMenuCode() {
        return menuCode;
    }

    /**
     * 设置菜单代码
     *
     * @param menuCode 菜单代码
     */
    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    /**
     * 获取菜单PNG图片
     *
     * @return MENU_PNG - 菜单PNG图片
     */
    public String getMenuPng() {
        return menuPng;
    }

    /**
     * 设置菜单PNG图片
     *
     * @param menuPng 菜单PNG图片
     */
    public void setMenuPng(String menuPng) {
        this.menuPng = menuPng;
    }
}