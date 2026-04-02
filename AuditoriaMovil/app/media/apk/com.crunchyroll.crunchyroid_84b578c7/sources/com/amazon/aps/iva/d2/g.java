package com.amazon.aps.iva.d2;

import java.text.CharacterIterator;
/* compiled from: CharSequenceCharacterIterator.kt */
/* loaded from: classes.dex */
public final class g implements CharacterIterator {
    public final CharSequence b;
    public final int d;
    public final int c = 0;
    public int e = 0;

    public g(CharSequence charSequence, int i) {
        this.b = charSequence;
        this.d = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            Object clone = super.clone();
            com.amazon.aps.iva.yb0.j.e(clone, "{\n            @Suppress(…  super.clone()\n        }");
            return clone;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.e;
        if (i == this.d) {
            return (char) 65535;
        }
        return this.b.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.e = this.c;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return this.c;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.d;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.e;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.c;
        int i2 = this.d;
        if (i == i2) {
            this.e = i2;
            return (char) 65535;
        }
        int i3 = i2 - 1;
        this.e = i3;
        return this.b.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.e + 1;
        this.e = i;
        int i2 = this.d;
        if (i >= i2) {
            this.e = i2;
            return (char) 65535;
        }
        return this.b.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.e;
        if (i <= this.c) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.e = i2;
        return this.b.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        boolean z = false;
        if (i <= this.d && this.c <= i) {
            z = true;
        }
        if (z) {
            this.e = i;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }
}
