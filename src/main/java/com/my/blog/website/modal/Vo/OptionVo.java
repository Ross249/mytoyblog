package com.my.blog.website.modal.Vo;

/**
 * 配置
 */
public class OptionVo {
    // 配置名称
    private String name;

    // 配置值
    private String value;

    private String description;

    public OptionVo(String name, String value, String description) {
        this.name = name;
        this.value = value;
        this.description = description;
    }

    public OptionVo() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}