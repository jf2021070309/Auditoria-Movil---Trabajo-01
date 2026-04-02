package com.amazon.aps.iva.cg;

import com.amazon.aps.iva.cg.u;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: DeepLinkInput.kt */
/* loaded from: classes.dex */
public final class c0 extends e0 {
    public final com.amazon.aps.iva.dg.a c;
    public final d0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.amazon.aps.iva.dg.a aVar, d0 d0Var) {
        super(u.a.SETTINGS, aVar);
        com.amazon.aps.iva.yb0.j.f(d0Var, FirebaseAnalytics.Param.DESTINATION);
        this.c = aVar;
        this.d = d0Var;
    }

    @Override // com.amazon.aps.iva.cg.e0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.c, c0Var.c) && this.d == c0Var.d) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.cg.e0, com.amazon.aps.iva.cg.u
    public final com.amazon.aps.iva.dg.a getUri() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.cg.e0
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "SettingsDeepLinkRawInput(uri=" + this.c + ", destination=" + this.d + ")";
    }
}
