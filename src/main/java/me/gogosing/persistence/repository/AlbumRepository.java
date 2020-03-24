package me.gogosing.persistence.repository;

import me.gogosing.persistence.entity.AlbumEntity;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

/**
 * 앨범 Repository.
 * Created by JinBum Jeong on 2020/03/24.
 */
@Repository
public interface AlbumRepository extends ReactiveCrudRepository<AlbumEntity, Long> {

    @Query("SELECT * FROM T_ALBUM WHERE ALBUM_ID = :id")
    Flux<AlbumEntity> findById(String id);
}
