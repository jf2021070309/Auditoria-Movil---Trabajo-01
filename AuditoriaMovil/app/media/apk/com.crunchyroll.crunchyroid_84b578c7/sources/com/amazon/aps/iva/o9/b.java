package com.amazon.aps.iva.o9;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.amazon.aps.iva.k9.c;
import com.amazon.aps.iva.k9.d;
import com.amazon.aps.iva.k9.m;
import com.amazon.aps.iva.k9.n;
import com.amazon.aps.iva.k9.q;
import com.amazon.aps.iva.k9.t;
import com.amazon.aps.iva.l9.e;
import com.amazon.aps.iva.l9.k;
import com.amazon.aps.iva.o9.a;
import com.amazon.aps.iva.t9.d;
import com.amazon.aps.iva.t9.g;
import com.amazon.aps.iva.t9.i;
import com.amazon.aps.iva.t9.p;
import com.amazon.aps.iva.t9.r;
import com.amazon.aps.iva.u9.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: SystemJobScheduler.java */
/* loaded from: classes.dex */
public final class b implements e {
    public static final /* synthetic */ int f = 0;
    public final Context b;
    public final JobScheduler c;
    public final k d;
    public final a e;

    static {
        m.e("SystemJobScheduler");
    }

    public b(Context context, k kVar) {
        a aVar = new a(context);
        this.b = context;
        this.d = kVar;
        this.c = (JobScheduler) context.getSystemService("jobscheduler");
        this.e = aVar;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            m c = m.c();
            String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i));
            c.b(th);
        }
    }

    public static ArrayList c(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            m.c().b(th);
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

    /* JADX WARN: Removed duplicated region for block: B:31:0x003c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0016 A[SYNTHETIC] */
    @Override // com.amazon.aps.iva.l9.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r9) {
        /*
            r8 = this;
            android.content.Context r0 = r8.b
            android.app.job.JobScheduler r1 = r8.c
            java.util.ArrayList r0 = c(r0, r1)
            r2 = 0
            if (r0 != 0) goto Lc
            goto L49
        Lc:
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 2
            r3.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r0.next()
            android.app.job.JobInfo r4 = (android.app.job.JobInfo) r4
            java.lang.String r5 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r6 = r4.getExtras()
            if (r6 == 0) goto L35
            boolean r7 = r6.containsKey(r5)     // Catch: java.lang.NullPointerException -> L35
            if (r7 == 0) goto L35
            java.lang.String r5 = r6.getString(r5)     // Catch: java.lang.NullPointerException -> L35
            goto L36
        L35:
            r5 = r2
        L36:
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L16
            int r4 = r4.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            goto L16
        L48:
            r2 = r3
        L49:
            if (r2 == 0) goto L76
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L76
            java.util.Iterator r0 = r2.iterator()
        L55:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r2 = r0.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            a(r1, r2)
            goto L55
        L69:
            com.amazon.aps.iva.l9.k r0 = r8.d
            androidx.work.impl.WorkDatabase r0 = r0.c
            com.amazon.aps.iva.t9.h r0 = r0.k()
            com.amazon.aps.iva.t9.i r0 = (com.amazon.aps.iva.t9.i) r0
            r0.b(r9)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o9.b.b(java.lang.String):void");
    }

    @Override // com.amazon.aps.iva.l9.e
    public final boolean d() {
        return true;
    }

    @Override // com.amazon.aps.iva.l9.e
    public final void e(p... pVarArr) {
        int i;
        int i2;
        int i3;
        int i4;
        k kVar = this.d;
        WorkDatabase workDatabase = kVar.c;
        int length = pVarArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i6 < length) {
            p pVar = pVarArr[i6];
            workDatabase.c();
            try {
                p i7 = ((r) workDatabase.n()).i(pVar.a);
                if (i7 == null) {
                    m.c().f(new Throwable[i5]);
                    workDatabase.h();
                } else if (i7.b != t.ENQUEUED) {
                    m.c().f(new Throwable[i5]);
                    workDatabase.h();
                } else {
                    g a = ((i) workDatabase.k()).a(pVar.a);
                    if (a != null) {
                        i4 = a.b;
                        i3 = i6;
                    } else {
                        kVar.b.getClass();
                        int i8 = kVar.b.g;
                        synchronized (f.class) {
                            workDatabase.c();
                            Long a2 = ((com.amazon.aps.iva.t9.f) workDatabase.j()).a("next_job_scheduler_id");
                            if (a2 != null) {
                                i = a2.intValue();
                            } else {
                                i = i5;
                            }
                            if (i == Integer.MAX_VALUE) {
                                i2 = i5;
                            } else {
                                i2 = i + 1;
                            }
                            i3 = i6;
                            ((com.amazon.aps.iva.t9.f) workDatabase.j()).b(new d("next_job_scheduler_id", i2));
                            workDatabase.h();
                            workDatabase.f();
                            if (i >= 0 && i <= i8) {
                                i4 = i;
                            }
                            ((com.amazon.aps.iva.t9.f) workDatabase.j()).b(new d("next_job_scheduler_id", 1));
                            i4 = 0;
                        }
                    }
                    if (a == null) {
                        g gVar = new g(pVar.a, i4);
                        i iVar = (i) kVar.c.k();
                        com.amazon.aps.iva.p8.g gVar2 = iVar.a;
                        gVar2.b();
                        gVar2.c();
                        iVar.b.e(gVar);
                        gVar2.h();
                        gVar2.f();
                    }
                    f(pVar, i4);
                    workDatabase.h();
                    workDatabase.f();
                    i6 = i3 + 1;
                    i5 = 0;
                }
                i3 = i6;
                workDatabase.f();
                i6 = i3 + 1;
                i5 = 0;
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
    }

    public final void f(p pVar, int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        int i3;
        int i4;
        JobScheduler jobScheduler = this.c;
        a aVar = this.e;
        aVar.getClass();
        c cVar = pVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.c());
        JobInfo.Builder extras = new JobInfo.Builder(i, aVar.a).setRequiresCharging(cVar.b).setRequiresDeviceIdle(cVar.c).setExtras(persistableBundle);
        n nVar = cVar.a;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30 && nVar == n.TEMPORARILY_UNMETERED) {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            int i6 = a.C0560a.a[nVar.ordinal()];
            if (i6 != 1) {
                int i7 = 2;
                if (i6 != 2) {
                    i2 = 3;
                    if (i6 != 3) {
                        i7 = 4;
                        if (i6 != 4) {
                            if (i6 != 5) {
                                m c = m.c();
                                String.format("API version too low. Cannot convert network type value %s", nVar);
                                int i8 = a.b;
                                c.a(new Throwable[0]);
                            }
                        }
                    }
                    i2 = i7;
                }
                i2 = 1;
            } else {
                i2 = 0;
            }
            extras.setRequiredNetworkType(i2);
        }
        if (!cVar.c) {
            if (pVar.l == com.amazon.aps.iva.k9.a.LINEAR) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            extras.setBackoffCriteria(pVar.m, i4);
        }
        long max = Math.max(pVar.a() - System.currentTimeMillis(), 0L);
        if (i5 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.q) {
            extras.setImportantWhileForeground(true);
        }
        if (cVar.h.a.size() > 0) {
            objArr = 1;
        } else {
            objArr = null;
        }
        if (objArr != null) {
            Iterator it = cVar.h.a.iterator();
            while (it.hasNext()) {
                d.a aVar2 = (d.a) it.next();
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(aVar2.a, aVar2.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(cVar.f);
            extras.setTriggerContentMaxDelay(cVar.g);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(cVar.d);
        extras.setRequiresStorageNotLow(cVar.e);
        if (pVar.k > 0) {
            objArr2 = 1;
        } else {
            objArr2 = null;
        }
        if (max > 0) {
            objArr3 = 1;
        } else {
            objArr3 = null;
        }
        if (com.amazon.aps.iva.k3.a.b() && pVar.q && objArr2 == null && objArr3 == null) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        m c2 = m.c();
        String.format("Scheduling work ID %s Job ID %s", pVar.a, Integer.valueOf(i));
        c2.a(new Throwable[0]);
        try {
            if (jobScheduler.schedule(build) == 0) {
                m c3 = m.c();
                String.format("Unable to schedule work ID %s", pVar.a);
                c3.f(new Throwable[0]);
                if (pVar.q && pVar.r == q.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.q = false;
                    String.format("Scheduling a non-expedited job (work ID %s)", pVar.a);
                    m.c().a(new Throwable[0]);
                    f(pVar, i);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList c4 = c(this.b, jobScheduler);
            if (c4 != null) {
                i3 = c4.size();
            } else {
                i3 = 0;
            }
            Locale locale = Locale.getDefault();
            Integer valueOf = Integer.valueOf(i3);
            k kVar = this.d;
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", valueOf, Integer.valueOf(((r) kVar.c.n()).e().size()), Integer.valueOf(kVar.b.h));
            m.c().b(new Throwable[0]);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            m c5 = m.c();
            String.format("Unable to schedule %s", pVar);
            c5.b(th);
        }
    }
}
