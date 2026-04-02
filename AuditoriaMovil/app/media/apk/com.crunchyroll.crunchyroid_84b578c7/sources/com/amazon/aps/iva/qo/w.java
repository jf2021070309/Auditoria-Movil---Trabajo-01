package com.amazon.aps.iva.qo;

import androidx.lifecycle.LiveData;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: WatchScreenViewModel.kt */
/* loaded from: classes2.dex */
public interface w {
    LiveData<com.amazon.aps.iva.ez.g<g>> D5();

    com.amazon.aps.iva.az.b L8();

    com.amazon.aps.iva.az.b P1();

    void U3();

    void V7(long j, String str);

    androidx.lifecycle.c c1();

    void c8(PlayableAsset playableAsset, Playhead playhead);

    com.amazon.aps.iva.i5.u f4();

    PlayableAsset getCurrentAsset();

    ContentContainer h0();

    com.amazon.aps.iva.i5.u h4();

    void i5(String str);

    com.amazon.aps.iva.az.f<com.amazon.aps.iva.ez.g<g>> k2();

    void l0(boolean z);

    y o0();

    com.amazon.aps.iva.az.a u4();

    LiveData<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.sf.e>> x();
}
