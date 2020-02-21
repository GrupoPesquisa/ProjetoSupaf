package entity;

public class Sentimentos {
private int codigo, desfrutadoVida, sentidoContente, sentidoSatisfeito, estadoHumor, sentidoAlegre, seDivertido;


public Sentimentos(int codigo, int desfrutadoVida, int sentidoContente, int sentidoSatisfeito, int estadoHumor, int sentidoAlegre, int seDivertido){

this.codigo = codigo;
this.desfrutadoVida = desfrutadoVida;
this.sentidoContente = sentidoContente;
this.sentidoSatisfeito = sentidoSatisfeito;
this.estadoHumor = estadoHumor;
this.sentidoAlegre = sentidoAlegre;
this.seDivertido = seDivertido;
}

    public Sentimentos() {
       
    }

public int getCodigo() {
    return codigo;
}

public void setCodigo(int codigo) {
    this.codigo = codigo;
}

public int getDesfrutadoVida(){
return desfrutadoVida;
}

public void setDesfrutadoVida(int desfrutadoVida){
this.desfrutadoVida = desfrutadoVida;
}

public int getSsentidoContente(){
return sentidoContente;
}

public void setSentidoContente(int sentidoContente){
this.sentidoContente = sentidoContente;
}

public int getSentidoSatisfeito(){
return sentidoSatisfeito;
}

public void setSentidoSatisfeito(int sentidoSatisfeito){
this.sentidoSatisfeito = sentidoSatisfeito;
}

public int getEstadoHumor(){
return estadoHumor;
}

public void setEstadoHumor(int estadoHumor){
this.estadoHumor = estadoHumor;
}

public int getSentidoAlegre(){
return sentidoAlegre;
}

public void setSentidoAlegre(int sentidoAlegre){
this.sentidoAlegre = sentidoAlegre;
}

public int getSeDivertido(){
return seDivertido;
}

public void setSeDivertido(int seDivertido){
this.seDivertido = seDivertido;
}
};