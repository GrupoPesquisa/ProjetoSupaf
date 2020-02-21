
package entity;

import java.sql.Time;

public class IPAQ {

    private int codigo, diasCaminhou, ativModerada, ativVigorosa;
    private Time horasCaminhou, tempoAtivModerada, tempoAtivVigorosa, tempoGastoSentado1, tempoGastoSentadofds;
    private Aluno aluno;

    public IPAQ(int codigo, int diasCaminhou, int ativModerada, int ativVigorosa, Time horasCaminhou, Time tempoAtivModerada, Time tempoAtivVigorosa, Time tempoGastoSentado1, Time tempoGastoSentadofds, Aluno aluno) {
        this.codigo = codigo;
        this.diasCaminhou = diasCaminhou;
        this.ativModerada = ativModerada;
        this.ativVigorosa = ativVigorosa;
        this.horasCaminhou = horasCaminhou;
        this.tempoAtivModerada = tempoAtivModerada;
        this.tempoAtivVigorosa = tempoAtivVigorosa;
        this.tempoGastoSentado1 = tempoGastoSentado1;
        this.tempoGastoSentadofds = tempoGastoSentadofds;
        this.aluno = aluno;
    }

    public IPAQ() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDiasCaminhou() {
        return diasCaminhou;
    }

    public void setDiasCaminhou(int diasCaminhou) {
        this.diasCaminhou = diasCaminhou;
    }

    public int getAtivModerada() {
        return ativModerada;
    }

    public void setAtivModerada(int ativModerada) {
        this.ativModerada = ativModerada;
    }

    public int getAtivVigorosa() {
        return ativVigorosa;
    }

    public void setAtivVigorosa(int ativVigorosa) {
        this.ativVigorosa = ativVigorosa;
    }

    public Time getHorasCaminhou() {
        return horasCaminhou;
    }

    public void setHorasCaminhou(Time horasCaminhou) {
        this.horasCaminhou = horasCaminhou;
    }

    public Time getTempoAtivModerada() {
        return tempoAtivModerada;
    }

    public void setTempoAtivModerada(Time tempoAtivModerada) {
        this.tempoAtivModerada = tempoAtivModerada;
    }

    public Time getTempoAtivVigorosa() {
        return tempoAtivVigorosa;
    }

    public void setTempoAtivVigorosa(Time tempoAtivVigorosa) {
        this.tempoAtivVigorosa = tempoAtivVigorosa;
    }

    public Time getTempoGastoSentado1() {
        return tempoGastoSentado1;
    }

    public void setTempoGastoSentado1(Time tempoGastoSentado1) {
        this.tempoGastoSentado1 = tempoGastoSentado1;
    }

    public Time getTempoGastoSentadofds() {
        return tempoGastoSentadofds;
    }

    public void setTempoGastoSentadofds(Time tempoGastoSentadofds) {
        this.tempoGastoSentadofds = tempoGastoSentadofds;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

}
