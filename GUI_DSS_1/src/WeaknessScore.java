/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Natnaree
 */
import java.io.BufferedReader;
//import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WeaknessScore {
    
    static int[] subjectWeak = new int [5];
    
    public WeaknessScore(){
        
    }
    
    public String sort(int[] department){
        department = dsshome.holland.departmentFiltered;
        
        int[] score = new int [department.length];
        
        for(int i = 0; i < 5; i++){
            System.out.println(subjectWeak[i]);
        }
        
        for(int i = 0; i < score.length; i++){
            
            score[i] = 0;
            
            if(subjectWeak[0] == 1) score[i] += dsshome.data.math[department[i]];
            if(subjectWeak[1] == 1) score[i] += dsshome.data.english[department[i]];
            if(subjectWeak[2] == 1) score[i] += dsshome.data.physics[department[i]];
            if(subjectWeak[3] == 1) score[i] += dsshome.data.chemistry[department[i]];
            if(subjectWeak[4] == 1) score[i] += dsshome.data.biology[department[i]];
            
            System.out.println(dsshome.data.department[department[i]] + " " + score[i]);
        }
        
        int min = score[0];
        String minDep = dsshome.data.department[department[0]];
        for(int i = 1; i < score.length; i++){
           if(score[i] < min){
               min = score[i];
               minDep = dsshome.data.department[department[i]];
           }
        }
        
        return minDep;
    }
    
}
