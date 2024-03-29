package com.cn.repository.impl;

import com.cn.entity.Student;
import com.cn.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @date 2019/9/2 0002 16:22
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long, Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L, new Student(1L, "张三", 18));
        studentMap.put(2L, new Student(2L, "李四", 21));
        studentMap.put(3L, new Student(3L, "王五", 34));
        studentMap.put(4L, new Student(4L, "赵六", 23));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
