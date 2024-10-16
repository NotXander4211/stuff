// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

//import com.ctre.phoenix6.configs.Slot0Configs;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.MotionMagicVoltage;
import com.ctre.phoenix6.hardware.TalonFX;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PosControl extends SubsystemBase {
  /** Creates a new PosControl. */
  MotionMagicVoltage m_motion = new MotionMagicVoltage(0);
  TalonFX f_motor = new TalonFX(Constants.f_motorPort);
  

  public PosControl() {
    TalonFXConfiguration tfx_config = new TalonFXConfiguration();
    var mm_config = tfx_config.MotionMagic;
    var slot0config = tfx_config.Slot0;
    //TODO: FIX PID VALS
    //PID 
    slot0config.kP = 0;
    slot0config.kI = 0;
    slot0config.kD = 0;
    //mm config velocity and acceleration

    mm_config.MotionMagicAcceleration = 0;
    mm_config.MotionMagicCruiseVelocity = 0;

    //set configs
    f_motor.getConfigurator().apply(tfx_config);
  }

  public void Move(double pos){
    f_motor.setControl(m_motion.withPosition(pos));
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    Move(10);
  }
}
