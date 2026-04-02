package com.google.zxing.oned.rss;

import com.amazon.aps.iva.d0.b2;
/* loaded from: classes4.dex */
public class DataCharacter {
    private final int checksumPortion;
    private final int value;

    public DataCharacter(int i, int i2) {
        this.value = i;
        this.checksumPortion = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DataCharacter)) {
            return false;
        }
        DataCharacter dataCharacter = (DataCharacter) obj;
        if (this.value != dataCharacter.value || this.checksumPortion != dataCharacter.checksumPortion) {
            return false;
        }
        return true;
    }

    public final int getChecksumPortion() {
        return this.checksumPortion;
    }

    public final int getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value ^ this.checksumPortion;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.value);
        sb.append("(");
        return b2.b(sb, this.checksumPortion, ')');
    }
}
