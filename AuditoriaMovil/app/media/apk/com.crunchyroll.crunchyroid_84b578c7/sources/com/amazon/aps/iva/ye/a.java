package com.amazon.aps.iva.ye;

import android.app.Activity;
import com.crunchyroll.cast.castlistener.VideoCastController;
/* compiled from: CastApiFeature.kt */
/* loaded from: classes.dex */
public interface a {
    VideoCastController createCastController(Activity activity);

    void endCastingSession();

    com.amazon.aps.iva.ef.a getCastMediaLoader();

    f getCastStateProvider();

    com.amazon.aps.iva.ze.c getChromecastAudioReader();

    h getPreferencesChromecastMessenger();

    j getSessionManagerProvider();

    h getSubtitleChromecastMessenger();

    h getVersionsChromecastMessenger();
}
