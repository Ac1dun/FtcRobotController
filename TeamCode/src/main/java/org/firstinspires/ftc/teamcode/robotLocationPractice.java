package org.firstinspires.ftc.teamcode;

public class robotLocationPractice {
    double angle;

    public robotLocationPractice(double angle) {
        this.angle = angle;
    }

    public double getHeading() {
        double angle = this.angle;
        while (angle > 180) {
            angle -= 360;
        }
        while (angle <= -180) {
            angle += 360;
        }
        return angle ;
    }

    public void turnRobot(double angleChange) {
        angle += angleChange;
    }
    public void setAngle(double angle) {
        this.angle = angle;
    }
}
