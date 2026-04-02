package c.i.h;

import android.content.Context;
import c.i.h.j;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public class h implements Callable<j.a> {
    public final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f2086b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f2087c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2088d;

    public h(String str, Context context, e eVar, int i2) {
        this.a = str;
        this.f2086b = context;
        this.f2087c = eVar;
        this.f2088d = i2;
    }

    @Override // java.util.concurrent.Callable
    public j.a call() throws Exception {
        try {
            return j.a(this.a, this.f2086b, this.f2087c, this.f2088d);
        } catch (Throwable unused) {
            return new j.a(-3);
        }
    }
}
