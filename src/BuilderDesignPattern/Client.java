package BuilderDesignPattern;

public class Client {
    public static void main(String[] args) {
//        Builder builder =new Builder();

//        Builder builder = Student.getBuilder();
//        builder.setName("Prashant");
//        builder.setAge(29);
//        builder.setBatch("Morning April 2023");
//        builder.setPsp(88.53);
//        builder.setGradYear(2024);
//        builder.setUniversityName("Scaler");
//
////      Student student = new Student(builder);
//        Student student = builder.build();

        Student student = Student.getBuilder()
                .setName("Sample")
                .setAge(20)
                .setGradYear(2024)
                .setBatch("Evening Batch")
                .setPsp(97.4)
                .build();

        System.out.println("DEBUG");
    }
}
