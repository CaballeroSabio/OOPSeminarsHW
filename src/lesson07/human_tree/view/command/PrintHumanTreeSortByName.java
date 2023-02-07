package lesson07.human_tree.view.command;

import view.View;

public class PrintHumanTreeSortByName  implements Option{
    view view;

    public PrintHumanTreeSortByName(View view) {
        this.view = view;
    }

    @Override
    public String discription() {
        return "Get all human in console sort by name.";
    }

    @Override
    public void execute() {
        view.sortHumanByName();
    }

    @Override
    public void execute(int order) {
        System.out.println("Unnecessary id of human");
        return;
    }
}