package me.gogosing.service.impl;

import me.gogosing.persistence.entity.AlbumEntity;
import me.gogosing.persistence.repository.AlbumRepository;
import me.gogosing.service.AlbumService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

/**
 * Created by JinBum Jeong on 2020/03/24.
 */
@Service
public class AlbumServiceImpl implements AlbumService {

    private final AlbumRepository albumRepository;

    public AlbumServiceImpl(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public Flux<AlbumEntity> getAlbumById(String id) {
        return albumRepository.findById(id);
    }
}
