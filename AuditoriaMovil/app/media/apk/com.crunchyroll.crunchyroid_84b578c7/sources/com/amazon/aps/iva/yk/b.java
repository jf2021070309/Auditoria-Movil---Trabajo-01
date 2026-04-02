package com.amazon.aps.iva.yk;

import com.amazon.aps.iva.wy.j;
import com.crunchyroll.player.presentation.controls.playbackbutton.PlaybackButton;
/* compiled from: PlaybackButtonPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<g> implements a {
    public final com.amazon.aps.iva.rv.a b;

    public b(PlaybackButton playbackButton, com.amazon.aps.iva.rv.e eVar) {
        super(playbackButton, new j[0]);
        this.b = eVar;
    }

    @Override // com.amazon.aps.iva.yk.a
    public final void C() {
        if (this.b.c()) {
            getView().i9();
        } else {
            getView().n();
        }
    }
}
