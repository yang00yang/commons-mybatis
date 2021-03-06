package org.laziji.commons.mybatis.dao;

import org.laziji.commons.mybatis.model.POJO;
import org.laziji.commons.mybatis.query.Query;

import java.util.List;

public interface Dao<T extends POJO> {

    List<T> select(Query<T> query);

    int selectCount(Query<T> query);
}

