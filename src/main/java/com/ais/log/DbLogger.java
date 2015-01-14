package com.ais.log;

import java.io.IOException;
import java.sql.*;

/**
 * Created by enterprise on 1/14/15 AD.
 */
public class DbLogger implements Logger {
    private Connection conn;

    public void setConn(Connection conn)
    {
        this.conn = conn;
    }

    @Override
    public void persist(String message, String date) throws Exception {
            PreparedStatement stat = conn.prepareStatement("insert into test values(?,?)");
            stat.setString(1, message);
            stat.setString(2, date);

            stat.execute();
            stat.close();
            conn.close();

    }
}
