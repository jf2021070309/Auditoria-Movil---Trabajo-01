package com.amazon.aps.iva.types;
/* loaded from: classes.dex */
public class DurationChangeArgs {
    private float duration;

    /* loaded from: classes.dex */
    public static class DurationChangeArgsBuilder {
        private float duration;

        public DurationChangeArgs build() {
            return new DurationChangeArgs(this.duration);
        }

        public DurationChangeArgsBuilder duration(float f) {
            this.duration = f;
            return this;
        }

        public String toString() {
            return "DurationChangeArgs.DurationChangeArgsBuilder(duration=" + this.duration + ")";
        }
    }

    public DurationChangeArgs(float f) {
        this.duration = f;
    }

    public static DurationChangeArgsBuilder builder() {
        return new DurationChangeArgsBuilder();
    }

    public float getDuration() {
        return this.duration;
    }

    public String toString() {
        return "DurationChangeArgs(duration=" + getDuration() + ")";
    }
}
