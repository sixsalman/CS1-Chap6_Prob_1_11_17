package Prob11;

/**
 *  Author: Salman
 *
 *  This class serves a blueprint for creation of a FreezingAndBoilingPoint object which decides the sate of
 *  ethyl, oxygen and water at a given temperature
 */
public class FreezingAndBoilingPoints {

    private double temperature; // temperature holding variable

    /**
     * This constructor accepts temperature as an argument which is assigned to temperature variable of this class
     * @param temperature holds temperature
     */
    public FreezingAndBoilingPoints (double temperature){
        this.temperature = temperature;
    }

    /**
     * This no-arg constructor assigns 0.0 to temperature variable
     */
    public FreezingAndBoilingPoints (){
        temperature = 0.0;
    }

    /**
     * Get's temperature
     * @return temperature
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * Set's temperature
     * @param temperature holds temperature
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /**
     * Decides and returns whether ethyl's physical state is solid or not
     * @return whether ethyl freezes or not at that temperature
     */
    public boolean isEthylFreezing (){
        if (temperature <= -173){
            return true;
        }else {
            return false;
        }
    }

    /**
     * Decides and returns whether ethyl's physical state is gas or not
     * @return whether ethyl boils or not at that temperature
     */
    public boolean isEthylBoiling (){
        if (temperature >= 172){
            return true;
        }else {
            return false;
        }
    }

    /**
     * Decides and returns whether oxygen's physical state is solid or not
     * @return whether oxygen freezes or not at that temperature
     */
    public boolean isOxygenFreezing (){
        if (temperature <= -362){
            return true;
        }else {
            return false;
        }
    }

    /**
     * Decides and returns whether oxygen's physical state is gas or not
     * @return whether ethyl boils or not at that temperature
     */
    public boolean isOxygenBoiling (){
        if (temperature >= -306){
            return true;
        }else {
            return false;
        }
    }

    /**
     * Decides and returns whether water's physical state is solid or not
     * @return whether water freezes or not at that temperature
     */
    public boolean isWaterFreezing (){
        if (temperature <= 32){
            return true;
        }else {
            return false;
        }
    }

    /**
     * Decides and returns whether water's physical state is gas or not
     * @return whether water boils or not at that temperature
     */
    public boolean isWaterBoiling (){
        if (temperature >= 212){
            return true;
        }else {
            return false;
        }
    }

}
