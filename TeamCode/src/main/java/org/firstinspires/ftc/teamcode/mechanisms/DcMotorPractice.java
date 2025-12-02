package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class DcMotorPractice extends OpMode {
    TestBench1 bench = new TestBench1();

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        double motorSpeed = gamepad1.right_trigger;
        telemetry.addData("motor revs", bench.getTicksPerRev());

        if (gamepad1.a) {
            bench.setMotorSpeed(motorSpeed);
        } else if (gamepad1.b){
            bench.setMotorSpeed(-motorSpeed);
        }   else {
            bench.setMotorSpeed(0);
        }
    }
}
