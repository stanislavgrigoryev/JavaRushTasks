package com.javarush.task.sql.task12.task1205;

/* 
Сохранить аудио файл в БД
*/

import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import java.util.Map;

@Entity
@Table(name = "audio_table", schema = "test")
public class Audio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "file_name")
    private String fileName;

    @Lob
    @Column(name = "audio_file")
    private byte[] audioFile;


//    @Column(name = "file_meta")

//    private Map<String, String> fileProperties;

}
