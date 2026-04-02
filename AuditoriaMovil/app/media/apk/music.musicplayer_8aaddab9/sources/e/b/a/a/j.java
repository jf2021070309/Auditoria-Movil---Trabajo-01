package e.b.a.a;

import java.util.concurrent.CountDownLatch;
/* loaded from: classes.dex */
public class j extends e.b.a.a.v.b {
    public final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f5359b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f5360c;

    public j(k kVar, String str, CountDownLatch countDownLatch) {
        this.f5360c = kVar;
        this.a = str;
        this.f5359b = countDownLatch;
    }

    @Override // e.b.a.a.v.a
    public void c(h hVar) {
        if (this.a.equals(hVar.f5329h)) {
            this.f5359b.countDown();
            b bVar = this.f5360c.f5361b.a;
            if (bVar.f5238b.remove(this)) {
                bVar.f5239c.decrementAndGet();
            }
        }
    }
}
