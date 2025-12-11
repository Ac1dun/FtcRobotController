package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.ServoTest;

@TeleOp
public class servoExample extends OpMode {
    ServoTest bench = new ServoTest();
    double left_Trigger, right_Trigger;
    @Override
    public void init() {
        bench.init(hardwareMap);
        left_Trigger = 0;
        right_Trigger = 0;
    }

    @Override
    public void loop() {
        if (gamepad1.a) {
            bench.setServoPos(1.0);
        } else {
            bench.setServoPos(0.0);
        }

        left_Trigger = gamepad1.left_trigger;
        right_Trigger = gamepad1.right_trigger;
        telemetry.addData("left trigger ", left_Trigger);
        telemetry.addData("right trigger ", right_Trigger);

        bench.setServoPos(left_Trigger);
        bench.setServoCont(right_Trigger);
        /*
        if (left_Trigger>0.05) {
            bench.setServoCont(-left_Trigger);
        } else if (right_Trigger>0.05) {
            bench.setServoCont(right_Trigger);
        } else {
            bench.setServoCont(0);
        }
         */
        /*if (gamepad1.b) {
            bench.setServoCont(1.)
        } else if (gamepad1.x) {
            bench.setServoCont(-1.0);
        } else {
            bench.setServoCont(0.0);
        }
      left_trigger = gamepad1.left_trigger;
        right_Trigger = gamepad1.right_trigger;
        bench.setServoPos(left_trigger);
        bench.setServoPos(right_Trigger);
       */
    }
}
