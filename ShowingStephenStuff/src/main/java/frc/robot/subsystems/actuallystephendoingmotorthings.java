// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.controls.DutyCycleOut;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class actuallystephendoingmotorthings extends SubsystemBase {
  /** Creates a new actuallystephendoingmotorthings. */
  TalonFX motor1 = new TalonFX(0);


  public actuallystephendoingmotorthings() {
    motor1.setControl(new DutyCycleOut(-1));
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
