module org.example.voicemaker {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.voicemaker to javafx.fxml;
    exports org.example.voicemaker;
}