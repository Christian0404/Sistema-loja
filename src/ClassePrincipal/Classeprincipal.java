
package ClassePrincipal;

import view.TelaPrincipalMDI;
import conexoes.MySQL;

public class Classeprincipal {
    public static void main(String[] args) {
        TelaPrincipalMDI menu = new TelaPrincipalMDI();
        menu.setVisible(true);
                
        MySQL mysql = new MySQL("localhost:3306", "dbloja", "root", "root");
        mysql.conectaBanco();

        //menu.setExtendedState(menu.MAXIMIZED_BOTH); 
        
    }
    
}