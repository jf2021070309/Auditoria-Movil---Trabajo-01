package c.i.h;

import android.content.Context;
import c.i.h.j;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public class f implements Callable<j.a> {
    public final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f2083b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f2084c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2085d;

    public f(String str, Context context, e eVar, int i2) {
        this.a = str;
        this.f2083b = context;
        this.f2084c = eVar;
        this.f2085d = i2;
    }

    @Override // java.util.concurrent.Callable
    public j.a call() throws Exception {
        return j.a(this.a, this.f2083b, this.f2084c, this.f2085d);
    }
}
