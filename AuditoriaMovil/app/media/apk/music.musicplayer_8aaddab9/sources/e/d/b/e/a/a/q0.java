package e.d.b.e.a.a;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public final class q0 {
    public static final e.d.b.e.a.c.e a = new e.d.b.e.a.c.e("ExtractorLooper");

    /* renamed from: b  reason: collision with root package name */
    public final h1 f6891b;

    /* renamed from: c  reason: collision with root package name */
    public final n0 f6892c;

    /* renamed from: d  reason: collision with root package name */
    public final k2 f6893d;

    /* renamed from: e  reason: collision with root package name */
    public final u1 f6894e;

    /* renamed from: f  reason: collision with root package name */
    public final y1 f6895f;

    /* renamed from: g  reason: collision with root package name */
    public final d2 f6896g;

    /* renamed from: h  reason: collision with root package name */
    public final e.d.b.e.a.c.b0<e3> f6897h;

    /* renamed from: i  reason: collision with root package name */
    public final k1 f6898i;

    /* renamed from: j  reason: collision with root package name */
    public final AtomicBoolean f6899j = new AtomicBoolean(false);

    public q0(h1 h1Var, e.d.b.e.a.c.b0<e3> b0Var, n0 n0Var, k2 k2Var, u1 u1Var, y1 y1Var, d2 d2Var, k1 k1Var) {
        this.f6891b = h1Var;
        this.f6897h = b0Var;
        this.f6892c = n0Var;
        this.f6893d = k2Var;
        this.f6894e = u1Var;
        this.f6895f = y1Var;
        this.f6896g = d2Var;
        this.f6898i = k1Var;
    }

    public final void a(final int i2, Exception exc) {
        try {
            final h1 h1Var = this.f6891b;
            h1Var.a(new g1(h1Var, i2) { // from class: e.d.b.e.a.a.a1
                public final h1 a;

                /* renamed from: b  reason: collision with root package name */
                public final int f6732b;

                {
                    this.a = h1Var;
                    this.f6732b = i2;
                }

                @Override // e.d.b.e.a.a.g1
                public final Object a() {
                    this.a.b(this.f6732b).f6773c.f6755c = 5;
                    return null;
                }
            });
            h1 h1Var2 = this.f6891b;
            h1Var2.a(new b1(h1Var2, i2));
        } catch (p0 unused) {
            a.a(6, "Error during error handling: %s", new Object[]{exc.getMessage()});
        }
    }
}
