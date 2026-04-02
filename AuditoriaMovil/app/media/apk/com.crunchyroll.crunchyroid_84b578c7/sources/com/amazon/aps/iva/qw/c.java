package com.amazon.aps.iva.qw;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: SubtitlesDownloadSynchronizerFactory.kt */
/* loaded from: classes2.dex */
public final class c implements b {
    public static final c a = new c();

    @Override // com.amazon.aps.iva.qw.b
    public final d a(int i, j jVar, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "failure");
        return new d(new AtomicInteger(i), jVar, lVar);
    }
}
