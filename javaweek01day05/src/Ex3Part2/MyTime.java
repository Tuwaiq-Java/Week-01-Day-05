package Ex3Part2;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTime {
    private int hour, minute,second;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) throws IllegalArgumentException {
        if ((hour >= 0 && hour <24 ) && (minute >=0 && minute <=59) && (second >=0 && second <=59)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;

        } else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }

    public void setTime(int hour, int minute, int second) throws  IllegalArgumentException{

        if ((hour >= 0 && hour <24 ) && (minute >=0 && minute <=59) && (second >=0 && second <=59)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;

        } else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }

    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <24) {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute >=0 && minute <=59) {
            this.minute = minute;

        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second >=0 && second <=59) {
            this.second = second;

        }
    }

    public MyTime nextSecond() {
        if(this.second ==  59) {
            this.second =0;
            if (this.minute == 59) {
                if (this.hour == 23) {
                    this.hour = 0;
                } else {
                    this.hour+=1;
                }
                    this.minute =0;
            } else {
                this.minute += 1;
            }
        }else {
            this.second +=1;
        }
        return new MyTime(this.hour,this.minute,this.second);
    }

    public MyTime nextMinute() {
        if(this.minute == 59) {
            if(this.hour == 23) {
                this.hour =0;
            } else {
                this.hour += 1;
            }
            this.minute =0;
        }else {
            this.minute += 1;
        }
        return new MyTime(this.hour,this.minute,this.second);
    }
    public MyTime nextHour() {
        if(this.hour == 23) {
//            this.second = 0;
//            this.minute = 0;
            this.hour =0;
        } else {
            this.hour += 1;
        }
        return new MyTime(this.hour,this.minute,this.second);
    }

    public MyTime previousSecond() {
        if(this.second == 0) {
            if(this.minute == 0) {
                if( this.hour == 0) {
                    this.hour = 23;
                } else {
                    this.hour -= 1;
                }
                this.minute = 59;
            } else {
                this.minute -= 1;
            }
        } else {
            this.second -= 1;
        }
        return new MyTime(this.hour,this.minute,this.second);
    }

    public MyTime previousMinute() {
        if (this.minute == 0) {
            this.minute = 59;
            if(this.hour ==0) {
                this.hour = 23;
            } else {
                this.hour -= 1;
            }
        } else {
            this.minute -=1;
        }
        return new MyTime(this.hour,this.minute,this.second);
    }
    public MyTime previousHour() {
        if(this.hour == 0) {
            this.hour = 23;
        } else {
            this.hour -= 1;
        }
        return new MyTime(this.hour,this.minute,this.second);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }
}
