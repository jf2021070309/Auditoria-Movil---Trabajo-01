package com.amazon.aps.iva.i50;

import android.content.Context;
import android.content.Intent;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.application.e;
/* compiled from: WatchScreenRouter.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.a<Intent> {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Context i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, boolean z) {
        super(0);
        this.h = z;
        this.i = context;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Intent invoke() {
        Intent intent = new Intent(this.i, e.a().e().i(this.h));
        intent.addFlags(131072);
        return intent;
    }
}
