import javax.swing.*;

public class BindingTest {
    public JComponent myRootComponent;
    public static JComponent myStaticField;
    public final JComponent myFinalField = null;
    public int myIntField;
    public String myStringField;

    public BindingTest() {
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        myRootComponent = new JPanel();
        myRootComponent.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new java.awt.Insets(0, 0, 0, 0), -1, -1));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return myRootComponent;
    }
}
