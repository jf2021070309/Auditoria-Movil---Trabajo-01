package com.amazon.aps.iva.k9;

import android.annotation.SuppressLint;
/* compiled from: Operation.java */
/* loaded from: classes.dex */
public interface p {
    @SuppressLint({"SyntheticAccessor"})
    public static final a.c a = new a.c();
    @SuppressLint({"SyntheticAccessor"})
    public static final a.b b = new a.b();

    /* compiled from: Operation.java */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* compiled from: Operation.java */
        /* renamed from: com.amazon.aps.iva.k9.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0438a extends a {
            public final Throwable a;

            public C0438a(Throwable th) {
                this.a = th;
            }

            public final String toString() {
                return String.format("FAILURE (%s)", this.a.getMessage());
            }
        }

        /* compiled from: Operation.java */
        /* loaded from: classes.dex */
        public static final class b extends a {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        /* compiled from: Operation.java */
        /* loaded from: classes.dex */
        public static final class c extends a {
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
