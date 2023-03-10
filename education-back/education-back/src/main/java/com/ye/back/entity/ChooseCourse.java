package com.ye.back.entity;

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
public class ChooseCourse implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userId;

    private Integer courseId;

    private Double usualGrade;

    private Double endGrade;

    private Double totalGrade;

    private Integer chooseStatus;

    private String isPass;


}
