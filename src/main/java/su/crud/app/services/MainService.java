package su.crud.app.services;

import org.springframework.stereotype.Service;
import su.crud.app.DTO.MainDTO;
import su.crud.app.entities.MainEntity;
import su.crud.app.repositories.MainRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MainService {

    private final MainRepository mainRepository;

    public MainService(MainRepository mainRepository){
        this.mainRepository = mainRepository;
    }

    public List<MainEntity> findAll(){
        return this.mainRepository.findAll();
    }

    public MainEntity save(MainDTO dto){

        MainEntity entity = new MainEntity();
        entity.setName(dto.getName());
        entity.setInfo(dto.getInfo());

       return this.mainRepository.save(entity);
    }

    public void delete(Integer id){
         this.mainRepository.deleteById(id);
    }

    public MainEntity update(MainDTO dto){
        MainEntity entity = new MainEntity();

        entity.setId((long) dto.getId());
        entity.setInfo(dto.getInfo());
        entity.setName(dto.getName());

        this.mainRepository.save(entity);

        return null;
    }

}
