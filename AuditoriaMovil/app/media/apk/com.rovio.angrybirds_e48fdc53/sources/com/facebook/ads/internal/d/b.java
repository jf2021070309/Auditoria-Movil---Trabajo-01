package com.facebook.ads.internal.d;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/* loaded from: classes2.dex */
public class b {
    private static final String a = b.class.getSimpleName();
    private static final ExecutorService b = Executors.newSingleThreadExecutor();
    private static final ExecutorService c = Executors.newFixedThreadPool(5);
    private final c e;
    private final d f;
    private final Handler d = new Handler();
    private final List<Callable<Boolean>> g = new ArrayList();

    /* loaded from: classes2.dex */
    private class a implements Callable<Boolean> {
        private final String b;
        private final int c;
        private final int d;

        public a(String str, int i, int i2) {
            this.b = str;
            this.c = i;
            this.d = i2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() {
            b.this.e.a(this.b, this.c, this.d);
            return true;
        }
    }

    /* renamed from: com.facebook.ads.internal.d.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private class CallableC0110b implements Callable<Boolean> {
        private final String b;

        public CallableC0110b(String str) {
            this.b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() {
            b.this.f.a(this.b);
            return true;
        }
    }

    public b(Context context) {
        this.e = c.a(context);
        this.f = d.a(context);
    }

    public void a(final com.facebook.ads.internal.d.a aVar) {
        final ArrayList arrayList = new ArrayList(this.g);
        b.execute(new Runnable() { // from class: com.facebook.ads.internal.d.b.1
            @Override // java.lang.Runnable
            public void run() {
                ArrayList<Future> arrayList2 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(b.c.submit((Callable) it.next()));
                }
                try {
                    for (Future future : arrayList2) {
                        future.get();
                    }
                    b.this.d.post(new Runnable() { // from class: com.facebook.ads.internal.d.b.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (aVar != null) {
                                aVar.a();
                            }
                        }
                    });
                } catch (InterruptedException | ExecutionException e) {
                    Log.e(b.a, "Exception while executing cache downloads.", e);
                    b.this.d.post(new Runnable() { // from class: com.facebook.ads.internal.d.b.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (aVar != null) {
                                aVar.b();
                            }
                        }
                    });
                }
            }
        });
        this.g.clear();
    }

    public void a(String str) {
        this.g.add(new CallableC0110b(str));
    }

    public void a(String str, int i, int i2) {
        this.g.add(new a(str, i, i2));
    }

    public String b(String str) {
        return this.f.b(str);
    }
}
