package entity;

public class VoceEosDemais{
    private int codigo, medoRapazesMocas, rapazesZombadoVoce, rapEmocIntimidandoVoce;

public VoceEosDemais(int codigo, int medoRapazesMocas, int rapazesZombadoVoce, int rapEmocIntimidandoVoce){
    this.codigo = codigo;
    this.medoRapazesMocas = medoRapazesMocas;
    this.rapazesZombadoVoce = rapazesZombadoVoce;
    this.rapEmocIntimidandoVoce = rapEmocIntimidandoVoce;
}

    public VoceEosDemais() {
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public int getMedoRapazesMocas(){
        return medoRapazesMocas;
    }

    public void setMedoRapazesMocas(int medoRapazesMocas){
        this.medoRapazesMocas = medoRapazesMocas;
    }

    public int getRapazesZombadoVoce(){
        return rapazesZombadoVoce;
    }

    public void setRapazesZombadoVoce(int rapazesZombadoVoce){
        this.rapazesZombadoVoce = rapazesZombadoVoce;
    }

    public int getRapEmocIntimidandoVoce(){
       return rapEmocIntimidandoVoce;
    }

    public void setRapEmocIntimidandoVoce(int rapEmocIntimidandoVoce){
        this.rapEmocIntimidandoVoce = rapEmocIntimidandoVoce;
    }
}