package com.amazon.aps.iva.h6;

import java.io.IOException;
/* compiled from: SampleQueueMappingException.java */
/* loaded from: classes.dex */
public final class q extends IOException {
    public q(String str) {
        super(defpackage.e.e("Unable to bind a sample queue to TrackGroup with MIME type ", str, "."));
    }
}
