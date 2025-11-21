package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.TestBench;

@TeleOp
public class TouchSensorPractice extends OpMode {

    TestBench bench = new TestBench();

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        String touchSensorStatus = "N/A";
        
        telemetry.addData("touch sensor state", bench.TouchSensorState());


        if (bench.isTouchSensorReleased()) {
            touchSensorStatus = "not pressed";
        } else if (!bench.isTouchSensorReleased()) {
            touchSensorStatus = "pressed";
        }
        telemetry.addData("reversed touch sensor state", touchSensorStatus);

    }
}
