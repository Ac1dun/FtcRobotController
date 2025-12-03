package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBench1 {
    private DcMotor motor;
    private DigitalChannel touchSensor;
    private double ticksPerRev;
    public void init(HardwareMap hwMap) {

        motor = hwMap.get(DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticksPerRev = motor.getMotorType().getTicksPerRev();
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        //motor.setDirection(DcMotorSimple.Direction.FORWARD);

        touchSensor = hwMap.get(DigitalChannel.class, "touch_sensor");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
    }
    public void setMotorSpeed(double speed) {

        motor.setPower(speed);
    }

    public double getTicksPerRev() {
        return motor.getCurrentPosition() / ticksPerRev;
    }




    public boolean TouchSensorState() {
        return !touchSensor.getState();
    }

    public boolean isTouchSensorReleased() {
        return touchSensor.getState();
    }
    public void setMotorZeroType(DcMotor.ZeroPowerBehavior zeroType) {
        motor.setZeroPowerBehavior(zeroType);

    }
}
