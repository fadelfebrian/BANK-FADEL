package bni.assignment.core.controllers;

import bni.assignment.core.models.NasabahModel;
import bni.assignment.core.services.NasabahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/nasabah")
public class NasabahController {
    @Autowired
    private NasabahService nasabahService;
    @GetMapping("/getAll")
    public List<NasabahModel> getAllNasabah(){
        List<NasabahModel> response = nasabahService.getAllNasabah();
                return response;
    }

    @GetMapping("/getByKtp")
    public List<NasabahModel> getNasabahByKtp(@RequestParam String noKtp){
        List<NasabahModel> response = nasabahService.getNasabahByKtp(noKtp);
                return response;
    }

    @PutMapping("/{id}")
    public NasabahModel putNasabah(@RequestBody NasabahModel nasabah,@PathVariable(name = "id") Long id){
        NasabahModel oneNasabah = nasabahService.getOneNasabah(id).get();
        oneNasabah.setAlamat(nasabah.getAlamat());
        oneNasabah.setNamaLengkap(nasabah.getNamaLengkap());
        oneNasabah.setTempatLahir(nasabah.getTempatLahir());
        oneNasabah.setTglLahir(nasabah.getTglLahir());
        oneNasabah.setNoHp(nasabah.getNoHp());
        oneNasabah.setNoKtp(nasabah.getNoKtp());
        final NasabahModel updatedNasabah = nasabahService.saveNasabah(oneNasabah);
        return updatedNasabah;
    }

    @PostMapping
    public NasabahModel saveNasabah(@RequestBody NasabahModel nasabah){
        NasabahModel request = new NasabahModel();
        request.setNamaLengkap(nasabah.getNamaLengkap());
        request.setAlamat(nasabah.getAlamat());
        request.setNoHp(nasabah.getNoHp());
        request.setNoKtp(nasabah.getNoKtp());
        request.setTempatLahir(nasabah.getTempatLahir());
        request.setTglLahir(nasabah.getTglLahir());
        NasabahModel response = nasabahService.saveNasabah(request);
        return response;
    }
}
