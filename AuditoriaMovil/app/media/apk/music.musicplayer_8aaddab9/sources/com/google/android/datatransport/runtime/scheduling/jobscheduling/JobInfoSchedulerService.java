package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import e.d.b.b.j.c0.h.d;
import e.d.b.b.j.c0.h.u;
import e.d.b.b.j.f0.a;
import e.d.b.b.j.j;
import e.d.b.b.j.r;
import e.d.b.b.j.v;
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i2 = jobParameters.getExtras().getInt("priority");
        int i3 = jobParameters.getExtras().getInt("attemptNumber");
        v.b(getApplicationContext());
        r.a a = r.a();
        a.b(string);
        a.c(a.b(i2));
        if (string2 != null) {
            ((j.b) a).f6266b = Base64.decode(string2, 0);
        }
        u uVar = v.a().f6290e;
        uVar.f6187e.execute(new d(uVar, a.a(), i3, new Runnable() { // from class: e.d.b.b.j.c0.h.c
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.jobFinished(jobParameters, false);
            }
        }));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
