package e.d.b.e.a.a;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class q1 implements e.d.b.e.a.c.e0<p1> {
    public final e.d.b.e.a.c.e0<String> a;

    /* renamed from: b  reason: collision with root package name */
    public final e.d.b.e.a.c.e0<t> f6900b;

    /* renamed from: c  reason: collision with root package name */
    public final e.d.b.e.a.c.e0<t0> f6901c;

    /* renamed from: d  reason: collision with root package name */
    public final e.d.b.e.a.c.e0<Context> f6902d;

    /* renamed from: e  reason: collision with root package name */
    public final e.d.b.e.a.c.e0<a2> f6903e;

    /* renamed from: f  reason: collision with root package name */
    public final e.d.b.e.a.c.e0<Executor> f6904f;

    public q1(e.d.b.e.a.c.e0<String> e0Var, e.d.b.e.a.c.e0<t> e0Var2, e.d.b.e.a.c.e0<t0> e0Var3, e.d.b.e.a.c.e0<Context> e0Var4, e.d.b.e.a.c.e0<a2> e0Var5, e.d.b.e.a.c.e0<Executor> e0Var6) {
        this.a = e0Var;
        this.f6900b = e0Var2;
        this.f6901c = e0Var3;
        this.f6902d = e0Var4;
        this.f6903e = e0Var5;
        this.f6904f = e0Var6;
    }

    @Override // e.d.b.e.a.c.e0
    public final /* bridge */ /* synthetic */ p1 a() {
        String a = this.a.a();
        t a2 = this.f6900b.a();
        t0 a3 = this.f6901c.a();
        Context a4 = ((a3) this.f6902d).a();
        a2 a5 = this.f6903e.a();
        return new p1(a != null ? new File(a4.getExternalFilesDir(null), a) : a4.getExternalFilesDir(null), a2, a3, a4, a5, e.d.b.e.a.c.d0.b(this.f6904f));
    }
}
