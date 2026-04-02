package com.amazon.aps.iva.b10;

import com.ellation.crunchyroll.model.Episode;
/* compiled from: NotificationData.kt */
/* loaded from: classes2.dex */
public final class j {
    public final Episode a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public j(Episode episode, int i, int i2, int i3, int i4) {
        com.amazon.aps.iva.yb0.j.f(episode, "episode");
        this.a = episode;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, jVar.a) && this.b == jVar.b && this.c == jVar.c && this.d == jVar.d && this.e == jVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + com.amazon.aps.iva.a0.r.a(this.d, com.amazon.aps.iva.a0.r.a(this.c, com.amazon.aps.iva.a0.r.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationData(episode=");
        sb.append(this.a);
        sb.append(", syncedAssetsCount=");
        sb.append(this.b);
        sb.append(", totalAssetsCount=");
        sb.append(this.c);
        sb.append(", pausedAssetsCount=");
        sb.append(this.d);
        sb.append(", failedAssetsCount=");
        return defpackage.e.f(sb, this.e, ")");
    }
}
