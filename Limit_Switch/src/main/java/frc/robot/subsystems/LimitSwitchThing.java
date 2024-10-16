// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.controls.DutyCycleOut;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LimitSwitchThing extends SubsystemBase {
  /** Creates a new LimitSwitchThing. */
  DigitalInput limit = new DigitalInput(0);
  TalonFX motor = new TalonFX(1);
  public LimitSwitchThing() {
    percentOutput(0.25);
  }

  public void percentOutput(double percent){
    motor.setControl(new DutyCycleOut(percent));
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    if(limit.get()){
      percentOutput(0);
    }
    
  }
}
