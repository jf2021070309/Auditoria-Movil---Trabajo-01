package com.amazon.aps.iva.ll;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: BasePlayerSettingsFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/aps/iva/ll/a;", "Lcom/amazon/aps/iva/wy/e;", "<init>", "()V", "player_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class a extends com.amazon.aps.iva.wy.e {
    public final boolean c;
    public final int d;

    public a() {
        super(0);
        this.c = true;
        this.d = R.layout.fragment_settings_options;
    }

    public boolean getCanGoBack() {
        return this.c;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(layoutInflater, "inflater");
        return layoutInflater.inflate(this.d, viewGroup, false);
    }
}
