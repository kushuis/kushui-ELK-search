package com.yupi.springbootinit.model.dto.picture;

import com.yupi.springbootinit.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
public class PictureQueryRequest extends PageRequest implements Serializable {

    private String searchText;

    private long current;

    private long size;
}
