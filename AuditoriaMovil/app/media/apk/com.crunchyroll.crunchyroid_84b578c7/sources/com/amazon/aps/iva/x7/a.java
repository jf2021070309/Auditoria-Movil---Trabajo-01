package com.amazon.aps.iva.x7;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.amazon.aps.iva.q7.c;
import com.amazon.aps.iva.q7.d;
import com.amazon.aps.iva.q7.f;
import com.amazon.aps.iva.s5.a;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.p;
import com.amazon.aps.iva.t5.v;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;
import java.util.List;
/* compiled from: Tx3gDecoder.java */
/* loaded from: classes.dex */
public final class a extends c {
    public final v m = new v();
    public final boolean n;
    public final int o;
    public final int p;
    public final String q;
    public final float r;
    public final int s;

    public a(List<byte[]> list) {
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.o = bArr[24];
            this.p = ((bArr[26] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[27] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[28] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[29] & UnsignedBytes.MAX_VALUE);
            int i = g0.a;
            this.q = "Serif".equals(new String(bArr, 43, bArr.length - 43, Charsets.UTF_8)) ? "serif" : "sans-serif";
            int i2 = bArr[25] * Ascii.DC4;
            this.s = i2;
            boolean z = (bArr[0] & 32) != 0;
            this.n = z;
            if (z) {
                this.r = g0.h(((bArr[11] & UnsignedBytes.MAX_VALUE) | ((bArr[10] & UnsignedBytes.MAX_VALUE) << 8)) / i2, 0.0f, 0.95f);
                return;
            } else {
                this.r = 0.85f;
                return;
            }
        }
        this.o = 0;
        this.p = -1;
        this.q = "sans-serif";
        this.n = false;
        this.r = 0.85f;
        this.s = -1;
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z3 = true;
            if ((i & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) == 0) {
                z3 = false;
            }
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (!z3 && !z && !z2) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    @Override // com.amazon.aps.iva.q7.c
    public final d g(int i, byte[] bArr, boolean z) throws f {
        boolean z2;
        String s;
        boolean z3;
        int i2;
        int i3;
        int i4;
        int i5;
        v vVar = this.m;
        vVar.D(i, bArr);
        int i6 = 1;
        int i7 = 0;
        if (vVar.c - vVar.b >= 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int z4 = vVar.z();
            if (z4 == 0) {
                s = "";
            } else {
                int i8 = vVar.b;
                Charset B = vVar.B();
                int i9 = z4 - (vVar.b - i8);
                if (B == null) {
                    B = Charsets.UTF_8;
                }
                s = vVar.s(i9, B);
            }
            if (s.isEmpty()) {
                return b.c;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(s);
            h(spannableStringBuilder, this.o, 0, 0, spannableStringBuilder.length(), 16711680);
            int length = spannableStringBuilder.length();
            int i10 = this.p;
            if (i10 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((i10 & 255) << 24) | (i10 >>> 8)), 0, length, 16711713);
            }
            int length2 = spannableStringBuilder.length();
            String str = this.q;
            if (str != "sans-serif") {
                spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
            }
            float f = this.r;
            while (true) {
                int i11 = vVar.c;
                int i12 = vVar.b;
                if (i11 - i12 >= 8) {
                    int e = vVar.e();
                    int e2 = vVar.e();
                    if (e2 == 1937013100) {
                        if (vVar.c - vVar.b >= 2) {
                            i2 = i6;
                        } else {
                            i2 = i7;
                        }
                        if (i2 != 0) {
                            int z5 = vVar.z();
                            int i13 = i7;
                            while (i13 < z5) {
                                if (vVar.c - vVar.b >= 12) {
                                    i3 = i6;
                                } else {
                                    i3 = i7;
                                }
                                if (i3 != 0) {
                                    int z6 = vVar.z();
                                    int z7 = vVar.z();
                                    vVar.G(2);
                                    int u = vVar.u();
                                    vVar.G(i6);
                                    int e3 = vVar.e();
                                    if (z7 > spannableStringBuilder.length()) {
                                        spannableStringBuilder.length();
                                        p.g();
                                        z7 = spannableStringBuilder.length();
                                    }
                                    int i14 = z7;
                                    if (z6 >= i14) {
                                        p.g();
                                        i4 = i13;
                                        i5 = z5;
                                    } else {
                                        i4 = i13;
                                        i5 = z5;
                                        h(spannableStringBuilder, u, this.o, z6, i14, 0);
                                        if (e3 != i10) {
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan((e3 >>> 8) | ((e3 & 255) << 24)), z6, i14, 33);
                                        }
                                    }
                                    i13 = i4 + 1;
                                    z5 = i5;
                                    i6 = 1;
                                    i7 = 0;
                                } else {
                                    throw new f("Unexpected subtitle format.");
                                }
                            }
                            continue;
                        } else {
                            throw new f("Unexpected subtitle format.");
                        }
                    } else if (e2 == 1952608120 && this.n) {
                        if (vVar.c - vVar.b >= 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            f = g0.h(vVar.z() / this.s, 0.0f, 0.95f);
                        } else {
                            throw new f("Unexpected subtitle format.");
                        }
                    }
                    vVar.F(i12 + e);
                    i6 = 1;
                    i7 = 0;
                } else {
                    a.C0695a c0695a = new a.C0695a();
                    c0695a.a = spannableStringBuilder;
                    c0695a.e = f;
                    c0695a.f = 0;
                    c0695a.g = 0;
                    return new b(c0695a.a());
                }
            }
        } else {
            throw new f("Unexpected subtitle format.");
        }
    }
}
