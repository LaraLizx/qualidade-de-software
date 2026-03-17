/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ifc.lara;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Estudante {
    
        private String nomeCompleto;
        private Date dataNascimento;
        private String cpf;
        private char genero;
        private String matricula;
        private String email;
        private String nivelEnsino;
        private int telefone;
        private String anosIngresso;
        private String semestredeIngresso;
        private String situaçãoAcademicada;
        private String digito;
        
        
        public Estudante(){
            nome = "Noboy";
        }
        
        public int obterIdade(Date hoje){
            int idade = 0;
            //Lógica do calculo idade
            return idade;
        }
        public String getnomeCompleto(){
            return nomeCompleto;
        }
        
        public void setnomeCompleto (String _nomeCompleto){
            nomeCompleto = _nomeCompleto;
        }
        
        public Date getdataNascimento (){
            return dataNascimento;
        }
        public void setdataNascimento (Date _dataNascimento){
            dataNascimento = _dataNascimento;
        } 
        
        public String getcpf (){
            return cpf;
        }
        public void setcpf (String _cpf){
            cpf = _cpf;
        }
        
        public char getgenero(){
            return genero;
        }
        public void setgenero (char _genero){
            genero = _genero;
        }
        
        public String getmatricula (){
            return anosIngresso+semestredeIngresso+digito;
        }
        public void setmatricula (String _matricula){
            matricula = _matricula;
        }
        
        public String getemail (){
            return email;
        }
        public void setemail (String _email){
            email = _email;
        }
        
        public String getnivelEnsino(){
            return nivelEnsino;
        }
        public void setnivelEnsino(String _nivelEnsino){
            nivelEnsino = _nivelEnsino;
        }
        
        public int gettelefone (){
            return telefone;
        }
        public void settelefone (int _telefone){
            telefone = _telefone;
        }
        
        public String getanosIngresso(){
            return anosIngresso;
        }
        public void setanosIngresso(String _anosIngresso){
            anosIngresso = _anosIngresso;
        }
        
        public String getsemestredeIngresso(){
            return semestredeIngresso;
        }
        public void setsemestredeIngresso(String _semestredeIngresso){
            semestredeIngresso = _semestredeIngresso;
        }
        
        public String getsituaçãoAcademicada(){
            return situaçãoAcademicada;
        }
        public void setsituaçãoAcademicada(String _situaçãoAcademicada){
            situaçãoAcademicada = _situaçãoAcademicada;
        }
    }

