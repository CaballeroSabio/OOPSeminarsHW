package lesson07.human_tree;

import java.io.Serializable;

import controller.Controller;
import model.HumanTreeOperation;
import view.View;

public class Main implements Serializable{
    public static void main(String[] args){
        view view = new View();
        HumanTreeOperation humanTreeOperation = new HumanTreeOperation();
        Controller controller = new Controller(view, humanTreeOperation);
        view.setController(controller);
        view.start();
    }
}
