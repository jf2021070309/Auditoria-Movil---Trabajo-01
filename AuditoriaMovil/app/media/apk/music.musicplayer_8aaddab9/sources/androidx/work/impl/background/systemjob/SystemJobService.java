package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import c.c0.d0.b;
import c.c0.d0.d;
import c.c0.d0.l;
import c.c0.d0.t.k;
import c.c0.r;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements b {
    public static final String a = r.e("SystemJobService");

    /* renamed from: b  reason: collision with root package name */
    public l f664b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, JobParameters> f665c = new HashMap();

    public static String a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // c.c0.d0.b
    public void d(String str, boolean z) {
        JobParameters remove;
        r.c().a(a, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f665c) {
            remove = this.f665c.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            l c2 = l.c(getApplicationContext());
            this.f664b = c2;
            c2.f1375i.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            r.c().f(a, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        l lVar = this.f664b;
        if (lVar != null) {
            lVar.f1375i.e(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f664b == null) {
            r.c().a(a, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String a2 = a(jobParameters);
        if (TextUtils.isEmpty(a2)) {
            r.c().b(a, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f665c) {
            if (this.f665c.containsKey(a2)) {
                r.c().a(a, String.format("Job is already being executed by SystemJobService: %s", a2), new Throwable[0]);
                return false;
            }
            r.c().a(a, String.format("onStartJob for %s", a2), new Throwable[0]);
            this.f665c.put(a2, jobParameters);
            WorkerParameters.a aVar = null;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                aVar = new WorkerParameters.a();
                if (jobParameters.getTriggeredContentUris() != null) {
                    aVar.f651b = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    aVar.a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i2 >= 28) {
                    aVar.f652c = jobParameters.getNetwork();
                }
            }
            l lVar = this.f664b;
            ((c.c0.d0.t.t.b) lVar.f1373g).a.execute(new k(lVar, a2, aVar));
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.f664b == null) {
            r.c().a(a, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String a2 = a(jobParameters);
        if (TextUtils.isEmpty(a2)) {
            r.c().b(a, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        r.c().a(a, String.format("onStopJob for %s", a2), new Throwable[0]);
        synchronized (this.f665c) {
            this.f665c.remove(a2);
        }
        this.f664b.g(a2);
        d dVar = this.f664b.f1375i;
        synchronized (dVar.f1347l) {
            contains = dVar.f1345j.contains(a2);
        }
        return !contains;
    }
}
