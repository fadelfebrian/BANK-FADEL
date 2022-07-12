package bni.assignment.core.services;

import bni.assignment.core.models.NasabahModel;
import bni.assignment.core.repositories.NasabahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class NasabahService {
    @Autowired
    private NasabahRepository nasabahRepository;
            public List<NasabahModel> getAllNasabah(){
                List<NasabahModel> response = nasabahRepository.findAll();
                return response;
            }
            public Optional<NasabahModel> getOneNasabah(Long id){
                Optional<NasabahModel> response = nasabahRepository.findById(id);
                return response;
            }

            public List<NasabahModel> getNasabahByKtp(@RequestParam  String noKtp){
                List<NasabahModel> response = nasabahRepository.findByNoKtp(noKtp);
                return response;

            }
            public NasabahModel saveNasabah(NasabahModel nasabah){
                NasabahModel response = nasabahRepository.save(nasabah);
                return response;
            }
}
