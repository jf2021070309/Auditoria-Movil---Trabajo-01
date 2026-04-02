package com.amazon.aps.iva.k9;

import android.app.Notification;
/* compiled from: ForegroundInfo.java */
/* loaded from: classes.dex */
public final class g {
    public final int a;
    public final int b;
    public final Notification c;

    public g(int i, int i2, Notification notification) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.a != gVar.a || this.b != gVar.b) {
            return false;
        }
        return this.c.equals(gVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
