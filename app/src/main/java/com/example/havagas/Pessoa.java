package com.example.havagas;

import androidx.annotation.NonNull;

public class Pessoa {
    private String nome;
    private String email;
    private String aceitouEmail;
    private String telefone;
    private String typeTelefone;
    private String celular;
    private String sexo;
    private String dataNascimento;
    private String formacao;
    private String anoFormatura;
    private String anoConclusao;
    private String instituicao;
    private String tituloMonografia;
    private String orientador;
    private String vagasInteresse;

    public Pessoa(){
    }

    public Pessoa(String nome, String email, String aceitouEmail, String telefone, String typeTelefone, String celular, String sexo, String dataNascimento, String formacao, String anoFormatura, String anoConclusao, String instituicao, String tituloMonografia, String orientador, String vagasInteresse) {
        this.nome = nome;
        this.email = email;
        this.aceitouEmail = aceitouEmail;
        this.telefone = telefone;
        this.typeTelefone = typeTelefone;
        this.celular = celular;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.formacao = formacao;
        this.anoFormatura = anoFormatura;
        this.anoConclusao = anoConclusao;
        this.instituicao = instituicao;
        this.tituloMonografia = tituloMonografia;
        this.orientador = orientador;
        this.vagasInteresse = vagasInteresse;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAceitouEmail() {
        return aceitouEmail;
    }

    public void setAceitouEmail(String aceitouEmail) {
        this.aceitouEmail = aceitouEmail;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTypeTelefone() {
        return typeTelefone;
    }

    public void setTypeTelefone(String typeTelefone) {
        this.typeTelefone = typeTelefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getAnoFormatura() {
        return anoFormatura;
    }

    public void setAnoFormatura(String anoFormatura) {
        this.anoFormatura = anoFormatura;
    }

    public String getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(String anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getTituloMonografia() {
        return tituloMonografia;
    }

    public void setTituloMonografia(String tituloMonografia) {
        this.tituloMonografia = tituloMonografia;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public String getVagasInteresse() {
        return vagasInteresse;
    }

    public void setVagasInteresse(String vagasInteresse) {
        this.vagasInteresse = vagasInteresse;
    }

    @Override
    public String toString() {
        return "Nome:" + nome + "\n" +
                "Email:" + email + "\n" +
                "Aceitou receber email:" + aceitouEmail + "\n" +
                "Telefone:" + telefone + "\n" +
                "Tipo de telefone:" + typeTelefone + "\n" +
                "Celular:" + celular  + "\n" +
                "Sexo:" + sexo  + "\n" +
                "Data de nascimento:" + dataNascimento  + "\n" +
                "Formacao:" + formacao  + "\n" +
                "Ano de formatura:" + anoFormatura  + "\n" +
                "Ano de conslusao:" + anoConclusao  + "\n" +
                "Instituicao:" + instituicao  + "\n" +
                "Titulo de monografia:" + tituloMonografia  + "\n" +
                "Orientador:" + orientador  + "\n" +
                "Vagas de Interesse:" + vagasInteresse  + "\n"
                ;
    }
}
