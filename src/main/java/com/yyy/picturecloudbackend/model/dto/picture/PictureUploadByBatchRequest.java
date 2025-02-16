package com.yyy.picturecloudbackend.model.dto.picture;

import lombok.Data;

@Data
public class PictureUploadByBatchRequest {  
  
    /**  
     * 搜索词  
     */  
    private String searchText;

    /**
     * 名称前缀
     */
    private String namePrefix;


    /**
     * 图片名称
     */
    private String picName;

    /**  
     * 抓取数量  
     */  
    private Integer count = 10;  
}
