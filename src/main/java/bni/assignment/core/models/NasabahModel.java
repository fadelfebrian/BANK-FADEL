package bni.assignment.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "td_nasabah")
public class NasabahModel {
    @Id
    //     BELOW THIS COMMENT IS FOR PRIMARY KEY
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    @Column(name = "id_nasabah")
    @JsonProperty("id_nasabah")
    private Long idNasabah;

    @Column(name = "nama_lengkap")
    @JsonProperty("nama_lengkap")
    private String namaLengkap;

    @Column(name = "alamat")
    @JsonProperty("alamat")
    private String alamat;

    @Column(name = "tempat_lahir")
    @JsonProperty("tempat_lahir")
    private String tempatLahir;

    @Column(name = "tgl_lahir")
    @JsonProperty("tgl_lahir")
    private String tglLahir;

    @Column(name = "no_hp")
    @JsonProperty("no_hp")
    private String noHp;

    @Column(name = "no_ktp")
    @JsonProperty("no_ktp")
    private String noKtp;

    //     BELOW THIS COMMENT IS SETTER AND GETTET
    public Long getIdNasabah() {
        return idNasabah;
    }

    public void setIdNasabah(Long idNasabah) {
        this.idNasabah = idNasabah;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    public NasabahModel() {
    }

    public NasabahModel(String namaLengkap, String alamat, String tempatLahir, String tglLahir, String noHp, String noKtp) {
        this.namaLengkap = namaLengkap;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tglLahir = tglLahir;
        this.noHp = noHp;
        this.noKtp = noKtp;
    }

    public NasabahModel(Long idNasabah, String namaLengkap, String alamat, String tempatLahir, String tglLahir, String noHp, String noKtp) {
        this.idNasabah = idNasabah;
        this.namaLengkap = namaLengkap;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tglLahir = tglLahir;
        this.noHp = noHp;
        this.noKtp = noKtp;
    }
}
