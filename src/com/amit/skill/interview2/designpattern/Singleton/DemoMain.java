package com.amit.skill.interview2.designpattern.Singleton;

import java.sql.Connection;

/**
 * Created by amitkumar on 28/5/18.
 */
public class DemoMain {
    public static void main(String[] args) {
        Connection conn=ConnectionPool.INSTANCE.conn;
    }
}
