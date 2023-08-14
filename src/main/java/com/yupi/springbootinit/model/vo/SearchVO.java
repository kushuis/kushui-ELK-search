package com.yupi.springbootinit.model.vo;

import com.google.gson.Gson;
import com.yupi.springbootinit.model.entity.Picture;
import lombok.Data;
import org.apache.poi.ss.formula.functions.T;

import java.io.Serializable;
import java.util.List;

@Data
public class SearchVO implements Serializable {


   private List<UserVO> userList;

   private List<PostVO>  postList;

   private List<Picture> pictureList;

   private List<?>  dataList;

}
