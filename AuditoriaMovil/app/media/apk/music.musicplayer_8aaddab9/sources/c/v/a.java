package c.v;

import android.content.Context;
import c.v.f;
import c.x.a.c;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class a {
    public final c.InterfaceC0058c a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f2738b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2739c;

    /* renamed from: d  reason: collision with root package name */
    public final f.d f2740d;

    /* renamed from: e  reason: collision with root package name */
    public final List<f.b> f2741e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2742f;

    /* renamed from: g  reason: collision with root package name */
    public final f.c f2743g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f2744h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f2745i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f2746j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f2747k;

    public a(Context context, String str, c.InterfaceC0058c interfaceC0058c, f.d dVar, List<f.b> list, boolean z, f.c cVar, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file) {
        this.a = interfaceC0058c;
        this.f2738b = context;
        this.f2739c = str;
        this.f2740d = dVar;
        this.f2741e = list;
        this.f2742f = z;
        this.f2743g = cVar;
        this.f2744h = executor;
        this.f2745i = executor2;
        this.f2746j = z3;
        this.f2747k = z4;
    }

    public boolean a(int i2, int i3) {
        return !((i2 > i3) && this.f2747k) && this.f2746j;
    }
}
