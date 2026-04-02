package com.amazon.aps.iva.hz;

import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import com.amazon.aps.iva.yb0.j;
/* compiled from: SystemNotificationSettings.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final Context a;

    public b(Context context) {
        j.f(context, "context");
        this.a = context;
    }

    @Override // com.amazon.aps.iva.hz.a
    public final boolean a() {
        return NotificationManagerCompat.from(this.a).areNotificationsEnabled();
    }
}
