package entity;

public class VidaFamiliar {
    private int codigo, entendimentoPais, sentqueridoPais, felizCasa, tempPais, tratJustoPais, dialogoPais;


public VidaFamiliar(int codigo, int entendimentoPais, int sentqueridoPais, int felizCasa, int tempPais, int tratJustoPais, int dialogoPais){
    this.codigo = codigo;
    this.entendimentoPais = entendimentoPais;
    this.sentqueridoPais = sentqueridoPais;
    this.felizCasa = felizCasa;
    this.tempPais = tempPais;
    this.tratJustoPais = tratJustoPais;
    this.dialogoPais = dialogoPais;
}

    public VidaFamiliar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEntendimentoPais(){
        return entendimentoPais;
    }

    public void setEntedimentoPais(int entendimentoPais){
        this.entendimentoPais = entendimentoPais;
    }

    public int getSentqueridoPais(){
        return sentqueridoPais;
    }

    public void setSentqueridoPais(int sentqueridoPais){
        this.sentqueridoPais = sentqueridoPais;
    }

    public int getFelizCasa(){
        return felizCasa;
    }

    public void setFelizCasa(int felizCasa){
        this.felizCasa = felizCasa;
    }

    public int getTempPais(){
        return tempPais;
    }

        public void setTempPais(int tempPais){
    this.tempPais = tempPais;
    }

    public int getTratJustoPais(){
        return tratJustoPais;
    }

    public void setTratJustoPais(int tratJustoPais){
        this.tratJustoPais = tratJustoPais;
    }

    public int getDialogoPais(){
        return dialogoPais;
    }

    public void setDialogoPais( int dialogoPais){
        this.dialogoPais = dialogoPais;
    }
}