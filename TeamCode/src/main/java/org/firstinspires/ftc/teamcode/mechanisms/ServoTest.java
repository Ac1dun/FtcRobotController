package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class ServoTest {
    private Servo servoPos;
    private CRServo servoCont;


    public void init(HardwareMap hwMap) {
        servoPos = hwMap.get(Servo.class, "servo_pos");
        servoCont = hwMap.get(CRServo.class, "servo_cont");
        servoPos.scaleRange(0, 1);
        servoCont.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public void setServoPos(double angle) {
        servoPos.setPosition(angle);
    }

    public void setServoCont(double power) {
        servoCont.setPower(power);
    }
}
