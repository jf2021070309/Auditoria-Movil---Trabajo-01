package e.d.d.m.j.j;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class h0 extends j {
    public final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ExecutorService f7171b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f7172c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f7173d;

    public h0(String str, ExecutorService executorService, long j2, TimeUnit timeUnit) {
        this.a = str;
        this.f7171b = executorService;
        this.f7172c = j2;
        this.f7173d = timeUnit;
    }

    @Override // e.d.d.m.j.j.j
    public void a() {
        try {
            e.d.d.m.j.f fVar = e.d.d.m.j.f.a;
            fVar.a(3);
            this.f7171b.shutdown();
            if (this.f7171b.awaitTermination(this.f7172c, this.f7173d)) {
                return;
            }
            fVar.a(3);
            this.f7171b.shutdownNow();
        } catch (InterruptedException unused) {
            e.d.d.m.j.f fVar2 = e.d.d.m.j.f.a;
            String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.a);
            fVar2.a(3);
            this.f7171b.shutdownNow();
        }
    }
}
