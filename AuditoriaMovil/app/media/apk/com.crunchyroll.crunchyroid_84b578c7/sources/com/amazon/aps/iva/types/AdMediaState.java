package com.amazon.aps.iva.types;

import com.amazon.aps.iva.e4.e;
/* loaded from: classes.dex */
public class AdMediaState {
    private String currentSrc;
    private float currentTime;
    private float duration;
    private boolean ended;
    private boolean fullscreen;
    private boolean muted;
    private boolean paused;
    private float volume;

    /* loaded from: classes.dex */
    public static class AdMediaStateBuilder {
        private boolean currentSrc$set;
        private String currentSrc$value;
        private float currentTime;
        private float duration;
        private boolean ended;
        private boolean fullscreen;
        private boolean muted;
        private boolean paused;
        private float volume;

        public AdMediaState build() {
            String str = this.currentSrc$value;
            if (!this.currentSrc$set) {
                str = AdMediaState.access$000();
            }
            return new AdMediaState(str, this.currentTime, this.duration, this.ended, this.muted, this.paused, this.volume, this.fullscreen);
        }

        public AdMediaStateBuilder currentSrc(String str) {
            this.currentSrc$value = str;
            this.currentSrc$set = true;
            return this;
        }

        public AdMediaStateBuilder currentTime(float f) {
            this.currentTime = f;
            return this;
        }

        public AdMediaStateBuilder duration(float f) {
            this.duration = f;
            return this;
        }

        public AdMediaStateBuilder ended(boolean z) {
            this.ended = z;
            return this;
        }

        public AdMediaStateBuilder fullscreen(boolean z) {
            this.fullscreen = z;
            return this;
        }

        public AdMediaStateBuilder muted(boolean z) {
            this.muted = z;
            return this;
        }

        public AdMediaStateBuilder paused(boolean z) {
            this.paused = z;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AdMediaState.AdMediaStateBuilder(currentSrc$value=");
            sb.append(this.currentSrc$value);
            sb.append(", currentTime=");
            sb.append(this.currentTime);
            sb.append(", duration=");
            sb.append(this.duration);
            sb.append(", ended=");
            sb.append(this.ended);
            sb.append(", muted=");
            sb.append(this.muted);
            sb.append(", paused=");
            sb.append(this.paused);
            sb.append(", volume=");
            sb.append(this.volume);
            sb.append(", fullscreen=");
            return e.c(sb, this.fullscreen, ")");
        }

        public AdMediaStateBuilder volume(float f) {
            this.volume = f;
            return this;
        }
    }

    private static String $default$currentSrc() {
        return "apsIva";
    }

    public AdMediaState(String str, float f, float f2, boolean z, boolean z2, boolean z3, float f3, boolean z4) {
        this.currentSrc = str;
        this.currentTime = f;
        this.duration = f2;
        this.ended = z;
        this.muted = z2;
        this.paused = z3;
        this.volume = f3;
        this.fullscreen = z4;
    }

    public static /* synthetic */ String access$000() {
        return $default$currentSrc();
    }

    public static AdMediaStateBuilder builder() {
        return new AdMediaStateBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof AdMediaState;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdMediaState)) {
            return false;
        }
        AdMediaState adMediaState = (AdMediaState) obj;
        if (!adMediaState.canEqual(this) || Float.compare(getCurrentTime(), adMediaState.getCurrentTime()) != 0 || Float.compare(getDuration(), adMediaState.getDuration()) != 0 || isEnded() != adMediaState.isEnded() || isMuted() != adMediaState.isMuted() || isPaused() != adMediaState.isPaused() || Float.compare(getVolume(), adMediaState.getVolume()) != 0 || isFullscreen() != adMediaState.isFullscreen()) {
            return false;
        }
        String currentSrc = getCurrentSrc();
        String currentSrc2 = adMediaState.getCurrentSrc();
        if (currentSrc != null ? currentSrc.equals(currentSrc2) : currentSrc2 == null) {
            return true;
        }
        return false;
    }

    public String getCurrentSrc() {
        return this.currentSrc;
    }

    public float getCurrentTime() {
        return this.currentTime;
    }

    public float getDuration() {
        return this.duration;
    }

    public float getVolume() {
        return this.volume;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode;
        int floatToIntBits = (Float.floatToIntBits(getDuration()) + ((Float.floatToIntBits(getCurrentTime()) + 59) * 59)) * 59;
        int i4 = 79;
        if (isEnded()) {
            i = 79;
        } else {
            i = 97;
        }
        int i5 = (floatToIntBits + i) * 59;
        if (isMuted()) {
            i2 = 79;
        } else {
            i2 = 97;
        }
        int i6 = (i5 + i2) * 59;
        if (isPaused()) {
            i3 = 79;
        } else {
            i3 = 97;
        }
        int floatToIntBits2 = (Float.floatToIntBits(getVolume()) + ((i6 + i3) * 59)) * 59;
        if (!isFullscreen()) {
            i4 = 97;
        }
        String currentSrc = getCurrentSrc();
        int i7 = (floatToIntBits2 + i4) * 59;
        if (currentSrc == null) {
            hashCode = 43;
        } else {
            hashCode = currentSrc.hashCode();
        }
        return i7 + hashCode;
    }

    public boolean isEnded() {
        return this.ended;
    }

    public boolean isFullscreen() {
        return this.fullscreen;
    }

    public boolean isMuted() {
        return this.muted;
    }

    public boolean isPaused() {
        return this.paused;
    }

    public void setCurrentSrc(String str) {
        this.currentSrc = str;
    }

    public void setCurrentTime(float f) {
        this.currentTime = f;
    }

    public void setDuration(float f) {
        this.duration = f;
    }

    public void setEnded(boolean z) {
        this.ended = z;
    }

    public void setFullscreen(boolean z) {
        this.fullscreen = z;
    }

    public void setMuted(boolean z) {
        this.muted = z;
    }

    public void setPaused(boolean z) {
        this.paused = z;
    }

    public void setVolume(float f) {
        this.volume = f;
    }

    public String toString() {
        return "AdMediaState(currentSrc=" + getCurrentSrc() + ", currentTime=" + getCurrentTime() + ", duration=" + getDuration() + ", ended=" + isEnded() + ", muted=" + isMuted() + ", paused=" + isPaused() + ", volume=" + getVolume() + ", fullscreen=" + isFullscreen() + ")";
    }
}
