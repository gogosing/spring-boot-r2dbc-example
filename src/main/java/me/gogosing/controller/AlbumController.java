package me.gogosing.controller;

import me.gogosing.persistence.entity.AlbumEntity;
import me.gogosing.service.AlbumService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * Created by JinBum Jeong on 2020/03/24.
 */
@RestController
@RequestMapping("/v1")
public class AlbumController {

    private final AlbumService albumService;

    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping("/album/{id}")
    public Flux<AlbumEntity> getAlbum(@PathVariable("id") String id) {
        return albumService.getAlbumById(id);
    }
}
