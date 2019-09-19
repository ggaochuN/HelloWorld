package cn.kgc.helloworld11.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Prop implements Serializable {
    private String key;
    private String value;
}
