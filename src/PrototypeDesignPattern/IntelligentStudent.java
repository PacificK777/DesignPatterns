package PrototypeDesignPattern;

public class IntelligentStudent extends Student {
    int iq;

    public IntelligentStudent() {

    }

    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public IntelligentStudent clone() {
        //this -> IntelligentStudent
        return new IntelligentStudent(this);
    }
}
