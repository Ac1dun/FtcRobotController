package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.ServoTest;

@TeleOp
public class servoExample extends OpMode {
    ServoTest bench = new ServoTest();
    double left_trigger, right_Trigger;
    @Override
    public void init() {
        bench.init(hardwareMap);
        left_trigger = 0;
        right_Trigger = 0;
    }

    @Override
    public void loop() {
        left_trigger = gamepad1.left_trigger;
        right_Trigger = gamepad1.right_trigger;
        bench.setServoPos(left_trigger);
        bench.setServoPos(right_Trigger);
    }
}
