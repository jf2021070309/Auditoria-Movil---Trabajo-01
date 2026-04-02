package com.amazon.aps.iva.f8;

import android.os.Bundle;
/* compiled from: MediaRouteDiscoveryRequest.java */
/* loaded from: classes.dex */
public final class z {
    public final Bundle a;
    public e0 b;

    public z(e0 e0Var, boolean z) {
        if (e0Var != null) {
            Bundle bundle = new Bundle();
            this.a = bundle;
            this.b = e0Var;
            bundle.putBundle("selector", e0Var.a);
            bundle.putBoolean("activeScan", z);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.b == null) {
            e0 b = e0.b(this.a.getBundle("selector"));
            this.b = b;
            if (b == null) {
                this.b = e0.c;
            }
        }
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        a();
        e0 e0Var = this.b;
        zVar.a();
        if (!e0Var.equals(zVar.b) || b() != zVar.b()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        a();
        return this.b.hashCode() ^ b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb.append(this.b);
        sb.append(", activeScan=");
        sb.append(b());
        sb.append(", isValid=");
        a();
        e0 e0Var = this.b;
        e0Var.a();
        return com.amazon.aps.iva.e4.e.c(sb, !e0Var.b.contains(null), " }");
    }
}
