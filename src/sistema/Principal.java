
package sistema;

import GUI.PanelMenu;

/**
 *
 * @author soloa
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SistemaEnviaPack sistema = new SistemaEnviaPack();
        PanelMenu menu = new PanelMenu(sistema);
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }
}
