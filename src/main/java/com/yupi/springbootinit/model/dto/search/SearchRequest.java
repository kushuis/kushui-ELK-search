package com.yupi.springbootinit.model.dto.search;

import com.yupi.springbootinit.common.PageRequest;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.ibatis.javassist.SerialVersionUID;


import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
public class SearchRequest extends PageRequest implements Serializable {

    private String searchText;

    //对于类型采用了枚举
    private String type;

    private static final long SerialVersionUID = 1L;
}
