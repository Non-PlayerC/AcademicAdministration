package com.ye.back.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author hjy
 * @since 2023-03-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Term implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "term_id", type = IdType.AUTO)
    private Integer termId;

    private String termName;

    private Integer termStatus;


}
