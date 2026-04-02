package com.amazon.aps.iva.l9;

import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.amazon.aps.iva.t9.o;
import com.amazon.aps.iva.t9.p;
import com.amazon.aps.iva.t9.q;
import com.amazon.aps.iva.t9.r;
import com.amazon.aps.iva.t9.t;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* compiled from: WorkerWrapper.java */
/* loaded from: classes.dex */
public final class n implements Runnable {
    public static final /* synthetic */ int u = 0;
    public final Context b;
    public final String c;
    public final List<e> d;
    public final WorkerParameters.a e;
    public p f;
    public final com.amazon.aps.iva.w9.a h;
    public final androidx.work.a j;
    public final com.amazon.aps.iva.s9.a k;
    public final WorkDatabase l;
    public final q m;
    public final com.amazon.aps.iva.t9.b n;
    public final t o;
    public ArrayList p;
    public String q;
    public volatile boolean t;
    public ListenableWorker.a i = new ListenableWorker.a.C0060a();
    public final com.amazon.aps.iva.v9.c<Boolean> r = new com.amazon.aps.iva.v9.c<>();
    public ListenableFuture<ListenableWorker.a> s = null;
    public ListenableWorker g = null;

    /* compiled from: WorkerWrapper.java */
    /* loaded from: classes.dex */
    public static class a {
        public final Context a;
        public final com.amazon.aps.iva.s9.a b;
        public final com.amazon.aps.iva.w9.a c;
        public final androidx.work.a d;
        public final WorkDatabase e;
        public final String f;
        public List<e> g;
        public WorkerParameters.a h = new WorkerParameters.a();

        public a(Context context, androidx.work.a aVar, com.amazon.aps.iva.w9.a aVar2, com.amazon.aps.iva.s9.a aVar3, WorkDatabase workDatabase, String str) {
            this.a = context.getApplicationContext();
            this.c = aVar2;
            this.b = aVar3;
            this.d = aVar;
            this.e = workDatabase;
            this.f = str;
        }
    }

    static {
        com.amazon.aps.iva.k9.m.e("WorkerWrapper");
    }

    public n(a aVar) {
        this.b = aVar.a;
        this.h = aVar.c;
        this.k = aVar.b;
        this.c = aVar.f;
        this.d = aVar.g;
        this.e = aVar.h;
        this.j = aVar.d;
        WorkDatabase workDatabase = aVar.e;
        this.l = workDatabase;
        this.m = workDatabase.n();
        this.n = workDatabase.i();
        this.o = workDatabase.o();
    }

