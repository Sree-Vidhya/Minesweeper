package Validation;

import java.util.ArrayList;
import java.util.Scanner;

public class ValidateFieldContent implements ValidateUserInput
{
    Scanner input = new Scanner(System.in);
    ArrayList field = new ArrayList();
    String eachCell;
    public boolean validateTheInput(String input) {
        if(input.equals(".") ||input.equals("*") ){
            return true;
        }
        else{
            return false;
        }
    }
    public String eachCellInput(){
        return input.next();
    }
    public int calculateToTalNumberofcells( String fieldLayout)
    {
        int totalNumberOfCells = 0;
        ValidateFieldLayout gridLayout = new ValidateFieldLayout();
        if(gridLayout.validateTheFormatandLength(fieldLayout) == true) {
            String[] layout = (fieldLayout.split(""));
            int numberOfRows = Integer.parseInt(layout[0]);
            int numberOfColumns = Integer.parseInt(layout[1]);
            totalNumberOfCells = numberOfRows * numberOfColumns;
        }
        return totalNumberOfCells;
    }
    public ArrayList userEnteredEachCell(int totalNumberOfCells){

        System.out.println("Enter the Input for Each Cell: \n'.' for safe zone.\n'*' for mine zone");
        for(int i =0 ; i < totalNumberOfCells ; i++) {
            eachCell = eachCellInput();
            while (validateTheInput(eachCell) == false) {
                System.out.println("Not a Valid Input");
                eachCell = eachCellInput();
            }
            field.add(eachCell);
        }
        return field;
    }
}
