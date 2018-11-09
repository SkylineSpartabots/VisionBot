package org.usfirst.frc.team2976.robot.subsystems;

import org.usfirst.frc.team2976.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Arm extends Subsystem {

     // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private static WPI_TalonSRX ArmMotorLeft1 =new WPI_TalonSRX(RobotMap.armMotor1);
	private static WPI_TalonSRX ArmMotorLeft2 =new WPI_TalonSRX(RobotMap.armMotor2);
	private static WPI_TalonSRX ArmMotorRight1 =new WPI_TalonSRX(RobotMap.armMotor3);
	private static WPI_TalonSRX ArmMotorRight2 =new WPI_TalonSRX(RobotMap.armMotor1);
	
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public static void extend(double power){
    	ArmMotorLeft1.setInverted(true);
    	ArmMotorLeft2.setInverted(true);
    	ArmMotorLeft1.set(power);
    	ArmMotorLeft2.set(power);
    	ArmMotorRight1.set(power);
    	ArmMotorRight2.set(power);
    }
    
    
    
}

