package entity;

import java.util.Date;

public class Aluno{
    private int matricula;
    private String nome;
    private Date dataN;
    private int idade;
    private String sexo;
    private int celular;
    private String email;
    private int telefone;
    private Endereco endereco;
    private Curso curso;
    private Turma turma;
    
    public Aluno( int matricula, String nome, Date dataN,int idade ,String sexo,int celular, String email, int telefone, Endereco endereco, Curso curso, Turma turma){
        this.matricula = matricula;
        this.nome = nome;
        this.dataN = dataN;
        this.idade = idade;
        this.sexo = sexo;
        this.celular = celular;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.curso = curso;
        this.turma = turma;
    }

    public Aluno() {
    }

   
    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
   
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Date getDataN() {
        return dataN;
    }

    public void setDataN(Date dataN) {
        this.dataN = dataN;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

   
    public Curso getCurso(){
        return curso;
    }
    public void setCurso(Curso curso){
        this.curso = curso;
    }
   
    public Turma getTurma(){
        return turma;
    }
    public void setTurma(Turma turma){
        this.turma = turma;
    }
   
}
