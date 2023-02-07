package lesson07.human_tree.controller;

import model.HumanTreeOperation;
import view.View;

public class Controller {
    view view;
    HumanTreeOperation humanTreeOperation;

    public Controller(view view, HumanTreeOperation humanTreeOperation) {
        this.view = view;
        this.humanTreeOperation = humanTreeOperation;
    }

    public void printConsole() {
        humanTreeOperation.printConsole();
    }

    public void printFile() {
        humanTreeOperation.printFile();
    }

    public void sortHumanByBirth() {
        humanTreeOperation.sortHumanByBirth();
    }

    public void sortHumanByName() {
        humanTreeOperation.sortHumanByName();
    }

    public void printHuman(int order) {
        humanTreeOperation.printHuman(order);
    }

    public void printHumanChild(int order) {
        humanTreeOperation.printHumanChild(order);
    }

    public void printHumanFather(int order) {
        humanTreeOperation.printHumanFather(order);
    }

    public void printHumanMother(int order) {
        humanTreeOperation.printHumanMother(order);
    }

    public void printHumanSistBroth(int order) {
        humanTreeOperation.printHumanSistBroth(order);
    }

    public boolean orderCheck(int order) {
        return humanTreeOperation.orderCheck(order);
    }
}
