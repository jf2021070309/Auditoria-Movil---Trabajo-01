package com.amazon.aps.iva.types;

import com.amazon.aps.iva.e4.e;
/* loaded from: classes.dex */
public class VolumeChangeArgs {
    private boolean muted;
    private float volume;

    /* loaded from: classes.dex */
    public static class VolumeChangeArgsBuilder {
        private boolean muted;
        private float volume;

        public VolumeChangeArgs build() {
            return new VolumeChangeArgs(this.volume, this.muted);
        }

        public VolumeChangeArgsBuilder muted(boolean z) {
            this.muted = z;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("VolumeChangeArgs.VolumeChangeArgsBuilder(volume=");
            sb.append(this.volume);
            sb.append(", muted=");
            return e.c(sb, this.muted, ")");
        }

        public VolumeChangeArgsBuilder volume(float f) {
            this.volume = f;
            return this;
        }
    }

    public VolumeChangeArgs(float f, boolean z) {
        this.volume = f;
        this.muted = z;
    }

    public static VolumeChangeArgsBuilder builder() {
        return new VolumeChangeArgsBuilder();
    }

    public float getVolume() {
        return this.volume;
    }

    public boolean isMuted() {
        return this.muted;
    }

    public String toString() {
        return "VolumeChangeArgs(volume=" + getVolume() + ", muted=" + isMuted() + ")";
    }
}
