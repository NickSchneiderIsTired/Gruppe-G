package Blatt4.Aufgabe15;

public class Task {

    String desc;
    int prio;

    public Task(String desc, int prio) throws IllegalArgumentException{
        setDesc(desc);
        setPrio(prio);
    }

    public Task(String desc) throws IllegalArgumentException{
        setDesc(desc);
        prio = 1;
    }

    private boolean checkDesc(String desc) {
        return desc.length() > 0;
    }

    private void setDesc(String desc) throws IllegalArgumentException{
        if(!checkDesc(desc)) {
            throw new IllegalArgumentException("Beschreibung kann nicht leer sein");
        } else {
            this.desc = desc;
        }
    }

    public void setPrio(int prio) {
        if(prio < 1) {
            this.prio = 1;
        } else if(prio > 5) {
            this.prio = 5;
        } else {
            this.prio = prio;
        }
    }

    public boolean equals(Task t) {
        String s1 = this.desc.toLowerCase();
        String s2 = t.desc.toLowerCase();
        return s1.equals(s2);
    }

    public void printTask() {
        System.out.println(desc + "(" + prio + ")");
    }

    public String getDesc() {
        return desc;
    }

    public int getPrio() {
        return prio;
    }
}
