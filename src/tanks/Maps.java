/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tanks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Maps {
    
    public Maps(){
        
        
        
    }
    final String url = "src/tanks/Maps/";
    ArrayList<int[][]> maps = new ArrayList<>();
    
    public int[][] getMapFromFile(int mapNumber) throws FileNotFoundException, IOException{
        int[][]map = new int[26][26];
        Scanner s = new Scanner(new File(url + "Map" + mapNumber +".txt"));
        System.out.println("Hello world!");
        System.out.println(s.delimiter());
//              BufferedReader reader = new BufferedReader(new FileReader(new File(url + "Map" + mapNumber +".txt")));
//		for (int i = 0; i < map.length; i++) {
//		    String[] items = reader.readLine().split(" ");
//                  for (int j = 0; j < map.length; j++) {
//                      map[i][j] = Integer.parseInt(items[j]);
//                  }
//              }
        for (int i = 0; i < map.length; i++){
            for(int j = 0; j < map.length; j++){
                map[i][j] = s.nextInt();
//                System.out.print(map[i][j]);
            }
//            System.out.println();
        }
        
        return map;
    }
    public int[][] getMap(int mapNumber){
        
        return maps.get(mapNumber);
    }
    
}
