package com.amazon.aps.iva.wy;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import java.util.Arrays;
import kotlin.Metadata;
/* compiled from: BasePresenterPreferenceFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/amazon/aps/iva/wy/f;", "Landroidx/preference/b;", "Lcom/amazon/aps/iva/cz/b;", "<init>", "()V", "mvp_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class f extends androidx.preference.b implements com.amazon.aps.iva.cz.b {
    public final com.amazon.aps.iva.cz.d j = new com.amazon.aps.iva.cz.d(this);

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        com.amazon.aps.iva.yb0.j.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        for (k kVar : this.j.c) {
            kVar.onConfigurationChanged(configuration);
        }
    }

    @Override // androidx.preference.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        k[] kVarArr = (k[]) setupPresenters().toArray(new k[0]);
        this.j.a((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        this.d.setNestedScrollingEnabled(false);
    }
}
