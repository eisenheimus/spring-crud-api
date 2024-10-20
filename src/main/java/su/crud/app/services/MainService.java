package su.crud.app.services;

import org.springframework.stereotype.Service;
import su.crud.app.entities.MainEntity;
import su.crud.app.repositories.MainRepository;

import java.util.List;

@Service
public class MainService {

    private final MainRepository mainRepository;

    public MainService(MainRepository mainRepository){
        this.mainRepository = mainRepository;
    }

    public List<MainEntity> findAll(){
        return this.mainRepository.findAll();
    }

}
