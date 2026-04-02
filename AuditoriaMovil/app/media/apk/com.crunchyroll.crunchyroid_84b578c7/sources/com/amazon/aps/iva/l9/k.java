package com.amazon.aps.iva.l9;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.a;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import com.amazon.aps.iva.k9.m;
import com.amazon.aps.iva.k9.p;
import com.amazon.aps.iva.k9.u;
import com.amazon.aps.iva.k9.v;
import com.amazon.aps.iva.p8.g;
import com.amazon.aps.iva.t9.r;
import com.amazon.aps.iva.u8.b;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: WorkManagerImpl.java */
/* loaded from: classes.dex */
public final class k extends u {
    public static k j;
    public static k k;
    public static final Object l;
    public Context a;
    public androidx.work.a b;
    public WorkDatabase c;
    public com.amazon.aps.iva.w9.a d;
    public List<e> e;
    public d f;
    public com.amazon.aps.iva.u9.h g;
    public boolean h;
    public BroadcastReceiver.PendingResult i;

    static {
        com.amazon.aps.iva.k9.m.e("WorkManagerImpl");
        j = null;
        k = null;
        l = new Object();
    }

    public k(Context context, androidx.work.a aVar, com.amazon.aps.iva.w9.b bVar) {
        g.a aVar2;
        Executor executor;
        String str;
        boolean z;
        boolean z2 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        com.amazon.aps.iva.u9.j jVar = bVar.a;
        int i = WorkDatabase.k;
        if (z2) {
            aVar2 = new g.a(applicationContext, null);
            aVar2.h = true;
        } else {
            String[] strArr = j.a;
            aVar2 = new g.a(applicationContext, "androidx.work.workdb");
            aVar2.g = new h(applicationContext);
        }
        aVar2.e = jVar;
        i iVar = new i();
        if (aVar2.d == null) {
            aVar2.d = new ArrayList<>();
        }
        aVar2.d.add(iVar);
        aVar2.a(androidx.work.impl.a.a);
        aVar2.a(new a.h(applicationContext, 2, 3));
        aVar2.a(androidx.work.impl.a.b);
        aVar2.a(androidx.work.impl.a.c);
        aVar2.a(new a.h(applicationContext, 5, 6));
        aVar2.a(androidx.work.impl.a.d);
        aVar2.a(androidx.work.impl.a.e);
        aVar2.a(androidx.work.impl.a.f);
        aVar2.a(new a.i(applicationContext));
        aVar2.a(new a.h(applicationContext, 10, 11));
        aVar2.a(androidx.work.impl.a.g);
        aVar2.j = false;
        aVar2.k = true;
        Context context2 = aVar2.c;
        if (context2 != null) {
            Class<T> cls = aVar2.a;
            if (cls != 0) {
                Executor executor2 = aVar2.e;
                if (executor2 == null && aVar2.f == null) {
                    com.amazon.aps.iva.r.b bVar2 = com.amazon.aps.iva.r.c.c;
                    aVar2.f = bVar2;
                    aVar2.e = bVar2;
                } else if (executor2 != null && aVar2.f == null) {
                    aVar2.f = executor2;
                } else if (executor2 == null && (executor = aVar2.f) != null) {
                    aVar2.e = executor;
                }
                if (aVar2.g == null) {
                    aVar2.g = new com.amazon.aps.iva.v8.c();
                }
                String str2 = aVar2.b;
                b.c cVar = aVar2.g;
                g.d dVar = aVar2.l;
                ArrayList<g.b> arrayList = aVar2.d;
                boolean z3 = aVar2.h;
                g.c resolve = aVar2.i.resolve(context2);
                Executor executor3 = aVar2.e;
                com.amazon.aps.iva.p8.a aVar3 = new com.amazon.aps.iva.p8.a(context2, str2, cVar, dVar, arrayList, z3, resolve, executor3, aVar2.f, aVar2.j, aVar2.k);
                String name = cls.getPackage().getName();
                String canonicalName = cls.getCanonicalName();
                canonicalName = name.isEmpty() ? canonicalName : canonicalName.substring(name.length() + 1);
                String str3 = canonicalName.replace('.', '_') + "_Impl";
                try {
                    if (name.isEmpty()) {
                        str = str3;
                    } else {
                        str = name + "." + str3;
                    }
                    com.amazon.aps.iva.p8.g gVar = (com.amazon.aps.iva.p8.g) Class.forName(str).newInstance();
                    com.amazon.aps.iva.u8.b e = gVar.e(aVar3);
                    gVar.c = e;
                    if (e instanceof com.amazon.aps.iva.p8.j) {
                        ((com.amazon.aps.iva.p8.j) e).b = aVar3;
                    }
                    if (resolve == g.c.WRITE_AHEAD_LOGGING) {
                        z = true;
                    } else {
                        z = false;
                    }
                    e.setWriteAheadLoggingEnabled(z);
                    gVar.g = arrayList;
                    gVar.b = executor3;
                    new ArrayDeque();
                    gVar.e = z3;
                    gVar.f = z;
                    WorkDatabase workDatabase = (WorkDatabase) gVar;
                    Context applicationContext2 = context.getApplicationContext();
                    m.a aVar4 = new m.a(aVar.f);
                    synchronized (com.amazon.aps.iva.k9.m.class) {
                        com.amazon.aps.iva.k9.m.a = aVar4;
                    }
                    int i2 = f.a;
                    com.amazon.aps.iva.o9.b bVar3 = new com.amazon.aps.iva.o9.b(applicationContext2, this);
                    com.amazon.aps.iva.u9.g.a(applicationContext2, SystemJobService.class, true);
                    com.amazon.aps.iva.k9.m.c().a(new Throwable[0]);
                    List<e> asList = Arrays.asList(bVar3, new com.amazon.aps.iva.m9.c(applicationContext2, aVar, bVar, this));
                    d dVar2 = new d(context, aVar, bVar, workDatabase, asList);
                    Context applicationContext3 = context.getApplicationContext();
                    this.a = applicationContext3;
                    this.b = aVar;
                    this.d = bVar;
                    this.c = workDatabase;
                    this.e = asList;
                    this.f = dVar2;
                    this.g = new com.amazon.aps.iva.u9.h(workDatabase);
                    this.h = false;
                    if (!applicationContext3.isDeviceProtectedStorage()) {
                        ((com.amazon.aps.iva.w9.b) this.d).a(new ForceStopRunnable(applicationContext3, this));
                        return;
                    }
                    throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
                } catch (ClassNotFoundException unused) {
                    throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str3 + " does not exist");
                } catch (IllegalAccessException unused2) {
                    throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
                } catch (InstantiationException unused3) {
                    throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
                }
            }
            throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
        }
        throw new IllegalArgumentException("Cannot provide null context for the database.");
    }

    public static k c(Context context) {
        k kVar;
        Object obj = l;
        synchronized (obj) {
            synchronized (obj) {
                kVar = j;
                if (kVar == null) {
                    kVar = k;
                }
            }
            return kVar;
        }
        if (kVar == null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof a.b) {
                d(applicationContext, ((a.b) applicationContext).a());
                kVar = c(applicationContext);
            } else {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
        }
        return kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (com.amazon.aps.iva.l9.k.k != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        com.amazon.aps.iva.l9.k.k = new com.amazon.aps.iva.l9.k(r4, r5, new com.amazon.aps.iva.w9.b(r5.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        com.amazon.aps.iva.l9.k.j = com.amazon.aps.iva.l9.k.k;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(android.content.Context r4, androidx.work.a r5) {
        /*
            java.lang.Object r0 = com.amazon.aps.iva.l9.k.l
            monitor-enter(r0)
            com.amazon.aps.iva.l9.k r1 = com.amazon.aps.iva.l9.k.j     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L14
            com.amazon.aps.iva.l9.k r2 = com.amazon.aps.iva.l9.k.k     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L32
            throw r4     // Catch: java.lang.Throwable -> L32
        L14:
            if (r1 != 0) goto L30
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L32
            com.amazon.aps.iva.l9.k r1 = com.amazon.aps.iva.l9.k.k     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L2c
            com.amazon.aps.iva.l9.k r1 = new com.amazon.aps.iva.l9.k     // Catch: java.lang.Throwable -> L32
            com.amazon.aps.iva.w9.b r2 = new com.amazon.aps.iva.w9.b     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.ExecutorService r3 = r5.b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L32
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L32
            com.amazon.aps.iva.l9.k.k = r1     // Catch: java.lang.Throwable -> L32
        L2c:
            com.amazon.aps.iva.l9.k r4 = com.amazon.aps.iva.l9.k.k     // Catch: java.lang.Throwable -> L32
            com.amazon.aps.iva.l9.k.j = r4     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.l9.k.d(android.content.Context, androidx.work.a):void");
    }

    public final p a(List<? extends v> list) {
        if (!list.isEmpty()) {
            return new g(this, null, com.amazon.aps.iva.k9.f.KEEP, list, 0).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public final p b(com.amazon.aps.iva.k9.f fVar, List list) {
        return new g(this, "DatadogUploadWorker", fVar, list).a();
    }

    public final void e() {
        synchronized (l) {
            this.h = true;
            BroadcastReceiver.PendingResult pendingResult = this.i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.i = null;
            }
        }
    }

    public final void f() {
        ArrayList c;
        Context context = this.a;
        int i = com.amazon.aps.iva.o9.b.f;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (c = com.amazon.aps.iva.o9.b.c(context, jobScheduler)) != null && !c.isEmpty()) {
            Iterator it = c.iterator();
            while (it.hasNext()) {
                com.amazon.aps.iva.o9.b.a(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        r rVar = (r) this.c.n();
        com.amazon.aps.iva.p8.g gVar = rVar.a;
        gVar.b();
        r.h hVar = rVar.i;
        com.amazon.aps.iva.v8.e a = hVar.a();
        gVar.c();
        try {
            a.k();
            gVar.h();
            gVar.f();
            hVar.c(a);
            f.a(this.b, this.c, this.e);
        } catch (Throwable th) {
            gVar.f();
            hVar.c(a);
            throw th;
        }
    }

    public final void g(String str, WorkerParameters.a aVar) {
        ((com.amazon.aps.iva.w9.b) this.d).a(new com.amazon.aps.iva.u9.k(this, str, aVar));
    }

    public final void h(String str) {
        ((com.amazon.aps.iva.w9.b) this.d).a(new com.amazon.aps.iva.u9.l(this, str, false));
    }
}
