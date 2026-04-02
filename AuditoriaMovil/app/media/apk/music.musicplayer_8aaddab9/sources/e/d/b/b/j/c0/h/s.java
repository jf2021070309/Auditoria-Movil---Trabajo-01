package e.d.b.b.j.c0.h;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import e.d.b.b.j.c0.h.t;
import e.d.b.b.j.c0.i.a0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
/* loaded from: classes.dex */
public class s implements y {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f6182b;

    /* renamed from: c  reason: collision with root package name */
    public final t f6183c;

    public s(Context context, a0 a0Var, t tVar) {
        this.a = context;
        this.f6182b = a0Var;
        this.f6183c = tVar;
    }

    @Override // e.d.b.b.j.c0.h.y
    public void a(e.d.b.b.j.r rVar, int i2) {
        b(rVar, i2, false);
    }

    @Override // e.d.b.b.j.c0.h.y
    public void b(e.d.b.b.j.r rVar, int i2, boolean z) {
        boolean z2;
        ComponentName componentName = new ComponentName(this.a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.a.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(rVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(e.d.b.b.j.f0.a.a(rVar.d())).array());
        if (rVar.c() != null) {
            adler32.update(rVar.c());
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i3 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i3 >= i2) {
                        z2 = true;
                    }
                }
            }
            z2 = false;
            if (z2) {
                c.t.m.g("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", rVar);
                return;
            }
        }
        long R = this.f6182b.R(rVar);
        t tVar = this.f6183c;
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        e.d.b.b.d d2 = rVar.d();
        builder.setMinimumLatency(tVar.b(d2, R, i2));
        Set<t.b> c2 = tVar.c().get(d2).c();
        if (c2.contains(t.b.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (c2.contains(t.b.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (c2.contains(t.b.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i2);
        persistableBundle.putString("backendName", rVar.b());
        persistableBundle.putInt("priority", e.d.b.b.j.f0.a.a(rVar.d()));
        if (rVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(rVar.c(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {rVar, Integer.valueOf(value), Long.valueOf(this.f6183c.b(rVar.d(), R, i2)), Long.valueOf(R), Integer.valueOf(i2)};
        c.t.m.m("JobInfoScheduler");
        String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
        jobScheduler.schedule(builder.build());
    }
}
