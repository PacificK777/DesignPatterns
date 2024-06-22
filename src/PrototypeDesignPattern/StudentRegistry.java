package PrototypeDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<StudentRegistryKey, Student> map = new HashMap<>();

    public void register(StudentRegistryKey key, Student student) {
        map.put(key, student);
    }

    public Student get(StudentRegistryKey key) {
        return map.get(key);
    }
}
