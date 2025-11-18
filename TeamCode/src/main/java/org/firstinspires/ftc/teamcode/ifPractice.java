package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class ifPractice extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double leftY = -gamepad1.left_stick_y;
        boolean leftTrig = gamepad1.left_bumper;
        if (leftY < 0.1 && leftY > -0.1){
            telemetry.addData("leftYstate", "in dead zone");
        } else {
            telemetry.addData("leftYstate", "out of dead zone");
        }
        if (leftY > 0.5 && leftTrig){
            telemetry.addData("hi", "hello");
        } else {
            
        }
    }

}