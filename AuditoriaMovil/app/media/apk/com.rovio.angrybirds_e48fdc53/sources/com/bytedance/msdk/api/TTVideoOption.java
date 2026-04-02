package com.bytedance.msdk.api;
@Deprecated
/* loaded from: classes.dex */
public class TTVideoOption {
    private final boolean a;
    private final boolean b;
    private float c;
    private GDTExtraOption d;
    private BaiduExtraOptions e;

    /* loaded from: classes.dex */
    public static final class Builder {
        @Deprecated
        private boolean a = true;
        @Deprecated
        private float b;
        @Deprecated
        private GDTExtraOption c;
        @Deprecated
        private boolean d;
        @Deprecated
        private BaiduExtraOptions e;

        public final TTVideoOption build() {
            return new TTVideoOption(this);
        }

        @Deprecated
        public Builder setAdmobAppVolume(float f) {
            if (f > 1.0f) {
                f = 1.0f;
            } else if (f < 0.0f) {
                f = 0.0f;
            }
            this.b = f;
            return this;
        }

        @Deprecated
        public Builder setBaiduExtraOption(BaiduExtraOptions baiduExtraOptions) {
            this.e = baiduExtraOptions;
            return this;
        }

        @Deprecated
        public Builder setGDTExtraOption(GDTExtraOption gDTExtraOption) {
            this.c = gDTExtraOption;
            return this;
        }

        @Deprecated
        public final Builder setMuted(boolean z) {
            this.a = z;
            return this;
        }

        @Deprecated
        public final Builder useSurfaceView(boolean z) {
            this.d = z;
            return this;
        }
    }

    private TTVideoOption(Builder builder) {
        this.a = builder.a;
        this.c = builder.b;
        this.d = builder.c;
        this.b = builder.d;
        this.e = builder.e;
    }

    public float getAdmobAppVolume() {
        return this.c;
    }

    public BaiduExtraOptions getBaiduExtraOption() {
        return this.e;
    }

    public GDTExtraOption getGDTExtraOption() {
        return this.d;
    }

    public boolean isMuted() {
        return this.a;
    }

    public boolean useSurfaceView() {
        return this.b;
    }
}
