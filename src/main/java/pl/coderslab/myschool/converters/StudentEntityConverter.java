package pl.coderslab.myschool.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.coderslab.myschool.entities.Student;
import pl.coderslab.myschool.repository.StudentRepository;

public class StudentEntityConverter implements Converter<String, Student> {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student convert(String s) {
        return studentRepository.findById(Long.parseLong(s));
    }
}
