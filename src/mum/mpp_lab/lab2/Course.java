package mum.mpp_lab.lab2;

public class Course {
    private String number;
    private String title;
    private int units;
    private Faculty faculty;

    public Course(String number, String title, int units, Faculty faculty) {
        this.number = number;
        this.title = title;
        this.units = units;
        this.faculty = faculty;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Course)){
            return false;
        }
        Course course = (Course) obj;
        return this.number.equals(course.getNumber());
    }
}
