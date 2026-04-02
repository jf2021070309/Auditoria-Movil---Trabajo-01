package com.amazon.aps.iva.ex;

import android.app.Activity;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.internal.ImagesContract;
/* compiled from: CrunchylistsFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class g implements com.amazon.aps.iva.gn.e {
    public final /* synthetic */ Activity b;

    public g(androidx.fragment.app.h hVar) {
        this.b = hVar;
    }

    @Override // com.amazon.aps.iva.gn.e
    public final void Tb(String str) {
        j.f(str, ImagesContract.URL);
        Activity activity = this.b;
        activity.startActivity(com.amazon.aps.iva.gd0.j.i(activity, str));
    }
}
