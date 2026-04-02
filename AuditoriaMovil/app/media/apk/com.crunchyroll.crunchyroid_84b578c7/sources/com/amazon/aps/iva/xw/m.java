package com.amazon.aps.iva.xw;

import android.view.View;
import androidx.fragment.app.Fragment;
/* compiled from: ButterKnife.kt */
/* loaded from: classes2.dex */
public final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Fragment, Integer, View> {
    public static final m h = new m();

    public m() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final View invoke(Fragment fragment, Integer num) {
        Fragment fragment2 = fragment;
        int intValue = num.intValue();
        com.amazon.aps.iva.yb0.j.f(fragment2, "$this$null");
        View view = fragment2.getView();
        if (view != null) {
            return view.findViewById(intValue);
        }
        return null;
    }
}
