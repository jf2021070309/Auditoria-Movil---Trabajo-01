package com.moat.analytics.mobile.vng;

import android.media.MediaPlayer;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
class u extends h<MediaPlayer> implements NativeVideoTracker {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u(String str) {
        super(str);
        p.a(3, "NativeVideoTracker", this, "In initialization method.");
        p.a("[SUCCESS] ", a() + " created");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.moat.analytics.mobile.vng.b
    public String a() {
        return "NativeVideoTracker";
    }

    @Override // com.moat.analytics.mobile.vng.c
    protected Map<String, Object> g() {
        MediaPlayer mediaPlayer = (MediaPlayer) this.j.get();
        HashMap hashMap = new HashMap();
        hashMap.put("width", Integer.valueOf(mediaPlayer.getVideoWidth()));
        hashMap.put("height", Integer.valueOf(mediaPlayer.getVideoHeight()));
        hashMap.put("duration", Integer.valueOf(mediaPlayer.getDuration()));
        return hashMap;
    }

    @Override // com.moat.analytics.mobile.vng.h
    protected Integer j() {
        return Integer.valueOf(((MediaPlayer) this.j.get()).getCurrentPosition());
    }

    @Override // com.moat.analytics.mobile.vng.h
    protected boolean k() {
        return ((MediaPlayer) this.j.get()).isPlaying();
    }

    @Override // com.moat.analytics.mobile.vng.h
    protected Integer l() {
        return Integer.valueOf(((MediaPlayer) this.j.get()).getDuration());
    }

    @Override // com.moat.analytics.mobile.vng.h, com.moat.analytics.mobile.vng.c
    /* renamed from: trackVideoAd */
    public boolean a(Map<String, String> map, MediaPlayer mediaPlayer, View view) {
        if (mediaPlayer == null) {
            p.a(3, "NativeVideoTracker", this, "Null player instance. Not tracking.");
            p.a("[ERROR] ", a() + " tracking didn't start, Null player instance");
            return false;
        }
        try {
            mediaPlayer.getCurrentPosition();
            return super.a(map, mediaPlayer, view);
        } catch (Exception e) {
            p.a(3, "NativeVideoTracker", this, "Playback has already completed. Not tracking.");
            p.a("[ERROR] ", a() + " tracking didn't started for " + e() + ", playback has already completed");
            return false;
        }
    }
}
