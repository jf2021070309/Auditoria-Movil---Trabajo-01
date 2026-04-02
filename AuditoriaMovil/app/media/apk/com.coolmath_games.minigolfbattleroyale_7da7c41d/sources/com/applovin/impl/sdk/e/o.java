package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.Utils;
import com.facebook.internal.security.CertificateUtil;
import com.vungle.warren.AdLoader;
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
    private final com.applovin.impl.sdk.k b;
    private final com.applovin.impl.sdk.r c;
    private final ScheduledThreadPoolExecutor v;
    private final ScheduledThreadPoolExecutor w;
    private final ScheduledThreadPoolExecutor x;
    private final String a = "TaskManager";
    private final List<c> y = new ArrayList(5);
    private final Object z = new Object();
    private final ScheduledThreadPoolExecutor d = a("main");
    private final ScheduledThreadPoolExecutor e = a("timeout");
    private final ScheduledThreadPoolExecutor f = a("back");
    private final ScheduledThreadPoolExecutor g = a("advertising_info_collection");
    private final ScheduledThreadPoolExecutor h = a("postbacks");
    private final ScheduledThreadPoolExecutor i = a("caching_interstitial");
    private final ScheduledThreadPoolExecutor j = a("caching_incentivized");
    private final ScheduledThreadPoolExecutor k = a("caching_other");
    private final ScheduledThreadPoolExecutor l = a("reward");
    private final ScheduledThreadPoolExecutor m = a("mediation_main");
    private final ScheduledThreadPoolExecutor n = a("mediation_timeout");
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

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements ThreadFactory {
        private final String b;

        b(String str) {
            this.b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.b + CertificateUtil.DELIMITER + Utils.shortenKey(o.this.b.x()));
            thread.setDaemon(true);
            thread.setPriority(10);
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.applovin.impl.sdk.e.o.b.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread2, Throwable th) {
                    o.this.c.b("TaskManager", "Caught unhandled exception", th);
                }
            });
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        private final String b;
        private final com.applovin.impl.sdk.e.a c;
        private final a d;

        c(com.applovin.impl.sdk.e.a aVar, a aVar2) {
            this.b = aVar.e();
            this.c = aVar;
            this.d = aVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            long a;
            com.applovin.impl.sdk.r rVar;
            StringBuilder sb;
            try {
                com.applovin.impl.sdk.utils.f.a();
            } catch (Throwable th) {
                try {
                    o.this.c.b(this.c.e(), "Task failed execution", th);
                    a = o.this.a(this.d) - 1;
                    rVar = o.this.c;
                    sb = new StringBuilder();
                } catch (Throwable th2) {
                    com.applovin.impl.sdk.r rVar2 = o.this.c;
                    rVar2.c("TaskManager", this.d + " queue finished task " + this.c.e() + " with queue size " + (o.this.a(this.d) - 1));
                    throw th2;
                }
            }
            if (o.this.b.c() && !this.c.g()) {
                o.this.c.c(this.b, "Task re-scheduled...");
                o.this.a(this.c, this.d, AdLoader.RETRY_DELAY);
                a = o.this.a(this.d) - 1;
                rVar = o.this.c;
                sb = new StringBuilder();
                sb.append(this.d);
                sb.append(" queue finished task ");
                sb.append(this.c.e());
                sb.append(" with queue size ");
                sb.append(a);
                rVar.c("TaskManager", sb.toString());
            }
            this.c.run();
            a = o.this.a(this.d) - 1;
            rVar = o.this.c;
            sb = new StringBuilder();
            sb.append(this.d);
            sb.append(" queue finished task ");
            sb.append(this.c.e());
            sb.append(" with queue size ");
            sb.append(a);
            rVar.c("TaskManager", sb.toString());
        }
    }

    public o(com.applovin.impl.sdk.k kVar) {
        this.b = kVar;
        this.c = kVar.z();
        this.v = a("auxiliary_operations", ((Integer) kVar.a(com.applovin.impl.sdk.c.b.bT)).intValue());
        this.w = a("caching_operations", ((Integer) kVar.a(com.applovin.impl.sdk.c.b.bU)).intValue());
        this.x = a("shared_thread_pool", ((Integer) kVar.a(com.applovin.impl.sdk.c.b.al)).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a(a aVar) {
        long taskCount;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        if (aVar == a.MAIN) {
            taskCount = this.d.getTaskCount();
            scheduledThreadPoolExecutor = this.d;
        } else if (aVar == a.TIMEOUT) {
            taskCount = this.e.getTaskCount();
            scheduledThreadPoolExecutor = this.e;
        } else if (aVar == a.BACKGROUND) {
            taskCount = this.f.getTaskCount();
            scheduledThreadPoolExecutor = this.f;
        } else if (aVar == a.ADVERTISING_INFO_COLLECTION) {
            taskCount = this.g.getTaskCount();
            scheduledThreadPoolExecutor = this.g;
        } else if (aVar == a.POSTBACKS) {
            taskCount = this.h.getTaskCount();
            scheduledThreadPoolExecutor = this.h;
        } else if (aVar == a.CACHING_INTERSTITIAL) {
            taskCount = this.i.getTaskCount();
            scheduledThreadPoolExecutor = this.i;
        } else if (aVar == a.CACHING_INCENTIVIZED) {
            taskCount = this.j.getTaskCount();
            scheduledThreadPoolExecutor = this.j;
        } else if (aVar == a.CACHING_OTHER) {
            taskCount = this.k.getTaskCount();
            scheduledThreadPoolExecutor = this.k;
        } else if (aVar == a.REWARD) {
            taskCount = this.l.getTaskCount();
            scheduledThreadPoolExecutor = this.l;
        } else if (aVar == a.MEDIATION_MAIN) {
            taskCount = this.m.getTaskCount();
            scheduledThreadPoolExecutor = this.m;
        } else if (aVar == a.MEDIATION_TIMEOUT) {
            taskCount = this.n.getTaskCount();
            scheduledThreadPoolExecutor = this.n;
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

    private ScheduledThreadPoolExecutor a(String str, int i) {
        return new ScheduledThreadPoolExecutor(i, new b(str));
    }

    private void a(final Runnable runnable, long j, final ScheduledExecutorService scheduledExecutorService, boolean z) {
        if (j <= 0) {
            scheduledExecutorService.submit(runnable);
        } else if (z) {
            com.applovin.impl.sdk.utils.d.a(j, this.b, new Runnable() { // from class: com.applovin.impl.sdk.e.o.1
                @Override // java.lang.Runnable
                public void run() {
                    scheduledExecutorService.execute(runnable);
                }
            });
        } else {
            scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        }
    }

    private boolean a(c cVar) {
        if (cVar.c.g()) {
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
            this.c.e("TaskManager", "Attempted to execute null task immediately");
            return;
        }
        try {
            aVar.run();
        } catch (Throwable th) {
            this.c.b(aVar.e(), "Task failed execution", th);
        }
    }

    public void a(com.applovin.impl.sdk.e.a aVar, a aVar2) {
        a(aVar, aVar2, 0L);
    }

    public void a(com.applovin.impl.sdk.e.a aVar, a aVar2, long j) {
        a(aVar, aVar2, j, false);
    }

    public void a(com.applovin.impl.sdk.e.a aVar, a aVar2, long j, boolean z) {
        ScheduledExecutorService scheduledExecutorService;
        if (aVar == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j < 0) {
            throw new IllegalArgumentException("Invalid delay specified: " + j);
        }
        c cVar = new c(aVar, aVar2);
        if (a(cVar)) {
            this.c.c(aVar.e(), "Task execution delayed until after init");
        } else if (((Boolean) this.b.a(com.applovin.impl.sdk.c.b.am)).booleanValue()) {
            a(aVar, j, this.x, z);
        } else {
            com.applovin.impl.sdk.r rVar = this.c;
            rVar.b("TaskManager", "Scheduling " + aVar.e() + " on " + aVar2 + " queue in " + j + "ms with new queue size " + (a(aVar2) + 1));
            if (aVar2 == a.MAIN) {
                scheduledExecutorService = this.d;
            } else if (aVar2 == a.TIMEOUT) {
                scheduledExecutorService = this.e;
            } else if (aVar2 == a.BACKGROUND) {
                scheduledExecutorService = this.f;
            } else if (aVar2 == a.ADVERTISING_INFO_COLLECTION) {
                scheduledExecutorService = this.g;
            } else if (aVar2 == a.POSTBACKS) {
                scheduledExecutorService = this.h;
            } else if (aVar2 == a.CACHING_INTERSTITIAL) {
                scheduledExecutorService = this.i;
            } else if (aVar2 == a.CACHING_INCENTIVIZED) {
                scheduledExecutorService = this.j;
            } else if (aVar2 == a.CACHING_OTHER) {
                scheduledExecutorService = this.k;
            } else if (aVar2 == a.REWARD) {
                scheduledExecutorService = this.l;
            } else if (aVar2 == a.MEDIATION_MAIN) {
                scheduledExecutorService = this.m;
            } else if (aVar2 == a.MEDIATION_TIMEOUT) {
                scheduledExecutorService = this.n;
            } else if (aVar2 == a.MEDIATION_BACKGROUND) {
                scheduledExecutorService = this.o;
            } else if (aVar2 == a.MEDIATION_POSTBACKS) {
                scheduledExecutorService = this.p;
            } else if (aVar2 == a.MEDIATION_BANNER) {
                scheduledExecutorService = this.q;
            } else if (aVar2 == a.MEDIATION_INTERSTITIAL) {
                scheduledExecutorService = this.r;
            } else if (aVar2 == a.MEDIATION_INCENTIVIZED) {
                scheduledExecutorService = this.s;
            } else if (aVar2 == a.MEDIATION_REWARDED_INTERSTITIAL) {
                scheduledExecutorService = this.t;
            } else if (aVar2 != a.MEDIATION_REWARD) {
                return;
            } else {
                scheduledExecutorService = this.u;
            }
            a(cVar, j, scheduledExecutorService, z);
        }
    }

    public boolean a() {
        return this.A;
    }

    public ScheduledExecutorService b() {
        return this.v;
    }

    public void c() {
        synchronized (this.z) {
            this.A = false;
        }
    }

    public void d() {
        synchronized (this.z) {
            this.A = true;
            for (c cVar : this.y) {
                a(cVar.c, cVar.d);
            }
            this.y.clear();
        }
    }
}
