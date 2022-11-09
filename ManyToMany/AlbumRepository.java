package com.app.seminario.service;
import org.springframework.data.jpa.repository.JpaRepository;
import com.app.seminario.entity.Album;

public interface AlbumRepository extends JpaRepository<Album, Integer>{

}
