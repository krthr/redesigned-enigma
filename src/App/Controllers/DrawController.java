package App.Controllers;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Dibujar imagenes.
 */
public class DrawController {

    /**
     * JLabel para dibujar imagenes.
     */
    class ImageLabel extends JLabel {

        public ImageLabel(String img) {
            this(new ImageIcon(img));
        }

        public ImageLabel(ImageIcon icon) {
            setIcon(icon);
            // setMargin(new Insets(0,0,0,0));
            setIconTextGap(0);
            // setBorderPainted(false);
            setBorder(null);
            setText(null);
            setSize(icon.getImage().getWidth(null), icon.getImage().getHeight(null));
        }

    }
    
    
    public static void drawImage() {
        
    }

}
