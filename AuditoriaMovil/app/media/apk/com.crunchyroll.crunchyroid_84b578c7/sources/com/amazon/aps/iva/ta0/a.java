package com.amazon.aps.iva.ta0;

import android.os.Handler;
import android.os.Looper;
import com.amazon.aps.iva.qa0.c;
import com.amazon.aps.iva.qa0.g;
import com.truex.adrenderer.web.TruexWebView;
/* loaded from: classes4.dex */
public final class a extends g {
    public TruexWebView c;
    public final Handler d;

    public a(c cVar) {
        super(cVar);
        this.d = new Handler(Looper.getMainLooper());
    }
}
