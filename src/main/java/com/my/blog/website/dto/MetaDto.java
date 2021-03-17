package com.my.blog.website.dto;

import com.my.blog.website.modal.Vo.MetaVo;

public class MetaDto extends MetaVo {
    private int count;

    public MetaDto(Integer mid, String name, String slug, String type, String description, Integer sort, Integer parent) {
        super(mid, name, slug, type, description, sort, parent);
        this.count = getCount();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
