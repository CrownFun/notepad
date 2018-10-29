
package editText;

import java.awt.Color;
import javax.swing.text.DefaultHighlighter;


   public class MyHighLightPainter extends DefaultHighlighter.DefaultHighlightPainter {

        public MyHighLightPainter(Color color) {
            super(color);
        }
    }