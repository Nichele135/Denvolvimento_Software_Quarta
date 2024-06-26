package br.edu.up.heranca2.modelo;

public class EquipamentoSonoro extends Equipamento {
    private Integer volume;
    private Boolean estereo;

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Boolean getEstereo() {
        return estereo;
    }

    public void setEstereo(Boolean estereo) {
        this.estereo = estereo;
    }

    public void mono(){
        this.estereo = false;
    }

    public void estereo(){
        this.estereo = true;
    }

    @Override
    public void ligar(){
        super.ligar();
        this.volume = 5;
    }

}
