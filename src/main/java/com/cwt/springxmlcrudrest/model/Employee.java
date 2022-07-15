package com.cwt.springxmlcrudrest.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity @Table(name="cwt_employees")
@JacksonXmlRootElement(localName = "Employee")
public class Employee implements Serializable {

    private static final long serialVersionUID = 21L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JacksonXmlProperty(isAttribute = true)
    private Long empId;

    @JacksonXmlProperty
    private String name;

    @JacksonXmlProperty
    private String email;
}
