package com.kwad.sdk.utils;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
/* loaded from: classes3.dex */
public final class h {
    private AudioManager.OnAudioFocusChangeListener aIi = new AudioManager.OnAudioFocusChangeListener() { // from class: com.kwad.sdk.utils.h.1
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(final int i) {
            if (h.this.gJ == null) {
                return;
            }
            bj.postOnUiThread(new Runnable() { // from class: com.kwad.sdk.utils.h.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (i < 0) {
                        h.this.gJ.onAudioBeOccupied();
                    } else {
                        h.this.gJ.onAudioBeReleased();
                    }
                }
            });
        }
    };
    private AudioManager awe;
    private a gJ;

    /* loaded from: classes3.dex */
    public interface a {
        void onAudioBeOccupied();

        void onAudioBeReleased();
    }

    public h(Context context) {
        this.awe = (AudioManager) context.getSystemService("audio");
    }

    private AudioFocusRequest HR() {
        return new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(3).setUsage(1).setContentType(2).build()).setAcceptsDelayedFocusGain(false).setOnAudioFocusChangeListener(this.aIi).build();
    }

    public final boolean HQ() {
        if (this.aIi != null && this.awe != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                return 1 == this.awe.requestAudioFocus(HR());
            } else if (1 == this.awe.requestAudioFocus(this.aIi, 3, 2)) {
                return true;
            }
        }
        return false;
    }

    public final void c(a aVar) {
        this.gJ = aVar;
    }
}
