package cnu.mobilesoftware.smartscheduler.KFGD_SchedulerUI;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2016-11-01.
 */

public class ScheduleItem  implements Parcelable{
    public long _ID=-1;
    public String day;
    public int startTime;
    public int endTime;
    public String subjectName = "";
    public String classNum = "";
    public String professor = "";

    public ScheduleItem(SchedulerUtils.DAY_TAG day_tag, int startTime, int endTime){
        this.day = day_tag.name();
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public ScheduleItem(SchedulerUtils.DAY_TAG day_tag, int startTime, int endTime, String subjectName, String classNum, String professor) {
        this.day = day_tag.name();
        this.startTime = startTime;
        this.endTime = endTime;
        this.subjectName = subjectName;
        this.classNum = classNum;
        this.professor = professor;
    }


    protected ScheduleItem(Parcel in) {
        _ID = in.readLong();
        day = in.readString();
        startTime = in.readInt();
        endTime = in.readInt();
        subjectName = in.readString();
        classNum = in.readString();
        professor = in.readString();
    }

    public static final Creator<ScheduleItem> CREATOR = new Creator<ScheduleItem>() {
        @Override
        public ScheduleItem createFromParcel(Parcel in) {
            return new ScheduleItem(in);
        }

        @Override
        public ScheduleItem[] newArray(int size) {
            return new ScheduleItem[size];
        }
    };

    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(_ID);
        parcel.writeString(day);
        parcel.writeInt(startTime);
        parcel.writeInt(endTime);
        parcel.writeString(subjectName);
        parcel.writeString(classNum);
        parcel.writeString(professor);
    }
}
