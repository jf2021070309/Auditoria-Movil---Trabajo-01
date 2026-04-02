package e.b.a.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class f {
    public final r a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5303b;

    /* renamed from: d  reason: collision with root package name */
    public final e.b.a.a.z.c f5305d;

    /* renamed from: f  reason: collision with root package name */
    public final l f5307f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5308g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5309h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5310i;

    /* renamed from: m  reason: collision with root package name */
    public final e.b.a.a.c0.a f5314m;

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f5304c = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final CopyOnWriteArrayList<Runnable> f5306e = new CopyOnWriteArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public List<a> f5315n = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final int f5313l = 5;

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, i> f5311j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    public final ThreadGroup f5312k = new ThreadGroup("JobConsumers");

    /* loaded from: classes.dex */
    public static class a implements Runnable {
        public static final e.b.a.a.z.d a = new C0107a();

        /* renamed from: b  reason: collision with root package name */
        public final e.b.a.a.z.c f5316b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f5317c;

        /* renamed from: d  reason: collision with root package name */
        public volatile long f5318d;

        /* renamed from: e  reason: collision with root package name */
        public final e.b.a.a.z.h f5319e;

        /* renamed from: f  reason: collision with root package name */
        public final e.b.a.a.z.e f5320f;

        /* renamed from: g  reason: collision with root package name */
        public final e.b.a.a.c0.a f5321g;

        /* renamed from: h  reason: collision with root package name */
        public final e.b.a.a.z.f f5322h = new b();

        /* renamed from: e.b.a.a.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0107a implements e.b.a.a.z.d {
        }

        /* loaded from: classes.dex */
        public class b extends e.b.a.a.z.f {
            public b() {
            }

            @Override // e.b.a.a.z.f
            public void a(e.b.a.a.z.b bVar) {
                Throwable th;
                boolean z;
                boolean z2;
                boolean z3;
                int ordinal = bVar.f5400b.ordinal();
                int i2 = 3;
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return;
                    }
                    a aVar = a.this;
                    Objects.requireNonNull(aVar);
                    int i3 = ((e.b.a.a.z.k.e) bVar).f5427d;
                    if (i3 == 1) {
                        aVar.f5319e.e();
                        return;
                    } else if (i3 != 2) {
                        return;
                    } else {
                        e.b.a.a.y.c.a.a("Consumer has been poked.", new Object[0]);
                        return;
                    }
                }
                a aVar2 = a.this;
                e.b.a.a.z.k.i iVar = (e.b.a.a.z.k.i) bVar;
                Objects.requireNonNull(aVar2);
                e.b.a.a.y.c.a.a("running job %s", iVar.f5432d.getClass().getSimpleName());
                i iVar2 = iVar.f5432d;
                int i4 = iVar2.p;
                e.b.a.a.c0.a aVar3 = aVar2.f5321g;
                h hVar = iVar2.f5336e;
                Objects.requireNonNull(hVar);
                if (e.b.a.a.y.c.a()) {
                    e.b.a.a.y.c.a.a("running job %s", hVar.getClass().getSimpleName());
                }
                try {
                    hVar.h();
                    if (e.b.a.a.y.c.a()) {
                        e.b.a.a.y.c.a.a("finished job %s", hVar);
                    }
                    z3 = false;
                    z = false;
                    th = null;
                    z2 = false;
                } catch (Throwable th2) {
                    th = th2;
                    e.b.a.a.y.c.a.d(th, "error while executing job %s", hVar);
                    z = iVar2.f5339h && iVar2.f5343l <= aVar3.a();
                    z2 = i4 < 20 && !z;
                    if (z2 && !hVar.a) {
                        try {
                            q i5 = hVar.i(th, i4, 20);
                            if (i5 == null) {
                                i5 = q.a;
                            }
                            iVar2.f5338g = i5;
                            z2 = i5.f5381b;
                        } catch (Throwable th3) {
                            e.b.a.a.y.c.a.d(th3, "shouldReRunOnThrowable did throw an exception", new Object[0]);
                        }
                    }
                    z3 = true;
                }
                e.b.a.a.y.c.a.a("safeRunResult for %s : %s. re run:%s. cancelled: %s", hVar, Boolean.valueOf(!z3), Boolean.valueOf(z2), Boolean.valueOf(hVar.a));
                if (!z3) {
                    i2 = 1;
                } else if (iVar2.f5341j) {
                    i2 = 6;
                } else if (!iVar2.f5340i) {
                    if (z2) {
                        i2 = 4;
                    } else if (z) {
                        i2 = 7;
                    } else if (i4 < 20) {
                        iVar2.r = th;
                        i2 = 5;
                    } else {
                        iVar2.r = th;
                        i2 = 2;
                    }
                }
                e.b.a.a.z.k.j jVar = (e.b.a.a.z.k.j) aVar2.f5316b.a(e.b.a.a.z.k.j.class);
                jVar.f5433d = iVar2;
                jVar.f5434e = i2;
                jVar.f5435f = aVar2;
                aVar2.f5318d = aVar2.f5321g.a();
                aVar2.f5320f.a(jVar);
                e.b.a.a.z.h hVar2 = a.this.f5319e;
                synchronized (hVar2.f5409f) {
                    e.b.a.a.z.b bVar2 = hVar2.f5417d;
                    e.b.a.a.z.b bVar3 = null;
                    while (bVar2 != null) {
                        if (bVar2.f5400b == e.b.a.a.z.i.COMMAND && ((e.b.a.a.z.k.e) bVar2).f5427d == 2) {
                            e.b.a.a.z.b bVar4 = bVar2.f5401c;
                            if (hVar2.f5418e == bVar2) {
                                hVar2.f5418e = bVar3;
                            }
                            if (bVar3 == null) {
                                hVar2.f5417d = bVar4;
                            } else {
                                bVar3.f5401c = bVar4;
                            }
                            hVar2.f5416c.b(bVar2);
                            bVar2 = bVar4;
                        } else {
                            bVar3 = bVar2;
                            bVar2 = bVar2.f5401c;
                        }
                    }
                    e.b.a.a.z.a aVar4 = hVar2.f5410g;
                    e.b.a.a.z.b bVar5 = aVar4.f5399b;
                    e.b.a.a.z.b bVar6 = null;
                    while (bVar5 != null) {
                        boolean z4 = bVar5.f5400b == e.b.a.a.z.i.COMMAND && ((e.b.a.a.z.k.e) bVar5).f5427d == 2;
                        e.b.a.a.z.b bVar7 = bVar5.f5401c;
                        if (z4) {
                            if (bVar6 == null) {
                                aVar4.f5399b = bVar7;
                            } else {
                                bVar6.f5401c = bVar7;
                            }
                            aVar4.a.b(bVar5);
                        } else {
                            bVar6 = bVar5;
                        }
                        bVar5 = bVar7;
                    }
                }
            }

            @Override // e.b.a.a.z.f
            public void b() {
                e.b.a.a.y.c.a.a("consumer manager on idle", new Object[0]);
                e.b.a.a.z.k.g gVar = (e.b.a.a.z.k.g) a.this.f5316b.a(e.b.a.a.z.k.g.class);
                a aVar = a.this;
                gVar.f5430e = aVar;
                gVar.f5429d = aVar.f5318d;
                a.this.f5320f.a(gVar);
            }
        }

        public a(e.b.a.a.z.e eVar, e.b.a.a.z.h hVar, e.b.a.a.z.c cVar, e.b.a.a.c0.a aVar) {
            this.f5319e = hVar;
            this.f5316b = cVar;
            this.f5320f = eVar;
            this.f5321g = aVar;
            this.f5318d = aVar.a();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5319e.d(this.f5322h);
        }
    }

    public f(l lVar, e.b.a.a.c0.a aVar, e.b.a.a.z.c cVar, e.b.a.a.w.a aVar2) {
        this.f5307f = lVar;
        this.f5314m = aVar;
        this.f5305d = cVar;
        this.f5308g = aVar2.f5389d;
        this.f5310i = aVar2.f5391f;
        this.f5309h = aVar2.f5390e;
        this.f5303b = aVar2.f5387b * 1000 * 1000000;
        this.a = new r(aVar);
    }

    public final boolean a(boolean z) {
        boolean z2;
        e.b.a.a.y.c.a.a("considering adding a new consumer. Should poke all waiting? %s isRunning? %s waiting workers? %d", Boolean.valueOf(z), Boolean.valueOf(this.f5307f.f5376m), Integer.valueOf(this.f5315n.size()));
        if (!this.f5307f.f5376m) {
            e.b.a.a.y.c.a.a("jobqueue is not running, no consumers will be added", new Object[0]);
            return false;
        } else if (this.f5315n.size() > 0) {
            e.b.a.a.y.c.a.a("there are waiting workers, will poke them instead", new Object[0]);
            for (int size = this.f5315n.size() - 1; size >= 0; size--) {
                e.b.a.a.z.k.e eVar = (e.b.a.a.z.k.e) this.f5305d.a(e.b.a.a.z.k.e.class);
                eVar.f5427d = 2;
                this.f5315n.remove(size).f5319e.a(eVar);
                if (!z) {
                    break;
                }
            }
            e.b.a.a.y.c.a.a("there were waiting workers, poked them and I'm done", new Object[0]);
            return true;
        } else {
            int size2 = this.f5304c.size();
            if (size2 >= this.f5309h) {
                e.b.a.a.y.c.a.a("too many consumers, clearly above load factor %s", Integer.valueOf(size2));
                z2 = false;
            } else {
                l lVar = this.f5307f;
                int b2 = lVar.b(lVar.c());
                int size3 = this.f5311j.size();
                int i2 = b2 + size3;
                boolean z3 = this.f5308g * size2 < i2 || (size2 < this.f5310i && size2 < i2);
                e.b.a.a.y.c.a.a("check above load factor: totalCons:%s minCons:%s maxConsCount: %s, loadFactor %s remainingJobs: %s running holders: %s. isAbove:%s", Integer.valueOf(size2), Integer.valueOf(this.f5310i), Integer.valueOf(this.f5309h), Integer.valueOf(this.f5308g), Integer.valueOf(b2), Integer.valueOf(size3), Boolean.valueOf(z3));
                z2 = z3;
            }
            e.b.a.a.y.c.a.a("nothing has been poked. are we above load factor? %s", Boolean.valueOf(z2));
            if (z2) {
                e.b.a.a.y.c.a.a("adding another consumer", new Object[0]);
                a aVar = new a(this.f5307f.f5366c, new e.b.a.a.z.h(this.f5314m, this.f5305d, "consumer"), this.f5305d, this.f5314m);
                ThreadGroup threadGroup = this.f5312k;
                StringBuilder y = e.a.d.a.a.y("job-queue-worker-");
                y.append(UUID.randomUUID());
                Thread thread = new Thread(threadGroup, aVar, y.toString());
                thread.setPriority(this.f5313l);
                this.f5304c.add(aVar);
                try {
                    thread.start();
                } catch (InternalError e2) {
                    e.b.a.a.y.c.a.d(e2, "Cannot start a thread. Looks like app is shutting down.See issue #294 for details.", new Object[0]);
                }
                return true;
            }
            return false;
        }
    }

    public boolean b() {
        return a(true);
    }

    public void c(e.b.a.a.z.k.j jVar, i iVar, q qVar) {
        a aVar = (a) jVar.f5435f;
        if (!aVar.f5317c) {
            throw new IllegalStateException("this worker should not have a job");
        }
        aVar.f5317c = false;
        this.f5311j.remove(iVar.f5336e.f5329h);
        String str = iVar.a;
        if (str != null) {
            r rVar = this.a;
            synchronized (rVar) {
                if (rVar.f5383c.remove(str)) {
                    rVar.f5384d = null;
                }
            }
        }
    }

    public boolean d(String str) {
        return this.f5311j.get(str) != null;
    }

    public final Set<String> e(s sVar, String[] strArr, boolean z) {
        HashSet hashSet = new HashSet();
        for (i iVar : this.f5311j.values()) {
            h hVar = iVar.f5336e;
            boolean z2 = false;
            e.b.a.a.y.c.a.a("checking job tag %s. tags of job: %s", hVar, hVar.f5331j);
            Set<String> set = iVar.f5335d;
            if (set != null && set.size() > 0) {
                z2 = true;
            }
            if (z2 && !iVar.f5340i && sVar.matches(strArr, iVar.f5335d)) {
                hashSet.add(iVar.f5333b);
                if (z) {
                    iVar.f5341j = true;
                    iVar.a();
                } else {
                    iVar.a();
                }
            }
        }
        return hashSet;
    }
}
