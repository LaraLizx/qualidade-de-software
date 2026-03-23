/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.lara;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Professor {

    private String nomeCompleto;
    private int Siape;
    private String email;
    private int telefone;
    private String TitulacaoAcademica;
    private String areaDeAtuacao;
    private String RegimeTrabalhoInstituicao;
    private Date dataIngresso;
    private String Formacao;

    public Professor() {
        nomeCompleto = "noboy";
    }

    public String getnomeCompleto() {
        return nomeCompleto;
    }
    public void setnomeCompleto(String _nomeCompleto) {
        nomeCompleto = _nomeCompleto;
    }

    public int getSiape() {
        return Siape;
    }
    public void setSiape(int _Siape) {
        Siape = _Siape;
    }

    public String getemail() {
        return email;
    }
    public void setemail(String _email) {
        email = _email;
    }

    public int gettelefone() {
        return telefone;
    }
    public void settelefone(int _telefone) {
        telefone = _telefone;
    }

    public String getTitulacaoAcademica() {
        return TitulacaoAcademica;
    }
    public void setTitulacaoAcademica(String _TitulacaoAcademica) {
        TitulacaoAcademica = _TitulacaoAcademica;
    }

    public String getareaDeAtuacao() {
        return areaDeAtuacao;
    }
    public void setareaDeAtuação(String _areaDeAtuacao) {
        areaDeAtuacao = _areaDeAtuacao;
    }

    public String getRegimeTrabalhoInstituicao() {
        return RegimeTrabalhoInstituicao;
    }
    public void setregimetrabalhoInstituição(String _RegimeTrabalhoInstituicao) {
        RegimeTrabalhoInstituicao = _RegimeTrabalhoInstituicao;
    }

    public Date getdataIngresso() {
        return dataIngresso;
    }
    public void setdataIngresso(Date _dataIngresso) {
        dataIngresso = _dataIngresso;
    }

    public String getFormacao() {
        return Formacao;
    }
    public void setFormacao(String _Formacao) {
        Formacao = _Formacao;
    }
}