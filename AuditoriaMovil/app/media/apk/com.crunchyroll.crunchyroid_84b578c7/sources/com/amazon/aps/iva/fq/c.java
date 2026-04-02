package com.amazon.aps.iva.fq;

import android.content.Context;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.j;
import java.lang.Thread;
import java.lang.ref.WeakReference;
/* compiled from: DatadogExceptionHandler.kt */
/* loaded from: classes2.dex */
public final class c implements Thread.UncaughtExceptionHandler {
    public final com.amazon.aps.iva.kq.b a;
    public final com.amazon.aps.iva.sp.c<com.amazon.aps.iva.pq.a> b;
    public final WeakReference<Context> c;
    public Thread.UncaughtExceptionHandler d;

    public c(com.amazon.aps.iva.kq.b bVar, com.amazon.aps.iva.sp.c<com.amazon.aps.iva.pq.a> cVar, Context context) {
        j.f(cVar, "writer");
        this.a = bVar;
        this.b = cVar;
        this.c = new WeakReference<>(context);
    }

    public static String a(Throwable th) {
        boolean z;
        String message = th.getMessage();
        if (message != null && !m.b0(message)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            String canonicalName = th.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = th.getClass().getSimpleName();
            }
            return "Application crash detected: ".concat(canonicalName);
        }
        return message;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5 A[LOOP:0: B:17:0x0074->B:36:0x00b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b7 A[EDGE_INSN: B:62:0x00b7->B:37:0x00b7 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uncaughtException(java.lang.Thread r19, java.lang.Throwable r20) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.fq.c.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
