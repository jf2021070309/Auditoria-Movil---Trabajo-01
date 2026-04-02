package com.amazon.aps.iva.n6;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.p;
/* compiled from: PlatformScheduler.java */
/* loaded from: classes.dex */
public final class a implements d {
    public static final int d;
    public final int a;
    public final ComponentName b;
    public final JobScheduler c;

    /* compiled from: PlatformScheduler.java */
    /* renamed from: com.amazon.aps.iva.n6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class job.JobServiceC0530a extends JobService {
        @Override // android.app.job.JobService
        public final boolean onStartJob(JobParameters jobParameters) {
            PersistableBundle extras = jobParameters.getExtras();
            if (new b(extras.getInt("requirements")).a(this) == 0) {
                String string = extras.getString("service_action");
                string.getClass();
                String string2 = extras.getString("service_package");
                string2.getClass();
                Intent intent = new Intent(string).setPackage(string2);
                if (g0.a >= 26) {
                    startForegroundService(intent);
                    return false;
                }
                startService(intent);
                return false;
            }
            p.g();
            jobFinished(jobParameters, true);
            return false;
        }

        @Override // android.app.job.JobService
        public final boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    static {
        int i;
        if (g0.a >= 26) {
            i = 16;
        } else {
            i = 0;
        }
        d = i | 15;
    }

    public a(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = 567;
        this.b = new ComponentName(applicationContext, job.JobServiceC0530a.class);
        JobScheduler jobScheduler = (JobScheduler) applicationContext.getSystemService("jobscheduler");
        jobScheduler.getClass();
        this.c = jobScheduler;
    }

    @Override // com.amazon.aps.iva.n6.d
    public final boolean a(b bVar, String str) {
        b bVar2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i = bVar.b;
        int i2 = d & i;
        if (i2 == i) {
            bVar2 = bVar;
        } else {
            bVar2 = new b(i2);
        }
        if (!bVar2.equals(bVar)) {
            p.g();
        }
        JobInfo.Builder builder = new JobInfo.Builder(this.a, this.b);
        int i3 = bVar.b;
        if ((i3 & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            builder.setRequiredNetworkType(2);
        } else {
            if ((i3 & 1) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                builder.setRequiredNetworkType(1);
            }
        }
        if ((i3 & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        builder.setRequiresDeviceIdle(z3);
        if ((i3 & 8) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        builder.setRequiresCharging(z4);
        if (g0.a >= 26) {
            if ((i3 & 16) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                builder.setRequiresStorageNotLow(true);
            }
        }
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("service_action", "androidx.media3.exoplayer.downloadService.action.RESTART");
        persistableBundle.putString("service_package", str);
        persistableBundle.putInt("requirements", i3);
        builder.setExtras(persistableBundle);
        if (this.c.schedule(builder.build()) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.n6.d
    public final b b(b bVar) {
        int i = bVar.b;
        int i2 = d & i;
        if (i2 != i) {
            return new b(i2);
        }
        return bVar;
    }

    @Override // com.amazon.aps.iva.n6.d
    public final void cancel() {
        this.c.cancel(this.a);
    }
}
