package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public abstract class zzage implements zzagd {
    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = (zzd() > ((zzagd) obj).zzd() ? 1 : (zzd() == ((zzagd) obj).zzd() ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zzagd) && zzd() == ((zzagd) obj).zzd()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long zzd = zzd();
        return (int) (zzd ^ (zzd >>> 32));
    }

    public final String toString() {
        int i;
        int i2;
        long zzd = zzd();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PT");
        zzagh.zza(stringBuffer, zzd);
        while (true) {
            int length = stringBuffer.length();
            int i3 = (zzd > 0L ? 1 : (zzd == 0L ? 0 : -1));
            if (i3 < 0) {
                i = 7;
            } else {
                i = 6;
            }
            if (length >= i) {
                break;
            }
            if (i3 < 0) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            stringBuffer.insert(i2, "0");
        }
        if ((zzd / 1000) * 1000 == zzd) {
            stringBuffer.setLength(stringBuffer.length() - 3);
        } else {
            stringBuffer.insert(stringBuffer.length() - 3, ".");
        }
        stringBuffer.append('S');
        return stringBuffer.toString();
    }
}
