package com.cwt.springxmlcrudrest.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@JacksonXmlRootElement
public class Employees implements Serializable {

    private static final long serialVersionUID = 22L;

    @JacksonXmlProperty(localName = "Employee")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Employee> employees = new ArrayList<>();
}
