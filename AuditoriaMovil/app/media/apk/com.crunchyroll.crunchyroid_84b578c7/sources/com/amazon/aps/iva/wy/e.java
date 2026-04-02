package com.amazon.aps.iva.wy;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.Arrays;
import kotlin.Metadata;
/* compiled from: BasePresenterFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/amazon/aps/iva/wy/e;", "Landroidx/fragment/app/Fragment;", "Lcom/amazon/aps/iva/cz/b;", "mvp_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class e extends Fragment implements com.amazon.aps.iva.cz.b {
    public final com.amazon.aps.iva.cz.d b;

    public e() {
        this(0);
    }

    public void ci(Intent intent) {
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        for (k kVar : this.b.c) {
            kVar.onNewIntent(intent);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        com.amazon.aps.iva.yb0.j.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        for (k kVar : this.b.c) {
            kVar.onConfigurationChanged(configuration);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        com.amazon.aps.iva.aq.j.M(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        k[] kVarArr = (k[]) setupPresenters().toArray(new k[0]);
        this.b.a((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
    }

    public e(int i) {
        super(i);
        this.b = new com.amazon.aps.iva.cz.d(this);
    }
}
