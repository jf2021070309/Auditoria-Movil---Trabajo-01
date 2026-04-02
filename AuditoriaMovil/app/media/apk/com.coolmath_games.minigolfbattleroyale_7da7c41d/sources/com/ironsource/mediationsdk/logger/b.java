package com.ironsource.mediationsdk.logger;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
/* loaded from: classes2.dex */
public final class b extends IronSourceLogger {
    public LogListener c;

    private b() {
        super("publisher");
    }

    public b(LogListener logListener, int i) {
        super("publisher", 1);
        this.c = null;
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public final synchronized void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        if (this.c != null && str != null) {
            this.c.onLog(ironSourceTag, str, i);
        }
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public final void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th != null) {
            log(ironSourceTag, th.getMessage(), 3);
        }
    }
}
