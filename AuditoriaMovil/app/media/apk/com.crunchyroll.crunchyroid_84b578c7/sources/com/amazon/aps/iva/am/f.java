package com.amazon.aps.iva.am;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: SelectedProfileDiskSource.kt */
/* loaded from: classes2.dex */
public final class f extends l implements com.amazon.aps.iva.xb0.a<String> {
    public static final f h = new f();

    public f() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        com.amazon.aps.iva.fm.f fVar = com.amazon.aps.iva.fm.g.e;
        if (fVar != null) {
            return (String) fVar.e().invoke();
        }
        j.m("dependencies");
        throw null;
    }
}
