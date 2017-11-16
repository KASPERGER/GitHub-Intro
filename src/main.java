

/*
 * INSTRUKTIONER:
 * 
 * Ni ska återskapa 4 olika vyer i JavaFX med hjälp av koden nedan.
 * Ni behöver modifiera och/eller kopiera delar av koden för att
 * lyckas lösa uppgifterna. 
 * De fyra metoderna makeView1(),makeView2(),makeView3() och makeView4()
 * är till för att skapa de olika vyerna och omkring rad 47 kan du bara ändra
 * siffran på metoden till den vy du vill se.
 * 
 * Ditt uppdrag är att redigera i de 4 olika metoderna och få vyn att
 * bli lik de från uppgiften i drive-dokumentet!
 * 
 * Dokumentet hittar du här: https://tinyurl.com/javafx-te16d
 * 
 * Detta är mer en rolig och valfri uppgift för de som är nyfikna.
 * Lycka till!
 */

import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class main extends Application {

	// Ändra dessa variabler för att göra ditt fönster större/mindre
	public static final double WIDTH = 600;
	public static final double HEIGHT = 600;

	private ArrayList<KeyCode> keysPressed = new ArrayList<KeyCode>();
	private AnimationTimer gameLoop;
	private Group root = new Group();

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Ändra siffran här nere till 1,2,3 eller 4 beroende på vilken vy du vill se!
		makeView4();

		primaryStage.setScene(new Scene(root, WIDTH, HEIGHT));
		primaryStage.show();

	}

	private void makeView1() {

		/*
		 * TODO: Det är för små rutor. Vi måste göra dem mindre på något vis.
		 * 		 Eller är det kanske bara för många rutor??....
		 */

		int rows = 10;
		int cols = 10;

		double width = WIDTH / cols;
		double height = HEIGHT / rows;

		for (int row = 0; row < rows; row++) {

			for (int col = 0; col < cols; col++) {

				// Skapa en ny Rectangle
				Rectangle rect = new Rectangle(width, height);

				// Flytta rect i x-led så den kommer rätt
				rect.setTranslateX(col * width);

				// Flytta rect i y-led så den kommer rätt
				rect.setTranslateY(row * height);

				// Färglägg med en random färg
				int r = (int) (Math.random() * 255);
				int g = (int) (Math.random() * 255);
				int b = (int) (Math.random() * 255);
				rect.setFill(Color.rgb(r, g, b));

				// Lägg till rect så den syns i fönstret
				root.getChildren().add(rect);
			}
		}

	}
	
	private void makeView2(){
		
		/*
		 * TODO: Samma som 3 fast varje Circle måste flyttas olika
		 * 		 i x-led och y-led för att hamna på rätt ställe.
		 * 
		 * 		 TIPS: Börja i mitten och gå snett uppåt.
		 */
		
		int ringar = 300;

		for(int v = ringar; v >= 0; v--){
			
			double radien = WIDTH / ringar / 2;
			
			Circle herrn = new Circle(v * radien);
			
			int r = (int) (Math.random() * 255);
			int g = (int) (Math.random() * 255);
			int b = (int) (Math.random() * 255);
			
			
			herrn.setFill(Color.rgb(r, g, b));
			
			root.getChildren().add(herrn);
		
			for(int d = 0; d < ringar; d++){
				
				herrn.setTranslateX(v);
				herrn.setTranslateY(v);
				
				
			}
		}
	}

	private void makeView3() {

		/*
		 * TODO: Om alla cirklar bara kunde flyttas till mitten av fönstret
		 * 		 skulle det ju se bättre ut? 
		 * 		 Sedan måste mellanrummet mellan ringarna minska också...
		 */

		int rings = 200;
		
		for (int i = rings; i >= 0; i--) {

			double radius = WIDTH / rings / 2;
			
			Circle bigboy = new Circle(i * radius);

			int r = (int) (Math.random() * 255);
			int g = (int) (Math.random() * 255);
			int b = (int) (Math.random() * 255);
			
			bigboy.setFill(Color.rgb(r, g, b));

			root.getChildren().add(bigboy);
			
			bigboy.setTranslateX(WIDTH/2);
			bigboy.setTranslateY(HEIGHT/2);
			

		}

	}

	private void makeView4() {

		/*
		 * TODO: Typ samma som makeView1 fast med Circle istället för Rectangle,
		 * eller hur??
		 */

		
		int rad = 10;
		int gollum = 10;
		
		double bredd = 350/rad;
		double höjd = 350/gollum;
		
		for(int deg = 0; deg < rad; deg++){
			
			for(int oha = 0; oha < gollum; oha++){
				
				Circle tja = new Circle(bredd);
				
				tja.setTranslateX(oha * bredd*2);
				tja.setTranslateY(deg * höjd*2);
				
				int r = (int) (Math.random() * 255);
				int g = (int) (Math.random() * 255);
				int b = (int) (Math.random() * 255);
				tja.setFill(Color.rgb(r, g, b));
				
				root.getChildren().add(tja);
				
				
			}
			
			
		}
		
		
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
