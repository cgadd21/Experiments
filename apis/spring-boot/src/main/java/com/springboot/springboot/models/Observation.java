package com.springboot.springboot.models;

public class Observation {
    private String stationID;
    private String obsTimeUtc;
    private String obsTimeLocal;
    private String neighborhood;
    private String softwareType;
    private String country;
    private Double solarRadiation;
    private Double lon;
    private Integer realtimeFrequency;
    private Long epoch;
    private Double lat;
    private Double uv;
    private Integer winddir;
    private Integer humidity;
    private Integer qcStatus;
    private Imperial imperial;

    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {
        this.stationID = stationID;
    }

    public String getObsTimeUtc() {
        return obsTimeUtc;
    }

    public void setObsTimeUtc(String obsTimeUtc) {
        this.obsTimeUtc = obsTimeUtc;
    }

    public String getObsTimeLocal() {
        return obsTimeLocal;
    }

    public void setObsTimeLocal(String obsTimeLocal) {
        this.obsTimeLocal = obsTimeLocal;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getSoftwareType() {
        return softwareType;
    }

    public void setSoftwareType(String softwareType) {
        this.softwareType = softwareType;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getSolarRadiation() {
        return solarRadiation;
    }

    public void setSolarRadiation(Double solarRadiation) {
        this.solarRadiation = solarRadiation;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Integer getRealtimeFrequency() {
        return realtimeFrequency;
    }

    public void setRealtimeFrequency(Integer realtimeFrequency) {
        this.realtimeFrequency = realtimeFrequency;
    }

    public Long getEpoch() {
        return epoch;
    }

    public void setEpoch(Long epoch) {
        this.epoch = epoch;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getUv() {
        return uv;
    }

    public void setUv(Double uv) {
        this.uv = uv;
    }

    public Integer getWinddir() {
        return winddir;
    }

    public void setWinddir(Integer winddir) {
        this.winddir = winddir;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getQcStatus() {
        return qcStatus;
    }

    public void setQcStatus(Integer qcStatus) {
        this.qcStatus = qcStatus;
    }

    public Imperial getImperial() {
        return imperial;
    }

    public void setImperial(Imperial imperial) {
        this.imperial = imperial;
    }

    public static class Imperial {
        private Integer temp;
        private Integer heatIndex;
        private Integer dewpt;
        private Integer windChill;
        private Integer windSpeed;
        private Integer windGust;
        private Double pressure;
        private Double precipRate;
        private Double precipTotal;
        private Integer elev;

        public Integer getTemp() {
            return temp;
        }

        public void setTemp(Integer temp) {
            this.temp = temp;
        }

        public Integer getHeatIndex() {
            return heatIndex;
        }

        public void setHeatIndex(Integer heatIndex) {
            this.heatIndex = heatIndex;
        }

        public Integer getDewpt() {
            return dewpt;
        }

        public void setDewpt(Integer dewpt) {
            this.dewpt = dewpt;
        }

        public Integer getWindChill() {
            return windChill;
        }

        public void setWindChill(Integer windChill) {
            this.windChill = windChill;
        }

        public Integer getWindSpeed() {
            return windSpeed;
        }

        public void setWindSpeed(Integer windSpeed) {
            this.windSpeed = windSpeed;
        }

        public Integer getWindGust() {
            return windGust;
        }

        public void setWindGust(Integer windGust) {
            this.windGust = windGust;
        }

        public Double getPressure() {
            return pressure;
        }

        public void setPressure(Double pressure) {
            this.pressure = pressure;
        }

        public Double getPrecipRate() {
            return precipRate;
        }

        public void setPrecipRate(Double precipRate) {
            this.precipRate = precipRate;
        }

        public Double getPrecipTotal() {
            return precipTotal;
        }

        public void setPrecipTotal(Double precipTotal) {
            this.precipTotal = precipTotal;
        }

        public Integer getElev() {
            return elev;
        }

        public void setElev(Integer elev) {
            this.elev = elev;
        }

        @Override
        public String toString() {
            return "Imperial{" +
                    "temp=" + temp +
                    ", heatIndex=" + heatIndex +
                    ", dewpt=" + dewpt +
                    ", windChill=" + windChill +
                    ", windSpeed=" + windSpeed +
                    ", windGust=" + windGust +
                    ", pressure=" + pressure +
                    ", precipRate=" + precipRate +
                    ", precipTotal=" + precipTotal +
                    ", elev=" + elev +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Observation{" +
                "stationID='" + stationID + '\'' +
                ", obsTimeUtc='" + obsTimeUtc + '\'' +
                ", obsTimeLocal='" + obsTimeLocal + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", softwareType='" + softwareType + '\'' +
                ", country='" + country + '\'' +
                ", solarRadiation=" + solarRadiation +
                ", lon=" + lon +
                ", realtimeFrequency=" + realtimeFrequency +
                ", epoch=" + epoch +
                ", lat=" + lat +
                ", uv=" + uv +
                ", winddir=" + winddir +
                ", humidity=" + humidity +
                ", qcStatus=" + qcStatus +
                ", imperial=" + imperial +
                '}';
    }
}

