package org.example.module9.gof_patterns.task3;

public class ButtonFactoryMethods {
    abstract static class Dialog {
        public abstract Button createButton();

        public void renderWindow() {
            Button button = createButton();
            button.render();
        }
    }

    static class WindowsDialog extends Dialog {
        public Button createButton() {
            return new WindowsButton();
        }
    }

    static class LinuxDialog extends Dialog {
        public Button createButton() {
            return new LinuxButton();
        }
    }

    interface Button {
        void render();
    }

    static class WindowsButton implements Button {
        public void render() {
            System.out.println("Rendering a Windows button.");
        }
    }

    static class LinuxButton implements Button {
        public void render() {
            System.out.println("Rendering a Linux button.");
        }
    }

    public static void main(String[] args) {
        runLinux();
        runWindows();
    }

    private static void runLinux() {
        Dialog dialog = new LinuxDialog();
        dialog.renderWindow();
    }

    private static void runWindows() {
        Dialog dialog = new LinuxDialog();
        dialog.renderWindow();
    }
}
