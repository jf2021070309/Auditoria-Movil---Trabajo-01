package com.ironsource.mediationsdk.logger;
/* loaded from: classes2.dex */
public abstract class IronSourceLogger {
    int a;
    String b;

    /* loaded from: classes2.dex */
    public class IronSourceLogLevel {
        public static final int ERROR = 3;
        public static final int INFO = 1;
        public static final int VERBOSE = 0;
        public static final int WARNING = 2;

        public IronSourceLogLevel() {
        }
    }

    /* loaded from: classes2.dex */
    public enum IronSourceTag {
        API,
        ADAPTER_API,
        CALLBACK,
        ADAPTER_CALLBACK,
        NETWORK,
        INTERNAL,
        NATIVE,
        EVENT
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IronSourceLogger(String str) {
        this.b = str;
        this.a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IronSourceLogger(String str, int i) {
        this.b = str;
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof IronSourceLogger)) {
            IronSourceLogger ironSourceLogger = (IronSourceLogger) obj;
            String str = this.b;
            if (str != null && str.equals(ironSourceLogger.b)) {
                return true;
            }
        }
        return false;
    }

    public abstract void log(IronSourceTag ironSourceTag, String str, int i);

    public abstract void logException(IronSourceTag ironSourceTag, String str, Throwable th);

    public void setDebugLevel(int i) {
        this.a = i;
    }
}
