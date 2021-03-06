/**
 * Proyecto Final POO Jose David Mora Loria 2014004856 Diego Delgado Cerdas
 * 2013099268 David Diaz 2014004725 Roger Villalobos 2014079369 25/10/2014
 */

package dogLovers.vista;

import java.awt.BorderLayout;
import java.awt.SystemColor;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

import dogLovers.DogLovers;
import dogLovers.control.Principal;

/**
 * @author Jos�David 25/10/2014 Extiende JPanel. Define un panel y le asigna un
 *         fondo
 */
public class PanelConFondo extends JPanel {

	private static final long serialVersionUID = -2135548113040445537L;
	private JButton btn;

	// Recibe un string con la URL de la imagen
	public PanelConFondo(String urlImagen) {
		setForeground(SystemColor.controlHighlight);
		definirBorde(urlImagen);
		setLayout(null);
	}

	// Recibe un string con la URL de la imagen y si el panel es opaco o no
	public PanelConFondo(String urlImagen, boolean isOpaque) {
		setForeground(SystemColor.controlHighlight);
		definirBorde(urlImagen);
		setOpaque(isOpaque);
	}

	// Recibe un string con la URL de la imagen y si el panel es opaco o no y
	// crea un
	// botón con el título ingresado
	public PanelConFondo(String urlImagen, boolean isOpaque, String titulo) {
		setForeground(SystemColor.controlHighlight);
		definirBorde(urlImagen);
		setOpaque(isOpaque);
		setLayout(new BorderLayout(0, 0));

		this.btn = new JButton(titulo);
		this.btn.setOpaque(false);
		this.btn.setContentAreaFilled(false);
		this.btn.setBorderPainted(false);
		this.btn.setFont(Principal.getLetratexto2());
		add(this.btn, BorderLayout.CENTER);
	}

	public JButton getBtn() {
		return this.btn;
	}

	public void definirBorde(String url) {
		try {
			URL imagen = DogLovers.class.getResource("vista/imagenes/" + url);
			BufferedImage img = ImageIO.read(imagen);
			BgBorder borde = new BgBorder(img);
			this.setBorder(borde);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
