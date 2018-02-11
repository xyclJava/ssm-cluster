package com.ssm.cluster.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.ssm.cluster.dao.PictureDao;
import com.ssm.cluster.entity.Picture;
import com.ssm.cluster.service.PictureService;

@Service("pictureService")
public class PictureServiceImpl implements PictureService {
    @Autowired
    private PictureDao pictureDao;

    @Override
    public Picture queryObject(Integer id) {
        return pictureDao.findPictureById(id);
    }

    @Override
    public List<Picture> queryList(Map<String, Object> map) {
        return pictureDao.findPictures(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return pictureDao.getTotalPictures(map);
    }

    @Override
    public void save(Picture picture) {
        pictureDao.insertPicture(picture);
    }

    @Override
    public void update(Picture picture) {
        pictureDao.updPicture(picture);
    }

    @Override
    public void delete(Integer id) {
        pictureDao.delPicture(id);
    }

    @Override
    public void deleteBatch(Integer[] ids) {
        pictureDao.deleteBatch(ids);
    }

}
