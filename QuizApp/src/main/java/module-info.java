module com.nbh.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires lombok;
    requires mysql.connector.j;
    requires java.sql;

    opens com.nbh.quizapp to javafx.fxml;
    exports com.nbh.quizapp;
}
