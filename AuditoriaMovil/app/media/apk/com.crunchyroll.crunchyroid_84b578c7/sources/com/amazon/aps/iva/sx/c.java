package com.amazon.aps.iva.sx;

import android.app.Activity;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: WatchScreenDependenciesImpl.kt */
/* loaded from: classes2.dex */
public final class c extends l implements p<Activity, Boolean, e> {
    public static final c h = new c();

    public c() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final e invoke(Activity activity, Boolean bool) {
        Activity activity2 = activity;
        boolean booleanValue = bool.booleanValue();
        j.f(activity2, "activity");
        return new e(activity2, booleanValue);
    }
}
