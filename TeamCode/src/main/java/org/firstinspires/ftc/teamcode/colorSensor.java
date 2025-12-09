package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.TestBench;
import org.firstinspires.ftc.teamcode.mechanisms.TestBenchColor;

@TeleOp
public class colorSensor extends OpMode {
    TestBenchColor bench = new TestBenchColor();
    //TestBenchColor.DetectedColor detectedColor;
    double distance;
    String detectedColor;

    @Override
    public void init() {
        bench.init(hardwareMap);
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
            } else if (detectedColor == "green") {
                telemetry.addData("and it is", detectedColor);
            }
        }
    }
}

