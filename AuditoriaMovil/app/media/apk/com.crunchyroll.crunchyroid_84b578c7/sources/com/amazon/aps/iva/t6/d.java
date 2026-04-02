package com.amazon.aps.iva.t6;

import android.os.Handler;
import com.amazon.aps.iva.w5.y;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: BandwidthMeter.java */
/* loaded from: classes.dex */
public interface d {

    /* compiled from: BandwidthMeter.java */
    /* loaded from: classes.dex */
    public interface a {

        /* compiled from: BandwidthMeter.java */
        /* renamed from: com.amazon.aps.iva.t6.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0732a {
            public final CopyOnWriteArrayList<C0733a> a = new CopyOnWriteArrayList<>();

            /* compiled from: BandwidthMeter.java */
            /* renamed from: com.amazon.aps.iva.t6.d$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0733a {
                public final Handler a;
                public final a b;
                public boolean c;

                public C0733a(Handler handler, com.amazon.aps.iva.b6.a aVar) {
                    this.a = handler;
                    this.b = aVar;
                }
            }

            public final void a(com.amazon.aps.iva.b6.a aVar) {
                CopyOnWriteArrayList<C0733a> copyOnWriteArrayList = this.a;
                Iterator<C0733a> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    C0733a next = it.next();
                    if (next.b == aVar) {
                        next.c = true;
                        copyOnWriteArrayList.remove(next);
                    }
                }
            }
        }

        void K(int i, long j, long j2);
    }

    y c();

    long e();

    void f(Handler handler, com.amazon.aps.iva.b6.a aVar);

    void g(com.amazon.aps.iva.b6.a aVar);
}
