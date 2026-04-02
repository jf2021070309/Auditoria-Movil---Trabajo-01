package c.p;

import android.os.Handler;
import c.p.j;
/* loaded from: classes.dex */
public class f0 {
    public final r a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f2456b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    public a f2457c;

    /* loaded from: classes.dex */
    public static class a implements Runnable {
        public final r a;

        /* renamed from: b  reason: collision with root package name */
        public final j.a f2458b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2459c = false;

        public a(r rVar, j.a aVar) {
            this.a = rVar;
            this.f2458b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2459c) {
                return;
            }
            this.a.e(this.f2458b);
            this.f2459c = true;
        }
    }

    public f0(p pVar) {
        this.a = new r(pVar);
    }

    public final void a(j.a aVar) {
        a aVar2 = this.f2457c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.a, aVar);
        this.f2457c = aVar3;
        this.f2456b.postAtFrontOfQueue(aVar3);
    }
}
