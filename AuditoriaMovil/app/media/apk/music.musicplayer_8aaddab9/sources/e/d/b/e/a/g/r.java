package e.d.b.e.a.g;
/* loaded from: classes2.dex */
public final class r<ResultT> {
    public final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final m<ResultT> f7033b = new m<>();

    /* renamed from: c  reason: collision with root package name */
    public boolean f7034c;

    /* renamed from: d  reason: collision with root package name */
    public ResultT f7035d;

    /* renamed from: e  reason: collision with root package name */
    public Exception f7036e;

    public final void a(Exception exc) {
        synchronized (this.a) {
            if (!(!this.f7034c)) {
                throw new IllegalStateException("Task is already complete");
            }
            this.f7034c = true;
            this.f7036e = exc;
        }
        this.f7033b.b(this);
    }

    public final void b(ResultT resultt) {
        synchronized (this.a) {
            if (!(!this.f7034c)) {
                throw new IllegalStateException("Task is already complete");
            }
            this.f7034c = true;
            this.f7035d = resultt;
        }
        this.f7033b.b(this);
    }

    public final void c() {
        synchronized (this.a) {
            if (this.f7034c) {
                this.f7033b.b(this);
            }
        }
    }

    public final ResultT d() {
        ResultT resultt;
        synchronized (this.a) {
            if (!this.f7034c) {
                throw new IllegalStateException("Task is not yet complete");
            }
            Exception exc = this.f7036e;
            if (exc != null) {
                throw new d(exc);
            }
            resultt = this.f7035d;
        }
        return resultt;
    }

    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.f7034c && this.f7036e == null) {
                z = true;
            }
        }
        return z;
    }
}
