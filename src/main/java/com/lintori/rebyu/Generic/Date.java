package com.lintori.rebyu.Generic;

public class Date {

    private Integer year;
    private Integer month;
    private Integer date;

    public Date(Integer year, Integer month, Integer date){
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public boolean equals(Object compared){
        boolean output = false;
        if (this == compared){
            output = true;
        }
        if (!(compared instanceof Date)){
            output = false;
        }
        Date comparedDate = (Date) compared;
        if (this.year == comparedDate.getYear() &&
                this.month == comparedDate.getMonth() &&
                this.date == comparedDate.getDate()
        ){
            output = true;
        }
        return output;
    }

}
