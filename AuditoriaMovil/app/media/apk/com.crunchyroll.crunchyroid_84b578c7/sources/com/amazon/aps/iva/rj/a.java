package com.amazon.aps.iva.rj;

import android.view.ViewGroup;
import com.amazon.aps.iva.lb0.z;
import java.util.List;
/* compiled from: AdViewProviderDecorator.kt */
/* loaded from: classes.dex */
public final class a implements com.amazon.aps.iva.q5.d {
    public androidx.media3.ui.d b;

    @Override // com.amazon.aps.iva.q5.d
    public final List<com.amazon.aps.iva.q5.a> getAdOverlayInfos() {
        List<com.amazon.aps.iva.q5.a> list;
        androidx.media3.ui.d dVar = this.b;
        if (dVar != null) {
            list = dVar.getAdOverlayInfos();
        } else {
            list = null;
        }
        if (list == null) {
            return z.b;
        }
        return list;
    }

    @Override // com.amazon.aps.iva.q5.d
    public final ViewGroup getAdViewGroup() {
        androidx.media3.ui.d dVar = this.b;
        if (dVar != null) {
            return dVar.getAdViewGroup();
        }
        return null;
    }
}
