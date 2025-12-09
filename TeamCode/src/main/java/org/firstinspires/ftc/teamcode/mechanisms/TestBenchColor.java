package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class TestBenchColor {
    NormalizedColorSensor colorSensor;

    public enum DetectedColor {
        purple,
        green,
        UNKOWN
    }


    public void init(HardwareMap hwMap){
         colorSensor = hwMap.get(NormalizedColorSensor.class, "color_sensor");
         colorSensor.setGain(16);
    }
    boolean green = false;
    boolean purple = false;
    public DetectedColor getDetectedColor(Telemetry telemetry) {
        NormalizedRGBA colors = colorSensor.getNormalizedColors();

        float normRed, normGreen, normBlue;
        normRed = colors.red / colors.alpha;
        normGreen = colors.green / colors.alpha;
        normBlue = colors.blue / colors.alpha;
        if (normRed <= 0.11 && normGreen >= 0.2 && normBlue <= 0.25) {
            green = true;
        } else if (normRed >= 0.19 && normGreen <= 0.25 && normBlue >= 0.31 ) {
            purple = true;

        } else {
            purple = false;
            green = false;

        }
        telemetry.addData("greenBall", green);
        telemetry.addData("purpleBall", purple);
        telemetry.addData("red", normRed);
        telemetry.addData("green", normGreen);
        telemetry.addData("blue", normBlue);
        return  DetectedColor.UNKOWN;
    }
}
