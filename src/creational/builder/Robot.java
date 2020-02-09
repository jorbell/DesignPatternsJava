package creational.builder;

public class Robot implements RobotPlan {
    private String robotHead;
    private String robotTorso;
    private String robotArms;
    private String robotLegs;

    /**
     * @return the robotHead
     */
    public String getRobotHead() {
        return robotHead;
    }

    public void setRobotHead(String head) {
        // TODO Auto-generated method stub
        robotHead = head;

    }

    /**
     * @return the robotTorso
     */
    public String getRobotTorso() {
        return robotTorso;
    }

    public void setRobotTorso(String torso) {
        // TODO Auto-generated method stub
        robotTorso = torso;

    }

    /**
     * @return the robotArms
     */
    public String getRobotArms() {
        return robotArms;
    }

    public void setRobotArms(String arms) {
        // TODO Auto-generated method stub
        robotArms = arms;

    }

    /**
     * @return the robotLegs
     */
    public String getRobotLegs() {
        return robotLegs;
    }

    public void setRobotLegs(String legs) {
        // TODO Auto-generated method stub
        robotLegs = legs;

    }
    
}
