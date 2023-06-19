public class Testing {
    public static void main(String[] args) {
        testModel();
        testView();
        testController();
    }

    public static void testModel() {
        System.out.println("Testing Model...");

        Model model = new Model();

        // Test generateRandomRoll() and getRandRoll()
        model.generateRandomRoll(6);
        int roll = model.getRandRoll();
        System.out.println("Generated roll: " + roll);

        System.out.println("Model testing complete.\n");
    }

    public static void testView() {
        System.out.println("Testing View...");

        View view = new View();

        // Test setResultAreaTo() and dropdown_choice()
        view.setResultAreaTo("Test Roll Number");
        System.out.println("Selected dropdown choice: " + view.dropdown_choice());

        System.out.println("View testing complete.\n");
    }

    public static void testController() {
        System.out.println("Testing Controller...");

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        // Simulate button click
        view.dropdown_choice(); // Select a dropdown choice
        view.addButtonDetector(controller.new ButtonDetector());
        view.button.doClick(); // Simulate button click

        System.out.println("Controller testing complete.\n");
    }
}
