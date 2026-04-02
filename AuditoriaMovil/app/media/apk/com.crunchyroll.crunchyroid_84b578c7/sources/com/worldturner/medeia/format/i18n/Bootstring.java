package com.worldturner.medeia.format.i18n;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.o;
import com.amazon.aps.iva.va0.a;
import com.amazon.aps.iva.yb0.b0;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: Bootstring.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000e"}, d2 = {"Lcom/worldturner/medeia/format/i18n/Bootstring;", "", "()V", "adapt", "", "delta", "numPoints", "firstTime", "", "p", "Lcom/worldturner/medeia/format/i18n/BootstringParameters;", "encode", "", "s", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class Bootstring {
    public static final Bootstring INSTANCE = new Bootstring();

    private Bootstring() {
    }

    private final int adapt(int i, int i2, boolean z, BootstringParameters bootstringParameters) {
        int i3;
        if (z) {
            i3 = i / bootstringParameters.getDamp();
        } else {
            i3 = i / 2;
        }
        int i4 = (i3 / i2) + i3;
        int i5 = 0;
        while (i4 > (bootstringParameters.getTmax() * (bootstringParameters.getBase() - bootstringParameters.getTmin())) / 2) {
            i4 /= bootstringParameters.getBase() - bootstringParameters.getTmin();
            i5 += bootstringParameters.getBase();
        }
        return ((((bootstringParameters.getBase() - bootstringParameters.getTmin()) + 1) * i4) / (bootstringParameters.getSkew() + i4)) + i5;
    }

    public final String encode(String str, BootstringParameters bootstringParameters) {
        int i;
        boolean z;
        boolean z2;
        Integer minIf;
        boolean z3;
        int restrictRange;
        boolean z4;
        Bootstring bootstring;
        j.g(str, "s");
        j.g(bootstringParameters, "p");
        StringBuilder sb = new StringBuilder();
        b0 b0Var = new b0();
        b0Var.b = bootstringParameters.getInitialN();
        int initialBias = bootstringParameters.getInitialBias();
        a aVar = new a(str);
        boolean isEmpty = aVar.isEmpty();
        String str2 = aVar.b;
        if (isEmpty) {
            i = 0;
        } else {
            i = 0;
            int i2 = 0;
            while (true) {
                if (i2 < str2.length()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    break;
                } else if (str2 != null) {
                    int codePointAt = str2.codePointAt(i2);
                    i2 += Character.charCount(codePointAt);
                    if (bootstringParameters.isBasicCodePoint(Integer.valueOf(codePointAt).intValue()) && (i = i + 1) < 0) {
                        f1.R();
                        throw null;
                    }
                } else {
                    throw new o("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
        int i3 = 0;
        while (true) {
            if (i3 < str2.length()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (str2 != null) {
                    int codePointAt2 = str2.codePointAt(i3);
                    i3 += Character.charCount(codePointAt2);
                    int intValue = Integer.valueOf(codePointAt2).intValue();
                    if (bootstringParameters.isBasicCodePoint(intValue)) {
                        sb.appendCodePoint(intValue);
                    } else if (intValue < bootstringParameters.getInitialN()) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new o("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                if (i > 0) {
                    sb.appendCodePoint(bootstringParameters.getDelimiter());
                }
                int i4 = i;
                int i5 = 0;
                while (i4 < aVar.size()) {
                    minIf = BootstringKt.minIf(aVar, new Bootstring$encode$m$1(b0Var));
                    if (minIf != null) {
                        int intValue2 = minIf.intValue();
                        int i6 = ((i4 + 1) * (intValue2 - b0Var.b)) + i5;
                        b0Var.b = intValue2;
                        int i7 = 0;
                        while (true) {
                            String str3 = aVar.b;
                            if (i7 < str3.length()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                int codePointAt3 = str3.codePointAt(i7);
                                i7 += Character.charCount(codePointAt3);
                                int intValue3 = Integer.valueOf(codePointAt3).intValue();
                                if (intValue3 >= b0Var.b && !bootstringParameters.isBasicCodePoint(intValue3)) {
                                    if (intValue3 == b0Var.b) {
                                        int base = bootstringParameters.getBase();
                                        int i8 = i6;
                                        while (true) {
                                            restrictRange = BootstringKt.restrictRange(base - initialBias, bootstringParameters.getTmin(), bootstringParameters.getTmax());
                                            if (i8 < restrictRange) {
                                                break;
                                            }
                                            int i9 = i8 - restrictRange;
                                            sb.appendCodePoint(bootstringParameters.digitToBasicCodePoint((i9 % (bootstringParameters.getBase() - restrictRange)) + restrictRange));
                                            i8 = i9 / (bootstringParameters.getBase() - restrictRange);
                                            base += bootstringParameters.getBase();
                                        }
                                        sb.appendCodePoint(bootstringParameters.digitToBasicCodePoint(i8));
                                        int i10 = i4 + 1;
                                        if (i4 == i) {
                                            bootstring = this;
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                            bootstring = this;
                                        }
                                        int adapt = bootstring.adapt(i6, i10, z4, bootstringParameters);
                                        i6 = 0;
                                        i4 = i10;
                                        initialBias = adapt;
                                    }
                                } else {
                                    i6++;
                                }
                            }
                        }
                        i5 = i6 + 1;
                        b0Var.b++;
                    } else {
                        j.l();
                        throw null;
                    }
                }
                String sb2 = sb.toString();
                j.b(sb2, "builder.toString()");
                return sb2;
            }
        }
    }
}
