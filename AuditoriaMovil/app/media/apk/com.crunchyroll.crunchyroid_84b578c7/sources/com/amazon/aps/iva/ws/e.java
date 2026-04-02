package com.amazon.aps.iva.ws;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.js.t;
import com.amazon.aps.iva.js.u;
import com.amazon.aps.iva.js.v;
import com.amazon.aps.iva.ks.n;
import com.amazon.aps.iva.yb0.j;
/* compiled from: PanelAnalyticsData.kt */
/* loaded from: classes2.dex */
public final class e {
    public final int a;
    public final int b;
    public final v c;
    public final t d;
    public final n e;
    public final u f;

    public e(int i, int i2, v vVar, t tVar, n nVar) {
        u uVar = u.MEDIA;
        j.f(vVar, "contextType");
        j.f(tVar, "containerType");
        j.f(uVar, "panelContent");
        this.a = i;
        this.b = i2;
        this.c = vVar;
        this.d = tVar;
        this.e = nVar;
        this.f = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d && j.a(this.e, eVar.e) && this.f == eVar.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int a = r.a(this.b, Integer.hashCode(this.a) * 31, 31);
        int hashCode = this.d.hashCode();
        int hashCode2 = this.e.hashCode();
        return this.f.hashCode() + ((hashCode2 + ((hashCode + ((this.c.hashCode() + a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PanelAnalyticsData(positionOfFeed=" + this.a + ", positionOfPanelInFeed=" + this.b + ", contextType=" + this.c + ", containerType=" + this.d + ", panelContextObject=" + this.e + ", panelContent=" + this.f + ")";
    }
}
