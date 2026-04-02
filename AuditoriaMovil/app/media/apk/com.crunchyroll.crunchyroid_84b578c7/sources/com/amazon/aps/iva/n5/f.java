package com.amazon.aps.iva.n5;

import android.media.VolumeProvider;
/* compiled from: VolumeProviderCompat.java */
/* loaded from: classes.dex */
public final class f extends VolumeProvider {
    public final /* synthetic */ h a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, int i, int i2, int i3, String str) {
        super(i, i2, i3, str);
        this.a = hVar;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        this.a.b(i);
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        this.a.c(i);
    }
}
