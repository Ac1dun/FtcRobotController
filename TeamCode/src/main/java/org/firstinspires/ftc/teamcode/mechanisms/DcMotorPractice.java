package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class DcMotorPractice extends OpMode {
    TestBench1 bench = new TestBench1();
    double leftStickCounter = 0;
    double currentPower = 0.25;
    @Override
    public void init() {
        bench.init(hardwareMap);
    }
    double leftStickPress = 0;
    @Override
    public void loop() {

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


        telemetry.addData("motor revs", bench.getTicksPerRev());
        double speedMotor = -gamepad1.left_stick_y;
        bench.setMotorSpeed(speedMotor * currentPower);
    }
}
