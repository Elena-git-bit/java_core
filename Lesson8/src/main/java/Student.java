public class Student {
    String name;
    String course;
    String faculty;

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public String getFaculty() {
        return faculty;
    }



@Override
    public String toString(){
        return "[" + name + "," + course + "," + faculty + "]";

    }


}
