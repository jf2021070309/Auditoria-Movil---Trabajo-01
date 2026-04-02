package com.amazon.aps.iva.yq;

import android.content.Context;
import android.os.Looper;
import android.util.Printer;
import com.amazon.aps.iva.gr.o;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.sq.f;
import com.amazon.aps.iva.yb0.j;
import java.util.concurrent.TimeUnit;
/* compiled from: MainLooperLongTaskStrategy.kt */
/* loaded from: classes2.dex */
public final class a implements Printer, o {
    public long d;
    public final long b = 100;
    public final long c = TimeUnit.MILLISECONDS.toNanos(100);
    public String e = "";

    @Override // com.amazon.aps.iva.gr.o
    public final void a(Context context) {
        Looper.getMainLooper().setMessageLogging(null);
    }

    @Override // com.amazon.aps.iva.gr.o
    public final void d(Context context) {
        Looper.getMainLooper().setMessageLogging(this);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (!j.a(a.class, cls)) {
            return false;
        }
        if (obj != null) {
            if (this.b == ((a) obj).b) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.datadog.android.rum.internal.instrumentation.MainLooperLongTaskStrategy");
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    @Override // android.util.Printer
    public final void println(String str) {
        com.amazon.aps.iva.ar.a aVar;
        if (str != null) {
            long nanoTime = System.nanoTime();
            if (m.h0(str, ">>>>> Dispatching to ", false)) {
                String substring = str.substring(21);
                j.e(substring, "this as java.lang.String).substring(startIndex)");
                this.e = substring;
                this.d = nanoTime;
            } else if (m.h0(str, "<<<<< Finished to ", false)) {
                long j = nanoTime - this.d;
                if (j > this.c) {
                    f fVar = com.amazon.aps.iva.sq.c.c;
                    if (fVar instanceof com.amazon.aps.iva.ar.a) {
                        aVar = (com.amazon.aps.iva.ar.a) fVar;
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        aVar.k(j, this.e);
                    }
                }
            }
        }
    }

    public final String toString() {
        return com.amazon.aps.iva.c.b.b(new StringBuilder("MainLooperLongTaskStrategy("), this.b, ")");
    }
}
