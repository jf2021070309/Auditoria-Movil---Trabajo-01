package com.google.android.gms.internal.cast;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzgc extends zzft {
    static final zzft zza = new zzgc(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzgc(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    public static zzgc zzh(int i, Object[] objArr, zzfs zzfsVar) {
        byte[] bArr;
        int i2 = i;
        Object[] objArr2 = objArr;
        if (i2 == 0) {
            return (zzgc) zza;
        }
        Object obj = null;
        if (i2 == 1) {
            Object obj2 = objArr2[0];
            obj2.getClass();
            Object obj3 = objArr2[1];
            obj3.getClass();
            zzfh.zza(obj2, obj3);
            return new zzgc(null, objArr2, 1);
        }
        zzez.zzb(i2, objArr2.length >> 1, FirebaseAnalytics.Param.INDEX);
        int zzh = zzfu.zzh(i);
        if (i2 == 1) {
            Object obj4 = objArr2[0];
            obj4.getClass();
            Object obj5 = objArr2[1];
            obj5.getClass();
            zzfh.zza(obj4, obj5);
            i2 = 1;
        } else {
            int i3 = zzh - 1;
            if (zzh <= 128) {
                bArr = new byte[zzh];
                Arrays.fill(bArr, (byte) -1);
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i4 + i4;
                    int i7 = i5 + i5;
                    Object obj6 = objArr2[i7];
                    obj6.getClass();
                    Object obj7 = objArr2[i7 ^ 1];
                    obj7.getClass();
                    zzfh.zza(obj6, obj7);
                    int zza2 = zzfj.zza(obj6.hashCode());
                    while (true) {
                        int i8 = zza2 & i3;
                        int i9 = bArr[i8] & 255;
                        if (i9 == 255) {
                            bArr[i8] = (byte) i6;
                            if (i4 < i5) {
                                objArr2[i6] = obj6;
                                objArr2[i6 ^ 1] = obj7;
                            }
                            i4++;
                        } else if (obj6.equals(objArr2[i9])) {
                            int i10 = i9 ^ 1;
                            Object obj8 = objArr2[i10];
                            obj8.getClass();
                            zzfr zzfrVar = new zzfr(obj6, obj7, obj8);
                            objArr2[i10] = obj7;
                            obj = zzfrVar;
                            break;
                        } else {
                            zza2 = i8 + 1;
                        }
                    }
                }
                if (i4 != i2) {
                    obj = new Object[]{bArr, Integer.valueOf(i4), obj};
                }
                obj = bArr;
            } else if (zzh <= 32768) {
                bArr = new short[zzh];
                Arrays.fill(bArr, (short) -1);
                int i11 = 0;
                for (int i12 = 0; i12 < i2; i12++) {
                    int i13 = i11 + i11;
                    int i14 = i12 + i12;
                    Object obj9 = objArr2[i14];
                    obj9.getClass();
                    Object obj10 = objArr2[i14 ^ 1];
                    obj10.getClass();
                    zzfh.zza(obj9, obj10);
                    int zza3 = zzfj.zza(obj9.hashCode());
                    while (true) {
                        int i15 = zza3 & i3;
                        char c = (char) bArr[i15];
                        if (c == 65535) {
                            bArr[i15] = (short) i13;
                            if (i11 < i12) {
                                objArr2[i13] = obj9;
                                objArr2[i13 ^ 1] = obj10;
                            }
                            i11++;
                        } else if (obj9.equals(objArr2[c])) {
                            int i16 = c ^ 1;
                            Object obj11 = objArr2[i16];
                            obj11.getClass();
                            zzfr zzfrVar2 = new zzfr(obj9, obj10, obj11);
                            objArr2[i16] = obj10;
                            obj = zzfrVar2;
                            break;
                        } else {
                            zza3 = i15 + 1;
                        }
                    }
                }
                if (i11 != i2) {
                    obj = new Object[]{bArr, Integer.valueOf(i11), obj};
                }
                obj = bArr;
            } else {
                bArr = new int[zzh];
                Arrays.fill((int[]) bArr, -1);
                int i17 = 0;
                for (int i18 = 0; i18 < i2; i18++) {
                    int i19 = i17 + i17;
                    int i20 = i18 + i18;
                    Object obj12 = objArr2[i20];
                    obj12.getClass();
                    Object obj13 = objArr2[i20 ^ 1];
                    obj13.getClass();
                    zzfh.zza(obj12, obj13);
                    int zza4 = zzfj.zza(obj12.hashCode());
                    while (true) {
                        int i21 = zza4 & i3;
                        ?? r14 = bArr[i21];
                        if (r14 == -1) {
                            bArr[i21] = i19;
                            if (i17 < i18) {
                                objArr2[i19] = obj12;
                                objArr2[i19 ^ 1] = obj13;
                            }
                            i17++;
                        } else if (obj12.equals(objArr2[r14])) {
                            int i22 = r14 ^ 1;
                            Object obj14 = objArr2[i22];
                            obj14.getClass();
                            zzfr zzfrVar3 = new zzfr(obj12, obj13, obj14);
                            objArr2[i22] = obj13;
                            obj = zzfrVar3;
                            break;
                        } else {
                            zza4 = i21 + 1;
                        }
                    }
                }
                if (i17 != i2) {
                    obj = new Object[]{bArr, Integer.valueOf(i17), obj};
                }
                obj = bArr;
            }
        }
        if (obj instanceof Object[]) {
            Object[] objArr3 = (Object[]) obj;
            zzfsVar.zzc = (zzfr) objArr3[2];
            Object obj15 = objArr3[0];
            int intValue = ((Integer) objArr3[1]).intValue();
            objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
            obj = obj15;
            i2 = intValue;
        }
        return new zzgc(obj, objArr2, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.cast.zzft, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            int r1 = r9.zzd
            java.lang.Object[] r2 = r9.zzb
            r3 = 1
            if (r1 != r3) goto L20
            r1 = 0
            r1 = r2[r1]
            r1.getClass()
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r3]
            r10.getClass()
            goto L9c
        L20:
            java.lang.Object r1 = r9.zzc
            if (r1 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.cast.zzfj.zza(r1)
        L38:
            r1 = r1 & r6
            r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L4e:
            int r1 = r1 + 1
            goto L38
        L51:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.cast.zzfj.zza(r1)
        L63:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L7a:
            int r1 = r1 + 1
            goto L63
        L7d:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.cast.zzfj.zza(r6)
        L89:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.zzgc.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.cast.zzft
    public final zzfm zza() {
        return new zzgb(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.cast.zzft
    public final zzfu zze() {
        return new zzfz(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.cast.zzft
    public final zzfu zzf() {
        return new zzga(this, new zzgb(this.zzb, 0, this.zzd));
    }
}
