package BuilderDesignPattern;

public class Student {
    String name;
    int age;
    String batch;
    String universityName;
    double psp;
    int gradYear;
    String phoneNumber;

    private Student(Builder builder){
        this.name=builder.name;
        this.age=builder.age;
        this.batch=builder.batch;
        this.universityName=builder.universityName;
        this.psp=builder.psp;
        this.gradYear=builder.gradYear;
        this.phoneNumber=builder.phoneNumber;
    }
    public static Builder getBuilder(){
        return new Builder();
    }
    public static class Builder {  //Inner class
        String name;
        int age;
        String batch;
        String universityName;
        double psp;
        int gradYear;
        String phoneNumber;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public Student build(){
            //Validations
            if (this.getGradYear()<2020){
                throw new IllegalArgumentException("Grade year must be greater than 2020!");
            }
            //Using below will actually build the student object
            return new Student(this);
        }
    }
}
