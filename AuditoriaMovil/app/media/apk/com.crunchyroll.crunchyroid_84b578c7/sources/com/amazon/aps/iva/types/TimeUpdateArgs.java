package com.amazon.aps.iva.types;
/* loaded from: classes.dex */
public class TimeUpdateArgs {
    private float currentTime;

    /* loaded from: classes.dex */
    public static class TimeUpdateArgsBuilder {
        private float currentTime;

        public TimeUpdateArgs build() {
            return new TimeUpdateArgs(this.currentTime);
        }

        public TimeUpdateArgsBuilder currentTime(float f) {
            this.currentTime = f;
            return this;
        }

        public String toString() {
            return "TimeUpdateArgs.TimeUpdateArgsBuilder(currentTime=" + this.currentTime + ")";
        }
    }

    public TimeUpdateArgs(float f) {
        this.currentTime = f;
    }

    public static TimeUpdateArgsBuilder builder() {
        return new TimeUpdateArgsBuilder();
    }

    public float getCurrentTime() {
        return this.currentTime;
    }

    public String toString() {
        return "TimeUpdateArgs(currentTime=" + getCurrentTime() + ")";
    }
}
