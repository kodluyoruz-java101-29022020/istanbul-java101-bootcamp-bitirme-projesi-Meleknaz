package com.graduation.project.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.graduation.project.annotation.enums.LogTimeUnit;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.METHOD }) 
public @interface Logger {

	LogTimeUnit timeUnit();

	boolean active();

}
