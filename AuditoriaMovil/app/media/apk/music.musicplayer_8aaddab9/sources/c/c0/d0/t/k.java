package c.c0.d0.t;

import androidx.work.WorkerParameters;
/* loaded from: classes.dex */
public class k implements Runnable {
    public c.c0.d0.l a;

    /* renamed from: b  reason: collision with root package name */
    public String f1544b;

    /* renamed from: c  reason: collision with root package name */
    public WorkerParameters.a f1545c;

    public k(c.c0.d0.l lVar, String str, WorkerParameters.a aVar) {
        this.a = lVar;
        this.f1544b = str;
        this.f1545c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.f1375i.g(this.f1544b, this.f1545c);
    }
}
