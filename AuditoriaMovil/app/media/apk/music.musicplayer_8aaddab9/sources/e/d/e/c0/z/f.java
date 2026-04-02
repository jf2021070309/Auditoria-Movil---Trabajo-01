package e.d.e.c0.z;

import e.d.e.t;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class f extends e.d.e.e0.c {

    /* renamed from: l  reason: collision with root package name */
    public static final Writer f7845l = new a();

    /* renamed from: m  reason: collision with root package name */
    public static final t f7846m = new t("closed");

    /* renamed from: n  reason: collision with root package name */
    public final List<e.d.e.o> f7847n;
    public String o;
    public e.d.e.o p;

    /* loaded from: classes2.dex */
    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    public f() {
        super(f7845l);
        this.f7847n = new ArrayList();
        this.p = e.d.e.q.a;
    }

    @Override // e.d.e.e0.c
    public e.d.e.e0.c K(long j2) throws IOException {
        f0(new t(Long.valueOf(j2)));
        return this;
    }

    @Override // e.d.e.e0.c
    public e.d.e.e0.c M(Boolean bool) throws IOException {
        if (bool == null) {
            f0(e.d.e.q.a);
            return this;
        }
        f0(new t(bool));
        return this;
    }

    @Override // e.d.e.e0.c
    public e.d.e.e0.c Q(Number number) throws IOException {
        if (number == null) {
            f0(e.d.e.q.a);
            return this;
        }
        if (!this.f7917h) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        f0(new t(number));
        return this;
    }

    @Override // e.d.e.e0.c
    public e.d.e.e0.c W(String str) throws IOException {
        if (str == null) {
            f0(e.d.e.q.a);
            return this;
        }
        f0(new t(str));
        return this;
    }

    @Override // e.d.e.e0.c
    public e.d.e.e0.c a0(boolean z) throws IOException {
        f0(new t(Boolean.valueOf(z)));
        return this;
    }

    @Override // e.d.e.e0.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f7847n.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f7847n.add(f7846m);
    }

    public final e.d.e.o e0() {
        List<e.d.e.o> list = this.f7847n;
        return list.get(list.size() - 1);
    }

    @Override // e.d.e.e0.c
    public e.d.e.e0.c f() throws IOException {
        e.d.e.l lVar = new e.d.e.l();
        f0(lVar);
        this.f7847n.add(lVar);
        return this;
    }

    public final void f0(e.d.e.o oVar) {
        if (this.o != null) {
            if (!(oVar instanceof e.d.e.q) || this.f7920k) {
                ((e.d.e.r) e0()).a.put(this.o, oVar);
            }
            this.o = null;
        } else if (this.f7847n.isEmpty()) {
            this.p = oVar;
        } else {
            e.d.e.o e0 = e0();
            if (!(e0 instanceof e.d.e.l)) {
                throw new IllegalStateException();
            }
            ((e.d.e.l) e0).a.add(oVar);
        }
    }

    @Override // e.d.e.e0.c, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // e.d.e.e0.c
    public e.d.e.e0.c h() throws IOException {
        e.d.e.r rVar = new e.d.e.r();
        f0(rVar);
        this.f7847n.add(rVar);
        return this;
    }

    @Override // e.d.e.e0.c
    public e.d.e.e0.c m() throws IOException {
        if (this.f7847n.isEmpty() || this.o != null) {
            throw new IllegalStateException();
        }
        if (e0() instanceof e.d.e.l) {
            List<e.d.e.o> list = this.f7847n;
            list.remove(list.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // e.d.e.e0.c
    public e.d.e.e0.c r() throws IOException {
        if (this.f7847n.isEmpty() || this.o != null) {
            throw new IllegalStateException();
        }
        if (e0() instanceof e.d.e.r) {
            List<e.d.e.o> list = this.f7847n;
            list.remove(list.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // e.d.e.e0.c
    public e.d.e.e0.c u(String str) throws IOException {
        if (this.f7847n.isEmpty() || this.o != null) {
            throw new IllegalStateException();
        }
        if (e0() instanceof e.d.e.r) {
            this.o = str;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // e.d.e.e0.c
    public e.d.e.e0.c y() throws IOException {
        f0(e.d.e.q.a);
        return this;
    }
}
