package com.tianjian.ehrp.launch;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tianjian.ehrp.ui.MainController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
	final static Logger log = LoggerFactory.getLogger(App.class);

	private Stage primaryStage;
	private VBox mainLayout;
	private AnchorPane contentPane;

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("小说漫画下载阅读器");

		// 注入服务
//		service = SpringContent.getBean(ComicService.class);

		initRootLayout();
	}

	/**
	 * Initializes the root layout.
	 */
	public void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(App.class.getResource("../ui/Main.fxml"));

			mainLayout = (VBox) loader.load();

			MainController controller = loader.getController();
			controller.setApp(this);

			contentPane = controller.getContentPane();

			// Show the scene containing the root layout.
			Scene scene = new Scene(mainLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			log.error(e.getMessage());
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
