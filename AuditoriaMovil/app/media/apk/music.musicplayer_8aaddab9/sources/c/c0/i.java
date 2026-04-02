package c.c0;

import android.app.Notification;
/* loaded from: classes.dex */
public final class i {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1601b;

    /* renamed from: c  reason: collision with root package name */
    public final Notification f1602c;

    public i(int i2, Notification notification, int i3) {
        this.a = i2;
        this.f1602c = notification;
        this.f1601b = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.a == iVar.a && this.f1601b == iVar.f1601b) {
            return this.f1602c.equals(iVar.f1602c);
        }
        return false;
    }

    public int hashCode() {
        return this.f1602c.hashCode() + (((this.a * 31) + this.f1601b) * 31);
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.f1601b + ", mNotification=" + this.f1602c + '}';
    }
}
