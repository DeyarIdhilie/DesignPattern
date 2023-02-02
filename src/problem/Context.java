/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem;

import java.io.BufferedReader;

/**
 *
 * @author lenovo
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public String excuteStrategy(BufferedReader reader){
        return strategy.parse(reader);
    }
}
