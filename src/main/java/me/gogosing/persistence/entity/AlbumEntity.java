package me.gogosing.persistence.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.ZonedDateTime;

/**
 * 앨범 정보 Entity.
 * Created by JinBum Jeong on 2020/03/24.
 */
@Table(value = "T_ALBUM")
public class AlbumEntity {

    /**
     * 레코드 식별자.
     */
    @Id
    @Column(value = "ALBUM_KEY")
    private Long key = null;

    /**
     * 레코드 대체 식별자.
     */
    @Column(value = "ALBUM_ID")
    private String id;

    /**
     * 제목.
     */
    @Column(value = "TITLE")
    private String title;

    /**
     * 삭제여부.
     */
    @Column(value = "DELETED")
    private boolean deleted = false;

    /**
     * 레코드 생성일시.
     */
    @Column(value = "CREATE_UTC")
    private ZonedDateTime createOn;

    public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public ZonedDateTime getCreateOn() {
        return createOn;
    }

    public void setCreateOn(ZonedDateTime createOn) {
        this.createOn = createOn;
    }
}
