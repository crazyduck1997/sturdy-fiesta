package com.frank.demo.model.dto;

import lombok.Data;

/**
 * @Author frank
 * @date 2023/3/4 17:30
 * @Description
 */
@Data
public class ParentDTO {
    private String updateBy;

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
}
