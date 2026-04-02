package com.kwad.components.ad.reward.m;

import android.view.ViewGroup;
import com.kwad.sdk.utils.ai;
/* loaded from: classes.dex */
public abstract class d {
    /* JADX INFO: Access modifiers changed from: protected */
    public void a(r rVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ac(boolean z) {
    }

    public final void b(r rVar) {
        a(rVar);
        gS().getContext();
        ac(ai.IK());
    }

    public abstract ViewGroup gS();

    public void onUnbind() {
    }
}