    public final void a(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            com.amazon.aps.iva.k9.m c = com.amazon.aps.iva.k9.m.c();
            String.format("Worker result SUCCESS for %s", this.q);
            c.d(new Throwable[0]);
            if (this.f.c()) {
                e();
                return;
            }
            com.amazon.aps.iva.t9.b bVar = this.n;
            String str = this.c;
            q qVar = this.m;
            WorkDatabase workDatabase = this.l;
            workDatabase.c();
            try {
                ((r) qVar).n(com.amazon.aps.iva.k9.t.SUCCEEDED, str);
                ((r) qVar).l(str, ((ListenableWorker.a.c) this.i).a);
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = ((com.amazon.aps.iva.t9.c) bVar).a(str).iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (((r) qVar).f(str2) == com.amazon.aps.iva.k9.t.BLOCKED && ((com.amazon.aps.iva.t9.c) bVar).b(str2)) {
                        com.amazon.aps.iva.k9.m c2 = com.amazon.aps.iva.k9.m.c();
                        String.format("Setting status to enqueued for %s", str2);
                        c2.d(new Throwable[0]);
                        ((r) qVar).n(com.amazon.aps.iva.k9.t.ENQUEUED, str2);
                        ((r) qVar).m(currentTimeMillis, str2);
                    }
                }
                workDatabase.h();
            } finally {
                workDatabase.f();
                f(false);
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            com.amazon.aps.iva.k9.m c3 = com.amazon.aps.iva.k9.m.c();
            String.format("Worker result RETRY for %s", this.q);
            c3.d(new Throwable[0]);
            d();
        } else {
            com.amazon.aps.iva.k9.m c4 = com.amazon.aps.iva.k9.m.c();
            String.format("Worker result FAILURE for %s", this.q);
            c4.d(new Throwable[0]);
            if (this.f.c()) {
                e();
            } else {
                h();
            }
        }
    }

    public final void b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            r rVar = (r) this.m;
            if (rVar.f(str2) != com.amazon.aps.iva.k9.t.CANCELLED) {
                rVar.n(com.amazon.aps.iva.k9.t.FAILED, str2);
            }
            linkedList.addAll(((com.amazon.aps.iva.t9.c) this.n).a(str2));
        }
    }

    public final void c() {
        boolean i = i();
        String str = this.c;
        WorkDatabase workDatabase = this.l;
        if (!i) {
            workDatabase.c();
            try {
                com.amazon.aps.iva.k9.t f = ((r) this.m).f(str);
                o oVar = (o) workDatabase.m();
                com.amazon.aps.iva.p8.g gVar = oVar.a;
                gVar.b();
                o.b bVar = oVar.c;
                com.amazon.aps.iva.v8.e a2 = bVar.a();
                if (str == null) {
                    a2.h(1);
                } else {
                    a2.i(1, str);
                }
                gVar.c();
                a2.k();
                gVar.h();
                gVar.f();
                bVar.c(a2);
                if (f == null) {
                    f(false);
                } else if (f == com.amazon.aps.iva.k9.t.RUNNING) {
                    a(this.i);
                } else if (!f.isFinished()) {
                    d();
                }
                workDatabase.h();
            } finally {
                workDatabase.f();
            }
        }
        List<e> list = this.d;
        if (list != null) {
            for (e eVar : list) {
                eVar.b(str);
            }
            f.a(this.j, workDatabase, list);
        }
    }

    public final void d() {
        String str = this.c;
        q qVar = this.m;
        WorkDatabase workDatabase = this.l;
        workDatabase.c();
        try {
            ((r) qVar).n(com.amazon.aps.iva.k9.t.ENQUEUED, str);
            ((r) qVar).m(System.currentTimeMillis(), str);
            ((r) qVar).k(-1L, str);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(true);
        }
    }

    public final void e() {
        String str = this.c;
        q qVar = this.m;
        WorkDatabase workDatabase = this.l;
        workDatabase.c();
        try {
            ((r) qVar).m(System.currentTimeMillis(), str);
            ((r) qVar).n(com.amazon.aps.iva.k9.t.ENQUEUED, str);
            r rVar = (r) qVar;
            com.amazon.aps.iva.p8.g gVar = rVar.a;
            gVar.b();
            r.f fVar = rVar.g;
            com.amazon.aps.iva.v8.e a2 = fVar.a();
            if (str == null) {
                a2.h(1);
            } else {
                a2.i(1, str);
            }
            gVar.c();
            a2.k();
            gVar.h();
            gVar.f();
            fVar.c(a2);
            ((r) qVar).k(-1L, str);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    public final void f(boolean z) {
        boolean z2;
        ListenableWorker listenableWorker;
        this.l.c();
        try {
            r rVar = (r) this.l.n();
            rVar.getClass();
            com.amazon.aps.iva.p8.i f = com.amazon.aps.iva.p8.i.f(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            com.amazon.aps.iva.p8.g gVar = rVar.a;
            gVar.b();
            Cursor g = gVar.g(f);
            if (g.moveToFirst() && g.getInt(0) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            g.close();
            f.release();
            if (!z2) {
                com.amazon.aps.iva.u9.g.a(this.b, RescheduleReceiver.class, false);
            }
            if (z) {
                ((r) this.m).n(com.amazon.aps.iva.k9.t.ENQUEUED, this.c);
                ((r) this.m).k(-1L, this.c);
            }
            if (this.f != null && (listenableWorker = this.g) != null && listenableWorker.isRunInForeground()) {
                com.amazon.aps.iva.s9.a aVar = this.k;
                String str = this.c;
                d dVar = (d) aVar;
                synchronized (dVar.l) {
                    dVar.g.remove(str);
                    dVar.g();
                }
            }
            this.l.h();
            this.l.f();
            this.r.h(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.l.f();
            throw th;
        }
    }

    public final void g() {
        String str = this.c;
        com.amazon.aps.iva.k9.t f = ((r) this.m).f(str);
        if (f == com.amazon.aps.iva.k9.t.RUNNING) {
            com.amazon.aps.iva.k9.m c = com.amazon.aps.iva.k9.m.c();
            String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", str);
            c.a(new Throwable[0]);
            f(true);
            return;
        }
        com.amazon.aps.iva.k9.m c2 = com.amazon.aps.iva.k9.m.c();
        String.format("Status for %s is %s; not doing any work", str, f);
        c2.a(new Throwable[0]);
        f(false);
    }

    public final void h() {
        String str = this.c;
        WorkDatabase workDatabase = this.l;
        workDatabase.c();
        try {
            b(str);
            ((r) this.m).l(str, ((ListenableWorker.a.C0060a) this.i).a);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    public final boolean i() {
        if (!this.t) {
            return false;
        }
        com.amazon.aps.iva.k9.m c = com.amazon.aps.iva.k9.m.c();
        String.format("Work interrupted for %s", this.q);
        c.a(new Throwable[0]);
        com.amazon.aps.iva.k9.t f = ((r) this.m).f(this.c);
        if (f == null) {
            f(false);
        } else {
            f(!f.isFinished());
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
        if (r0 != false) goto L100;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.l9.n.run():void");
    }
}
