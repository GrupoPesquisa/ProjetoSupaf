package entity;

public class SaudeATF{
private int codigo, suaSaude, sentidoBeF, fisicamenteAtv, podidoCorrer;


public SaudeATF(int codigo, int suaSaude, int sentidoBeF,int fisicamenteAtv, int podidoCorrer){
this.codigo = codigo;
this.suaSaude = suaSaude;
this.sentidoBeF = sentidoBeF;
this.fisicamenteAtv = fisicamenteAtv;
this.podidoCorrer = podidoCorrer;
}

    public SaudeATF() {
    }

public int getCodigo() {
    return codigo;
}

public void setCodigo(int codigo) {
    this.codigo = codigo;
}

public int getSuaSaude(){
    return suaSaude;
}
public void setSuaSaude(int suaSaude){
    this.suaSaude = suaSaude;
}

public int getSentidoBeF(){
    return sentidoBeF;
}
public void setSentidoBeF(int sentidoBeF){
    this.sentidoBeF = sentidoBeF;
}

public int getFisicamenteAtv(){
    return fisicamenteAtv;
}
public void setFisicamenteAtv(int fisicamenteAtv){
    this.fisicamenteAtv = fisicamenteAtv;
}

public int getPodidoCorrer(){
    return podidoCorrer;
}
public void setPodidoCorrer(int podidoCorrer){
    this.podidoCorrer = podidoCorrer;
}
}
