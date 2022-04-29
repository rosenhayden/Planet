public class Planet {
    int sizeRadius;
    boolean hasAir;
    boolean hasWater;
    int averageTemp;
    boolean hasLife;
    int distFromEarth;

    public Planet(int sizeRadius, boolean hasAir, boolean hasWater, int averageTemp, boolean hasLife, int distFromEarth) {
        this.sizeRadius = sizeRadius;
        this.hasAir = hasAir;
        this.hasWater = hasWater;
        this.averageTemp = averageTemp;
        this.hasLife = hasLife;
        this.distFromEarth = distFromEarth;
    }

    public int getSizeRadius() {
        return sizeRadius;
    }

    public void setSizeRadius(int sizeRadius) {
        this.sizeRadius = sizeRadius;
    }

    public boolean isHasAir() {
        return hasAir;
    }

    public void setHasAir(boolean hasAir) {
        this.hasAir = hasAir;
    }

    public boolean isHasWater() {
        return hasWater;
    }

    public void setHasWater(boolean hasWater) {
        this.hasWater = hasWater;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    public void setAverageTemp(int averageTemp) {
        this.averageTemp = averageTemp;
    }

    public boolean isHasLife() {
        return hasLife;
    }

    public void setHasLife(boolean hasLife) {
        this.hasLife = hasLife;
    }

    public int getDistFromEarth() {
        return distFromEarth;
    }

    public void setDistFromEarth(int distFromEarth) {
        this.distFromEarth = distFromEarth;
    }
    public boolean isHabitable(){
        return(isHasAir() == true && isHasLife() == true && getDistFromEarth() < 1000000 && getAverageTemp() > 22 && getAverageTemp() < 85 && isHasWater() == true);
    }
    public boolean willSnow() {
        return(isHasWater() == true && getAverageTemp() < 32 && hasAir == true);
    }
}
