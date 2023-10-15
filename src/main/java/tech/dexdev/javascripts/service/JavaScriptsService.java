package tech.dexdev.javascripts.service;

import org.springframework.stereotype.Service;
import tech.dexdev.javascripts.entity.JavaScript;
import tech.dexdev.javascripts.repository.JavaScriptsRepository;

import java.util.List;

@Service
public class JavaScriptsService {
    private final JavaScriptsRepository repository;

    public JavaScriptsService(JavaScriptsRepository repository) {
        this.repository = repository;
    }

    public List<JavaScript> findAll() {
        return repository.findAll();
    }

    public JavaScript save(JavaScript javaScript) {
        return repository.save(javaScript);
    }

    public JavaScript getById(Long id) {
        return repository.findById(id).get();
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

//    public void filter(String category) {
//        repository.findAllByContentType(category);
//    }
}
