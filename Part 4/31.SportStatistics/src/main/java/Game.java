/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matte
 */
public class Game {
    private String homeTeam;
    private String visitTeam;
    private int homePoint;
    private int visitPoint;
    
    public Game(String hT, String vT, int hP, int vP){
        this.homeTeam = hT;
        this.visitTeam = vT;
        this.homePoint = hP;
        this.visitPoint = vP;
    }
    
    public String getHomeTeam(){
        return this.homeTeam;
    }
    
    public String getVisitTeam(){
        return this.visitTeam;
    }
    
    public int getHomePoint(){
        return this.homePoint;
    }
    
    public int getVisitPoint(){
        return this.visitPoint;
    }
}
