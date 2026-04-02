package com.amazon.aps.iva.k3;

import android.os.Build;
import android.os.Trace;
/* compiled from: TraceCompat.java */
@Deprecated
/* loaded from: classes.dex */
public final class m {
    public static final /* synthetic */ int a = 0;

    /* compiled from: TraceCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(String str) {
            Trace.beginSection(str);
        }

        public static void b() {
            Trace.endSection();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }
}
