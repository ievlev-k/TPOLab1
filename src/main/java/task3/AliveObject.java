package task3;

public class AliveObject extends Object{

    Job job;

    State state;

    public AliveObject(Job job, State state, String name) {
        this.job = job;
        this.state = state;
        this.name = name;
    }

    public AliveObject(String name, Job job) {
        this.name = name;
        this.job = job;
        this.state = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public AliveObject(State state) {
        this.state = state;
    }

    public void changeState(UnrealObject unrealObject){
        switch (unrealObject.getCharacteristic()){
            case AWFUL:
                this.state = State.LOST;
                break;
            case MAJESTIC:
                this.state = State.DISCOVERED;
                break;
            case SIMPLE:
                this.state = State.UNDERSTOOD;
                break;
            default:
                this.state = null;
                break;
        }
        System.out.println("толпа разрядилась " + unrealObject.getCharacteristic().text + " " + unrealObject.getName() + " " + this.name + " " + getState().text);

    }

    public boolean isSpeak(){
        if (job == Job.SPEAKER){
            System.out.println(job.text + " говорит");
            return true;
        }else{
            System.out.println(job.text + " не говорит");
            return false;
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
