package com.amazon.aps.iva.oa0;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
/* compiled from: BatchManager.java */
/* loaded from: classes4.dex */
public final class l {
    public static l m;
    public final Context c;
    public boolean d;
    public boolean e;
    public long g;
    public final b h;
    public final c i;
    public final m l;
    public final Semaphore a = new Semaphore(1, true);
    public final Semaphore b = new Semaphore(1, true);
    public String f = null;
    public final String[] j = {FirebaseAnalytics.Param.AD_PLATFORM, "ad_currency", "pcc"};
    public final ConcurrentHashMap k = new ConcurrentHashMap();

    /* compiled from: BatchManager.java */
    /* loaded from: classes4.dex */
    public class a implements Runnable {

        /* compiled from: BatchManager.java */
        /* renamed from: com.amazon.aps.iva.oa0.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class RunnableC0563a implements Runnable {
            public final /* synthetic */ i b;
            public final /* synthetic */ String c;
            public final /* synthetic */ ExecutorService d;
            public final /* synthetic */ Semaphore e;

            /* compiled from: BatchManager.java */
            /* renamed from: com.amazon.aps.iva.oa0.l$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public class RunnableC0564a implements Runnable {
                public RunnableC0564a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC0563a runnableC0563a = RunnableC0563a.this;
                    try {
                        a aVar = a.this;
                        String str = runnableC0563a.c;
                        l.this.k.remove(str);
                        ((n) l.this.l).b(str);
                    } finally {
                        try {
                        } finally {
                        }
                    }
                }
            }

            public RunnableC0563a(i iVar, String str, ExecutorService executorService, Semaphore semaphore) {
                this.b = iVar;
                this.c = str;
                this.d = executorService;
                this.e = semaphore;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                b bVar = l.this.h;
                i iVar = this.b;
                v0 v0Var = (v0) bVar;
                v0Var.getClass();
                try {
                    z = iVar.i(v0Var.a.a);
                } catch (IOException e) {
                    f1.b(e);
                    z = false;
                }
                if (z) {
                    l lVar = l.m;
                    this.d.execute(new RunnableC0564a());
                    return;
                }
                l lVar2 = l.m;
                this.e.release();
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConcurrentHashMap concurrentHashMap;
            l lVar = l.this;
            try {
                lVar.b.acquire();
                lVar.a.acquire();
                m mVar = lVar.l;
                Semaphore semaphore = lVar.b;
                Context context = ((n) mVar).b;
                int i = f1.b;
                long j = context.getSharedPreferences("batch_send_id", 0).getLong("sendId", 0L) + 1;
                SharedPreferences.Editor edit = context.getSharedPreferences("batch_send_id", 0).edit();
                edit.putLong("sendId", j);
                edit.commit();
                lVar.g = j;
                lVar.a.release();
                l lVar2 = l.m;
                ConcurrentHashMap concurrentHashMap2 = lVar.k;
                concurrentHashMap2.size();
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                String[] strArr = (String[]) concurrentHashMap2.keySet().toArray(new String[0]);
                LinkedList linkedList = new LinkedList();
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (new com.amazon.aps.iva.if0.c(strArr[i2]).getLong("send_id") < lVar.g) {
                        linkedList.add(strArr[i2]);
                    }
                }
                String[] strArr2 = (String[]) linkedList.toArray(new String[0]);
                Semaphore semaphore2 = new Semaphore(0, true);
                int length = strArr2.length;
                int i3 = 0;
                while (i3 < length) {
                    String str = strArr2[i3];
                    i iVar = (i) concurrentHashMap2.get(str);
                    l lVar3 = l.m;
                    iVar.toString();
                    try {
                        concurrentHashMap = concurrentHashMap2;
                        try {
                            Executors.newSingleThreadExecutor().execute(new RunnableC0563a(iVar, str, newSingleThreadExecutor, semaphore2));
                        } catch (Throwable th) {
                            th = th;
                            l lVar4 = l.m;
                            f1.b(th);
                            lVar.c(th);
                            i3++;
                            concurrentHashMap2 = concurrentHashMap;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        concurrentHashMap = concurrentHashMap2;
                    }
                    i3++;
                    concurrentHashMap2 = concurrentHashMap;
                }
                semaphore2.tryAcquire(strArr2.length, 60L, TimeUnit.SECONDS);
                semaphore.release();
                lVar.a.release();
            }
        }
    }

    /* compiled from: BatchManager.java */
    /* loaded from: classes4.dex */
    public interface b {
    }

