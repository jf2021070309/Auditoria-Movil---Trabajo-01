package c.c0.d0;

import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import c.c0.d0.s.p;
import c.c0.d0.s.q;
import c.c0.d0.s.t;
import c.c0.r;
import c.c0.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class o implements Runnable {
    public static final String a = r.e("WorkerWrapper");

    /* renamed from: b  reason: collision with root package name */
    public Context f1383b;

    /* renamed from: c  reason: collision with root package name */
    public String f1384c;

    /* renamed from: d  reason: collision with root package name */
    public List<e> f1385d;

    /* renamed from: e  reason: collision with root package name */
    public WorkerParameters.a f1386e;

    /* renamed from: f  reason: collision with root package name */
    public p f1387f;

    /* renamed from: h  reason: collision with root package name */
    public c.c0.d0.t.t.a f1389h;

    /* renamed from: j  reason: collision with root package name */
    public c.c0.c f1391j;

    /* renamed from: k  reason: collision with root package name */
    public c.c0.d0.r.a f1392k;

    /* renamed from: l  reason: collision with root package name */
    public WorkDatabase f1393l;

    /* renamed from: m  reason: collision with root package name */
    public q f1394m;

    /* renamed from: n  reason: collision with root package name */
    public c.c0.d0.s.b f1395n;
    public t o;
    public List<String> p;
    public String q;
    public volatile boolean t;

    /* renamed from: i  reason: collision with root package name */
    public ListenableWorker.a f1390i = new ListenableWorker.a.C0003a();
    public c.c0.d0.t.s.c<Boolean> r = new c.c0.d0.t.s.c<>();
    public e.d.c.a.a.a<ListenableWorker.a> s = null;

    /* renamed from: g  reason: collision with root package name */
    public ListenableWorker f1388g = null;

    /* loaded from: classes.dex */
    public static class a {
        public Context a;

        /* renamed from: b  reason: collision with root package name */
        public c.c0.d0.r.a f1396b;

        /* renamed from: c  reason: collision with root package name */
        public c.c0.d0.t.t.a f1397c;

        /* renamed from: d  reason: collision with root package name */
        public c.c0.c f1398d;

        /* renamed from: e  reason: collision with root package name */
        public WorkDatabase f1399e;

        /* renamed from: f  reason: collision with root package name */
        public String f1400f;

        /* renamed from: g  reason: collision with root package name */
        public List<e> f1401g;

        /* renamed from: h  reason: collision with root package name */
        public WorkerParameters.a f1402h = new WorkerParameters.a();

        public a(Context context, c.c0.c cVar, c.c0.d0.t.t.a aVar, c.c0.d0.r.a aVar2, WorkDatabase workDatabase, String str) {
            this.a = context.getApplicationContext();
            this.f1397c = aVar;
            this.f1396b = aVar2;
            this.f1398d = cVar;
            this.f1399e = workDatabase;
            this.f1400f = str;
        }
    }

    public o(a aVar) {
        this.f1383b = aVar.a;
        this.f1389h = aVar.f1397c;
        this.f1392k = aVar.f1396b;
        this.f1384c = aVar.f1400f;
        this.f1385d = aVar.f1401g;
        this.f1386e = aVar.f1402h;
        this.f1391j = aVar.f1398d;
        WorkDatabase workDatabase = aVar.f1399e;
        this.f1393l = workDatabase;
        this.f1394m = workDatabase.q();
        this.f1395n = this.f1393l.l();
        this.o = this.f1393l.r();
    }

    public final void a(ListenableWorker.a aVar) {
        if (!(aVar instanceof ListenableWorker.a.c)) {
            if (aVar instanceof ListenableWorker.a.b) {
                r.c().d(a, String.format("Worker result RETRY for %s", this.q), new Throwable[0]);
                d();
                return;
            }
            r.c().d(a, String.format("Worker result FAILURE for %s", this.q), new Throwable[0]);
            if (this.f1387f.c()) {
                e();
                return;
            } else {
                h();
                return;
            }
        }
        r.c().d(a, String.format("Worker result SUCCESS for %s", this.q), new Throwable[0]);
        if (this.f1387f.c()) {
            e();
            return;
        }
        this.f1393l.c();
        try {
            ((c.c0.d0.s.r) this.f1394m).p(y.SUCCEEDED, this.f1384c);
            ((c.c0.d0.s.r) this.f1394m).n(this.f1384c, ((ListenableWorker.a.c) this.f1390i).a);
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = ((ArrayList) ((c.c0.d0.s.c) this.f1395n).a(this.f1384c)).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (((c.c0.d0.s.r) this.f1394m).f(str) == y.BLOCKED && ((c.c0.d0.s.c) this.f1395n).b(str)) {
                    r.c().d(a, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    ((c.c0.d0.s.r) this.f1394m).p(y.ENQUEUED, str);
                    ((c.c0.d0.s.r) this.f1394m).o(str, currentTimeMillis);
                }
            }
            this.f1393l.k();
        } finally {
            this.f1393l.g();
            f(false);
        }
    }

    public final void b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (((c.c0.d0.s.r) this.f1394m).f(str2) != y.CANCELLED) {
                ((c.c0.d0.s.r) this.f1394m).p(y.FAILED, str2);
            }
            linkedList.addAll(((c.c0.d0.s.c) this.f1395n).a(str2));
        }
    }

    public void c() {
        if (!i()) {
            this.f1393l.c();
            try {
                y f2 = ((c.c0.d0.s.r) this.f1394m).f(this.f1384c);
                ((c.c0.d0.s.o) this.f1393l.p()).a(this.f1384c);
                if (f2 == null) {
                    f(false);
                } else if (f2 == y.RUNNING) {
                    a(this.f1390i);
                } else if (!f2.isFinished()) {
                    d();
                }
                this.f1393l.k();
            } finally {
                this.f1393l.g();
            }
        }
        List<e> list = this.f1385d;
        if (list != null) {
            for (e eVar : list) {
                eVar.e(this.f1384c);
            }
            f.a(this.f1391j, this.f1393l, this.f1385d);
        }
    }

    public final void d() {
        this.f1393l.c();
        try {
            ((c.c0.d0.s.r) this.f1394m).p(y.ENQUEUED, this.f1384c);
            ((c.c0.d0.s.r) this.f1394m).o(this.f1384c, System.currentTimeMillis());
            ((c.c0.d0.s.r) this.f1394m).l(this.f1384c, -1L);
            this.f1393l.k();
        } finally {
            this.f1393l.g();
            f(true);
        }
    }

    public final void e() {
        this.f1393l.c();
        try {
            ((c.c0.d0.s.r) this.f1394m).o(this.f1384c, System.currentTimeMillis());
            ((c.c0.d0.s.r) this.f1394m).p(y.ENQUEUED, this.f1384c);
            ((c.c0.d0.s.r) this.f1394m).m(this.f1384c);
            ((c.c0.d0.s.r) this.f1394m).l(this.f1384c, -1L);
            this.f1393l.k();
        } finally {
            this.f1393l.g();
            f(false);
        }
    }

    public final void f(boolean z) {
        ListenableWorker listenableWorker;
        this.f1393l.c();
        try {
            c.c0.d0.s.r rVar = (c.c0.d0.s.r) this.f1393l.q();
            Objects.requireNonNull(rVar);
            c.v.h h2 = c.v.h.h("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
            rVar.a.b();
            Cursor a2 = c.v.l.b.a(rVar.a, h2, false, null);
            boolean z2 = a2.moveToFirst() && a2.getInt(0) != 0;
            a2.close();
            h2.release();
            if (!z2) {
                c.c0.d0.t.g.a(this.f1383b, RescheduleReceiver.class, false);
            }
            if (z) {
                ((c.c0.d0.s.r) this.f1394m).p(y.ENQUEUED, this.f1384c);
                ((c.c0.d0.s.r) this.f1394m).l(this.f1384c, -1L);
            }
            if (this.f1387f != null && (listenableWorker = this.f1388g) != null && listenableWorker.isRunInForeground()) {
                c.c0.d0.r.a aVar = this.f1392k;
                String str = this.f1384c;
                d dVar = (d) aVar;
                synchronized (dVar.f1347l) {
                    dVar.f1342g.remove(str);
                    dVar.h();
                }
            }
            this.f1393l.k();
            this.f1393l.g();
            this.r.j(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f1393l.g();
            throw th;
        }
    }

    public final void g() {
        y f2 = ((c.c0.d0.s.r) this.f1394m).f(this.f1384c);
        if (f2 == y.RUNNING) {
            r.c().a(a, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f1384c), new Throwable[0]);
            f(true);
            return;
        }
        r.c().a(a, String.format("Status for %s is %s; not doing any work", this.f1384c, f2), new Throwable[0]);
        f(false);
    }

    public void h() {
        this.f1393l.c();
        try {
            b(this.f1384c);
            c.c0.f fVar = ((ListenableWorker.a.C0003a) this.f1390i).a;
            ((c.c0.d0.s.r) this.f1394m).n(this.f1384c, fVar);
            this.f1393l.k();
        } finally {
            this.f1393l.g();
            f(false);
        }
    }

    public final boolean i() {
        if (this.t) {
            r.c().a(a, String.format("Work interrupted for %s", this.q), new Throwable[0]);
            y f2 = ((c.c0.d0.s.r) this.f1394m).f(this.f1384c);
            if (f2 == null) {
                f(false);
            } else {
                f(!f2.isFinished());
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bf, code lost:
        if ((r0.f1507b == r3 && r0.f1516k > 0) != false) goto L95;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c0.d0.o.run():void");
    }
}
