package com.amazon.aps.iva.ov;

import android.view.View;
import android.widget.TextView;
/* compiled from: LayoutAddToCrunchylistButtonBinding.java */
/* loaded from: classes2.dex */
public final class f implements com.amazon.aps.iva.d9.a {
    public final /* synthetic */ int a;
    public final View b;

    public /* synthetic */ f(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                return (TextView) view;
            default:
                return view;
        }
    }
}
