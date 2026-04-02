package com.amazon.aps.iva.n2;
/* compiled from: LineHeightStyle.kt */
/* loaded from: classes.dex */
public final class f {
    public static final f c = new f(a.b);
    public final float a;
    public final int b = 17;

    /* compiled from: LineHeightStyle.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static final float a;
        public static final float b;
        public static final float c;

        static {
            a(0.0f);
            a(0.5f);
            a = 0.5f;
            a(-1.0f);
            b = -1.0f;
            a(1.0f);
            c = 1.0f;
        }

        public static void a(float f) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (0.0f <= f && f <= 1.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (f == -1.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    z3 = false;
                }
            }
            if (z3) {
                return;
            }
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }
    }

    public f(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        float f = fVar.a;
        float f2 = a.a;
        if (Float.compare(this.a, f) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.b == fVar.b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        float f = a.a;
        return Integer.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        float f = a.a;
        float f2 = this.a;
        boolean z4 = false;
        if (f2 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "LineHeightStyle.Alignment.Top";
        } else {
            if (f2 == a.a) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                str = "LineHeightStyle.Alignment.Center";
            } else {
                if (f2 == a.b) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    str = "LineHeightStyle.Alignment.Proportional";
                } else {
                    if (f2 == a.c) {
                        z4 = true;
                    }
                    if (z4) {
                        str = "LineHeightStyle.Alignment.Bottom";
                    } else {
                        str = "LineHeightStyle.Alignment(topPercentage = " + f2 + ')';
                    }
                }
            }
        }
        sb.append((Object) str);
        sb.append(", trim=");
        int i = this.b;
        if (i == 1) {
            str2 = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str2 = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str2 = "LineHeightStyle.Trim.Both";
        } else if (i == 0) {
            str2 = "LineHeightStyle.Trim.None";
        } else {
            str2 = "Invalid";
        }
        sb.append((Object) str2);
        sb.append(')');
        return sb.toString();
    }
}
