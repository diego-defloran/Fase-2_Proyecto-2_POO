/**
 * 
 * @author Diego
 * @version 1.0
 */ 
import org.jfree.chart.*;
import org.jfree.data.category.*;
import org.jfree.chart.plot.*;
import javax.swing.*;

public class Seguimiento {
	public Seguimiento() {//Constructor para clase Seguimiento
		
		DefaultCategoryDataset data=new DefaultCategoryDataset();
		//String final que almacenan la leyenda correspondiente a cada barra generada
		final String variable1="Peso";
		final String variable2="Altura";
		final String variable3="Edad";
		final String variable4="Consumo de agua";
		//Conjunto de intrucciones que permiten mostrar las unidades de medición para cada gráfico
		data.addValue(145, variable1, "Libras");
		data.addValue(180, variable2, "Centimetros");
		data.addValue(19, variable3, "Años");
		data.addValue(2.5, variable4, "Litros/día");

		JFreeChart grafica = ChartFactory.createBarChart3D("SEGUIMIENTO DE HÁBITOS", "", "", data, PlotOrientation.VERTICAL, true, true, false);//variable grafica que permite almacenar el grafico generado por las librerias
		
		ChartPanel contenedor=new ChartPanel(grafica);//Display que permite la visualización de la gráfica en una ventana emergente
		JFrame ventana= new JFrame("SEGUIMIENTO DE HÁBITOS ALIMENTICIOS_BETA");
		ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//Do_Nothing_On_Close asegura la continuidad en la ejecución de tiempo real
		ventana.add(contenedor);
		ventana.setSize(500,200);//Delimita las dimensiones de la ventana emergente
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
	}

}
