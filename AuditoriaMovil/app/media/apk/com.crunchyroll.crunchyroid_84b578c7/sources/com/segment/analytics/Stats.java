package com.segment.analytics;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
class Stats {
    private static final String STATS_THREAD_NAME = "Segment-Stats";
    long flushCount;
    long flushEventCount;
    final StatsHandler handler;
    long integrationOperationCount;
    long integrationOperationDuration;
    Map<String, Long> integrationOperationDurationByIntegration = new HashMap();
    final HandlerThread statsThread;

    /* loaded from: classes4.dex */
    public static class StatsHandler extends Handler {
        static final int TRACK_FLUSH = 1;
        static final int TRACK_INTEGRATION_OPERATION = 2;
        private final Stats stats;

        public StatsHandler(Looper looper, Stats stats) {
            super(looper);
            this.stats = stats;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    this.stats.performIntegrationOperation((Pair) message.obj);
                    return;
                }
                throw new AssertionError("Unknown Stats handler message: " + message);
            }
            this.stats.performFlush(message.arg1);
        }
    }

    public Stats() {
        HandlerThread handlerThread = new HandlerThread(STATS_THREAD_NAME, 10);
        this.statsThread = handlerThread;
        handlerThread.start();
        this.handler = new StatsHandler(handlerThread.getLooper(), this);
    }

    public StatsSnapshot createSnapshot() {
        return new StatsSnapshot(System.currentTimeMillis(), this.flushCount, this.flushEventCount, this.integrationOperationCount, this.integrationOperationDuration, Collections.unmodifiableMap(this.integrationOperationDurationByIntegration));
    }

    public void dispatchFlush(int i) {
        StatsHandler statsHandler = this.handler;
        statsHandler.sendMessage(statsHandler.obtainMessage(1, i, 0));
    }

    public void dispatchIntegrationOperation(String str, long j) {
        StatsHandler statsHandler = this.handler;
        statsHandler.sendMessage(statsHandler.obtainMessage(2, new Pair(str, Long.valueOf(j))));
    }

    public void performFlush(int i) {
        this.flushCount++;
        this.flushEventCount += i;
    }

    public void performIntegrationOperation(Pair<String, Long> pair) {
        this.integrationOperationCount++;
        this.integrationOperationDuration = ((Long) pair.second).longValue() + this.integrationOperationDuration;
        Long l = this.integrationOperationDurationByIntegration.get(pair.first);
        if (l == null) {
            this.integrationOperationDurationByIntegration.put((String) pair.first, (Long) pair.second);
            return;
        }
        this.integrationOperationDurationByIntegration.put((String) pair.first, Long.valueOf(((Long) pair.second).longValue() + l.longValue()));
    }

    public void shutdown() {
        this.statsThread.quit();
    }
}
