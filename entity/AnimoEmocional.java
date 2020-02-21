package entity;

public class AnimoEmocional {
private int codigo, sensacaoFzrErrado, sentidoTriste, sentidoMalFzrNada, sensacaoVidaMal, sentidoCheioVida, sentidoSo, sentidoPressao, contenteMSer, ContenteRoupas, PreocAspecto, InvejaColegas, ParteCMudar;

public AnimoEmocional(int codigo, int sensacaoFzrErrado, int sentidoTriste, int sentidoMalFzrNada, int sensacaoVidaMal, int sentidoCheioVida, int sentidoSo, int sentidoPressao, int contenteMSer,int ContenteRoupas, int PreocAspecto, int InvejaColegas, int ParteCMudar ){
this.codigo = codigo;
this.sensacaoFzrErrado = sensacaoFzrErrado;
this.sentidoTriste = sentidoTriste;
this.sentidoMalFzrNada = sentidoMalFzrNada;
this.sensacaoVidaMal = sensacaoVidaMal;
this.sentidoCheioVida = sentidoCheioVida;
this.sentidoSo = sentidoSo;
this.sentidoPressao = sentidoPressao;
this.contenteMSer = contenteMSer;
this.ContenteRoupas = ContenteRoupas;
this.PreocAspecto = PreocAspecto;
this.InvejaColegas = InvejaColegas;
this.ParteCMudar = ParteCMudar;
}

    public AnimoEmocional() {
        
    }

public int getCodigo() {
    return codigo;
}

public void setCodigo(int codigo) {
    this.codigo = codigo;
}

public int getSensacaoFzrErrado(){
 return sensacaoFzrErrado;
}
public void setSensacaoFzrErrado(int sensacaoFzrErrado){
this.sensacaoFzrErrado = sensacaoFzrErrado;
}


public int getSentidoTriste(){
 return sentidoTriste;
}
public void setSentidoTriste(int sentidoTriste){
this.sentidoTriste = sentidoTriste;
}


public int getSentidoMalFzrnada(){
 return sentidoMalFzrNada;
}
public void setSentidoMalFzrnada(int sentidoMalFzrNada){
this.sentidoMalFzrNada = sentidoMalFzrNada;
}


public int getSensacaoVidaMal(){
 return sensacaoVidaMal;
}
public void setSensacaoVidaMal(int sensacaoVidaMal){
this.sensacaoVidaMal = sensacaoVidaMal;
}


public int getSentidoCheioVida(){
 return sentidoCheioVida;
}
public void setSentidoCheioVida(int sentidoCheioVida){
this.sentidoCheioVida = sentidoCheioVida;
}


public int getSentidoSo(){
 return sentidoSo;
}
public void setSentidoSo(int sentidoSo){
this.sentidoSo = sentidoSo;
}


public int getSentidoPressao(){
 return sentidoPressao;
}
public void setSentidoPressao(int sentidoPressao){
this.sentidoPressao = sentidoPressao;
}
    public int getContenteMSer() {
        return contenteMSer;
    }

    public void setContenteMSer(int contenteMSer) {
        this.contenteMSer = contenteMSer;
    }

    public int getContenteRoupas() {
        return ContenteRoupas;
    }

    public void setContenteRoupas(int ContenteRoupas) {
        this.ContenteRoupas = ContenteRoupas;
    }

    public int getPreocAspecto() {
        return PreocAspecto;
    }

    public void setPreocAspecto(int PreocAspecto) {
        this.PreocAspecto = PreocAspecto;
    }

    public int getInvejaColegas() {
        return InvejaColegas;
    }

    public void setInvejaColegas(int InvejaColegas) {
        this.InvejaColegas = InvejaColegas;
    }

    public int getParteCMudar() {
        return ParteCMudar;
    }

    public void setParteCMudar(int ParteCMudar) {
        this.ParteCMudar = ParteCMudar;
    }

}
