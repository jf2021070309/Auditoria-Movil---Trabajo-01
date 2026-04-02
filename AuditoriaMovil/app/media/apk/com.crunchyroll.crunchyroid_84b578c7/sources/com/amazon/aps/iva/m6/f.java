package com.amazon.aps.iva.m6;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseIntArray;
import com.amazon.aps.iva.a6.p1;
import com.amazon.aps.iva.m6.f;
import com.amazon.aps.iva.o6.o0;
import com.amazon.aps.iva.o6.u;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.q5.u0;
import com.amazon.aps.iva.s6.g;
import com.amazon.aps.iva.s6.r;
import com.amazon.aps.iva.s6.t;
import com.amazon.aps.iva.s6.x;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.w5.y;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: DownloadHelper.java */
/* loaded from: classes.dex */
public final class f {
    public static final /* synthetic */ int n = 0;
    public final b0.g a;
    public final com.amazon.aps.iva.o6.v b;
    public final com.amazon.aps.iva.s6.g c;
    public final p1[] d;
    public final SparseIntArray e;
    public final Handler f;
    public boolean g;
    public a h;
    public e i;
    public o0[] j;
    public t.a[] k;
    public List<com.amazon.aps.iva.s6.r>[][] l;
    public List<com.amazon.aps.iva.s6.r>[][] m;

    /* compiled from: DownloadHelper.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(f fVar);

        void b(f fVar, IOException iOException);
    }

    /* compiled from: DownloadHelper.java */
    /* loaded from: classes.dex */
    public static class d extends IOException {
    }

    /* compiled from: DownloadHelper.java */
    /* loaded from: classes.dex */
    public static final class e implements v.c, u.a, Handler.Callback {
        public final com.amazon.aps.iva.o6.v b;
        public final f c;
        public final com.amazon.aps.iva.t6.f d = new com.amazon.aps.iva.t6.f();
        public final ArrayList<com.amazon.aps.iva.o6.u> e = new ArrayList<>();
        public final Handler f = g0.n(new Handler.Callback() { // from class: com.amazon.aps.iva.m6.g
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                f.e eVar = f.e.this;
                boolean z = eVar.k;
                if (!z) {
                    int i = message.what;
                    f fVar = eVar.c;
                    if (i != 0) {
                        if (i == 1) {
                            if (!z) {
                                eVar.k = true;
                                eVar.h.sendEmptyMessage(3);
                            }
                            Object obj = message.obj;
                            int i2 = g0.a;
                            Handler handler = fVar.f;
                            handler.getClass();
                            handler.post(new com.amazon.aps.iva.k.t(3, fVar, (IOException) obj));
                            return true;
                        }
                    } else {
                        try {
                            f.a(fVar);
                            return true;
                        } catch (com.amazon.aps.iva.a6.l e) {
                            eVar.f.obtainMessage(1, new IOException(e)).sendToTarget();
                            return true;
                        }
                    }
                }
                return false;
            }
        });
        public final HandlerThread g;
        public final Handler h;
        public r0 i;
        public com.amazon.aps.iva.o6.u[] j;
        public boolean k;

