package c.c0.d0.p.c;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import c.c0.d0.e;
import c.c0.d0.l;
import c.c0.d0.s.g;
import c.c0.d0.s.i;
import c.c0.d0.s.p;
import c.c0.d0.t.f;
import c.c0.r;
import c.c0.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
/* loaded from: classes.dex */
public class b implements e {
    public static final String a = r.e("SystemJobScheduler");

    /* renamed from: b  reason: collision with root package name */
    public final Context f1445b;

    /* renamed from: c  reason: collision with root package name */
    public final JobScheduler f1446c;

    /* renamed from: d  reason: collision with root package name */
    public final l f1447d;

    /* renamed from: e  reason: collision with root package name */
    public final a f1448e;

    public b(Context context, l lVar) {
        a aVar = new a(context);
        this.f1445b = context;
        this.f1447d = lVar;
        this.f1446c = (JobScheduler) context.getSystemService("jobscheduler");
        this.f1448e = aVar;
    }

    public static void b(JobScheduler jobScheduler, int i2) {
        try {
            jobScheduler.cancel(i2);
        } catch (Throwable th) {
            r.c().b(a, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i2)), th);
        }
    }

    public static List<Integer> d(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> f2 = f(context, jobScheduler);
        if (f2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : f2) {
            if (str.equals(g(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static List<JobInfo> f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            r.c().b(a, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static String g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return extras.getString("EXTRA_WORK_SPEC_ID");
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // c.c0.d0.e
    public void a(p... pVarArr) {
        int b2;
        List<Integer> d2;
        int b3;
        WorkDatabase workDatabase = this.f1447d.f1372f;
        f fVar = new f(workDatabase);
        for (p pVar : pVarArr) {
            workDatabase.c();
            try {
                p i2 = ((c.c0.d0.s.r) workDatabase.q()).i(pVar.a);
                if (i2 == null) {
                    r.c().f(a, "Skipping scheduling " + pVar.a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.k();
                } else if (i2.f1507b != y.ENQUEUED) {
                    r.c().f(a, "Skipping scheduling " + pVar.a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.k();
                } else {
                    g a2 = ((i) workDatabase.n()).a(pVar.a);
                    if (a2 != null) {
                        b2 = a2.f1498b;
                    } else {
                        Objects.requireNonNull(this.f1447d.f1371e);
                        b2 = fVar.b(0, this.f1447d.f1371e.f1322g);
                    }
                    if (a2 == null) {
                        ((i) this.f1447d.f1372f.n()).b(new g(pVar.a, b2));
                    }
                    h(pVar, b2);
                    if (Build.VERSION.SDK_INT == 23 && (d2 = d(this.f1445b, this.f1446c, pVar.a)) != null) {
                        int indexOf = d2.indexOf(Integer.valueOf(b2));
                        if (indexOf >= 0) {
                            d2.remove(indexOf);
                        }
                        if (d2.isEmpty()) {
                            Objects.requireNonNull(this.f1447d.f1371e);
                            b3 = fVar.b(0, this.f1447d.f1371e.f1322g);
                        } else {
                            b3 = d2.get(0).intValue();
                        }
                        h(pVar, b3);
                    }
                    workDatabase.k();
                }
                workDatabase.g();
            } catch (Throwable th) {
                workDatabase.g();
                throw th;
            }
        }
    }

    @Override // c.c0.d0.e
    public boolean c() {
        return true;
    }

    @Override // c.c0.d0.e
    public void e(String str) {
        List<Integer> d2 = d(this.f1445b, this.f1446c, str);
        if (d2 == null || d2.isEmpty()) {
            return;
        }
        for (Integer num : d2) {
            b(this.f1446c, num.intValue());
        }
        ((i) this.f1447d.f1372f.n()).c(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
        if (r5 < 26) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(c.c0.d0.s.p r19, int r20) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c0.d0.p.c.b.h(c.c0.d0.s.p, int):void");
    }
}
