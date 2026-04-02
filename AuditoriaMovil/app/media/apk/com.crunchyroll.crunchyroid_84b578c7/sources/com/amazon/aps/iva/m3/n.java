package com.amazon.aps.iva.m3;

import android.os.Handler;
import java.util.concurrent.Callable;
/* compiled from: RequestExecutor.java */
/* loaded from: classes.dex */
public final class n<T> implements Runnable {
    public final Callable<T> b;
    public final com.amazon.aps.iva.o3.a<T> c;
    public final Handler d;

    /* compiled from: RequestExecutor.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ com.amazon.aps.iva.o3.a b;
        public final /* synthetic */ Object c;

        public a(com.amazon.aps.iva.o3.a aVar, Object obj) {
            this.b = aVar;
            this.c = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.b.a(this.c);
        }
    }

    public n(Handler handler, h hVar, i iVar) {
        this.b = hVar;
        this.c = iVar;
        this.d = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T t;
        try {
            t = this.b.call();
        } catch (Exception unused) {
            t = null;
        }
        this.d.post(new a(this.c, t));
    }
}
