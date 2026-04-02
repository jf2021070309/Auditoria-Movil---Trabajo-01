package com.amazon.aps.iva.l40;

import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: ShowPageActivity.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class j extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<String, PlayableAsset> {
    public j(j1 j1Var) {
        super(1, j1Var, j1.class, "getAsset", "getAsset(Ljava/lang/String;)Lcom/ellation/crunchyroll/model/PlayableAsset;", 0);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final PlayableAsset invoke(String str) {
        String str2 = str;
        com.amazon.aps.iva.yb0.j.f(str2, "p0");
        return ((j1) this.receiver).j7(str2);
    }
}
