package godsfist.robot;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;

/**
 * @author Jared 'jarebear' Gentner <jargen3d@yahoo.com>
 * @author Hiren 'BhavTsar' Bhavsar <bhavsar.hsb@gmail.com>
 *
 */
public class Motors {
	// TODO Assign proper port numbers

	// Driver and Operator Controller initialization
	private static final int DRIVER_JOYSTICK_SLOT = 0;
	private static final int OPERATOR_JOYSTICK_SLOT = 1;

	// Initialize Ports
	public static final int FRONT_LEFT_SC_PORT = 0, BACK_LEFT_SC_PORT = 0,
			FRONT_RIGHT_SC_PORT = 0, BACK_RIGHT_SC_PORT = 0,
			ELEVATOR_SC_PORT = 4, TRAY_SC_PORT = 0, CLAW_SC_PORT = 0,
			LEFT_ROLLER_SC_PORT = 0, RIGHT_ROLLER_SC_PORT = 0;

	// Elevator Slave Ports
	public static final int ELEVATOR_SLAVE_ONE = 0, ELEVATOR_SLAVE_TWO = 0,
			ELEVATOR_SLAVE_THREE = 0;

	// Initialize CANTalons and Roller Talons
	public static final CANTalon frontLeftSC, backLeftSC, frontRightSC,
			backRightSC, elevatorSC, traySC, clawSC;

	public static final Talon rollerLeftSC, rollerRightSC;

	// INITIALIZATIONS Final
	static {
		// Initialize Drive Train
		frontLeftSC = new CANTalon(FRONT_LEFT_SC_PORT);
		frontRightSC = new CANTalon(FRONT_RIGHT_SC_PORT);
		backLeftSC = new CANTalon(BACK_LEFT_SC_PORT);
		backRightSC = new CANTalon(BACK_RIGHT_SC_PORT);

		// Initialize Tray
		traySC = new CANTalon(TRAY_SC_PORT);

		// Initialize Elevator
		elevatorSC = new CANTalon(ELEVATOR_SC_PORT);

		// Initialize Claw
		clawSC = new CANTalon(CLAW_SC_PORT);
		rollerLeftSC = new Talon(LEFT_ROLLER_SC_PORT);
		rollerRightSC = new Talon(RIGHT_ROLLER_SC_PORT);

		// Initialize Controllers
		Joystick driver = new Joystick(DRIVER_JOYSTICK_SLOT);
		Joystick operator = new Joystick(OPERATOR_JOYSTICK_SLOT);
	}
}
