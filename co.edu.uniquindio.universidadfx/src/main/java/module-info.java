module co.edu.uniquindio.universidadfx.universidadfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.universidadfx.universidadfx to javafx.fxml;
    exports co.edu.uniquindio.universidadfx.universidadfx;
}