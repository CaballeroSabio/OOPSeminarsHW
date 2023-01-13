package lesson04.controller;

import Controller.Controller;
import Model.HumanTreeModel;
import Model.Model;
import View.View;

public class Main {
    public static void main(String[] args) {
        Model humanTreeModel = new HumanTreeModel();
        View view = new View();
        Controller controller = new Controller(view, humanTreeModel);
        view.start();
    }
}
