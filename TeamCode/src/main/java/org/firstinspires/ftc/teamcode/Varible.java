package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Varible extends OpMode {
    @Override
    public void init() {
        int teamNumber = 23537;
        double motorSpeed = 3.14;
        boolean clawClosed = true;
        String teamName = "itkan";
        int motorAngle = 10;
        String clawStatus = "N/A";

        if (clawClosed = true){
            clawStatus = "closed";
        } else {
            clawStatus = "opened";
        }

        telemetry.addData("TeamNumber", teamNumber);
        telemetry.addData("motorSpeed", motorSpeed);
        telemetry.addData("clawClosed", clawStatus);
        telemetry.addData("Name", teamName);
        telemetry.addData("Motor angle", motorAngle);





    }

    @Override
    public void loop() {
        /*

         */
    }
}
