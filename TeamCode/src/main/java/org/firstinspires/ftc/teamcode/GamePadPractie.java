package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class GamePadPractie extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double leftY = -gamepad1.left_stick_y / 2.0;
        double rightY = -gamepad1.right_stick_y / 2.0;
        double leftX = gamepad1.left_stick_x;
        double rightX = gamepad1.right_stick_x;
        double trigleft = gamepad1.left_trigger;
        double trigRight = gamepad1.right_trigger;

        telemetry.addData("leftX", leftX);
        telemetry.addData("leftY", leftY);
        telemetry.addData("rightX", rightY);
        telemetry.addData("rightY", rightX);
        telemetry.addData("a", gamepad1.a);
        telemetry.addData("b", gamepad1.b);
        telemetry.addData("difference of x", leftX - rightX);
        telemetry.addData("sum of triggers", trigleft + trigRight);
    }
}
