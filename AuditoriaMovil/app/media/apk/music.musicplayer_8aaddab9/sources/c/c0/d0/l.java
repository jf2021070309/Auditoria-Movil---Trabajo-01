package c.c0.d0;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import c.c0.c;
import c.c0.d0.j;
import c.c0.r;
import c.c0.z;
import c.v.f;
import c.x.a.c;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class l extends z {
    public static l a;

    /* renamed from: b  reason: collision with root package name */
    public static l f1368b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f1369c;

    /* renamed from: d  reason: collision with root package name */
    public Context f1370d;

    /* renamed from: e  reason: collision with root package name */
    public c.c0.c f1371e;

    /* renamed from: f  reason: collision with root package name */
    public WorkDatabase f1372f;

    /* renamed from: g  reason: collision with root package name */
    public c.c0.d0.t.t.a f1373g;

    /* renamed from: h  reason: collision with root package name */
    public List<e> f1374h;

    /* renamed from: i  reason: collision with root package name */
    public d f1375i;

    /* renamed from: j  reason: collision with root package name */
    public c.c0.d0.t.h f1376j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1377k;

    /* renamed from: l  reason: collision with root package name */
    public BroadcastReceiver.PendingResult f1378l;

    static {
        r.e("WorkManagerImpl");
        a = null;
        f1368b = null;
        f1369c = new Object();
    }

    public l(Context context, c.c0.c cVar, c.c0.d0.t.t.a aVar) {
        f.a aVar2;
        Executor executor;
        String str;
        e eVar;
        char c2;
        char c3;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        c.c0.d0.t.j jVar = ((c.c0.d0.t.t.b) aVar).a;
        int i2 = WorkDatabase.f654k;
        if (z) {
            aVar2 = new f.a(applicationContext, WorkDatabase.class, null);
            aVar2.f2779h = true;
        } else {
            String str2 = k.a;
            aVar2 = new f.a(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            aVar2.f2778g = new h(applicationContext);
        }
        aVar2.f2776e = jVar;
        i iVar = new i();
        if (aVar2.f2775d == null) {
            aVar2.f2775d = new ArrayList<>();
        }
        aVar2.f2775d.add(iVar);
        aVar2.a(j.a);
        aVar2.a(new j.h(applicationContext, 2, 3));
        aVar2.a(j.f1359b);
        aVar2.a(j.f1360c);
        aVar2.a(new j.h(applicationContext, 5, 6));
        aVar2.a(j.f1361d);
        aVar2.a(j.f1362e);
        aVar2.a(j.f1363f);
        aVar2.a(new j.i(applicationContext));
        aVar2.a(new j.h(applicationContext, 10, 11));
        aVar2.a(j.f1364g);
        aVar2.f2781j = false;
        aVar2.f2782k = true;
        Context context2 = aVar2.f2774c;
        if (context2 == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
        if (aVar2.a == null) {
            throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
        }
        Executor executor2 = aVar2.f2776e;
        if (executor2 == null && aVar2.f2777f == null) {
            Executor executor3 = c.c.a.a.a.f1297b;
            aVar2.f2777f = executor3;
            aVar2.f2776e = executor3;
        } else if (executor2 != null && aVar2.f2777f == null) {
            aVar2.f2777f = executor2;
        } else if (executor2 == null && (executor = aVar2.f2777f) != null) {
            aVar2.f2776e = executor;
        }
        if (aVar2.f2778g == null) {
            aVar2.f2778g = new c.x.a.f.d();
        }
        String str3 = aVar2.f2773b;
        c.InterfaceC0058c interfaceC0058c = aVar2.f2778g;
        f.d dVar = aVar2.f2783l;
        ArrayList<f.b> arrayList = aVar2.f2775d;
        boolean z2 = aVar2.f2779h;
        f.c resolve = aVar2.f2780i.resolve(context2);
        Executor executor4 = aVar2.f2776e;
        c.v.a aVar3 = new c.v.a(context2, str3, interfaceC0058c, dVar, arrayList, z2, resolve, executor4, aVar2.f2777f, false, aVar2.f2781j, aVar2.f2782k, null, null, null);
        Class<T> cls = aVar2.a;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        canonicalName = name.isEmpty() ? canonicalName : canonicalName.substring(name.length() + 1);
        String str4 = canonicalName.replace(CoreConstants.DOT, '_') + "_Impl";
        try {
            if (name.isEmpty()) {
                str = str4;
            } else {
                str = name + "." + str4;
            }
            c.v.f fVar = (c.v.f) Class.forName(str).newInstance();
            c.x.a.c f2 = fVar.f(aVar3);
            fVar.f2766c = f2;
            if (f2 instanceof c.v.i) {
                ((c.v.i) f2).f2800f = aVar3;
            }
            boolean z3 = resolve == f.c.WRITE_AHEAD_LOGGING;
            f2.setWriteAheadLoggingEnabled(z3);
            fVar.f2770g = arrayList;
            fVar.f2765b = executor4;
            new ArrayDeque();
            fVar.f2768e = z2;
            fVar.f2769f = z3;
            WorkDatabase workDatabase = (WorkDatabase) fVar;
            Context applicationContext2 = context.getApplicationContext();
            r.a aVar4 = new r.a(cVar.f1321f);
            synchronized (r.class) {
                r.a = aVar4;
            }
            e[] eVarArr = new e[2];
            String str5 = f.a;
            if (Build.VERSION.SDK_INT >= 23) {
                eVar = new c.c0.d0.p.c.b(applicationContext2, this);
                c.c0.d0.t.g.a(applicationContext2, SystemJobService.class, true);
                r.c().a(f.a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
                c2 = 1;
                c3 = 0;
            } else {
                try {
                    eVar = (e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(applicationContext2);
                    r.c().a(f.a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
                } catch (Throwable th) {
                    r.c().a(f.a, "Unable to create GCM Scheduler", th);
                    eVar = null;
                }
                c2 = 1;
                c3 = 0;
                if (eVar == null) {
                    eVar = new c.c0.d0.p.b.f(applicationContext2);
                    c.c0.d0.t.g.a(applicationContext2, SystemAlarmService.class, true);
                    r.c().a(f.a, "Created SystemAlarmScheduler", new Throwable[0]);
                }
            }
            eVarArr[c3] = eVar;
            eVarArr[c2] = new c.c0.d0.p.a.c(applicationContext2, cVar, aVar, this);
            List<e> asList = Arrays.asList(eVarArr);
            d dVar2 = new d(context, cVar, aVar, workDatabase, asList);
            Context applicationContext3 = context.getApplicationContext();
            this.f1370d = applicationContext3;
            this.f1371e = cVar;
            this.f1373g = aVar;
            this.f1372f = workDatabase;
            this.f1374h = asList;
            this.f1375i = dVar2;
            this.f1376j = new c.c0.d0.t.h(workDatabase);
            this.f1377k = false;
            if (Build.VERSION.SDK_INT >= 24 && applicationContext3.isDeviceProtectedStorage()) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
            ((c.c0.d0.t.t.b) this.f1373g).a.execute(new ForceStopRunnable(applicationContext3, this));
        } catch (ClassNotFoundException unused) {
            StringBuilder y = e.a.d.a.a.y("cannot find implementation for ");
            y.append(cls.getCanonicalName());
            y.append(". ");
            y.append(str4);
            y.append(" does not exist");
            throw new RuntimeException(y.toString());
        } catch (IllegalAccessException unused2) {
            StringBuilder y2 = e.a.d.a.a.y("Cannot access the constructor");
            y2.append(cls.getCanonicalName());
            throw new RuntimeException(y2.toString());
        } catch (InstantiationException unused3) {
            StringBuilder y3 = e.a.d.a.a.y("Failed to create an instance of ");
            y3.append(cls.getCanonicalName());
            throw new RuntimeException(y3.toString());
        }
    }

    public static l c(Context context) {
        l lVar;
        Object obj = f1369c;
        synchronized (obj) {
            synchronized (obj) {
                lVar = a;
                if (lVar == null) {
                    lVar = f1368b;
                }
            }
            return lVar;
        }
        if (lVar == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof c.b)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            d(applicationContext, ((c.b) applicationContext).a());
            lVar = c(applicationContext);
        }
        return lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (c.c0.d0.l.f1368b != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        c.c0.d0.l.f1368b = new c.c0.d0.l(r4, r5, new c.c0.d0.t.t.b(r5.f1317b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        c.c0.d0.l.a = c.c0.d0.l.f1368b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(android.content.Context r4, c.c0.c r5) {
        /*
            java.lang.Object r0 = c.c0.d0.l.f1369c
            monitor-enter(r0)
            c.c0.d0.l r1 = c.c0.d0.l.a     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L14
            c.c0.d0.l r2 = c.c0.d0.l.f1368b     // Catch: java.lang.Throwable -> L32
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
            c.c0.d0.l r1 = c.c0.d0.l.f1368b     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L2c
            c.c0.d0.l r1 = new c.c0.d0.l     // Catch: java.lang.Throwable -> L32
            c.c0.d0.t.t.b r2 = new c.c0.d0.t.t.b     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.Executor r3 = r5.f1317b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L32
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L32
            c.c0.d0.l.f1368b = r1     // Catch: java.lang.Throwable -> L32
        L2c:
            c.c0.d0.l r4 = c.c0.d0.l.f1368b     // Catch: java.lang.Throwable -> L32
            c.c0.d0.l.a = r4     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c0.d0.l.d(android.content.Context, c.c0.c):void");
    }

    public void e() {
        synchronized (f1369c) {
            this.f1377k = true;
            BroadcastReceiver.PendingResult pendingResult = this.f1378l;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f1378l = null;
            }
        }
    }

    public void f() {
        List<JobInfo> f2;
        if (Build.VERSION.SDK_INT >= 23) {
            Context context = this.f1370d;
            String str = c.c0.d0.p.c.b.a;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (jobScheduler != null && (f2 = c.c0.d0.p.c.b.f(context, jobScheduler)) != null && !f2.isEmpty()) {
                for (JobInfo jobInfo : f2) {
                    c.c0.d0.p.c.b.b(jobScheduler, jobInfo.getId());
                }
            }
        }
        c.c0.d0.s.r rVar = (c.c0.d0.s.r) this.f1372f.q();
        rVar.a.b();
        c.x.a.f.f a2 = rVar.f1528i.a();
        rVar.a.c();
        try {
            a2.a();
            rVar.a.k();
            rVar.a.g();
            c.v.j jVar = rVar.f1528i;
            if (a2 == jVar.f2803c) {
                jVar.a.set(false);
            }
            f.a(this.f1371e, this.f1372f, this.f1374h);
        } catch (Throwable th) {
            rVar.a.g();
            rVar.f1528i.c(a2);
            throw th;
        }
    }

    public void g(String str) {
        c.c0.d0.t.t.a aVar = this.f1373g;
        ((c.c0.d0.t.t.b) aVar).a.execute(new c.c0.d0.t.l(this, str, false));
    }
}
