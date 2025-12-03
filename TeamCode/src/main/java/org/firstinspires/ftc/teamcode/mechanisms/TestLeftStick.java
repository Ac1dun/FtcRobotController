package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class TestLeftStick extends OpMode {
    double leftStickCounter = 0;

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        if (gamepad1.a) {
            leftStickCounter += 1;
        }
        telemetry.addData("counter", leftStickCounter);
    }
}
