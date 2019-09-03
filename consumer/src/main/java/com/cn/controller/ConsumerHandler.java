package com.cn.controller;

import com.cn.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @author Administrator
 * @date 2019/9/2 0002 17:56
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        ResponseEntity<Collection> entity = restTemplate.getForEntity("http://localhost:8010/student/findAll", Collection.class);
        return entity.getBody();
    }

    @GetMapping("findAll2")
    public Collection<Student> findAll2() {
        return restTemplate.getForObject("http://localhost:8010/student/findAll", Collection.class);
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id) {
        ResponseEntity<Student> entity = restTemplate.getForEntity("http://localhost:8010/student/findById/{id}", Student.class, id);
        return entity.getBody();
    }

    @GetMapping("/findById2/{id}")
    public Student findById2(@PathVariable("id") long id) {
        return restTemplate.getForObject("http://localhost:8010/student/findById/{id}", Student.class, id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        restTemplate.postForEntity("http://localhost:8010/student/save", student, null);
    }

    @PostMapping("/save2")
    public void save2(@RequestBody Student student) {
        restTemplate.postForObject("http://localhost:8010/student/save", student, null);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        restTemplate.put("http://localhost:8010/student/update", student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void delete(@PathVariable("id") long id) {
        restTemplate.delete("http://localhost:8010/student/deleteById/{id}", id);
    }
}
