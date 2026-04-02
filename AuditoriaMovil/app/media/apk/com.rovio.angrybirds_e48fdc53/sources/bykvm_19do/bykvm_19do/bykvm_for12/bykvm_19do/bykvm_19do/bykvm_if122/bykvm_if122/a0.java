package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122;

import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.r;
import java.io.Closeable;
/* loaded from: classes.dex */
public final class a0 implements Closeable {
    final y a;
    final w b;
    final int c;
    final String d;
    final q e;
    final r f;
    final b0 g;
    final a0 h;
    final a0 i;
    final a0 j;
    final long k;
    final long l;
    private volatile d m;

    /* loaded from: classes.dex */
    public static class a {
        y a;
        w b;
        int c;
        String d;
        q e;
        r.a f;
        b0 g;
        a0 h;
        a0 i;
        a0 j;
        long k;
        long l;

        public a() {
            this.c = -1;
            this.f = new r.a();
        }

        a(a0 a0Var) {
            this.c = -1;
            this.a = a0Var.a;
            this.b = a0Var.b;
            this.c = a0Var.c;
            this.d = a0Var.d;
            this.e = a0Var.e;
            this.f = a0Var.f.a();
            this.g = a0Var.g;
            this.h = a0Var.h;
            this.i = a0Var.i;
            this.j = a0Var.j;
            this.k = a0Var.k;
            this.l = a0Var.l;
        }

        private void a(String str, a0 a0Var) {
            if (a0Var.g != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (a0Var.h != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (a0Var.i != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (a0Var.j == null) {
            } else {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }

        private void d(a0 a0Var) {
            if (a0Var.g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public a a(int i) {
            this.c = i;
            return this;
        }

        public a a(long j) {
            this.l = j;
            return this;
        }

        public a a(a0 a0Var) {
            if (a0Var != null) {
                a("cacheResponse", a0Var);
            }
            this.i = a0Var;
            return this;
        }

        public a a(b0 b0Var) {
            this.g = b0Var;
            return this;
        }

        public a a(q qVar) {
            this.e = qVar;
            return this;
        }

        public a a(r rVar) {
            this.f = rVar.a();
            return this;
        }

        public a a(w wVar) {
            this.b = wVar;
            return this;
        }

        public a a(y yVar) {
            this.a = yVar;
            return this;
        }

        public a a(String str) {
            this.d = str;
            return this;
        }

        public a a(String str, String str2) {
            this.f.a(str, str2);
            return this;
        }

        public a0 a() {
            if (this.a != null) {
                if (this.b != null) {
                    if (this.c >= 0) {
                        if (this.d != null) {
                            return new a0(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.c);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }

        public a b(long j) {
            this.k = j;
            return this;
        }

        public a b(a0 a0Var) {
            if (a0Var != null) {
                a("networkResponse", a0Var);
            }
            this.h = a0Var;
            return this;
        }

        public a c(a0 a0Var) {
            if (a0Var != null) {
                d(a0Var);
            }
            this.j = a0Var;
            return this;
        }
    }

    a0(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f.a();
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
    }

    public String a(String str, String str2) {
        String a2 = this.f.a(str);
        return a2 != null ? a2 : str2;
    }

    public String b(String str) {
        return a(str, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b0 b0Var = this.g;
        if (b0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        b0Var.close();
    }

    public b0 i() {
        return this.g;
    }

    public d j() {
        d dVar = this.m;
        if (dVar != null) {
            return dVar;
        }
        d a2 = d.a(this.f);
        this.m = a2;
        return a2;
    }

    public int k() {
        return this.c;
    }

    public q l() {
        return this.e;
    }

    public r m() {
        return this.f;
    }

    public boolean n() {
        int i = this.c;
        return i >= 200 && i < 300;
    }

    public String o() {
        return this.d;
    }

    public a p() {
        return new a(this);
    }

    public a0 q() {
        return this.j;
    }

    public long r() {
        return this.l;
    }

    public y s() {
        return this.a;
    }

    public long t() {
        return this.k;
    }

    public String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.c + ", message=" + this.d + ", url=" + this.a.g() + '}';
    }
}
