package com.amazon.aps.iva.b6;

import android.media.metrics.LogSessionId;
/* compiled from: PlayerId.java */
/* loaded from: classes.dex */
public final class p1 {
    public static final p1 b;
    public final a a;

    /* compiled from: PlayerId.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static final a b;
        public final LogSessionId a;

        static {
            LogSessionId logSessionId;
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            b = new a(logSessionId);
        }

        public a(LogSessionId logSessionId) {
            this.a = logSessionId;
        }
    }

    static {
        p1 p1Var;
        if (com.amazon.aps.iva.t5.g0.a < 31) {
            p1Var = new p1();
        } else {
            p1Var = new p1(a.b);
        }
        b = p1Var;
    }

    public p1() {
        this((a) null);
        com.amazon.aps.iva.cq.b.C(com.amazon.aps.iva.t5.g0.a < 31);
    }

    public p1(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    public p1(a aVar) {
        this.a = aVar;
    }
}
