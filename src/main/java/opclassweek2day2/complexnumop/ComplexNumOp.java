package opclassweek2day2.complexnumop;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ComplexNumOp
{

    @javafx.fxml.FXML
    private TextField imgOf2ndComplexNumberTextField;
    @javafx.fxml.FXML
    private TextField realOf2ndComplexNumberTextField;
    @javafx.fxml.FXML
    private TextField realOf1stComplexNumberTextField;
    @javafx.fxml.FXML
    private TextField imgOf1stComplexNumberTextField;
    @javafx.fxml.FXML
    private Label resultLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }
    ComplexNumOpController c1,c2,c3;
    @javafx.fxml.FXML
    public void subtractButtonOnMouseClicked(ActionEvent actionEvent) {
        c1 = new ComplexNumOpController(
                Integer.parseInt(realOf1stComplexNumberTextField.getText()),
                Integer.parseInt(imgOf1stComplexNumberTextField.getText())
        );
        c2 = new ComplexNumOpController(
                Integer.parseInt(realOf2ndComplexNumberTextField.getText()),
                Integer.parseInt(imgOf2ndComplexNumberTextField.getText())
        );
        c3 = c1.subtract(c2);
        resultLabel.setText(
                "1st Complex Number: "+c1.toString() + "\n"+
                        "2nd ComplexNumber: "+c2.toString()+ "\n" +
                        "Subtracted Result: "+c3.toString()
        );
    }

    @javafx.fxml.FXML
    public void addButtonOnMouseClicked(ActionEvent actionEvent) {
        c1 = new ComplexNumOpController(
                Integer.parseInt(realOf1stComplexNumberTextField.getText()),
                Integer.parseInt(imgOf1stComplexNumberTextField.getText())
                );
        c2 = new ComplexNumOpController(
                Integer.parseInt(realOf2ndComplexNumberTextField.getText()),
                Integer.parseInt(imgOf2ndComplexNumberTextField.getText())
        );
        c3 = c1.add(c2);
        resultLabel.setText(
                "1st Complex Number: "+c1.toString() + "\n"+
                 "2nd ComplexNumber: "+c2.toString()+ "\n" +
                        "Added Result: "+c3.toString()
        );

    }


}