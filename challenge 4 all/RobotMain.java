import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class RobotMain {

	public static void main(String[] args) {
  ColorSampleExample cse = new ColorSampleExample();
		Behavior laserRaptorFol = new LineFollowing(cse);
		PoleScanning laserRaptorPole = new PoleScanning(cse);
		Behavior laserRaptorGrab = new Grabbing(laserRaptorPole);
		Behavior wandering = new Wandering();
		Behavior [] behaviorArray = {wandering, laserRaptorFol, laserRaptorPole, laserRaptorGrab};
		Arbitrator arbitrator = new Arbitrator(behaviorArray);
	    arbitrator.go();
  }
}
