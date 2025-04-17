
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class App extends Application {
    public void start(String[] args) {
    launch(args);
}


@Override
public void start(Stage primaryStage){
    VBox root = new VBox(10);
    Label title = new Label("Metric Converter");
    TextField input = new TextField();
    input.setPromptText("Enter value you want to convert");


    Button kgToLbs = new Button("kg -> lbs");
    Button gramsToOunces = new Button("grams -> ounces");
    Button kmToMile = new Button("km -> mile");
    Button mmToInch = new Button("mm -> inch");

    Label result = new Label("Result");
    result.setFont(Font.font("Roboto", 14));

    kgToLbs.setOnAction(_ -> convKgToLbs(input, result));
    gramsToOunces.setOnAction(_ -> convGramsToOunces(input, result));
    kmToMile.setOnAction(_ -> convKmToMiles(input, result));
    mmToInch.setOnAction(_ -> convMmToInch(input, result));

    root.getChildren().addAll(
        title,
        input,
        kgToLbs,
        gramsToOunces,
        kmToMile,
        mmToInch,
        result
    );

    Scene scene = new Scene(root, 500, 500);
    primaryStage.setTitle("Metric Converter");
    primaryStage.setScene(scene);
    primaryStage.show();
}





private void convKgToLbs(TextField input, Label output){
try{double value = Double.parseDouble(input.getText());
double result = value * 2.20462;
output.setText(String.format("%.2f lbs", result));
}
catch(NumberFormatException e){
    output.setText("Enter a valid number");
}
}

private void convGramsToOunces(TextField input, Label output){
    try{double value = Double.parseDouble(input.getText());
    double result = value * 0.035274;
    output.setText(String.format("%.2f oz", result));
    }
    catch(NumberFormatException e){
        output.setText("Enter a valid number");
    }
    }

private void convKmToMiles(TextField input, Label output){
        try{double value = Double.parseDouble(input.getText());
        double result = value * 0.621371;
        output.setText(String.format("%.2f miles", result));
        }
        catch(NumberFormatException e){
            output.setText("Enter a valid number");
        }
        }

private void convMmToInch(TextField input, Label output){
            try{double value = Double.parseDouble(input.getText());
            double result = value * 0.0393701;
            output.setText(String.format("%.2f in", result));
            }
            catch(NumberFormatException e){
                output.setText("Enter a valid number");
            }
            }
}
