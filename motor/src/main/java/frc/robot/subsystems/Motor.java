// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix6.controls.DutyCycleOut;
import com.ctre.phoenix6.hardware.TalonFX;

public class Motor extends SubsystemBase {
  /** Creates a new Motor. */
  TalonFX motor = new TalonFX(4);
  public Motor() {
    motor.setControl(new DutyCycleOut(0.1));
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
