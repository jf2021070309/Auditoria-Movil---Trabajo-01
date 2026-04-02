package com.amazon.aps.iva.n2;
/* compiled from: LineBreak.android.kt */
/* loaded from: classes.dex */
public final class e {
    public static final int b = 66305;
    public final int a;

    /* compiled from: LineBreak.android.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public final int a;

        public static String a(int i) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return "Strategy.Simple";
            }
            if (i == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return "Strategy.HighQuality";
            }
            if (i == 3) {
                z3 = true;
            }
            if (z3) {
                return "Strategy.Balanced";
            }
            return "Invalid";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this.a != ((a) obj).a) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return a(this.a);
        }
    }

    /* compiled from: LineBreak.android.kt */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;

        public static String a(int i) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4 = false;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return "Strictness.None";
            }
            if (i == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return "Strictness.Loose";
            }
            if (i == 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                return "Strictness.Normal";
            }
            if (i == 4) {
                z4 = true;
            }
            if (z4) {
                return "Strictness.Strict";
            }
            return "Invalid";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (this.a != ((b) obj).a) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return a(this.a);
        }
    }

    /* compiled from: LineBreak.android.kt */
    /* loaded from: classes.dex */
    public static final class c {
        public final int a;

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            if (this.a != ((c) obj).a) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            boolean z;
            int i = this.a;
            boolean z2 = false;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return "WordBreak.None";
            }
            if (i == 2) {
                z2 = true;
            }
            if (z2) {
                return "WordBreak.Phrase";
            }
            return "Invalid";
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (this.a != ((e) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        boolean z;
        String str;
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i = this.a;
        sb.append((Object) a.a(i & 255));
        sb.append(", strictness=");
        sb.append((Object) b.a((i >> 8) & 255));
        sb.append(", wordBreak=");
        int i2 = (i >> 16) & 255;
        boolean z2 = false;
        if (i2 == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "WordBreak.None";
        } else {
            if (i2 == 2) {
                z2 = true;
            }
            if (z2) {
                str = "WordBreak.Phrase";
            } else {
                str = "Invalid";
            }
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
