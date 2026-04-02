package c.c0.d0.r;

import androidx.work.impl.foreground.SystemForegroundService;
/* loaded from: classes.dex */
public class e implements Runnable {
    public final /* synthetic */ int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f1493b;

    public e(SystemForegroundService systemForegroundService, int i2) {
        this.f1493b = systemForegroundService;
        this.a = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1493b.f670f.cancel(this.a);
    }
}
