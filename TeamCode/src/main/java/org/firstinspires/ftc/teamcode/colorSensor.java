package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.TestBench;
import org.firstinspires.ftc.teamcode.mechanisms.TestBenchColor;
import org.firstinspires.ftc.teamcode.mechanisms.TestBenchLED;

import java.nio.file.FileAlreadyExistsException;

@TeleOp
public class colorSensor extends OpMode {
    TestBenchColor bench = new TestBenchColor();
    TestBenchLED cBench = new TestBenchLED();
    //TestBenchColor.DetectedColor detectedColor;
    double distance;
    String detectedColor;

    @Override
    public void init() {
        bench.init(hardwareMap);
        cBench.init(hardwareMap);
    }

    @Override
    public void loop() {
       // bench.getDetectedColor(telemetry);
        //detectedColor=bench.getDetectedColor(telemetry);
        detectedColor = bench.getDetectedColor(telemetry);
        distance = bench.getDistanceColor();
        telemetry.addData("Ball distance", distance);
        if (distance <= 8) {
            telemetry.addData("Ball is in","cage");
            if (detectedColor == "purple") {
                telemetry.addData("and it is", detectedColor);
                cBench.setRedLed(true);
                cBench.setGreenLed(false);
            } else if (detectedColor == "green") {
                telemetry.addData("and it is", detectedColor);
                cBench.setGreenLed(true);
                cBench.setRedLed(false);
            } else {
                cBench.setRedLed(false);
                cBench.setGreenLed(false);
            }
        } else {
            cBench.setRedLed(false);
            cBench.setGreenLed(false);
        }
    }
}

