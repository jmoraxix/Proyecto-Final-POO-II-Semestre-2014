
package dogLovers.vista;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import dogLovers.modelo.Mascota;

@SuppressWarnings("serial")
public class PanelMostrarMascotas extends JPanel {

	private int contador = 0;
	private ArrayList<Component> componentes = new ArrayList<Component>();
	private GridBagLayout gridBagLayout;

	public PanelMostrarMascotas() {
		// Declaracion b�sica
		setOpaque(false);

		int ancho = this.getWidth();
		int tamCol = ancho / 10;

		// Declaración del layout
		this.gridBagLayout = new GridBagLayout();
		this.gridBagLayout.columnWidths = new int[] { tamCol, tamCol, tamCol,
				tamCol * 2, tamCol, tamCol / 2, tamCol / 3 * 2, tamCol };
		this.gridBagLayout.rowHeights = new int[] { 0, 10 };
		this.gridBagLayout.columnWeights = new double[] { 1.0, 0.6, 0.6, 1.0,
				0.3, 0.3, 0.1, 1.0 };
		this.gridBagLayout.rowWeights = new double[] { 0.0, 0.0 };
		setLayout(this.gridBagLayout);

		// Agrega titulos
		JLabel titFecha = new JLabel("Fecha");
		GridBagConstraints gbc_titFecha = new GridBagConstraints();
		gbc_titFecha.anchor = GridBagConstraints.NORTH;
		gbc_titFecha.insets = new Insets(0, 0, 5, 5);
		gbc_titFecha.gridx = 0;
		gbc_titFecha.gridy = 0;
		add(titFecha, gbc_titFecha);

		JLabel lblChipID = new JLabel("ChipID");
		GridBagConstraints gbc_lblChipID = new GridBagConstraints();
		gbc_lblChipID.anchor = GridBagConstraints.NORTH;
		gbc_lblChipID.insets = new Insets(0, 0, 5, 5);
		gbc_lblChipID.gridx = 1;
		gbc_lblChipID.gridy = 0;
		add(lblChipID, gbc_lblChipID);

		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.NORTH;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 0;
		add(lblNombre, gbc_lblNombre);

		JLabel lblColor = new JLabel("Color");
		GridBagConstraints gbc_lblColor = new GridBagConstraints();
		gbc_lblColor.anchor = GridBagConstraints.NORTH;
		gbc_lblColor.insets = new Insets(0, 0, 5, 5);
		gbc_lblColor.gridx = 3;
		gbc_lblColor.gridy = 0;
		add(lblColor, gbc_lblColor);

		JLabel lblLugar = new JLabel("Lugar");
		GridBagConstraints gbc_lblLugar = new GridBagConstraints();
		gbc_lblLugar.anchor = GridBagConstraints.NORTH;
		gbc_lblLugar.insets = new Insets(0, 0, 5, 5);
		gbc_lblLugar.gridx = 4;
		gbc_lblLugar.gridy = 0;
		add(lblLugar, gbc_lblLugar);

		JLabel lblEstado = new JLabel("Estado");
		GridBagConstraints gbc_lblEstado = new GridBagConstraints();
		gbc_lblEstado.anchor = GridBagConstraints.NORTH;
		gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstado.gridx = 5;
		gbc_lblEstado.gridy = 0;
		add(lblEstado, gbc_lblEstado);

		JLabel lblVer = new JLabel("Ver");
		GridBagConstraints gbc_lblVer = new GridBagConstraints();
		gbc_lblVer.anchor = GridBagConstraints.NORTH;
		gbc_lblVer.insets = new Insets(0, 0, 5, 0);
		gbc_lblVer.gridx = 6;
		gbc_lblVer.gridy = 0;
		add(lblVer, gbc_lblVer);
	}

	public void agregarMascota(final Mascota mascota) {
		// Incremente contador
		this.contador++;
		// Declara variables
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(0, 0, 5, 0);
		gbc.gridy = this.contador;
		// Agrega Fecha
		JLabel lblFec = new JLabel(mascota.getFecha().toLocaleString());
		this.componentes.add(lblFec);
		gbc.gridx = 0;
		add(lblFec, gbc);
		// Agrega ChipID
		JLabel lblChipID = new JLabel(mascota.getChipID());
		this.componentes.add(lblChipID);
		gbc.gridx = 1;
		add(lblChipID, gbc);
		// Agrega nombre
		JLabel lblNom = new JLabel(mascota.getNombre());
		this.componentes.add(lblNom);
		gbc.gridx = 2;
		add(lblNom, gbc);
		// Agrega color
		JLabel lblCol = new JLabel(mascota.getColor());
		this.componentes.add(lblCol);
		gbc.gridx = 3;
		add(lblCol, gbc);
		// Agrega lugar
		JLabel lblLug = new JLabel(mascota.getLugar());
		this.componentes.add(lblLug);
		gbc.gridx = 4;
		add(lblLug, gbc);
		// Agrega estado
		JLabel lblEstado = new JLabel(mascota.getEstado().name());
		this.componentes.add(lblEstado);
		gbc.gridx = 5;
		add(lblEstado, gbc);
		// //Agrega un botón para ver la mascota
		// JButton btn = new JButton("Ver Mascota");
		// btn.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent arg0) {
		// new MostrarMascota(ventana, mascota).setVisible(true);
		// }
		// });
		// componentes.add(btn);
		// gbc.gridx = 7;
		// add(btn, gbc);
	}

	public void limpiar() {
		// Eliminar todos los componentes guardados
		for (Component comp : this.componentes)
			this.gridBagLayout.removeLayoutComponent(comp);
		this.contador = 0;
		System.gc();
	}
}
