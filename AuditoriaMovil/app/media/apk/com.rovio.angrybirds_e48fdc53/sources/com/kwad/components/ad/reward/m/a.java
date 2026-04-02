package com.kwad.components.ad.reward.m;

import android.content.Context;
/* loaded from: classes.dex */
public class a implements b {
    private Context mContext;
    private com.kwad.components.ad.reward.j qB;

    public a(Context context, com.kwad.components.ad.reward.j jVar) {
        this.qB = jVar;
        this.mContext = context;
    }

    @Override // com.kwad.components.ad.reward.m.b
    public final void gW() {
        this.qB.a(1, this.mContext, 1, 1);
    }

    @Override // com.kwad.components.ad.reward.m.b
    public void ir() {
        this.qB.a(1, this.mContext, 13, 2);
    }

    @Override // com.kwad.components.ad.reward.m.b
    public void is() {
        this.qB.a(1, this.mContext, 117, 2);
    }
}
