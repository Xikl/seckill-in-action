package com.ximo.seckillinaction.domain;

import lombok.Data;

import java.util.Date;

/**
 * 秒杀用户
 *
 * @author Ximo
 * @date 2018/10/16 22:51
 */
@Data
public class SeckillUser {
    /** id */
    private Long id;
    /** 昵称 */
    private String nickname;
    /** 密码 */
    private String password;
    /** 密码盐值 */
    private String salt;
    /** 头像 */
    private String head;
    /** 注册时间 */
    private Date registerDate;
    /** 最后登录时间 */
    private Date lastLoginDate;
    /** 登录次数 */
    private Integer loginCount;
}
