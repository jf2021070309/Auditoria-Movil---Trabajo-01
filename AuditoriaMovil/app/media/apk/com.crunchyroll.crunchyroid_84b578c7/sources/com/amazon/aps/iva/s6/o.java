package com.amazon.aps.iva.s6;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import com.google.common.collect.Ordering;
/* compiled from: DefaultTrackSelector.java */
/* loaded from: classes.dex */
public final class o implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ g a;

    public o(g gVar) {
        this.a = gVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        g gVar = this.a;
        Ordering<Integer> ordering = g.k;
        gVar.u0();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        g gVar = this.a;
        Ordering<Integer> ordering = g.k;
        gVar.u0();
    }
}
