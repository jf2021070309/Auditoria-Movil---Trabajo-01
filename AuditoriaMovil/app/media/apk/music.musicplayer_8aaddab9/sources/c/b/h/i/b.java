package c.b.h.i;

import android.content.Context;
import android.view.LayoutInflater;
import c.b.h.i.m;
/* loaded from: classes.dex */
public abstract class b implements m {
    public Context a;

    /* renamed from: b  reason: collision with root package name */
    public Context f962b;

    /* renamed from: c  reason: collision with root package name */
    public g f963c;

    /* renamed from: d  reason: collision with root package name */
    public LayoutInflater f964d;

    /* renamed from: e  reason: collision with root package name */
    public m.a f965e;

    /* renamed from: f  reason: collision with root package name */
    public int f966f;

    /* renamed from: g  reason: collision with root package name */
    public int f967g;

    /* renamed from: h  reason: collision with root package name */
    public n f968h;

    public b(Context context, int i2, int i3) {
        this.a = context;
        this.f964d = LayoutInflater.from(context);
        this.f966f = i2;
        this.f967g = i3;
    }

    @Override // c.b.h.i.m
    public boolean e(g gVar, i iVar) {
        return false;
    }

    @Override // c.b.h.i.m
    public boolean f(g gVar, i iVar) {
        return false;
    }

    @Override // c.b.h.i.m
    public void g(m.a aVar) {
        this.f965e = aVar;
    }
}
