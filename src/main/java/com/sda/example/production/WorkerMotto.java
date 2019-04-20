package com.sda.example.production;

import java.util.Objects;

public class WorkerMotto {

    private String citate ;

    public WorkerMotto(){}

    public WorkerMotto(String citate) {

        this.citate = citate;
    }

    public String getCitate() {
        return citate;
    }

    public void setCitate(String citate) {
        this.citate = citate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WorkerMotto)) return false;
        WorkerMotto that = (WorkerMotto) o;
        return Objects.equals(getCitate(), that.getCitate());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCitate());
    }

    @Override
    public String toString() {
        return "WorkerMotto{" +
                "citate='" + citate + '\'' +
                '}';
    }
}
