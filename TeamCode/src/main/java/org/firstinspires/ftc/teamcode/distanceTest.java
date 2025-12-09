package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.TestBench1;
import org.firstinspires.ftc.teamcode.mechanisms.TestBenchMotor;
import org.firstinspires.ftc.teamcode.mechanisms.distanceTestBench;
@Disabled
@TeleOp
public class distanceTest extends OpMode {
    distanceTestBench bench = new distanceTestBench();
    TestBench1 motorBench = new TestBench1();



    @Override
    public void init() {
        bench.init(hardwareMap);
        motorBench.init(hardwareMap);
        motorBench.setMotorSpeed(1);
    }

    @Override
    public void loop() {


        double detectedDistance = bench.getDistance();

        telemetry.addData("distance", detectedDistance);
        if (detectedDistance <= 20) {
            motorBench.setMotorSpeed((detectedDistance-10) / 10);
        } else if (detectedDistance < 10){
            motorBench.setMotorSpeed(0);
        } else {
            motorBench.setMotorSpeed(1);
        }
        telemetry.addData("motor speed", (detectedDistance-10) / 10);
    }
}
