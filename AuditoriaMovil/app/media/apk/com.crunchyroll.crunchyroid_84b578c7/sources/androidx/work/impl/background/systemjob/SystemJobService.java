package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import com.amazon.aps.iva.k9.m;
import com.amazon.aps.iva.l9.b;
import com.amazon.aps.iva.l9.d;
import com.amazon.aps.iva.l9.k;
import java.util.HashMap;
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements b {
    public k b;
    public final HashMap c = new HashMap();

    static {
        m.e("SystemJobService");
    }

    @Override // com.amazon.aps.iva.l9.b
    public final void f(String str, boolean z) {
        JobParameters jobParameters;
        m c = m.c();
        String.format("%s executed on JobScheduler", str);
        c.a(new Throwable[0]);
        synchronized (this.c) {
            jobParameters = (JobParameters) this.c.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            k c = k.c(getApplicationContext());
            this.b = c;
            c.f.a(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                m.c().f(new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        k kVar = this.b;
        if (kVar != null) {
            d dVar = kVar.f;
            synchronized (dVar.l) {
                dVar.k.remove(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStartJob(android.app.job.JobParameters r8) {
        /*
            r7 = this;
            com.amazon.aps.iva.l9.k r0 = r7.b
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            com.amazon.aps.iva.k9.m r0 = com.amazon.aps.iva.k9.m.c()
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r0.a(r3)
            r7.jobFinished(r8, r1)
            return r2
        L13:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r3 = r8.getExtras()     // Catch: java.lang.NullPointerException -> L26
            if (r3 == 0) goto L26
            boolean r4 = r3.containsKey(r0)     // Catch: java.lang.NullPointerException -> L26
            if (r4 == 0) goto L26
            java.lang.String r0 = r3.getString(r0)     // Catch: java.lang.NullPointerException -> L26
            goto L27
        L26:
            r0 = 0
        L27:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L37
            com.amazon.aps.iva.k9.m r8 = com.amazon.aps.iva.k9.m.c()
            java.lang.Throwable[] r0 = new java.lang.Throwable[r2]
            r8.b(r0)
            return r2
        L37:
            java.util.HashMap r3 = r7.c
            monitor-enter(r3)
            java.util.HashMap r4 = r7.c     // Catch: java.lang.Throwable -> La5
            boolean r4 = r4.containsKey(r0)     // Catch: java.lang.Throwable -> La5
            if (r4 == 0) goto L56
            com.amazon.aps.iva.k9.m r8 = com.amazon.aps.iva.k9.m.c()     // Catch: java.lang.Throwable -> La5
            java.lang.String r1 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> La5
            java.lang.String.format(r1, r0)     // Catch: java.lang.Throwable -> La5
            java.lang.Throwable[] r0 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> La5
            r8.a(r0)     // Catch: java.lang.Throwable -> La5
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La5
            return r2
        L56:
            com.amazon.aps.iva.k9.m r4 = com.amazon.aps.iva.k9.m.c()     // Catch: java.lang.Throwable -> La5
            java.lang.String r5 = "onStartJob for %s"
            java.lang.Object[] r6 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> La5
            java.lang.String.format(r5, r6)     // Catch: java.lang.Throwable -> La5
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> La5
            r4.a(r2)     // Catch: java.lang.Throwable -> La5
            java.util.HashMap r2 = r7.c     // Catch: java.lang.Throwable -> La5
            r2.put(r0, r8)     // Catch: java.lang.Throwable -> La5
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La5
            int r2 = android.os.Build.VERSION.SDK_INT
            androidx.work.WorkerParameters$a r3 = new androidx.work.WorkerParameters$a
            r3.<init>()
            android.net.Uri[] r4 = r8.getTriggeredContentUris()
            if (r4 == 0) goto L85
            android.net.Uri[] r4 = r8.getTriggeredContentUris()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.b = r4
        L85:
            java.lang.String[] r4 = r8.getTriggeredContentAuthorities()
            if (r4 == 0) goto L95
            java.lang.String[] r4 = r8.getTriggeredContentAuthorities()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.a = r4
        L95:
            r4 = 28
            if (r2 < r4) goto L9f
            android.net.Network r8 = com.amazon.aps.iva.n3.c.a(r8)
            r3.c = r8
        L9f:
            com.amazon.aps.iva.l9.k r8 = r7.b
            r8.g(r0, r3)
            return r1
        La5:
            r8 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La5
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStopJob(android.app.job.JobParameters r6) {
        /*
            r5 = this;
            com.amazon.aps.iva.l9.k r0 = r5.b
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L10
            com.amazon.aps.iva.k9.m r6 = com.amazon.aps.iva.k9.m.c()
            java.lang.Throwable[] r0 = new java.lang.Throwable[r2]
            r6.a(r0)
            return r1
        L10:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r6 = r6.getExtras()     // Catch: java.lang.NullPointerException -> L23
            if (r6 == 0) goto L23
            boolean r3 = r6.containsKey(r0)     // Catch: java.lang.NullPointerException -> L23
            if (r3 == 0) goto L23
            java.lang.String r6 = r6.getString(r0)     // Catch: java.lang.NullPointerException -> L23
            goto L24
        L23:
            r6 = 0
        L24:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L34
            com.amazon.aps.iva.k9.m r6 = com.amazon.aps.iva.k9.m.c()
            java.lang.Throwable[] r0 = new java.lang.Throwable[r2]
            r6.b(r0)
            return r2
        L34:
            com.amazon.aps.iva.k9.m r0 = com.amazon.aps.iva.k9.m.c()
            java.lang.String r3 = "onStopJob for %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r6}
            java.lang.String.format(r3, r4)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r0.a(r2)
            java.util.HashMap r0 = r5.c
            monitor-enter(r0)
            java.util.HashMap r2 = r5.c     // Catch: java.lang.Throwable -> L67
            r2.remove(r6)     // Catch: java.lang.Throwable -> L67
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            com.amazon.aps.iva.l9.k r0 = r5.b
            r0.h(r6)
            com.amazon.aps.iva.l9.k r0 = r5.b
            com.amazon.aps.iva.l9.d r0 = r0.f
            java.lang.Object r2 = r0.l
            monitor-enter(r2)
            java.util.HashSet r0 = r0.j     // Catch: java.lang.Throwable -> L64
            boolean r6 = r0.contains(r6)     // Catch: java.lang.Throwable -> L64
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L64
            r6 = r6 ^ r1
            return r6
        L64:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L64
            throw r6
        L67:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStopJob(android.app.job.JobParameters):boolean");
    }
}
