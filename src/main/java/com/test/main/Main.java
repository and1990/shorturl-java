package com.test.main;

import com.test.util.ConfigUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    private WebServer server;

    public Main() {
        server = new WebServer(ConfigUtil.getInt("JETTY_PORT"));
    }

    public static void main(String... anArgs) throws Exception {
        logger.info("开始启动服务....");
        new Main().start();
        logger.info("服务启动成功....");
    }

    public void start() throws Exception {
        server.start();
        server.join();
    }
}
