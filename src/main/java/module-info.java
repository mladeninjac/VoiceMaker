module VoiceMaker {
    requires javafx.controls;
    requires javafx.fxml;
    //requires javafx.graphics;
    requires freetts;

    opens org.example.voicemaker to javafx.fxml;
    exports org.example.voicemaker;

}