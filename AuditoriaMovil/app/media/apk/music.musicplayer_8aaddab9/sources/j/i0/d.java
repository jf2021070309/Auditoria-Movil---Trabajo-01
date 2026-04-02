package j.i0;

import java.util.concurrent.ThreadFactory;
/* loaded from: classes2.dex */
public class d implements ThreadFactory {
    public final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f9282b;

    public d(String str, boolean z) {
        this.a = str;
        this.f9282b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.a);
        thread.setDaemon(this.f9282b);
        return thread;
    }
}
