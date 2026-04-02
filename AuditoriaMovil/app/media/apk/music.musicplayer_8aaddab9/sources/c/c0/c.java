package c.c0;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public final class c {
    public final Executor a = a(false);

    /* renamed from: b  reason: collision with root package name */
    public final Executor f1317b = a(true);

    /* renamed from: c  reason: collision with root package name */
    public final c0 f1318c;

    /* renamed from: d  reason: collision with root package name */
    public final m f1319d;

    /* renamed from: e  reason: collision with root package name */
    public final c.c0.d0.a f1320e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1321f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1322g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1323h;

    /* loaded from: classes.dex */
    public static final class a {
    }

    /* loaded from: classes.dex */
    public interface b {
        c a();
    }

    public c(a aVar) {
        String str = c0.a;
        this.f1318c = new b0();
        this.f1319d = new l();
        this.f1320e = new c.c0.d0.a();
        this.f1321f = 4;
        this.f1322g = Integer.MAX_VALUE;
        this.f1323h = 20;
    }

    public final Executor a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new c.c0.b(this, z));
    }
}
