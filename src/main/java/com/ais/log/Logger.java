package com.ais.log;

import java.io.IOException;

public interface Logger {
    void persist(String message, String date)  throws Exception;
}
