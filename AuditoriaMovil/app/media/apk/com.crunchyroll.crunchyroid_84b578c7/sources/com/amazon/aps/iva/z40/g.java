package com.amazon.aps.iva.z40;

import android.content.ActivityNotFoundException;
import com.amazon.aps.iva.wy.j;
import com.ellation.crunchyroll.presentation.update.UpdateAppActivity;
/* compiled from: UpdateAppPresenter.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.wy.b<h> implements f {
    public final String b;

    public g(UpdateAppActivity updateAppActivity, String str) {
        super(updateAppActivity, new j[0]);
        this.b = str;
    }

    @Override // com.amazon.aps.iva.z40.f
    public final void E1() {
        String str = this.b;
        try {
            getView().Qb(str);
        } catch (ActivityNotFoundException unused) {
            getView().F8(str);
        }
    }
}
