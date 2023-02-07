package lesson07.human_tree.view.command;

import view.View;

public class PrintHumanTreeConsole implements Option{
    View view;

    public PrintHumanTreeConsole(View view) {
        this.view = view;
    }

    @Override
    public String discription() {
        return "Get all human in console sort by reign (original).";
    }

    @Override
    public void execute() {
        view.printConsole();
    }

    @Override
    public void execute(int order) {
        System.out.println("Unnecessary id of human");
        return;
    }
}
