package e.d.b.b.j.c0.h;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import e.d.b.b.j.c0.i.a0;
import e.d.b.b.j.d0.b;
import java.util.Objects;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ u a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e.d.b.b.j.r f6159b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f6160c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Runnable f6161d;

    public /* synthetic */ d(u uVar, e.d.b.b.j.r rVar, int i2, Runnable runnable) {
        this.a = uVar;
        this.f6159b = rVar;
        this.f6160c = i2;
        this.f6161d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final u uVar = this.a;
        final e.d.b.b.j.r rVar = this.f6159b;
        final int i2 = this.f6160c;
        Runnable runnable = this.f6161d;
        Objects.requireNonNull(uVar);
        try {
            try {
                e.d.b.b.j.d0.b bVar = uVar.f6188f;
                final a0 a0Var = uVar.f6185c;
                Objects.requireNonNull(a0Var);
                bVar.f(new b.a() { // from class: e.d.b.b.j.c0.h.b
                    @Override // e.d.b.b.j.d0.b.a
                    public final Object a() {
                        return Integer.valueOf(a0.this.d());
                    }
                });
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) uVar.a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    uVar.a(rVar, i2);
                } else {
                    uVar.f6188f.f(new b.a() { // from class: e.d.b.b.j.c0.h.k
                        @Override // e.d.b.b.j.d0.b.a
                        public final Object a() {
                            u uVar2 = u.this;
                            uVar2.f6186d.a(rVar, i2 + 1);
                            return null;
                        }
                    });
                }
            } catch (e.d.b.b.j.d0.a unused) {
                uVar.f6186d.a(rVar, i2 + 1);
            }
        } finally {
            runnable.run();
        }
    }
}
