package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122;

import java.io.IOException;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x implements e {
    final v a;
    final bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.j b;
    private p c;
    final y d;
    final boolean e;
    private boolean f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class a extends bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.b {
        private final f b;

        a(f fVar) {
            super("OkHttp %s", x.this.c());
            this.b = fVar;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.b
        protected void b() {
            boolean z;
            a0 a;
            try {
                try {
                    a = x.this.a();
                } catch (IOException e) {
                    e = e;
                    z = false;
                }
                try {
                    if (x.this.b.a()) {
                        this.b.a(x.this, new IOException("Canceled"));
                    } else {
                        this.b.a(x.this, a);
                    }
                } catch (IOException e2) {
                    e = e2;
                    z = true;
                    if (z) {
                        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_try19.e b = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_try19.e.b();
                        b.a(4, "Callback failure for " + x.this.d(), e);
                    } else {
                        x.this.c.a(x.this, e);
                        this.b.a(x.this, e);
                    }
                    return;
                }
                if (a.c != 0) {
                    return;
                }
                throw new IOException(a.d);
            } finally {
                x.this.a.g().b(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String c() {
            return x.this.d.g().g();
        }
    }

    private x(v vVar, y yVar, boolean z) {
        this.a = vVar;
        this.d = yVar;
        this.e = z;
        this.b = new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.j(vVar, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x a(v vVar, y yVar, boolean z) {
        x xVar = new x(vVar, yVar, z);
        xVar.c = vVar.j().a(xVar);
        return xVar;
    }

    private void e() {
        this.b.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_try19.e.b().a("response.body().close()"));
    }

    a0 a() throws IOException {
        ArrayList arrayList = new ArrayList(this.a.n());
        arrayList.add(this.b);
        arrayList.add(new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.a(this.a.f()));
        arrayList.add(new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_19do.a(this.a.o()));
        arrayList.add(new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122.a(this.a));
        if (!this.e) {
            arrayList.addAll(this.a.p());
        }
        arrayList.add(new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.b(this.e));
        return new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.g(arrayList, null, null, null, 0, this.d, this, this.c, this.a.c(), this.a.u(), this.a.y()).a(this.d);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.e
    public void a(f fVar) {
        synchronized (this) {
            if (this.f) {
                throw new IllegalStateException("Already Executed");
            }
            this.f = true;
        }
        e();
        this.c.b(this);
        this.a.g().a(new a(fVar));
    }

    public boolean b() {
        return this.b.a();
    }

    String c() {
        return this.d.g().l();
    }

    /* renamed from: clone */
    public x m8clone() {
        return a(this.a, this.d, this.e);
    }

    String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(b() ? "canceled " : "");
        sb.append(this.e ? "web socket" : "call");
        sb.append(" to ");
        sb.append(c());
        return sb.toString();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.e
    public a0 i() throws IOException {
        synchronized (this) {
            if (this.f) {
                throw new IllegalStateException("Already Executed");
            }
            this.f = true;
        }
        e();
        this.c.b(this);
        try {
            try {
                this.a.g().a(this);
                a0 a2 = a();
                if (a2 != null) {
                    if (a2.c != 0) {
                        return a2;
                    }
                    throw new IOException(a2.d);
                }
                throw new IOException("Canceled");
            } catch (IOException e) {
                this.c.a(this, e);
                throw e;
            }
        } finally {
            this.a.g().b(this);
        }
    }
}
