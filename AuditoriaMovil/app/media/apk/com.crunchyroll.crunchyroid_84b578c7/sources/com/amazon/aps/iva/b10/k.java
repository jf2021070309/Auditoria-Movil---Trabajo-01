package com.amazon.aps.iva.b10;
/* compiled from: NotificationInput.kt */
/* loaded from: classes2.dex */
public final class k {
    public final String a;
    public final l b;

    public k(String str, l lVar) {
        com.amazon.aps.iva.yb0.j.f(str, "notificationId");
        com.amazon.aps.iva.yb0.j.f(lVar, "state");
        this.a = str;
        this.b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, kVar.a) && this.b == kVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NotificationInput(notificationId=" + this.a + ", state=" + this.b + ")";
    }
}
