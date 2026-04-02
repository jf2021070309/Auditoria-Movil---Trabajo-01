package com.kwad.components.ad.interstitial.d;

import com.kwad.sdk.mvp.Presenter;
import java.util.List;
/* loaded from: classes.dex */
public class b extends Presenter {
    public c jh;

    @Override // com.kwad.sdk.mvp.Presenter
    public void ah() {
        super.ah();
        this.jh = (c) Gh();
    }

    public void cO() {
        List<Presenter> Gg = Gg();
        if (Gg == null) {
            return;
        }
        for (Presenter presenter : Gg) {
            if (presenter instanceof b) {
                ((b) presenter).cO();
            }
        }
    }

    public void cP() {
        List<Presenter> Gg = Gg();
        if (Gg == null) {
            return;
        }
        for (Presenter presenter : Gg) {
            if (presenter instanceof b) {
                ((b) presenter).cP();
            }
        }
    }
}
