package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzaid {
    private int zza = 0;

    public final int zza() {
        return this.zza;
    }

    public final zzaid zzb(Object obj, Object obj2, Comparator comparator) {
        int i;
        if (this.zza != 0) {
            return this;
        }
        if (obj == obj2) {
            return this;
        }
        int i2 = -1;
        if (obj == null) {
            this.zza = -1;
            return this;
        } else if (obj2 == null) {
            this.zza = 1;
            return this;
        } else {
            if (obj.getClass().isArray()) {
                int i3 = 0;
                if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    long[] jArr2 = (long[]) obj2;
                    if (this.zza == 0 && jArr != jArr2) {
                        int length = jArr.length;
                        int length2 = jArr2.length;
                        if (length != length2) {
                            if (length >= length2) {
                                i2 = 1;
                            }
                            this.zza = i2;
                        } else {
                            while (i3 < jArr.length && this.zza == 0) {
                                this.zza = (jArr[i3] > jArr2[i3] ? 1 : (jArr[i3] == jArr2[i3] ? 0 : -1));
                                i3++;
                            }
                        }
                    }
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int[] iArr2 = (int[]) obj2;
                    if (this.zza == 0 && iArr != iArr2) {
                        int length3 = iArr.length;
                        int length4 = iArr2.length;
                        if (length3 != length4) {
                            if (length3 >= length4) {
                                i2 = 1;
                            }
                            this.zza = i2;
                        } else {
                            for (int i4 = 0; i4 < iArr.length && this.zza == 0; i4++) {
                                int i5 = iArr[i4];
                                int i6 = iArr2[i4];
                                if (i5 == i6) {
                                    i = 0;
                                } else if (i5 < i6) {
                                    i = -1;
                                } else {
                                    i = 1;
                                }
                                this.zza = i;
                            }
                        }
                    }
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    short[] sArr2 = (short[]) obj2;
                    if (this.zza == 0 && sArr != sArr2) {
                        int length5 = sArr.length;
                        int length6 = sArr2.length;
                        if (length5 != length6) {
                            if (length5 >= length6) {
                                i2 = 1;
                            }
                            this.zza = i2;
                        } else {
                            while (i3 < sArr.length && this.zza == 0) {
                                this.zza = sArr[i3] - sArr2[i3];
                                i3++;
                            }
                        }
                    }
                } else if (obj instanceof char[]) {
                    char[] cArr = (char[]) obj;
                    char[] cArr2 = (char[]) obj2;
                    if (this.zza == 0 && cArr != cArr2) {
                        int length7 = cArr.length;
                        int length8 = cArr2.length;
                        if (length7 != length8) {
                            if (length7 >= length8) {
                                i2 = 1;
                            }
                            this.zza = i2;
                        } else {
                            while (i3 < cArr.length && this.zza == 0) {
                                this.zza = cArr[i3] - cArr2[i3];
                                i3++;
                            }
                        }
                    }
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = (byte[]) obj2;
                    if (this.zza == 0 && bArr != bArr2) {
                        int length9 = bArr.length;
                        int length10 = bArr2.length;
                        if (length9 != length10) {
                            if (length9 >= length10) {
                                i2 = 1;
                            }
                            this.zza = i2;
                        } else {
                            while (i3 < bArr.length && this.zza == 0) {
                                this.zza = bArr[i3] - bArr2[i3];
                                i3++;
                            }
                        }
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    double[] dArr2 = (double[]) obj2;
                    if (this.zza == 0 && dArr != dArr2) {
                        int length11 = dArr.length;
                        int length12 = dArr2.length;
                        if (length11 != length12) {
                            if (length11 >= length12) {
                                i2 = 1;
                            }
                            this.zza = i2;
                        } else {
                            while (i3 < dArr.length && this.zza == 0) {
                                this.zza = Double.compare(dArr[i3], dArr2[i3]);
                                i3++;
                            }
                        }
                    }
                } else if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    float[] fArr2 = (float[]) obj2;
                    if (this.zza == 0 && fArr != fArr2) {
                        int length13 = fArr.length;
                        int length14 = fArr2.length;
                        if (length13 != length14) {
                            if (length13 >= length14) {
                                i2 = 1;
                            }
                            this.zza = i2;
                        } else {
                            while (i3 < fArr.length && this.zza == 0) {
                                this.zza = Float.compare(fArr[i3], fArr2[i3]);
                                i3++;
                            }
                        }
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    boolean[] zArr2 = (boolean[]) obj2;
                    if (this.zza == 0 && zArr != zArr2) {
                        int length15 = zArr.length;
                        int length16 = zArr2.length;
                        if (length15 != length16) {
                            if (length15 >= length16) {
                                i2 = 1;
                            }
                            this.zza = i2;
                        } else {
                            while (i3 < zArr.length && this.zza == 0) {
                                boolean z = zArr[i3];
                                if (z != zArr2[i3]) {
                                    if (z) {
                                        this.zza = 1;
                                    } else {
                                        this.zza = -1;
                                    }
                                }
                                i3++;
                            }
                        }
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    Object[] objArr2 = (Object[]) obj2;
                    if (this.zza == 0 && objArr != objArr2) {
                        int length17 = objArr.length;
                        int length18 = objArr2.length;
                        if (length17 != length18) {
                            if (length17 >= length18) {
                                i2 = 1;
                            }
                            this.zza = i2;
                        } else {
                            while (i3 < objArr.length && this.zza == 0) {
                                zzb(objArr[i3], objArr2[i3], null);
                                i3++;
                            }
                        }
                    }
                }
            } else {
                this.zza = ((Comparable) obj).compareTo(obj2);
            }
            return this;
        }
    }
}
