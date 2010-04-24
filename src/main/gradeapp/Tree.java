/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gradeapp;

import java.util.Collection;

/**
 *
 * @author perro
 */
public abstract class Tree {
    
    public Collection<String[]> students;
    public int question;
    public Tree right, wrong;
    public abstract int count(boolean passing, Collection<String[]> students);
    public abstract String toString(boolean gotItCorrect);
    



}
