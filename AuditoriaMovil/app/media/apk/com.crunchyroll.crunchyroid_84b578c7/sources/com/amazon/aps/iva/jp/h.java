package com.amazon.aps.iva.jp;
/* compiled from: DatadogSite.kt */
/* loaded from: classes2.dex */
public enum h {
    US1,
    US3,
    US5,
    US1_FED,
    EU1;

    /* compiled from: DatadogSite.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h.values().length];
            iArr[h.US1.ordinal()] = 1;
            iArr[h.US3.ordinal()] = 2;
            iArr[h.US5.ordinal()] = 3;
            iArr[h.US1_FED.ordinal()] = 4;
            iArr[h.EU1.ordinal()] = 5;
            a = iArr;
        }
    }

    public final String logsEndpoint() {
        int i = a.a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return "https://mobile-http-intake.logs.datadoghq.eu";
                        }
                        throw new com.amazon.aps.iva.kb0.h();
                    }
                    return "https://logs.browser-intake-ddog-gov.com";
                }
                return "https://logs.browser-intake-us5-datadoghq.com";
            }
            return "https://logs.browser-intake-us3-datadoghq.com";
        }
        return "https://logs.browser-intake-datadoghq.com";
    }

    public final String rumEndpoint() {
        int i = a.a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return "https://rum-http-intake.logs.datadoghq.eu";
                        }
                        throw new com.amazon.aps.iva.kb0.h();
                    }
                    return "https://rum.browser-intake-ddog-gov.com";
                }
                return "https://rum.browser-intake-us5-datadoghq.com";
            }
            return "https://rum.browser-intake-us3-datadoghq.com";
        }
        return "https://rum.browser-intake-datadoghq.com";
    }

    public final String tracesEndpoint() {
        int i = a.a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return "https:/public-trace-http-intake.logs.datadoghq.eu";
                        }
                        throw new com.amazon.aps.iva.kb0.h();
                    }
                    return "https://trace.browser-intake-ddog-gov.com";
                }
                return "https://trace.browser-intake-us5-datadoghq.com";
            }
            return "https://trace.browser-intake-us3-datadoghq.com";
        }
        return "https://trace.browser-intake-datadoghq.com";
    }
}