    /* compiled from: BatchManager.java */
    /* loaded from: classes4.dex */
    public interface c {
    }

    static {
        new com.amazon.aps.iva.b30.j(l.class.getSimpleName());
    }

    public l(Context context, n nVar, v0 v0Var, w0 w0Var) {
        this.d = false;
        this.e = false;
        this.l = nVar;
        this.h = v0Var;
        this.i = w0Var;
        int i = f1.b;
        this.g = nVar.b.getSharedPreferences("batch_send_id", 0).getLong("sendId", 0L);
        this.d = r.g.a.c();
        this.e = r.g.a.b();
        this.c = context;
    }

    public static void a(l lVar, i iVar) throws com.amazon.aps.iva.if0.b {
        synchronized (lVar) {
            try {
                lVar.a.acquire();
            } catch (InterruptedException e) {
                f1.b(e);
            }
            long currentTimeMillis = System.currentTimeMillis();
            String b2 = lVar.b(iVar);
            iVar.j();
            com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c(iVar.get("e"));
            if (lVar.k.containsKey(b2)) {
                i iVar2 = (i) lVar.k.get(b2);
                com.amazon.aps.iva.if0.c cVar2 = new com.amazon.aps.iva.if0.c(iVar2.get("e"));
                cVar2.put("r", cVar2.getDouble("r") + cVar.getDouble("r"));
                cVar2.put("ad_revenue", cVar2.getDouble("ad_revenue") + cVar.getDouble("ad_revenue"));
                cVar2.put("admon_count", cVar2.getInt("admon_count") + 1);
                cVar2.put("last_update_timestamp", currentTimeMillis);
                iVar2.put("e", cVar2.toString());
                iVar2.j();
                lVar.a.release();
                ((n) lVar.l).c(b2, iVar2.j());
            } else {
                com.amazon.aps.iva.if0.c cVar3 = new com.amazon.aps.iva.if0.c(b2);
                cVar3.remove("send_id");
                double d = cVar.getDouble("r");
                double d2 = cVar.getDouble("ad_revenue");
                cVar3.put("r", d);
                cVar3.put("ad_revenue", d2);
                cVar3.put("admon_count", 1);
                cVar3.put("is_admon_revenue", cVar.getBoolean("is_admon_revenue"));
                cVar3.put("is_revenue_event", cVar.getBoolean("is_revenue_event"));
                cVar3.put("first_update_timestamp", currentTimeMillis);
                cVar3.put("last_update_timestamp", currentTimeMillis);
                iVar.put("e", cVar3.toString());
                StringBuilder sb = new StringBuilder("a");
                SharedPreferences sharedPreferences = lVar.c.getSharedPreferences("pref-admon-event-index", 0);
                long j = sharedPreferences.getLong("admon-event-index", -1L) + 1;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong("admon-event-index", j);
                edit.commit();
                sb.append(String.valueOf(j));
                iVar.put("event_index", sb.toString());
                if (lVar.e) {
                    iVar.put("_de", "true");
                }
                lVar.k.put(b2, iVar);
                lVar.a.release();
                ((n) lVar.l).a(b2, iVar.j());
                iVar.j();
            }
        }
    }

    public final String b(i iVar) throws com.amazon.aps.iva.if0.b {
        String[] strArr;
        iVar.j();
        com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c(iVar.get("e"));
        com.amazon.aps.iva.if0.c cVar2 = new com.amazon.aps.iva.if0.c();
        cVar2.put("send_id", this.g);
        for (String str : this.j) {
            try {
                cVar2.put(str, cVar.getString(str));
            } catch (com.amazon.aps.iva.if0.b e) {
                f1.b(e);
            }
        }
        cVar2.toString();
        return cVar2.toString();
    }

    public final void c(Throwable th) {
        try {
            p0 b2 = p0.b(this.c, Boolean.FALSE);
            Handler handler = b2.b;
            if (handler != null) {
                o0 o0Var = new o0(b2, th);
                handler.removeCallbacksAndMessages(null);
                handler.post(o0Var);
            }
        } catch (RuntimeException unused) {
        }
    }

    public final void d() {
        if (!this.d) {
            return;
        }
        try {
            Executors.newSingleThreadExecutor().execute(new a());
        } catch (Throwable th) {
            f1.b(th);
            c(th);
        }
    }
}
