package com.worldturner.medeia.format.i18n;

import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.kb0.o;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: Bootstring.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003J\u000e\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000f¨\u0006!"}, d2 = {"Lcom/worldturner/medeia/format/i18n/BootstringParameters;", "", "base", "", "tmin", "tmax", "skew", "damp", "initialBias", "initialN", "delimiter", "basicCodePoints", "", "(IIIIIIIILjava/lang/String;)V", "getBase", "()I", "basicCodePointArray", "", "getBasicCodePoints", "()Ljava/lang/String;", "getDamp", "getDelimiter", "getInitialBias", "getInitialN", "getSkew", "getTmax", "getTmin", "basicCodePointValueToDigit", "ch", "digitToBasicCodePoint", "d", "isBasicCodePoint", "", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class BootstringParameters {
    private final int base;
    private final int[] basicCodePointArray;
    private final String basicCodePoints;
    private final int damp;
    private final int delimiter;
    private final int initialBias;
    private final int initialN;
    private final int skew;
    private final int tmax;
    private final int tmin;

    public BootstringParameters(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str) {
        j.g(str, "basicCodePoints");
        this.base = i;
        this.tmin = i2;
        this.tmax = i3;
        this.skew = i4;
        this.damp = i5;
        this.initialBias = i6;
        this.initialN = i7;
        this.delimiter = i8;
        this.basicCodePoints = str;
        int[] iArr = new int[i7];
        for (int i9 = 0; i9 < i7; i9++) {
            iArr[i9] = q.q0(this.basicCodePoints, Character.toLowerCase((char) i9), 0, false, 6);
        }
        this.basicCodePointArray = iArr;
    }

    public final int basicCodePointValueToDigit(int i) {
        if (i < this.initialN) {
            int i2 = this.basicCodePointArray[i];
            if (i2 >= 0) {
                return i2;
            }
            throw new IllegalArgumentException(a.d("Codepoint ", i, " is not a basic code point"));
        }
        throw new IllegalArgumentException(a.d("Codepoint ", i, " is not a basic code point"));
    }

    public final int digitToBasicCodePoint(int i) {
        String str = this.basicCodePoints;
        if (str != null) {
            return str.codePointAt(i);
        }
        throw new o("null cannot be cast to non-null type java.lang.String");
    }

    public final int getBase() {
        return this.base;
    }

    public final String getBasicCodePoints() {
        return this.basicCodePoints;
    }

    public final int getDamp() {
        return this.damp;
    }

    public final int getDelimiter() {
        return this.delimiter;
    }

    public final int getInitialBias() {
        return this.initialBias;
    }

    public final int getInitialN() {
        return this.initialN;
    }

    public final int getSkew() {
        return this.skew;
    }

    public final int getTmax() {
        return this.tmax;
    }

    public final int getTmin() {
        return this.tmin;
    }

    public final boolean isBasicCodePoint(int i) {
        if (i < this.initialN && this.basicCodePointArray[i] >= 0) {
            return true;
        }
        return false;
    }
}
