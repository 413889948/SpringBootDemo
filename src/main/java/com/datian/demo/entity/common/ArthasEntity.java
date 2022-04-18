package com.datian.demo.entity.common;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @author hyx
 * @date 2022/3/24 19:08
 */
@Data
@Accessors(chain = true)
public class ArthasEntity {
    private String id;
    private Boolean isNotNone;
    private ArthasSonEntity son;

    public ArthasEntity() {
        son = new ArthasSonEntity().setId(id + "_SON")
                .setTime(LocalDateTime.now());
    }
}
