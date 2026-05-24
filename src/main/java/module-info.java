module com.jogo.jogodavelha {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jogo.jogodavelha to javafx.fxml;
    exports com.jogo.jogodavelha;
}