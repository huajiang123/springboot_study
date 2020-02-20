package com.huajiang.example.entity;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * @author jianghua
 * @version v1.0
 * @package com.huajiang.example.entity
 * @date 2020/2/15 下午2:14
 * @Copyright
 */
@Validated
public class UserEntity {
    @NotNull
    private String userId;
    private String userName;
    private String passWord;

    public void setUserId(@NotNull String id){

    }

    @NotNull
    public String getUserId(){
        return this.userId;
    }
}
