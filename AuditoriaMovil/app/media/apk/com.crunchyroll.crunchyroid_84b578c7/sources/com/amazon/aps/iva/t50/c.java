package com.amazon.aps.iva.t50;

import android.os.SystemClock;
/* compiled from: TimeProvider.kt */
/* loaded from: classes2.dex */
public interface c {

    /* compiled from: TimeProvider.kt */
    /* loaded from: classes2.dex */
    public static final class a implements c {
        public static final a a = new a();

        @Override // com.amazon.aps.iva.t50.c
        public final long a() {
            return SystemClock.elapsedRealtime();
        }

        @Override // com.amazon.aps.iva.t50.c
        public final long b() {
            return SystemClock.elapsedRealtime() / 1000;
        }
    }

    /* compiled from: TimeProvider.kt */
    /* loaded from: classes2.dex */
    public static final class b implements c {
        public static final b a = new b();

        @Override // com.amazon.aps.iva.t50.c
        public final long a() {
            return System.currentTimeMillis();
        }

        @Override // com.amazon.aps.iva.t50.c
        public final long b() {
            return System.currentTimeMillis() / 1000;
        }
    }

    long a();

    long b();
}
