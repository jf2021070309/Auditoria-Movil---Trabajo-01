package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.Utils;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class o {
    private boolean A;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.m f4046b;

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.sdk.v f4047c;
    private final ScheduledThreadPoolExecutor v;
    private final ScheduledThreadPoolExecutor w;
    private final ScheduledThreadPoolExecutor x;
    private final String a = "TaskManager";
    private final List<c> y = new ArrayList(5);
    private final Object z = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f4048d = a("main");

    /* renamed from: e  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f4049e = a("timeout");

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f4050f = a("back");

    /* renamed from: g  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f4051g = a("advertising_info_collection");

    /* renamed from: h  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f4052h = a("postbacks");

    /* renamed from: i  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f4053i = a("caching_interstitial");

    /* renamed from: j  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f4054j = a("caching_incentivized");

    /* renamed from: k  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f4055k = a("caching_other");

    /* renamed from: l  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f4056l = a("reward");

    /* renamed from: m  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f4057m = a("mediation_main");

    /* renamed from: n  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f4058n = a("mediation_timeout");
    private final ScheduledThreadPoolExecutor o = a("mediation_background");
    private final ScheduledThreadPoolExecutor p = a("mediation_postbacks");
    private final ScheduledThreadPoolExecutor q = a("mediation_banner");
    private final ScheduledThreadPoolExecutor r = a("mediation_interstitial");
    private final ScheduledThreadPoolExecutor s = a("mediation_incentivized");
    private final ScheduledThreadPoolExecutor t = a("mediation_rewarded_interstitial");
    private final ScheduledThreadPoolExecutor u = a("mediation_reward");

    /* loaded from: classes.dex */
    public enum a {
        MAIN,
        TIMEOUT,
        BACKGROUND,
        ADVERTISING_INFO_COLLECTION,
        POSTBACKS,
        CACHING_INTERSTITIAL,
        CACHING_INCENTIVIZED,
        CACHING_OTHER,
        REWARD,
        MEDIATION_MAIN,
        MEDIATION_TIMEOUT,
        MEDIATION_BACKGROUND,
        MEDIATION_POSTBACKS,
        MEDIATION_BANNER,
        MEDIATION_INTERSTITIAL,
        MEDIATION_INCENTIVIZED,
        MEDIATION_REWARDED_INTERSTITIAL,
        MEDIATION_REWARD
    }

    /* loaded from: classes.dex */
    public class b implements ThreadFactory {

        /* renamed from: b  reason: collision with root package name */
        private final String f4074b;

        public b(String str) {
            this.f4074b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder y = e.a.d.a.a.y("AppLovinSdk:");
            y.append(this.f4074b);
            y.append(":");
            y.append(Utils.shortenKey(o.this.f4046b.z()));
            Thread thread = new Thread(runnable, y.toString());
            thread.setDaemon(true);
            thread.setPriority(10);
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.applovin.impl.sdk.e.o.b.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread2, Throwable th) {
                    o.this.f4047c.b("TaskManager", "Caught unhandled exception", th);
                }
            });
            return thread;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final String f4075b;

        /* renamed from: c  reason: collision with root package name */
        private final com.applovin.impl.sdk.e.a f4076c;

        /* renamed from: d  reason: collision with root package name */
        private final a f4077d;

        public c(com.applovin.impl.sdk.e.a aVar, a aVar2) {
            this.f4075b = aVar.e();
            this.f4076c = aVar;
            this.f4077d = aVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            long a;
            com.applovin.impl.sdk.v vVar;
            StringBuilder sb;
            try {
                com.applovin.impl.sdk.utils.g.a();
            } catch (Throwable th) {
                try {
                    o.this.f4047c.b(this.f4076c.e(), "Task failed execution", th);
                    a = o.this.a(this.f4077d) - 1;
                    vVar = o.this.f4047c;
                    sb = new StringBuilder();
                } catch (Throwable th2) {
                    com.applovin.impl.sdk.v vVar2 = o.this.f4047c;
                    vVar2.c("TaskManager", this.f4077d + " queue finished task " + this.f4076c.e() + " with queue size " + (o.this.a(this.f4077d) - 1));
                    throw th2;
                }
            }
            if (o.this.f4046b.c() && !this.f4076c.g()) {
                o.this.f4047c.c(this.f4075b, "Task re-scheduled...");
                o.this.a(this.f4076c, this.f4077d, 2000L);
                a = o.this.a(this.f4077d) - 1;
                vVar = o.this.f4047c;
                sb = new StringBuilder();
                sb.append(this.f4077d);
                sb.append(" queue finished task ");
                sb.append(this.f4076c.e());
                sb.append(" with queue size ");
                sb.append(a);
                vVar.c("TaskManager", sb.toString());
            }
            this.f4076c.run();
            a = o.this.a(this.f4077d) - 1;
            vVar = o.this.f4047c;
            sb = new StringBuilder();
            sb.append(this.f4077d);
            sb.append(" queue finished task ");
            sb.append(this.f4076c.e());
            sb.append(" with queue size ");
            sb.append(a);
            vVar.c("TaskManager", sb.toString());
        }
    }

    public o(com.applovin.impl.sdk.m mVar) {
        this.f4046b = mVar;
        this.f4047c = mVar.B();
        this.v = a("auxiliary_operations", ((Integer) mVar.a(com.applovin.impl.sdk.c.b.ci)).intValue());
        this.w = a("caching_operations", ((Integer) mVar.a(com.applovin.impl.sdk.c.b.cj)).intValue());
        this.x = a("shared_thread_pool", ((Integer) mVar.a(com.applovin.impl.sdk.c.b.as)).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a(a aVar) {
        long taskCount;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        if (aVar == a.MAIN) {
            taskCount = this.f4048d.getTaskCount();
            scheduledThreadPoolExecutor = this.f4048d;
        } else if (aVar == a.TIMEOUT) {
            taskCount = this.f4049e.getTaskCount();
            scheduledThreadPoolExecutor = this.f4049e;
        } else if (aVar == a.BACKGROUND) {
            taskCount = this.f4050f.getTaskCount();
            scheduledThreadPoolExecutor = this.f4050f;
        } else if (aVar == a.ADVERTISING_INFO_COLLECTION) {
            taskCount = this.f4051g.getTaskCount();
            scheduledThreadPoolExecutor = this.f4051g;
        } else if (aVar == a.POSTBACKS) {
            taskCount = this.f4052h.getTaskCount();
            scheduledThreadPoolExecutor = this.f4052h;
        } else if (aVar == a.CACHING_INTERSTITIAL) {
            taskCount = this.f4053i.getTaskCount();
            scheduledThreadPoolExecutor = this.f4053i;
        } else if (aVar == a.CACHING_INCENTIVIZED) {
            taskCount = this.f4054j.getTaskCount();
            scheduledThreadPoolExecutor = this.f4054j;
        } else if (aVar == a.CACHING_OTHER) {
            taskCount = this.f4055k.getTaskCount();
            scheduledThreadPoolExecutor = this.f4055k;
        } else if (aVar == a.REWARD) {
            taskCount = this.f4056l.getTaskCount();
            scheduledThreadPoolExecutor = this.f4056l;
        } else if (aVar == a.MEDIATION_MAIN) {
            taskCount = this.f4057m.getTaskCount();
            scheduledThreadPoolExecutor = this.f4057m;
        } else if (aVar == a.MEDIATION_TIMEOUT) {
            taskCount = this.f4058n.getTaskCount();
            scheduledThreadPoolExecutor = this.f4058n;
        } else if (aVar == a.MEDIATION_BACKGROUND) {
            taskCount = this.o.getTaskCount();
            scheduledThreadPoolExecutor = this.o;
        } else if (aVar == a.MEDIATION_POSTBACKS) {
            taskCount = this.p.getTaskCount();
            scheduledThreadPoolExecutor = this.p;
        } else if (aVar == a.MEDIATION_BANNER) {
            taskCount = this.q.getTaskCount();
            scheduledThreadPoolExecutor = this.q;
        } else if (aVar == a.MEDIATION_INTERSTITIAL) {
            taskCount = this.r.getTaskCount();
            scheduledThreadPoolExecutor = this.r;
        } else if (aVar == a.MEDIATION_INCENTIVIZED) {
            taskCount = this.s.getTaskCount();
            scheduledThreadPoolExecutor = this.s;
        } else if (aVar == a.MEDIATION_REWARDED_INTERSTITIAL) {
            taskCount = this.t.getTaskCount();
            scheduledThreadPoolExecutor = this.t;
        } else if (aVar != a.MEDIATION_REWARD) {
            return 0L;
        } else {
            taskCount = this.u.getTaskCount();
            scheduledThreadPoolExecutor = this.u;
        }
        return taskCount - scheduledThreadPoolExecutor.getCompletedTaskCount();
    }

    private ScheduledThreadPoolExecutor a(String str) {
        return a(str, 1);
    }

    private ScheduledThreadPoolExecutor a(String str, int i2) {
        return new ScheduledThreadPoolExecutor(i2, new b(str));
    }

    private void a(final Runnable runnable, long j2, final ScheduledExecutorService scheduledExecutorService, boolean z) {
        if (j2 <= 0) {
            scheduledExecutorService.submit(runnable);
        } else if (z) {
            com.applovin.impl.sdk.utils.e.a(j2, this.f4046b, new Runnable() { // from class: com.applovin.impl.sdk.e.o.1
                @Override // java.lang.Runnable
                public void run() {
                    scheduledExecutorService.execute(runnable);
                }
            });
        } else {
            scheduledExecutorService.schedule(runnable, j2, TimeUnit.MILLISECONDS);
        }
    }

    private boolean a(c cVar) {
        if (cVar.f4076c.g()) {
            return false;
        }
        synchronized (this.z) {
            if (this.A) {
                return false;
            }
            this.y.add(cVar);
            return true;
        }
    }

    public void a(com.applovin.impl.sdk.e.a aVar) {
        if (aVar == null) {
            this.f4047c.e("TaskManager", "Attempted to execute null task immediately");
            return;
        }
        try {
            aVar.run();
        } catch (Throwable th) {
            this.f4047c.b(aVar.e(), "Task failed execution", th);
        }
    }

    public void a(com.applovin.impl.sdk.e.a aVar, a aVar2) {
        a(aVar, aVar2, 0L);
    }

    public void a(com.applovin.impl.sdk.e.a aVar, a aVar2, long j2) {
        a(aVar, aVar2, j2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(com.applovin.impl.sdk.e.a aVar, a aVar2, long j2, boolean z) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2;
        c cVar;
        if (aVar == 0) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException(e.a.d.a.a.h("Invalid delay specified: ", j2));
        }
        c cVar2 = new c(aVar, aVar2);
        if (a(cVar2)) {
            this.f4047c.c(aVar.e(), "Task execution delayed until after init");
            return;
        }
        if (((Boolean) this.f4046b.a(com.applovin.impl.sdk.c.b.at)).booleanValue()) {
            cVar = aVar;
            scheduledThreadPoolExecutor2 = this.x;
        } else {
            com.applovin.impl.sdk.v vVar = this.f4047c;
            StringBuilder y = e.a.d.a.a.y("Scheduling ");
            y.append(aVar.e());
            y.append(" on ");
            y.append(aVar2);
            y.append(" queue in ");
            y.append(j2);
            y.append("ms with new queue size ");
            y.append(a(aVar2) + 1);
            vVar.b("TaskManager", y.toString());
            if (aVar2 == a.MAIN) {
                scheduledThreadPoolExecutor = this.f4048d;
            } else if (aVar2 == a.TIMEOUT) {
                scheduledThreadPoolExecutor = this.f4049e;
            } else if (aVar2 == a.BACKGROUND) {
                scheduledThreadPoolExecutor = this.f4050f;
            } else if (aVar2 == a.ADVERTISING_INFO_COLLECTION) {
                scheduledThreadPoolExecutor = this.f4051g;
            } else if (aVar2 == a.POSTBACKS) {
                scheduledThreadPoolExecutor = this.f4052h;
            } else if (aVar2 == a.CACHING_INTERSTITIAL) {
                scheduledThreadPoolExecutor = this.f4053i;
            } else if (aVar2 == a.CACHING_INCENTIVIZED) {
                scheduledThreadPoolExecutor = this.f4054j;
            } else if (aVar2 == a.CACHING_OTHER) {
                scheduledThreadPoolExecutor = this.f4055k;
            } else if (aVar2 == a.REWARD) {
                scheduledThreadPoolExecutor = this.f4056l;
            } else if (aVar2 == a.MEDIATION_MAIN) {
                scheduledThreadPoolExecutor = this.f4057m;
            } else if (aVar2 == a.MEDIATION_TIMEOUT) {
                scheduledThreadPoolExecutor = this.f4058n;
            } else if (aVar2 == a.MEDIATION_BACKGROUND) {
                scheduledThreadPoolExecutor = this.o;
            } else if (aVar2 == a.MEDIATION_POSTBACKS) {
                scheduledThreadPoolExecutor = this.p;
            } else if (aVar2 == a.MEDIATION_BANNER) {
                scheduledThreadPoolExecutor = this.q;
            } else if (aVar2 == a.MEDIATION_INTERSTITIAL) {
                scheduledThreadPoolExecutor = this.r;
            } else if (aVar2 == a.MEDIATION_INCENTIVIZED) {
                scheduledThreadPoolExecutor = this.s;
            } else if (aVar2 == a.MEDIATION_REWARDED_INTERSTITIAL) {
                scheduledThreadPoolExecutor = this.t;
            } else if (aVar2 != a.MEDIATION_REWARD) {
                return;
            } else {
                scheduledThreadPoolExecutor = this.u;
            }
            scheduledThreadPoolExecutor2 = scheduledThreadPoolExecutor;
            cVar = cVar2;
        }
        a(cVar, j2, scheduledThreadPoolExecutor2, z);
    }

    public boolean a() {
        return this.A;
    }

    public ScheduledExecutorService b() {
        return this.v;
    }

    public ScheduledExecutorService c() {
        return this.w;
    }

    public void d() {
        synchronized (this.z) {
            this.A = false;
        }
    }

    public void e() {
        synchronized (this.z) {
            this.A = true;
            for (c cVar : this.y) {
                a(cVar.f4076c, cVar.f4077d);
            }
            this.y.clear();
        }
    }
}
