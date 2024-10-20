package su.crud.app.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import su.crud.app.entities.MainEntity;
import su.crud.app.services.MainService;

import java.util.List;


@RestController
public class MainController {
    ObjectMapper objectMapper = new ObjectMapper();

    private final MainService mainService;

    MainController(MainService mainService){
        this.mainService = mainService;
    }


    @GetMapping()
    public String getMain() throws JsonProcessingException {

        List<MainEntity> result = this.mainService.findAll();

        return objectMapper.writeValueAsString(result);
    }

    @PostMapping()
    public String setMain() {
        return "";
    }
}
