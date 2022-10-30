package org.zi.hellomaven;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Configurations configs = new Configurations();
        XMLConfiguration config = configs.xml("C:\\Everything\\_java\\hello-maven\\pom.xml");

        System.out.println(IteratorUtils.toList(config.getKeys()));
        System.out.println(config.getList(String.class, "dependencies.dependency.artifactId"));

    }
}
