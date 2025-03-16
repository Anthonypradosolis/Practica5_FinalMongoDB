package com.example.demo.Psql.ComunicacionMongo;

import com.example.demo.Psql.model.AlbumMongo;
import com.example.demo.Psql.model.GrupoMongo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url = "http://localhost:8080", name = "org.example.demo.Psql.ComunicacionMongo")
public interface ComunicacionMongo {

    @PostMapping("/mongo/grupo/crear")
    void crearGrupo(@RequestBody GrupoMongo grupoMongo);

    @DeleteMapping("/mongo/grupo/borrar/{_id}")
    void borrarGrupo(@PathVariable Integer id);

    @PostMapping("/mongo/album/crear")
    void crearAlbum(@RequestBody AlbumMongo albumMongo);

    @DeleteMapping("/mongo/album/delete/{_id}")
    void borrarAlbum(@PathVariable Integer _id);

}
