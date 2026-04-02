package e.a.c;

import android.os.RemoteException;
import e.h.g.j0;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public class s6 {
    public ExecutorService a = Executors.newSingleThreadExecutor();

    /* renamed from: b  reason: collision with root package name */
    public e.h.f.a f5177b;

    public s6(e.h.f.a aVar) {
        this.f5177b = aVar;
    }

    public long a() throws RemoteException {
        z6.i();
        return this.f5177b.a0();
    }

    public void b(final long[] jArr, final int i2) throws RemoteException {
        if (e.h.g.j1.f()) {
            e.h.g.j0.b(new j0.b() { // from class: e.a.c.p0
                @Override // e.h.g.j0.b
                public final void a() {
                    s6 s6Var = s6.this;
                    long[] jArr2 = jArr;
                    int i3 = i2;
                    Objects.requireNonNull(s6Var);
                    try {
                        s6Var.b(jArr2, i3);
                    } catch (Throwable th) {
                        e.h.g.s1.l(th, true);
                    }
                }
            }, this.a);
            return;
        }
        try {
            this.f5177b.L0(jArr, i2);
        } catch (Throwable th) {
            e.h.g.s1.l(th, true);
        }
    }

    public long c() throws RemoteException {
        z6.i();
        return this.f5177b.M();
    }

    public String d() throws RemoteException {
        z6.i();
        return this.f5177b.e();
    }

    public long e() throws RemoteException {
        z6.i();
        return this.f5177b.N0();
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public long[] f() throws RemoteException {
        return this.f5177b.j();
    }

    public int g() throws RemoteException {
        z6.i();
        return this.f5177b.m();
    }

    public int h() throws RemoteException {
        return this.f5177b.h();
    }

    public String i() throws RemoteException {
        z6.i();
        return this.f5177b.b0();
    }

    public boolean j() throws RemoteException {
        return this.f5177b.isPlaying();
    }

    public void k() {
        if (e.h.g.j1.f()) {
            e.h.g.j0.b(new j0.b() { // from class: e.a.c.w0
                @Override // e.h.g.j0.b
                public final void a() {
                    s6 s6Var = s6.this;
                    Objects.requireNonNull(s6Var);
                    try {
                        s6Var.k();
                    } catch (Throwable th) {
                        e.h.g.s1.l(th, true);
                    }
                }
            }, this.a);
            return;
        }
        try {
            this.f5177b.next();
        } catch (Throwable th) {
            e.h.g.s1.l(th, true);
        }
    }

    public void l(final long[] jArr, final int i2) throws RemoteException {
        if (e.h.g.j1.f()) {
            e.h.g.j0.b(new j0.b() { // from class: e.a.c.t0
                @Override // e.h.g.j0.b
                public final void a() {
                    s6 s6Var = s6.this;
                    long[] jArr2 = jArr;
                    int i3 = i2;
                    Objects.requireNonNull(s6Var);
                    try {
                        s6Var.l(jArr2, i3);
                    } catch (Throwable th) {
                        e.h.g.s1.l(th, true);
                    }
                }
            }, this.a);
            return;
        }
        try {
            this.f5177b.j0(jArr, i2);
        } catch (Throwable th) {
            e.h.g.s1.l(th, true);
        }
    }

    public void m(final String str, final String str2) {
        if (e.h.g.j1.f()) {
            e.h.g.j0.b(new j0.b() { // from class: e.a.c.r0
                @Override // e.h.g.j0.b
                public final void a() {
                    s6.this.m(str, str2);
                }
            }, this.a);
            return;
        }
        try {
            this.f5177b.z0(str, str2);
        } catch (Throwable th) {
            e.h.g.s1.l(th, true);
        }
    }

    public void n() throws RemoteException {
        if (e.h.g.j1.f()) {
            e.h.g.j0.b(new j0.b() { // from class: e.a.c.q0
                @Override // e.h.g.j0.b
                public final void a() {
                    s6 s6Var = s6.this;
                    Objects.requireNonNull(s6Var);
                    try {
                        s6Var.n();
                    } catch (Throwable th) {
                        e.h.g.s1.l(th, true);
                    }
                }
            }, this.a);
            return;
        }
        try {
            this.f5177b.pause();
        } catch (Throwable th) {
            e.h.g.s1.l(th, true);
        }
    }

    public void o() throws RemoteException {
        if (e.h.g.j1.f()) {
            e.h.g.j0.b(new j0.b() { // from class: e.a.c.o0
                @Override // e.h.g.j0.b
                public final void a() {
                    s6 s6Var = s6.this;
                    Objects.requireNonNull(s6Var);
                    try {
                        s6Var.o();
                    } catch (Throwable th) {
                        e.h.g.s1.l(th, true);
                    }
                }
            }, this.a);
            return;
        }
        try {
            this.f5177b.i();
        } catch (Throwable th) {
            e.h.g.s1.l(th, true);
        }
    }

    public long p() throws RemoteException {
        z6.i();
        return this.f5177b.W();
    }

    public void q() throws RemoteException {
        if (e.h.g.j1.f()) {
            e.h.g.j0.b(new j0.b() { // from class: e.a.c.x0
                @Override // e.h.g.j0.b
                public final void a() {
                    s6 s6Var = s6.this;
                    Objects.requireNonNull(s6Var);
                    try {
                        s6Var.q();
                    } catch (Throwable th) {
                        e.h.g.s1.l(th, true);
                    }
                }
            }, this.a);
            return;
        }
        try {
            this.f5177b.E0();
        } catch (Throwable th) {
            e.h.g.s1.l(th, true);
        }
    }

    public long r(long j2) throws RemoteException {
        z6.i();
        return this.f5177b.B(j2);
    }

    public void s(final int i2) {
        if (e.h.g.j1.f()) {
            e.h.g.j0.b(new j0.b() { // from class: e.a.c.v0
                @Override // e.h.g.j0.b
                public final void a() {
                    s6 s6Var = s6.this;
                    int i3 = i2;
                    Objects.requireNonNull(s6Var);
                    try {
                        s6Var.s(i3);
                    } catch (Throwable th) {
                        e.h.g.s1.l(th, true);
                    }
                }
            }, this.a);
            return;
        }
        try {
            this.f5177b.J0(i2);
        } catch (Throwable th) {
            e.h.g.s1.l(th, true);
        }
    }

    public void t(final int i2) throws RemoteException {
        if (e.h.g.j1.f()) {
            e.h.g.j0.b(new j0.b() { // from class: e.a.c.y0
                @Override // e.h.g.j0.b
                public final void a() {
                    s6 s6Var = s6.this;
                    int i3 = i2;
                    Objects.requireNonNull(s6Var);
                    try {
                        s6Var.t(i3);
                    } catch (Throwable th) {
                        e.h.g.s1.l(th, true);
                    }
                }
            }, this.a);
            return;
        }
        try {
            this.f5177b.k(i2);
        } catch (Throwable th) {
            e.h.g.s1.l(th, true);
        }
    }

    public void u(final int i2) throws RemoteException {
        if (e.h.g.j1.f()) {
            e.h.g.j0.b(new j0.b() { // from class: e.a.c.u0
                @Override // e.h.g.j0.b
                public final void a() {
                    s6 s6Var = s6.this;
                    int i3 = i2;
                    Objects.requireNonNull(s6Var);
                    try {
                        s6Var.u(i3);
                    } catch (Throwable th) {
                        e.h.g.s1.l(th, true);
                    }
                }
            }, this.a);
            return;
        }
        try {
            this.f5177b.n(i2);
        } catch (Throwable th) {
            e.h.g.s1.l(th, true);
        }
    }

    public void v() {
        if (e.h.g.j1.f()) {
            e.h.g.j0.b(new j0.b() { // from class: e.a.c.s0
                @Override // e.h.g.j0.b
                public final void a() {
                    s6 s6Var = s6.this;
                    Objects.requireNonNull(s6Var);
                    try {
                        s6Var.v();
                    } catch (Throwable th) {
                        e.h.g.s1.l(th, true);
                    }
                }
            }, this.a);
            return;
        }
        try {
            this.f5177b.stop();
        } catch (Throwable th) {
            e.h.g.s1.l(th, true);
        }
    }
}
