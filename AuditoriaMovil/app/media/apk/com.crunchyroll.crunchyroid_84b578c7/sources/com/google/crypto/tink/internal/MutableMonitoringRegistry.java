package com.google.crypto.tink.internal;

import com.google.crypto.tink.monitoring.MonitoringClient;
import com.google.crypto.tink.monitoring.MonitoringKeysetInfo;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes4.dex */
public final class MutableMonitoringRegistry {
    private final AtomicReference<MonitoringClient> monitoringClient = new AtomicReference<>();
    private static final MutableMonitoringRegistry GLOBAL_INSTANCE = new MutableMonitoringRegistry();
    private static final DoNothingClient DO_NOTHING_CLIENT = new DoNothingClient();

    /* loaded from: classes4.dex */
    public static class DoNothingClient implements MonitoringClient {
        private DoNothingClient() {
        }

        @Override // com.google.crypto.tink.monitoring.MonitoringClient
        public MonitoringClient.Logger createLogger(MonitoringKeysetInfo monitoringKeysetInfo, String str, String str2) {
            return MonitoringUtil.DO_NOTHING_LOGGER;
        }
    }

    public static MutableMonitoringRegistry globalInstance() {
        return GLOBAL_INSTANCE;
    }

    public synchronized void clear() {
        this.monitoringClient.set(null);
    }

    public MonitoringClient getMonitoringClient() {
        MonitoringClient monitoringClient = this.monitoringClient.get();
        if (monitoringClient == null) {
            return DO_NOTHING_CLIENT;
        }
        return monitoringClient;
    }

    public synchronized void registerMonitoringClient(MonitoringClient monitoringClient) {
        if (this.monitoringClient.get() == null) {
            this.monitoringClient.set(monitoringClient);
        } else {
            throw new IllegalStateException("a monitoring client has already been registered");
        }
    }
}
