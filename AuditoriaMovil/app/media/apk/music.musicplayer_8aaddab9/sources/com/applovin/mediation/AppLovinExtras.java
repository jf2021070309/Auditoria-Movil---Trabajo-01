package com.applovin.mediation;

import android.os.Bundle;
/* loaded from: classes.dex */
public class AppLovinExtras {

    /* loaded from: classes.dex */
    public static class Builder {
        private boolean mMuteAudio;

        public Bundle build() {
            Bundle bundle = new Bundle(1);
            bundle.putBoolean(Keys.MUTE_AUDIO, this.mMuteAudio);
            return bundle;
        }

        public Builder setMuteAudio(boolean z) {
            this.mMuteAudio = z;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class Keys {
        public static final String MUTE_AUDIO = "mute_audio";
    }
}
