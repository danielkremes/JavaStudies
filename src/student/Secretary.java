package student;

public class Secretary {
    private String Register;
    private int LevelJob;
    private double Experience;

    public String getRegister() {
        return Register;
    }

    public void setRegister(String register) {
        Register = register;
    }

    public int getLevelJob() {
        return LevelJob;
    }

    public void setLevelJob(int levelJob) {
        LevelJob = levelJob;
    }

    public double getExperience() {
        return Experience;
    }

    public void setExperience(double experience) {
        Experience = experience;
    }

    @Override
    public String toString() {
        return "Secretary{" +
                "Register='" + Register + '\'' +
                ", LevelJob=" + LevelJob +
                ", Experience=" + Experience +
                '}';
    }
}
