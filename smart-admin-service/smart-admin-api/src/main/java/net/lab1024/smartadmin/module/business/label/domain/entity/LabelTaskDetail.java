package net.lab1024.smartadmin.module.business.label.domain.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@Document
public class LabelTaskDetail {
    private String taskId;

    private List<String> taskImages;
}
