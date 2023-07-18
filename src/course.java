class course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;
    double oralEffect;

    course(String name, String code, String prefix, double oralEffect) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.oralEffect = oralEffect;
    }

    void addTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    void printTeacher() {
        System.out.println("Teacher: " + this.teacher.name);
    }
}