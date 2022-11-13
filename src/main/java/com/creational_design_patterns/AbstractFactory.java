package com.creational_design_patterns;

public abstract class AbstractFactory {
    abstract Worker createWorker(String workerType) throws Exception;
}
