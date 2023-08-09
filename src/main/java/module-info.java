module org.openjfx.pruebasjavafxvarias2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens org.openjfx.pruebasjavafxvarias2 to javafx.fxml;
    exports org.openjfx.pruebasjavafxvarias2;
}
