package com.amazon.aps.iva;

import com.amazon.aps.iva.types.AdMediaState;
/* loaded from: classes.dex */
public interface ApsIvaSdk {
    void adMediaDurationChanged(String str, float f);

    void adMediaEnded(String str);

    void adMediaPaused(String str);

    void adMediaPlayed(String str);

    void adMediaPlaying(String str);

    void adMediaSeeked(String str);

    void adMediaSeeking(String str);

    void adMediaStalled(String str);

    void adMediaVolumeChanged(String str, float f, boolean z);

    void appBackgrounded(String str);

    void appForegrounded(String str);

    void clear();

    void fatalError(String str, int i, String str2);

    void updateAdMediaState(String str, AdMediaState adMediaState);
}
