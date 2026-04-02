package com.amazon.aps.iva.bx;

import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: CommentingFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.l<Fragment, com.amazon.aps.iva.iu.a> {
    public final /* synthetic */ com.amazon.aps.iva.yg.c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.amazon.aps.iva.yg.d dVar) {
        super(1);
        this.h = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.iu.a invoke(Fragment fragment) {
        Fragment fragment2 = fragment;
        j.f(fragment2, "fragment");
        return new b(this.h, fragment2);
    }
}
