/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package northeast;

/**
 *
 * @author anhhuynh
 */
public class NorthEast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        travel();
        
        // TODO code application logic here
    }
    public static void travel(){
        explore(0,0,1,2," Movest: ");
        
    }
    private static void explore( int curX, int curY, int desX, int desY, String path){
        if( curX== desX && curY==desY){
            // BASE CASE
            System.out.println(path);
            
        }
        else if(curX<=desX && curY<=desY){
            // one step toward N
            explore(curX+1, curY, desX, desY,path+", N");
           // one step toward E
           explore(curX, curY+1, desX, desY,path+", E");
           //one step toward NE
           explore(curX +1, curY+1, desX, desY,path+", NE");
        }
    }
    
}
