class student {
    String name;
    int stuNo;
    course course1;
    course course2;
    course course3;
    double average;
    boolean isPass;

    int oralNoteMat;
    int oralNoteFizik;
    int oralNoteKimya;

    student(String name, int stuNo, course course1, course course2, course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addOralNotes(int oralNoteMat, int oralNoteFizik, int oralNoteKimya) {
        this.oralNoteMat = oralNoteMat;
        this.oralNoteFizik = oralNoteFizik;
        this.oralNoteKimya = oralNoteKimya;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.course1.note = note1;
        }

        if (note2 >= 0 && note2 <= 100) {
            this.course2.note = note2;
        }

        if (note3 >= 0 && note3 <= 100) {
            this.course3.note = note3;
        }
    }

    void isPass() {
        calcAvarage();
        System.out.println(name + " Geçti: " + (average >= 55));
    }

    void calcAvarage() {
        average = ((course1.note * (1 - course1.oralEffect) + oralNoteMat * course1.oralEffect)
                + (course2.note * (1 - course2.oralEffect) + oralNoteFizik * course2.oralEffect)
                + (course3.note * (1 - course3.oralEffect) + oralNoteKimya * course3.oralEffect)) / 3;
    }

    void printNote() {
        System.out.println("=========================");
        System.out.println("Ders Adı: " + course1.name + " Notu: " + course1.note + " Sözlü: " + oralNoteMat);
        System.out.println("Ders Adı: " + course2.name + " Notu: " + course2.note + " Sözlü: " + oralNoteFizik);
        System.out.println("Ders Adı: " + course3.name + " Notu: " + course3.note + " Sözlü: " + oralNoteKimya);
        System.out.println("=========================");
    }
}
