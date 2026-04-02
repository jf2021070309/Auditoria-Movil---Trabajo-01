package com.amazon.aps.iva.v6;

import android.view.Surface;
import com.amazon.aps.iva.k6.n;
/* compiled from: MediaCodecVideoDecoderException.java */
/* loaded from: classes.dex */
public final class b extends com.amazon.aps.iva.k6.m {
    public b(IllegalStateException illegalStateException, n nVar, Surface surface) {
        super(illegalStateException, nVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
