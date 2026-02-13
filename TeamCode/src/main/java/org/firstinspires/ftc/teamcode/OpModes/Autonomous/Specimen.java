package org.firstinspires.ftc.teamcode.OpModes.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Base.AutonomousBaseV1;
import org.firstinspires.ftc.teamcode.Base.RobotRunType;


@Autonomous(name = "Specimen" )
public class Specimen extends AutonomousBaseV1 {

    @Override
    public void runOpMode() {
        //set up robot for teleop
        initRobotV2(RobotRunType.AUTONOMOUS);

        while (!opModeIsActive() && !isStopRequested()) {
            telemetry.addData("status", "waiting for start command...");
        }
        waitForStart();
        drive(0.4, 15);
        turnHeading(0.5, -45);
        //activateIntake(0.6);
        strafeRot(-0.4, 4);
        waitSec(1.2);
        //deactivateIntake();



        /*
        // Examples:
        liftUp();                    // Lift to top
        liftMiddle();                // Lift to middle
        liftDown();                  // Lift to bottom
        moveLift(0.5, 1.0);         // Lift to middle and wait 1 second

        sortLeft();                  // Sort left configuration
        sortRight();                 // Sort right configuration
        setSortPosition(1, 0);      // Manual sort control
        moveSort(0, 1, 0.5);        // Sort and wait 0.5 seconds
         */
        //drive(.4, 10);
        //activateSpinOne(0.5);
        //waitSec(2);
        //deactivateSpinOne();
        //runIntakeForTime(0.5, 2.0);  // Run intake at 50% for 2 seconds
        //activateIntake(0.7);
        //waitSec(3);
        //deactivateIntake();
        /*waitSec(.4);
        strafeRot(0.7,-2);
        waitSec(0.2);
        turnHeading(.3,90);
        waitSec(0.2);
        drive(0.4,10);*/
    }

}