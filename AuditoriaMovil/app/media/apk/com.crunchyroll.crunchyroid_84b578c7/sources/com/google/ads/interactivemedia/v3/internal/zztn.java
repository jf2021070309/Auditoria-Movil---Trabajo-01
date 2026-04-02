package com.google.ads.interactivemedia.v3.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zztn extends zzsr {
    static final zzsr zza = new zztn(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zztn(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static zztn zzj(int i, Object[] objArr, zzsq zzsqVar) {
        byte[] bArr;
        int i2 = i;
        Object[] objArr2 = objArr;
        if (i2 == 0) {
            return (zztn) zza;
        }
        Object obj = null;
        if (i2 == 1) {
            Object obj2 = objArr2[0];
            obj2.getClass();
            Object obj3 = objArr2[1];
            obj3.getClass();
            zzrv.zzb(obj2, obj3);
            return new zztn(null, objArr2, 1);
        }
        zzrm.zzb(i2, objArr2.length >> 1, FirebaseAnalytics.Param.INDEX);
        int zzj = zzst.zzj(i);
        if (i2 == 1) {
            Object obj4 = objArr2[0];
            obj4.getClass();
            Object obj5 = objArr2[1];
            obj5.getClass();
            zzrv.zzb(obj4, obj5);
        } else {
            int i3 = zzj - 1;
            char c = 65535;
            if (zzj <= 128) {
                bArr = new byte[zzj];
                Arrays.fill(bArr, (byte) -1);
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i4 + i4;
                    int i7 = i5 + i5;
                    Object obj6 = objArr2[i7];
                    obj6.getClass();
                    Object obj7 = objArr2[i7 ^ 1];
                    obj7.getClass();
                    zzrv.zzb(obj6, obj7);
                    int zzb = zzsi.zzb(obj6.hashCode());
                    while (true) {
                        int i8 = zzb & i3;
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
                            zzsp zzspVar = new zzsp(obj6, obj7, obj8);
                            objArr2[i10] = obj7;
                            obj = zzspVar;
                            break;
                        } else {
                            zzb = i8 + 1;
                        }
                    }
                }
                if (i4 != i2) {
                    obj = new Object[]{bArr, Integer.valueOf(i4), obj};
                }
                obj = bArr;
            } else if (zzj <= 32768) {
                bArr = new short[zzj];
                Arrays.fill(bArr, (short) -1);
                int i11 = 0;
                for (int i12 = 0; i12 < i2; i12++) {
                    int i13 = i11 + i11;
                    int i14 = i12 + i12;
                    Object obj9 = objArr2[i14];
                    obj9.getClass();
                    Object obj10 = objArr2[i14 ^ 1];
                    obj10.getClass();
                    zzrv.zzb(obj9, obj10);
                    int zzb2 = zzsi.zzb(obj9.hashCode());
                    while (true) {
                        int i15 = zzb2 & i3;
                        char c2 = (char) bArr[i15];
                        if (c2 == 65535) {
                            bArr[i15] = (short) i13;
                            if (i11 < i12) {
                                objArr2[i13] = obj9;
                                objArr2[i13 ^ 1] = obj10;
                            }
                            i11++;
                        } else if (obj9.equals(objArr2[c2])) {
                            int i16 = c2 ^ 1;
                            Object obj11 = objArr2[i16];
                            obj11.getClass();
                            zzsp zzspVar2 = new zzsp(obj9, obj10, obj11);
                            objArr2[i16] = obj10;
                            obj = zzspVar2;
                            break;
                        } else {
                            zzb2 = i15 + 1;
                        }
                    }
                }
                if (i11 != i2) {
                    obj = new Object[]{bArr, Integer.valueOf(i11), obj};
                }
                obj = bArr;
            } else {
                bArr = new int[zzj];
                Arrays.fill((int[]) bArr, -1);
                int i17 = 0;
                int i18 = 0;
                while (i17 < i2) {
                    int i19 = i18 + i18;
                    int i20 = i17 + i17;
                    Object obj12 = objArr2[i20];
                    obj12.getClass();
                    Object obj13 = objArr2[i20 ^ 1];
                    obj13.getClass();
                    zzrv.zzb(obj12, obj13);
                    int zzb3 = zzsi.zzb(obj12.hashCode());
                    while (true) {
                        int i21 = zzb3 & i3;
                        ?? r15 = bArr[i21];
                        if (r15 == c) {
                            bArr[i21] = i19;
                            if (i18 < i17) {
                                objArr2[i19] = obj12;
                                objArr2[i19 ^ 1] = obj13;
                            }
                            i18++;
                        } else if (obj12.equals(objArr2[r15])) {
                            int i22 = r15 ^ 1;
                            Object obj14 = objArr2[i22];
                            obj14.getClass();
                            zzsp zzspVar3 = new zzsp(obj12, obj13, obj14);
                            objArr2[i22] = obj13;
                            obj = zzspVar3;
                            break;
                        } else {
                            zzb3 = i21 + 1;
                            c = 65535;
                        }
                    }
                    i17++;
                    c = 65535;
                }
                if (i18 != i2) {
                    obj = new Object[]{bArr, Integer.valueOf(i18), obj};
                }
                obj = bArr;
            }
        }
        if (obj instanceof Object[]) {
            Object[] objArr3 = (Object[]) obj;
            zzsp zzspVar4 = (zzsp) objArr3[2];
            if (zzsqVar != null) {
                zzsqVar.zzc = zzspVar4;
                Object obj15 = objArr3[0];
                int intValue = ((Integer) objArr3[1]).intValue();
                objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                obj = obj15;
                i2 = intValue;
            } else {
                throw zzspVar4.zza();
            }
        }
        return new zztn(obj, objArr2, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[RETURN] */
    @Override // com.google.ads.interactivemedia.v3.internal.zzsr, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.zzc
            java.lang.Object[] r1 = r9.zzb
            int r2 = r9.zzd
            r3 = 0
            if (r10 != 0) goto Lc
        L9:
            r10 = r3
            goto L9c
        Lc:
            r4 = 1
            if (r2 != r4) goto L22
            r0 = 0
            r0 = r1[r0]
            r0.getClass()
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L9
            r10 = r1[r4]
            r10.getClass()
            goto L9c
        L22:
            if (r0 != 0) goto L25
            goto L9
        L25:
            boolean r2 = r0 instanceof byte[]
            r5 = -1
            if (r2 == 0) goto L51
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = com.google.ads.interactivemedia.v3.internal.zzsi.zzb(r0)
        L38:
            r0 = r0 & r6
            r5 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L9
        L41:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L4e:
            int r0 = r0 + 1
            goto L38
        L51:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7d
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = com.google.ads.interactivemedia.v3.internal.zzsi.zzb(r0)
        L63:
            r0 = r0 & r6
            short r5 = r2[r0]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L9
        L6d:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L7a:
            int r0 = r0 + 1
            goto L63
        L7d:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.ads.interactivemedia.v3.internal.zzsi.zzb(r6)
        L89:
            r6 = r6 & r2
            r7 = r0[r6]
            if (r7 != r5) goto L90
            goto L9
        L90:
            r8 = r1[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r1[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r3
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zztn.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr
    public final zzsk zza() {
        return new zztm(this.zzb, 1, this.zzd);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr
    public final zzst zze() {
        return new zztk(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr
    public final zzst zzf() {
        return new zztl(this, new zztm(this.zzb, 0, this.zzd));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr
    public final boolean zzi() {
        return false;
    }
}
