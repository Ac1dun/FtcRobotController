package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

public class TestBenchColor {
    private NormalizedColorSensor colorSensor;
    private DistanceSensor detectDistance;

    public enum DetectedColor {
        purple,
        green,
        UNKOWN
    }

    public void init(HardwareMap hwMap){
         colorSensor = hwMap.get(NormalizedColorSensor.class, "color_sensor");
         detectDistance = hwMap.get(DistanceSensor.class, "color_sensor");
      //   colorSensor.setGain(16);
        colorSensor.setGain(30);

    }
    boolean green, purple;

   // public DetectedColor getDetectedColor(Telemetry telemetry) {
    public String getDetectedColor (Telemetry telemetry) {
        NormalizedRGBA colors = colorSensor.getNormalizedColors();
        String colorBall;
        float normRed, normGreen, normBlue;
        normRed = colors.red / colors.alpha;
        normGreen = colors.green / colors.alpha;
        normBlue = colors.blue / colors.alpha;
      //  if (normRed <= 0.11 && normGreen >= 0.2 && normBlue <= 0.25) {
        if (normRed <= 0.25 && normGreen >= 0.45 && normBlue <= 0.5) {
            green = true;
            colorBall = "green";

     //   } else if (normRed >= 0.19 && normGreen <= 0.25 && normBlue >= 0.31 ) {
        } else if (normRed >= 0.2 && normGreen <= 0.45 && normBlue >= 0.45 ) {
            purple = true;
            colorBall = "purple";

        } else {
            purple = false;
            green = false;
            colorBall = "";
        }
        telemetry.addData("greenBall", green);
        telemetry.addData("purpleBall", purple);
        telemetry.addData("red", normRed);
        telemetry.addData("green", normGreen);
        telemetry.addData("blue", normBlue);
       // return  DetectedColor.UNKOWN;
        return colorBall;
    }
    public double getDistanceColor() {
        return detectDistance.getDistance((DistanceUnit.CM));
    }

}
