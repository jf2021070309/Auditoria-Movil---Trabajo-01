package com.amazon.aps.iva.js;
/* compiled from: ScreenNameProperty.kt */
/* loaded from: classes2.dex */
public final class f0 extends com.amazon.aps.iva.is.a {
    private final String screenName;

    public f0(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "screenName");
        this.screenName = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f0) && com.amazon.aps.iva.yb0.j.a(this.screenName, ((f0) obj).screenName)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.screenName.hashCode();
    }

    public final String toString() {
        return defpackage.e.e("ScreenNameProperty(screenName=", this.screenName, ")");
    }
}
