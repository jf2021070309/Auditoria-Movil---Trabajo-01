package com.amazon.aps.iva.r9;

import android.content.Context;
import com.amazon.aps.iva.k9.m;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: ConstraintTracker.java */
/* loaded from: classes.dex */
public abstract class d<T> {
    public static final /* synthetic */ int f = 0;
    public final com.amazon.aps.iva.w9.a a;
    public final Context b;
    public final Object c = new Object();
    public final LinkedHashSet d = new LinkedHashSet();
    public T e;

    /* compiled from: ConstraintTracker.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ List b;

        public a(ArrayList arrayList) {
            this.b = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (com.amazon.aps.iva.p9.a aVar : this.b) {
                aVar.a(d.this.e);
            }
        }
    }

    static {
        m.e("ConstraintTracker");
    }

    public d(Context context, com.amazon.aps.iva.w9.a aVar) {
        this.b = context.getApplicationContext();
        this.a = aVar;
    }

    public abstract T a();

    public final void b(T t) {
        synchronized (this.c) {
            T t2 = this.e;
            if (t2 != t && (t2 == null || !t2.equals(t))) {
                this.e = t;
                ((com.amazon.aps.iva.w9.b) this.a).c.execute(new a(new ArrayList(this.d)));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
