package mum.mpp_lab.lab5;

import java.util.Calendar;
import java.util.Date;

public final class DateRange {
    private final Date startDate;
    private final Date endDate;

    public DateRange(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public boolean isInRange(Date date) {
        return startDate.after(date) && endDate.before(date);
    }

    public static Date getFirstDateOfMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.getActualMinimum(Calendar.DAY_OF_MONTH);
        return cal.getTime();
    }

    public static Date getLastDateOfMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        return cal.getTime();
    }

    @Override
    public String toString() {
        return startDate.toString() + " " + endDate.toString();
    }

}
