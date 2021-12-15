package umn.ac.pet;

public class Reminder {
    private String name;
    private String date;
    private String owneruid;
    private String repeat_interval;
    private String time;
    private String repeat_type;
    private String sound;
    private String reminderid;

    public Reminder() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Reminder(String name, String date, String owneruid, String repeat_interval, String time, String repeat_type, String sound,
                    String reminderid) {
        this.name = name;
        this.date=date;
        this.owneruid=owneruid;
        this.repeat_interval=repeat_interval;
        this.time=time;
        this.repeat_type=repeat_type;
        this.sound=sound;
        this.reminderid=reminderid;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getOwneruid() {
        return owneruid;
    }

    public String getReminderid() {
        return reminderid;
    }

    public String getRepeat_interval() {
        return repeat_interval;
    }

    public String getRepeat_type() {
        return repeat_type;
    }

    public String getSound() {
        return sound;
    }

    public String getTime() {
        return time;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwneruid(String owneruid) {
        this.owneruid = owneruid;
    }

    public void setReminderid(String reminderid) {
        this.reminderid = reminderid;
    }

    public void setRepeat_interval(String repeat_interval) {
        this.repeat_interval = repeat_interval;
    }

    public void setRepeat_type(String repeat_type) {
        this.repeat_type = repeat_type;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setTime(String time) {
        this.time = time;
    }
}