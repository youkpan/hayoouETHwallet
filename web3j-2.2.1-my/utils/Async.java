package org.web3j.utils;


import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Async task facilitation.
 */
public class Async {

    private static ScheduledExecutorService executorService;

    static {
        executorService = defaultExecutorService();
    }

    private static int getCpuCount() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static ScheduledExecutorService defaultExecutorService() {
        return Executors.newScheduledThreadPool(getCpuCount());
    }
}