        public e(com.amazon.aps.iva.o6.v vVar, f fVar) {
            this.b = vVar;
            this.c = fVar;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadHelper");
            this.g = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), this);
            this.h = handler;
            handler.sendEmptyMessage(0);
        }

        @Override // com.amazon.aps.iva.o6.i0.a
        public final void a(com.amazon.aps.iva.o6.u uVar) {
            com.amazon.aps.iva.o6.u uVar2 = uVar;
            if (this.e.contains(uVar2)) {
                this.h.obtainMessage(2, uVar2).sendToTarget();
            }
        }

        @Override // com.amazon.aps.iva.o6.v.c
        public final void b(com.amazon.aps.iva.o6.v vVar, r0 r0Var) {
            com.amazon.aps.iva.o6.u[] uVarArr;
            if (this.i != null) {
                return;
            }
            if (r0Var.o(0, new r0.d()).b()) {
                this.f.obtainMessage(1, new d()).sendToTarget();
                return;
            }
            this.i = r0Var;
            this.j = new com.amazon.aps.iva.o6.u[r0Var.j()];
            int i = 0;
            while (true) {
                uVarArr = this.j;
                if (i >= uVarArr.length) {
                    break;
                }
                com.amazon.aps.iva.o6.u h = this.b.h(new v.b(r0Var.n(i)), this.d, 0L);
                this.j[i] = h;
                this.e.add(h);
                i++;
            }
            for (com.amazon.aps.iva.o6.u uVar : uVarArr) {
                uVar.k(this, 0L);
            }
        }

        @Override // com.amazon.aps.iva.o6.u.a
        public final void d(com.amazon.aps.iva.o6.u uVar) {
            ArrayList<com.amazon.aps.iva.o6.u> arrayList = this.e;
            arrayList.remove(uVar);
            if (arrayList.isEmpty()) {
                this.h.removeMessages(1);
                this.f.sendEmptyMessage(0);
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            Handler handler = this.h;
            com.amazon.aps.iva.o6.v vVar = this.b;
            if (i != 0) {
                int i2 = 0;
                ArrayList<com.amazon.aps.iva.o6.u> arrayList = this.e;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return false;
                        }
                        com.amazon.aps.iva.o6.u[] uVarArr = this.j;
                        if (uVarArr != null) {
                            int length = uVarArr.length;
                            while (i2 < length) {
                                vVar.c(uVarArr[i2]);
                                i2++;
                            }
                        }
                        vVar.n(this);
                        handler.removeCallbacksAndMessages(null);
                        this.g.quit();
                        return true;
                    }
                    com.amazon.aps.iva.o6.u uVar = (com.amazon.aps.iva.o6.u) message.obj;
                    if (arrayList.contains(uVar)) {
                        uVar.p(0L);
                    }
                    return true;
                }
                try {
                    if (this.j == null) {
                        vVar.j();
                    } else {
                        while (i2 < arrayList.size()) {
                            arrayList.get(i2).n();
                            i2++;
                        }
                    }
                    handler.sendEmptyMessageDelayed(1, 100L);
                } catch (IOException e) {
                    this.f.obtainMessage(1, e).sendToTarget();
                }
                return true;
            }
            vVar.d(this, null, com.amazon.aps.iva.b6.p1.b);
            handler.sendEmptyMessage(1);
            return true;
        }
    }

    static {
        g.c cVar = g.c.M0;
        cVar.getClass();
        g.c.a aVar = new g.c.a(cVar);
        aVar.x = true;
        aVar.J = false;
        aVar.r();
    }

    public f(b0 b0Var, com.amazon.aps.iva.o6.v vVar, u0 u0Var, p1[] p1VarArr) {
        b0.g gVar = b0Var.c;
        gVar.getClass();
        this.a = gVar;
        this.b = vVar;
        com.amazon.aps.iva.s6.g gVar2 = new com.amazon.aps.iva.s6.g(u0Var, new b.a(), null);
        this.c = gVar2;
        this.d = p1VarArr;
        this.e = new SparseIntArray();
        com.amazon.aps.iva.q5.b bVar = new com.amazon.aps.iva.q5.b(7);
        c cVar = new c();
        gVar2.b = bVar;
        gVar2.c = cVar;
        this.f = g0.n(null);
        new r0.d();
    }

    public static void a(f fVar) throws com.amazon.aps.iva.a6.l {
        fVar.i.getClass();
        fVar.i.j.getClass();
        fVar.i.i.getClass();
        int length = fVar.i.j.length;
        int length2 = fVar.d.length;
        fVar.l = (List[][]) Array.newInstance(List.class, length, length2);
        fVar.m = (List[][]) Array.newInstance(List.class, length, length2);
        for (int i = 0; i < length; i++) {
            for (int i2 = 0; i2 < length2; i2++) {
                fVar.l[i][i2] = new ArrayList();
                fVar.m[i][i2] = Collections.unmodifiableList(fVar.l[i][i2]);
            }
        }
        fVar.j = new o0[length];
        fVar.k = new t.a[length];
        for (int i3 = 0; i3 < length; i3++) {
            fVar.j[i3] = fVar.i.j[i3].q();
            x b2 = fVar.b(i3);
            fVar.c.getClass();
            t.a aVar = (t.a) b2.e;
            t.a[] aVarArr = fVar.k;
            aVar.getClass();
            aVarArr[i3] = aVar;
        }
        fVar.g = true;
        Handler handler = fVar.f;
        handler.getClass();
        handler.post(new com.amazon.aps.iva.m6.e(fVar, 0));
    }

    public final x b(int i) throws com.amazon.aps.iva.a6.l {
        boolean z;
        x S = this.c.S(this.d, this.j[i], new v.b(this.i.i.n(i)), this.i.i);
        for (int i2 = 0; i2 < S.a; i2++) {
            com.amazon.aps.iva.s6.r rVar = S.c[i2];
            if (rVar != null) {
                List<com.amazon.aps.iva.s6.r> list = this.l[i][i2];
                int i3 = 0;
                while (true) {
                    if (i3 < list.size()) {
                        com.amazon.aps.iva.s6.r rVar2 = list.get(i3);
                        if (rVar2.m().equals(rVar.m())) {
                            SparseIntArray sparseIntArray = this.e;
                            sparseIntArray.clear();
                            for (int i4 = 0; i4 < rVar2.length(); i4++) {
                                sparseIntArray.put(rVar2.f(i4), 0);
                            }
                            for (int i5 = 0; i5 < rVar.length(); i5++) {
                                sparseIntArray.put(rVar.f(i5), 0);
                            }
                            int[] iArr = new int[sparseIntArray.size()];
                            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                                iArr[i6] = sparseIntArray.keyAt(i6);
                            }
                            list.set(i3, new b(rVar2.m(), iArr));
                            z = true;
                        } else {
                            i3++;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    list.add(rVar);
                }
            }
        }
        return S;
    }

    /* compiled from: DownloadHelper.java */
    /* loaded from: classes.dex */
    public static final class c implements com.amazon.aps.iva.t6.d {
        @Override // com.amazon.aps.iva.t6.d
        public final y c() {
            return null;
        }

        @Override // com.amazon.aps.iva.t6.d
        public final long e() {
            return 0L;
        }

        @Override // com.amazon.aps.iva.t6.d
        public final void g(com.amazon.aps.iva.b6.a aVar) {
        }

        @Override // com.amazon.aps.iva.t6.d
        public final void f(Handler handler, com.amazon.aps.iva.b6.a aVar) {
        }
    }

    /* compiled from: DownloadHelper.java */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.s6.c {

        /* compiled from: DownloadHelper.java */
        /* loaded from: classes.dex */
        public static final class a implements r.b {
            @Override // com.amazon.aps.iva.s6.r.b
            public final com.amazon.aps.iva.s6.r[] a(r.a[] aVarArr, com.amazon.aps.iva.t6.d dVar) {
                b bVar;
                com.amazon.aps.iva.s6.r[] rVarArr = new com.amazon.aps.iva.s6.r[aVarArr.length];
                for (int i = 0; i < aVarArr.length; i++) {
                    r.a aVar = aVarArr[i];
                    if (aVar == null) {
                        bVar = null;
                    } else {
                        bVar = new b(aVar.a, aVar.b);
                    }
                    rVarArr[i] = bVar;
                }
                return rVarArr;
            }
        }

        @Override // com.amazon.aps.iva.s6.r
        public final int c() {
            return 0;
        }

        @Override // com.amazon.aps.iva.s6.r
        public final Object j() {
            return null;
        }

        @Override // com.amazon.aps.iva.s6.r
        public final int s() {
            return 0;
        }

        @Override // com.amazon.aps.iva.s6.r
        public final void g(long j, long j2, long j3, List<? extends com.amazon.aps.iva.q6.m> list, com.amazon.aps.iva.q6.n[] nVarArr) {
        }
    }
}
