package com.amazon.aps.iva.xw;

import android.app.Activity;
import android.view.View;
/* compiled from: ButterKnife.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Activity, Integer, View> {
    public static final j h = new j();

    public j() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final View invoke(Activity activity, Integer num) {
        Activity activity2 = activity;
        int intValue = num.intValue();
        com.amazon.aps.iva.yb0.j.f(activity2, "$this$null");
        return activity2.findViewById(intValue);
    }
}
