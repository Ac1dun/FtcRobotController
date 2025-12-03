package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.hardware.limelightvision.LLResult;
import com.qualcomm.hardware.limelightvision.LLStatus;
import com.qualcomm.hardware.limelightvision.Limelight3A;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

@Disabled
@Autonomous
public class LimelightTest extends OpMode {

    private Limelight3A limelight3A;

    @Override
    public void init() {
        limelight3A =  hardwareMap.get(Limelight3A.class, "limelight");
        limelight3A.pipelineSwitch(6 ); //7 is blue, 6 is red
    }

    @Override
    public void start() {
        limelight3A.start();
    }

    @Override
    public void loop() {
        LLResult llResult = limelight3A.getLatestResult();
        if (llResult != null & llResult.isValid()) {
            telemetry.addData("target x offset", llResult.getTx());
            telemetry.addData("target y offset", llResult.getTy());
            telemetry.addData("target area offset", llResult.getTa());

            LLStatus status = limelight3A.getStatus();
            telemetry.addData("Name", "%s",
                    status.getName());
            telemetry.addData("LL", "Temp: %.1fC, CPU: %.1f%%, FPS: %d",
                    status.getTemp(), status.getCpu(),(int)status.getFps());
            telemetry.addData("Pipeline", "Index: %d, Type: %s",
                    status.getPipelineIndex(), status.getPipelineType());
        }
    }
}
