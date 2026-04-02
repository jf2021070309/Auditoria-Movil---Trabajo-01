package com.amazon.aps.iva.r4;

import com.amazon.aps.iva.p4.n;
import com.crunchyroll.crunchyroid.R;
/* compiled from: CheckBox.kt */
/* loaded from: classes.dex */
public final class p implements com.amazon.aps.iva.p4.i {
    public com.amazon.aps.iva.p4.n a = n.a.b;
    public final String b = "";
    public final f c = new f(new com.amazon.aps.iva.x4.d(R.color.glance_default_check_box, R.color.glance_default_check_box));
    public final int d = Integer.MAX_VALUE;

    @Override // com.amazon.aps.iva.p4.i
    public final com.amazon.aps.iva.p4.n a() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.p4.i
    public final void b(com.amazon.aps.iva.p4.n nVar) {
        com.amazon.aps.iva.yb0.j.f(nVar, "<set-?>");
        this.a = nVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmittableCheckBox(modifier=");
        sb.append(this.a);
        sb.append(", checked=false, text=");
        sb.append(this.b);
        sb.append(", style=null, colors=");
        sb.append(this.c);
        sb.append(", maxLines=");
        return com.amazon.aps.iva.d0.b2.b(sb, this.d, ')');
    }
}
