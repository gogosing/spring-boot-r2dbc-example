drop table if exists T_ALBUM cascade;

CREATE TABLE T_ALBUM (
                       ALBUM_KEY            serial NOT NULL,
                       ALBUM_ID             char(14) NOT NULL,
                       TITLE                varchar(150) NOT NULL,
                       DELETED              boolean DEFAULT false NOT NULL,
                       CREATE_UTC           timestamptz DEFAULT current_timestamp NOT NULL,
                       CONSTRAINT PK_T_ALBUM_ALBUM_KEY PRIMARY KEY ( ALBUM_KEY ),
                       CONSTRAINT IDX_T_ALBUM_UNIQUE_ALBUM_ID UNIQUE ( ALBUM_ID )
);

CREATE INDEX IDX_ALBUM_TITLE ON T_ALBUM ( TITLE );

COMMENT ON TABLE T_ALBUM IS '앨범 정보 테이블';

COMMENT ON COLUMN T_ALBUM.ALBUM_KEY IS '레코드 식별자';

COMMENT ON COLUMN T_ALBUM.ALBUM_ID IS '앨범 레코드 대체 식별자';

COMMENT ON COLUMN T_ALBUM.TITLE IS '앨범 타이틀';

COMMENT ON COLUMN T_ALBUM.DELETED IS '삭제 여부';

COMMENT ON COLUMN T_ALBUM.CREATE_UTC IS '레코드 생성일시';