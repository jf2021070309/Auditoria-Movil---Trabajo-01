package com.amazon.aps.iva.bx;

import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: CommentingFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class e extends l implements com.amazon.aps.iva.xb0.l<Fragment, com.amazon.aps.iva.lu.b> {
    public static final e h = new e();

    public e() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.lu.b invoke(Fragment fragment) {
        Fragment fragment2 = fragment;
        j.f(fragment2, "fragment");
        return new d(fragment2);
    }
}
