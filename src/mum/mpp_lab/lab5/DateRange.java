package mum.mpp_lab.lab5;

import java.util.Calendar;
import java.util.Date;

public final class DateRange {
    private final Calendar startDate;
    private final Calendar endDate;

    public DateRange(Calendar startDate, Calendar endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public boolean isInRange(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return startDate.after(calendar) && endDate.before(calendar);
    }

    public static int getFirstDateOfMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.getActualMinimum(Calendar.DAY_OF_MONTH);
    }

    public static int getLastDateOfMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    @Override
    public String toString() {
        return startDate.toString() + " " + endDate.toString();
    }

}
