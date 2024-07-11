//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("hii there");

        /*  Single Responsibility Property
        * It means Single file should handle single responsibility. code should not tightly coupled.
        * Code should be easy to maintain , readable and extendable .
        * should not contain many reason to change the file.
        *
        * Example1 : Single class having multiple functionality if any one of them change it may affect the
        * entire file. e.g -: employee class
        *
        * Example2 : Single frontend react component having more than 1 responsibility
        *  1. State Managements
        *  2. Api Calls
        *  3. UI rendering
        *
        * Solutions :
        *   Example1 Solution : Create Multiple classes one class contain only one responsibility
        *   Example2 Solution : Call Api and state management in seprate file and ui redring in seprate file.
        * */
    }
}