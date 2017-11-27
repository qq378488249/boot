package com.blue.boot;

import org.apache.tomcat.util.descriptor.web.JspConfigDescriptorImpl;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public interface GirlRepository extends JpaRepository<Girl,Integer> {
}
