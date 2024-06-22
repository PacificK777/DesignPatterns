package PrototypeDesignPattern;

public class Client {

    private static void fillRegistry(StudentRegistry studentRegistry) {

        Student apr23BeginnerBatch = new Student();
        apr23BeginnerBatch.setBatch("Apr23 Beginner Batch");
        apr23BeginnerBatch.setAveragePsp(79.0);
        studentRegistry.register(StudentRegistryKey.APR23_BEGINNER, apr23BeginnerBatch);

        IntelligentStudent apr23IntelligentStudent = new IntelligentStudent();
        apr23IntelligentStudent.setBatch("Apr23 Beginner Batch");
        apr23IntelligentStudent.setAveragePsp(79.0);
        apr23IntelligentStudent.setIq(160);
        studentRegistry.register(StudentRegistryKey.APR23_INTELLIGENT, apr23IntelligentStudent);

    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student amit = studentRegistry.get(StudentRegistryKey.APR23_BEGINNER).clone();
        amit.setName("Amit");
        amit.setPsp(85);
        amit.setAge(37);

        Student nayak = studentRegistry.get(StudentRegistryKey.APR23_INTELLIGENT).clone();
        nayak.setName("Nayak");
        nayak.setAge(28);
        nayak.setCity("Mumbai");
        nayak.setPsp(57);

        System.out.println("DEBUG");
    }
}
