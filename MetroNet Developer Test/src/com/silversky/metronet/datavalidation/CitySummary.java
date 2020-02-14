package com.silversky.metronet.datavalidation;

public class CitySummary implements Comparable<CitySummary> {
    private String cityName;
    private int errorCount;

    public CitySummary() {
    }

    public CitySummary(String cityName, int errorCount) {
        this.cityName = cityName;
        this.errorCount = errorCount;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }

    @Override
    public int compareTo(CitySummary citySummary) {
        int errComp = this.getErrorCount() - citySummary.getErrorCount();
        int nameComp = this.getCityName().compareTo(citySummary.getCityName());
        int retVal = 0;
        if (errComp == 0){
            retVal = nameComp;
        } else {
            retVal = errComp;
        }

        return retVal;
    }

}
