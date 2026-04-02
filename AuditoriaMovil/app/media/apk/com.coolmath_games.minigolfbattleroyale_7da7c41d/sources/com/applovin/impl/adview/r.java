package com.applovin.impl.adview;

import android.content.Context;
import com.applovin.impl.adview.j;
/* loaded from: classes.dex */
public final class r extends j {
    public r(Context context) {
        super(context);
    }

    @Override // com.applovin.impl.adview.j
    public void a(int i) {
        setViewScale(i / 30.0f);
    }

    @Override // com.applovin.impl.adview.j
    public j.a getStyle() {
        return j.a.INVISIBLE;
    }
}
