module com.geekbrains.javagb.geekcloudclient {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.geekbrains.common;
    requires io.netty.codec;

    opens com.geekbrains.javagb.geekcloudclient to javafx.fxml;
    exports com.geekbrains.javagb.geekcloudclient;
}