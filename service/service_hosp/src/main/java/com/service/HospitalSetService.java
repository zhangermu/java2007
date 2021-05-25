package com.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.model.hosp.HospitalSet;

/**
 * 创作时间：2021/4/25 19:54
 * 作者：张林
 * mybatis-plus里面给我们提供了自己的servivce，只要我们的service继承他的service接口，然后把泛型给他，
 * 我们的service里面自动就拥有他的service接口里面的所有这样我们就可以直接在controller中调用
 */
public interface HospitalSetService extends IService<HospitalSet> {
}
