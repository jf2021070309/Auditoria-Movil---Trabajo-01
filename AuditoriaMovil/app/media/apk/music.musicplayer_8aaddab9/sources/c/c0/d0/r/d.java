package c.c0.d0.r;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;
/* loaded from: classes.dex */
public class d implements Runnable {
    public final /* synthetic */ int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Notification f1491b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f1492c;

    public d(SystemForegroundService systemForegroundService, int i2, Notification notification) {
        this.f1492c = systemForegroundService;
        this.a = i2;
        this.f1491b = notification;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1492c.f670f.notify(this.a, this.f1491b);
    }
}
