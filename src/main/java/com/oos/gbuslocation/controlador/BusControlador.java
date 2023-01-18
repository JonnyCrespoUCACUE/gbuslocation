package com.oos.gbuslocation.controlador;

import com.oos.gbuslocation.Repositorio.BusRepositorio;
import com.oos.gbuslocation.modelo.DatosBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api")


public class BusControlador {



    @Autowired
    BusRepositorio busRepositorio;


    @GetMapping("/getbuses")
    public List<DatosBus> buses()
    {

        return busRepositorio.findAll();
    }

    @PreAuthorize("hasAuthority('BASIC_AUTH')")
    @PostMapping("/buses")
    public DatosBus insertarNuevoBus(@Valid @RequestBody DatosBus bus)
    {
        return busRepositorio.save(bus);

    }
  /*  @GetMapping("/buses/{id}")
    public ResponseEntity<DatosBus> buscarBusId(@PathVariable int id) {
        DatosBus buscarBus = busRepositorio.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No exite bus: " + id));
        return ResponseEntity.ok(buscarBus);


    }
    @PutMapping("/buses/{id}")
    public ResponseEntity<DatosBus> editarBusId(@PathVariable int id,@RequestBody DatosBus busedit ) {
        DatosBus updateBus = busRepositorio.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No exite bus: " + id));

        updateBus.setId(busedit.getId());
        updateBus.setNombus(busedit.getNombus());
        updateBus.setFecha(busedit.getFecha());
        updateBus.setVelobus(busedit.getVelobus());
        updateBus.setLatitud(busedit.getLatitud());
        updateBus.setLongitud(busedit.getLongitud());

        DatosBus busactualizado = busRepositorio.save(updateBus);

        return ResponseEntity.ok(busactualizado);


    }

    //Metodo eliminacion datos
    @DeleteMapping("/buses/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarBus(@PathVariable int id) {
        DatosBus bus = busRepositorio.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No exite bus: " + id));

        busRepositorio.delete(bus);
        Map<String, Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminar", Boolean.TRUE);
        return  ResponseEntity.ok(respuesta);
    }*/
}
