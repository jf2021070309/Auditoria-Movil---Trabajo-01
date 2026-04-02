package j;

import j.s;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import m.s;
/* loaded from: classes.dex */
public final class y implements d {
    public final w a;

    /* renamed from: b  reason: collision with root package name */
    public final j.i0.g.h f9593b;

    /* renamed from: c  reason: collision with root package name */
    public final k.a f9594c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public n f9595d;

    /* renamed from: e  reason: collision with root package name */
    public final z f9596e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f9597f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9598g;

    /* loaded from: classes2.dex */
    public class a extends k.a {
        public a() {
        }

        @Override // k.a
        public void k() {
            y.this.cancel();
        }
    }

    /* loaded from: classes2.dex */
    public final class b extends j.i0.b {

        /* renamed from: b  reason: collision with root package name */
        public final e f9600b;

        public b(e eVar) {
            super("OkHttp %s", y.this.b());
            this.f9600b = eVar;
        }

        @Override // j.i0.b
        public void a() {
            IOException e2;
            boolean z;
            d0 a;
            y.this.f9594c.h();
            boolean z2 = false;
            try {
                try {
                    a = y.this.a();
                    z = true;
                } catch (Throwable th) {
                    y.this.a.f9568c.a(this);
                    throw th;
                }
            } catch (IOException e3) {
                e2 = e3;
                z = false;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                ((s.a) this.f9600b).b(y.this, a);
            } catch (IOException e4) {
                e2 = e4;
                IOException c2 = y.this.c(e2);
                if (z) {
                    j.i0.j.f fVar = j.i0.j.f.a;
                    fVar.l(4, "Callback failure for " + y.this.d(), c2);
                } else {
                    Objects.requireNonNull(y.this.f9595d);
                    ((s.a) this.f9600b).a(y.this, c2);
                }
                y.this.a.f9568c.a(this);
            } catch (Throwable th3) {
                th = th3;
                z2 = true;
                y.this.cancel();
                if (!z2) {
                    IOException iOException = new IOException("canceled due to " + th);
                    ((s.a) this.f9600b).a(y.this, iOException);
                }
                throw th;
            }
            y.this.a.f9568c.a(this);
        }
    }

    public y(w wVar, z zVar, boolean z) {
        this.a = wVar;
        this.f9596e = zVar;
        this.f9597f = z;
        this.f9593b = new j.i0.g.h(wVar, z);
        a aVar = new a();
        this.f9594c = aVar;
        Objects.requireNonNull(wVar);
        aVar.g(0, TimeUnit.MILLISECONDS);
    }

    public d0 a() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a.f9571f);
        arrayList.add(this.f9593b);
        arrayList.add(new j.i0.g.a(this.a.f9575j));
        Objects.requireNonNull(this.a);
        arrayList.add(new j.i0.e.a(null));
        arrayList.add(new j.i0.f.a(this.a));
        if (!this.f9597f) {
            arrayList.addAll(this.a.f9572g);
        }
        arrayList.add(new j.i0.g.b(this.f9597f));
        z zVar = this.f9596e;
        n nVar = this.f9595d;
        w wVar = this.a;
        d0 a2 = new j.i0.g.f(arrayList, null, null, null, 0, zVar, this, nVar, wVar.w, wVar.x, wVar.y).a(zVar);
        if (this.f9593b.f9341d) {
            j.i0.c.e(a2);
            throw new IOException("Canceled");
        }
        return a2;
    }

    public String b() {
        s.a k2 = this.f9596e.a.k("/...");
        Objects.requireNonNull(k2);
        k2.f9545b = s.b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        k2.f9546c = s.b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return k2.a().f9544j;
    }

    @Nullable
    public IOException c(@Nullable IOException iOException) {
        if (this.f9594c.i()) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
            return interruptedIOException;
        }
        return iOException;
    }

    public void cancel() {
        j.i0.g.c cVar;
        j.i0.f.c cVar2;
        j.i0.g.h hVar = this.f9593b;
        hVar.f9341d = true;
        j.i0.f.g gVar = hVar.f9339b;
        if (gVar != null) {
            synchronized (gVar.f9311d) {
                gVar.f9320m = true;
                cVar = gVar.f9321n;
                cVar2 = gVar.f9317j;
            }
            if (cVar != null) {
                cVar.cancel();
            } else if (cVar2 != null) {
                j.i0.c.f(cVar2.f9289d);
            }
        }
    }

    public Object clone() throws CloneNotSupportedException {
        w wVar = this.a;
        y yVar = new y(wVar, this.f9596e, this.f9597f);
        yVar.f9595d = ((o) wVar.f9573h).a;
        return yVar;
    }

    public String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9593b.f9341d ? "canceled " : "");
        sb.append(this.f9597f ? "web socket" : "call");
        sb.append(" to ");
        sb.append(b());
        return sb.toString();
    }
}
