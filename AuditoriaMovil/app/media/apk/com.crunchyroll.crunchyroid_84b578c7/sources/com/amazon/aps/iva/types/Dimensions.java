package com.amazon.aps.iva.types;
/* loaded from: classes.dex */
public class Dimensions {
    private final int height;
    private final int width;
    private final int x;
    private final int y;

    /* loaded from: classes.dex */
    public static class DimensionsBuilder {
        private int height;
        private int width;
        private int x;
        private int y;

        public Dimensions build() {
            return new Dimensions(this.x, this.y, this.width, this.height);
        }

        public DimensionsBuilder height(int i) {
            this.height = i;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Dimensions.DimensionsBuilder(x=");
            sb.append(this.x);
            sb.append(", y=");
            sb.append(this.y);
            sb.append(", width=");
            sb.append(this.width);
            sb.append(", height=");
            return e.f(sb, this.height, ")");
        }

        public DimensionsBuilder width(int i) {
            this.width = i;
            return this;
        }

        public DimensionsBuilder x(int i) {
            this.x = i;
            return this;
        }

        public DimensionsBuilder y(int i) {
            this.y = i;
            return this;
        }
    }

    public Dimensions(int i, int i2, int i3, int i4) {
        this.x = i;
        this.y = i2;
        this.width = i3;
        this.height = i4;
    }

    public static DimensionsBuilder builder() {
        return new DimensionsBuilder();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dimensions(x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        return e.f(sb, this.height, ")");
    }
}
