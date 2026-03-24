/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.lara;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author aluno
 */
public class Turma {
    private Estudante discente = new Estudante();  
    private Disciplina disciplina = new Disciplina();
    private Professor professor = new Professor();
    
    private Set<Estudante> Discente = new HashSet<Estudante>();
    private Set<Disciplina> Disciplinas = new HashSet<Disciplina>();
    private Set<Professor> Professores = new HashSet<Professor>();
}
