package com.sun.model;

/**
 * Created by sunpeng on 2017/4/3.
 */
public class User {
    private Integer id;
    private String name;
    private Integer age;

    public User() {
    }

    public User(Builder builder){
        this.id=builder.id;
        this.name=builder.name;
        this.age=builder.age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static class Builder {
        private Integer id;
        private String name;
        private Integer age;

        public Builder(Integer id) {
            this.id = id;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }
}
