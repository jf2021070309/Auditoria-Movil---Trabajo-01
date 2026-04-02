package c.i.c;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
/* loaded from: classes.dex */
public class l extends n {

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f1972b;

    @Override // c.i.c.n
    public void a(Bundle bundle) {
        bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        if (Build.VERSION.SDK_INT < 21) {
            bundle.putCharSequence("android.bigText", this.f1972b);
        }
    }

    @Override // c.i.c.n
    public void b(i iVar) {
        new Notification.BigTextStyle(((o) iVar).f1986b).setBigContentTitle(null).bigText(this.f1972b);
    }

    @Override // c.i.c.n
    public String f() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
