package entity;

public class Kidscreen52 {
    private int codigo;
    private SaudeATF saudeAtf;
    private Sentimentos sentimentos;
    private TempoLivre tempoLivre;
    private SeusAmigos seusAmigos;
    private AnimoEmocional animoEmocional;
    private AssuntosFinanceiros assuntosFinanceiros;
    private VidaFamiliar vidaFamiliar;
    private VoceMesmo voceMesmo;
    private SuaEscola suaEscola;
    private VoceEosDemais voceEosDemais;
    private boolean doencaCDeficiencia;
    private Aluno aluno;

    public Kidscreen52(int codigo, SaudeATF saudeAtf,Sentimentos sentimentos,TempoLivre tempoLivre,SeusAmigos seusAmigos,AnimoEmocional animoEmocional,AssuntosFinanceiros assuntosFinanceiros, VidaFamiliar vidaFamiliar, VoceMesmo voceMesmo,SuaEscola suaEscola, VoceEosDemais voceEosDemais,boolean doencaCDeficiencia, Aluno aluno){
    this.codigo = codigo;
    this.saudeAtf = saudeAtf;
    this.sentimentos = sentimentos;
    this.tempoLivre = tempoLivre;
    this.seusAmigos = seusAmigos;
    this.animoEmocional = animoEmocional;
    this.assuntosFinanceiros = assuntosFinanceiros;
    this.vidaFamiliar = vidaFamiliar;
    this.voceMesmo = voceMesmo;
    this.suaEscola = suaEscola;
    this.voceEosDemais = voceEosDemais;
    this.doencaCDeficiencia = doencaCDeficiencia;
    this.aluno = aluno;
}

    public Kidscreen52() {
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public SaudeATF getSaudeATF(){
        return saudeAtf;
    }
    public void setSaudeATF(SaudeATF saudeAtf){
        this.saudeAtf = saudeAtf;
    }

    public Sentimentos getSentimentos(){
        return sentimentos;
    }
    public void setSentimentos(Sentimentos sentimentos){
        this.sentimentos = sentimentos;
    }

    public TempoLivre getTempoLivre(){
        return tempoLivre;
    }
    public void setTempoLivre(TempoLivre tempoLivre){
        this.tempoLivre = tempoLivre;
    }

    public SeusAmigos getSeusAmigos(){
        return seusAmigos;
    }
    public void setSeusAmigos(SeusAmigos seusAmigos){
        this.seusAmigos = seusAmigos;
    }

    public AnimoEmocional getAnimoEmocional(){
        return animoEmocional;
    }
    public void setAnimoEmocional(AnimoEmocional animoEmocional){
        this.animoEmocional = animoEmocional;
    }

    public AssuntosFinanceiros getAssuntosFinanceiros(){
        return assuntosFinanceiros;
    }
    public void setAssuntosFinanceiros(AssuntosFinanceiros assuntosFinanceiros){
        this.assuntosFinanceiros = assuntosFinanceiros;
    }

    public VidaFamiliar getVidaFamiliar(){
        return vidaFamiliar;
    }
    public void setVidaFamiliar(VidaFamiliar vidaFamiliar){
        this.vidaFamiliar = vidaFamiliar;
    }

    public VoceMesmo getVoceMesmo(){
        return voceMesmo;
    }
    public void setVoceMesmo(VoceMesmo voceMesmo){
        this.voceMesmo = voceMesmo;
    }

    public SuaEscola getSuaEscola(){
        return suaEscola;
    }
    public void setSuaEscola(SuaEscola suaEscola){
        this.suaEscola = suaEscola;
    }

    public VoceEosDemais getVoceEosDemais(){
        return voceEosDemais;
    }
    public void setVoceEosDemais(VoceEosDemais voceEosDemais){
        this.voceEosDemais = voceEosDemais;
    }

    public boolean getDoencaCDeficiencia(){
        return doencaCDeficiencia;
    }
    public void setDoencaCDeficiencia(boolean doencaCDeficiencia){
        this.doencaCDeficiencia = doencaCDeficiencia;
    }

    public Aluno getAluno(){
        return aluno;
    }
    public void setAluno(Aluno aluno){
        this.aluno = aluno;
    }
};