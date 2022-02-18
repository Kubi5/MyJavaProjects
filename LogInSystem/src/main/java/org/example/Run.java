package org.example;

import java.sql.SQLException;

public class Run {
    public static void program() throws SQLException {
        loginSystem loginSystem = new loginSystem();
        loginSystem.Welcome();
        loginSystem.ValidChoice();
        loginSystem.runProgram();
    }
}
