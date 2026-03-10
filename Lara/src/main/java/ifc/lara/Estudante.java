/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ifc.lara;

/**
 *
 * @author aluno
 */
public class Estudante {
    
        private String nome;
        private Date dataNascimento;
        private String cpf;
        private char genero;
        private String matricula;
        private String email;
        
        public Estudante(){
            nome = "Noboy";
        }
        
        public int obterIdade(Date hoje){
            int idade = 0;
            //Lógica do calculo idade
            return idade;
        }
        public String getNome(){
            return nome;
        }
        
        public void setNome (String _nome){
            nome = _nome;
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
        
        
    }

