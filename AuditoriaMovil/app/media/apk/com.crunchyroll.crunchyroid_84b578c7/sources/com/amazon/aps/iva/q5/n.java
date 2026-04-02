package com.amazon.aps.iva.q5;

import android.os.Bundle;
import java.util.Arrays;
/* compiled from: ColorInfo.java */
/* loaded from: classes.dex */
public final class n implements k {
    public static final n g = new n(1, null, 2, 3);
    public static final String h = com.amazon.aps.iva.t5.g0.L(0);
    public static final String i = com.amazon.aps.iva.t5.g0.L(1);
    public static final String j = com.amazon.aps.iva.t5.g0.L(2);
    public static final String k = com.amazon.aps.iva.t5.g0.L(3);
    public static final m l = new m(0);
    public final int b;
    public final int c;
    public final int d;
    public final byte[] e;
    public int f;

    @Deprecated
    public n(int i2, byte[] bArr, int i3, int i4) {
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = bArr;
    }

    public static String a(int i2) {
        if (i2 != -1) {
            if (i2 != 10) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 6) {
                                if (i2 != 7) {
                                    return "Undefined color transfer";
                                }
                                return "HLG";
                            }
                            return "ST2084 PQ";
                        }
                        return "SDR SMPTE 170M";
                    }
                    return "sRGB";
                }
                return "Linear";
            }
            return "Gamma 2.2";
        }
        return "Unset color transfer";
    }

    public static int b(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 9) {
            return 6;
        }
        if (i2 != 4 && i2 != 5 && i2 != 6 && i2 != 7) {
            return -1;
        }
        return 2;
    }

    public static int c(int i2) {
        if (i2 != 1) {
            if (i2 != 4) {
                if (i2 != 13) {
                    if (i2 == 16) {
                        return 6;
                    }
                    if (i2 == 18) {
                        return 7;
                    }
                    if (i2 != 6 && i2 != 7) {
                        return -1;
                    }
                    return 3;
                }
                return 2;
            }
            return 10;
        }
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.b == nVar.b && this.c == nVar.c && this.d == nVar.d && Arrays.equals(this.e, nVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.e) + ((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31);
        }
        return this.f;
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(h, this.b);
        bundle.putInt(i, this.c);
        bundle.putInt(j, this.d);
        bundle.putByteArray(k, this.e);
        return bundle;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        boolean z = true;
        int i2 = this.b;
        if (i2 != -1) {
            if (i2 != 6) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        str = "Undefined color space";
                    } else {
                        str = "BT601";
                    }
                } else {
                    str = "BT709";
                }
            } else {
                str = "BT2020";
            }
        } else {
            str = "Unset color space";
        }
        sb.append(str);
        sb.append(", ");
        int i3 = this.c;
        if (i3 != -1) {
            if (i3 != 1) {
                if (i3 != 2) {
                    str2 = "Undefined color range";
                } else {
                    str2 = "Limited range";
                }
            } else {
                str2 = "Full range";
            }
        } else {
            str2 = "Unset color range";
        }
        sb.append(str2);
        sb.append(", ");
        sb.append(a(this.d));
        sb.append(", ");
        if (this.e == null) {
            z = false;
        }
        return com.amazon.aps.iva.e4.e.c(sb, z, ")");
    }
}
