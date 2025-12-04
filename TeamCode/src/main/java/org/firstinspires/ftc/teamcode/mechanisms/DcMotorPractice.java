package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class DcMotorPractice extends OpMode {
    TestBench1 bench = new TestBench1();
    //TestBenchMotor bench = new TestBenchMotor();
    double leftStickCounter = 0;
    double currentPower = 0.5;
    double leftStickPress = 0;
    double powerRev = 0.5;
    boolean speedRevFlag;

    @Override
    public void init() {
        bench.init(hardwareMap);
    }


    @Override
    public void loop() {
        double motorSpeed = -gamepad1.left_stick_y;

        if (gamepad1.left_stick_button) {
            speedRevFlag = !speedRevFlag;
        }

        /*
        if (speedRevFlag) {
            powerRev = 1;
        } else if (!speedRevFlag) {
            powerRev = 0.5;
        }
        currentPower = motorSpeed * powerRev;

        /*
        telemetry.addData("counter", leftStickCounter);

        if (gamepad1.a) {
            bench.setMotorZeroType(DcMotor.ZeroPowerBehavior.BRAKE);

        } else if (gamepad1.b) {
            bench.setMotorZeroType(DcMotor.ZeroPowerBehavior.FLOAT);
        }

        if (leftStickPress == 0 && gamepad1.left_stick_button) {
            currentPower = 0.25;
            leftStickPress = 1;
            leftStickCounter += 1;
        } else if (leftStickPress == 1 && gamepad1.left_stick_button) {
            currentPower = 0.5;
            leftStickPress = 2;
            leftStickCounter += 1;
        } else if (leftStickPress == 2 && gamepad1.left_stick_button) {
            currentPower = 1;
            leftStickPress = 0;
            leftStickCounter += 1;
        }
        */

        telemetry.addData("motor revs", bench.getTicksPerRev());
        telemetry.addData("power", motorSpeed);
        telemetry.addData("max power", powerRev);
        telemetry.addData("pwerrev", currentPower);
        bench.setMotorSpeed(currentPower);
        //bench.setMotorSpeed50100(motorSpeed,speedRevFlag);
    }
}
