package entity;

public class VoceMesmo{
    private int codigo, contenteManeira, contenteRoupas, preocupadoAspcto, invejaColegas, parteCorpoMudar;

public VoceMesmo(int codigo, int contenteManeira, int contenteRoupas, int preocupadoAspcto, int invejaColegas, int parteCorpoMudar){
    this.codigo = codigo;
    this.contenteManeira = contenteManeira;
    this.contenteRoupas = contenteRoupas;
    this.preocupadoAspcto = preocupadoAspcto;
    this.invejaColegas = invejaColegas;
    this.parteCorpoMudar = parteCorpoMudar;
}

public int getCodigo() {
    return codigo;
}

public void setCodigo(int codigo) {
    this.codigo = codigo;
}

public int getContenteManeira(){
    return contenteManeira;
}

public void setContenteManeira(int contenteManeira){
    this.contenteManeira = contenteManeira;
}

public int getContenteRoupas(){
    return contenteRoupas;
}

public void setContenteRoupas(int contenteRoupas){
    this.contenteRoupas = contenteRoupas;
}

public int getPreocupadoAspcto(){
    return preocupadoAspcto;
}

public void setPreocupadoAspcto(int preocupadoAspcto){
    this.preocupadoAspcto = preocupadoAspcto;
}

public int getInvejaColegas(){
    return invejaColegas;
}

public void setInvejaColegas(int invejaColegas){
    this.invejaColegas = invejaColegas;
}

public int getParteCorpoMudar(){
    return parteCorpoMudar;
}

public void setParteCorpoMudar(int parteCorpoMudar){
    this.parteCorpoMudar = parteCorpoMudar;
}

}
