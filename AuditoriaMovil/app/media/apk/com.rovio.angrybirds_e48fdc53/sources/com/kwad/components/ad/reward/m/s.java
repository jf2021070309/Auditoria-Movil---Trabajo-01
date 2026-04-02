package com.kwad.components.ad.reward.m;

import android.view.ViewGroup;
import android.view.ViewStub;
/* loaded from: classes.dex */
public abstract class s extends d {
    protected ViewGroup sA;

    public final void a(ViewGroup viewGroup, int i, int i2) {
        if (this.sA != null) {
            return;
        }
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(i);
        this.sA = (ViewGroup) (viewStub != null ? viewStub.inflate() : viewGroup.findViewById(i2));
    }

    @Override // com.kwad.components.ad.reward.m.d
    public ViewGroup gS() {
        return this.sA;
    }
}
