package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class Varible extends OpMode {
    @Override
    public void init() {
        int teamNumber = 23537;
        double motorSpeed = 3.14;
        String teamName = "itkan";
        int motorAngle = 10;


        telemetry.addData("TeamNumber", teamNumber);
        telemetry.addData("motorSpeed", motorSpeed);
        telemetry.addData("Name", teamName);
        telemetry.addData("Motor angle", motorAngle);
    }

    @Override
    public void loop() {
        boolean clawClosed = gamepad1.left_bumper;
        String clawStatus = "N/A";
        telemetry.addData("clawClosed", clawStatus); //Use clawClosed not clawStatus

        if (clawClosed) {   //use == for boolean
            clawStatus = "closed";
        } else {
            clawStatus = "opened";//Use clawClosed not clawStatus
        }

        telemetry.addData("clawClosed", clawStatus);

    }
}
