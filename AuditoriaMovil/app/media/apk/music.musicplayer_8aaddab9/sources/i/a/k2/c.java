package i.a.k2;

import i.a.h0;
import i.a.y0;
import java.util.concurrent.RejectedExecutionException;
/* loaded from: classes2.dex */
public class c extends y0 {

    /* renamed from: b  reason: collision with root package name */
    public final int f9116b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9117c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9118d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9119e;

    /* renamed from: f  reason: collision with root package name */
    public a f9120f;

    public c(int i2, int i3, String str, int i4) {
        int i5 = (i4 & 1) != 0 ? l.f9129b : i2;
        int i6 = (i4 & 2) != 0 ? l.f9130c : i3;
        String str2 = (i4 & 4) != 0 ? "DefaultDispatcher" : null;
        long j2 = l.f9131d;
        this.f9116b = i5;
        this.f9117c = i6;
        this.f9118d = j2;
        this.f9119e = str2;
        this.f9120f = new a(i5, i6, j2, str2);
    }

    @Override // i.a.c0
    public void e0(h.m.f fVar, Runnable runnable) {
        try {
            a.m(this.f9120f, runnable, null, false, 6);
        } catch (RejectedExecutionException unused) {
            h0.f8996g.o0(runnable);
        }
    }

    @Override // i.a.c0
    public void f0(h.m.f fVar, Runnable runnable) {
        try {
            a.m(this.f9120f, runnable, null, true, 2);
        } catch (RejectedExecutionException unused) {
            h0.f8996g.o0(runnable);
        }
    }
}
