package me.gogosing.service;

import me.gogosing.persistence.entity.AlbumEntity;
import reactor.core.publisher.Flux;

/**
 * Created by JinBum Jeong on 2020/03/24.
 */
public interface AlbumService {

    Flux<AlbumEntity> getAlbumById(String id);
}
