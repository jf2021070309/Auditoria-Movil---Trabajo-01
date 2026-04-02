package com.amazon.aps.iva.ef0;

import java.util.ArrayList;
import java.util.RandomAccess;
/* compiled from: Options.kt */
/* loaded from: classes4.dex */
public final class t extends com.amazon.aps.iva.lb0.c<i> implements RandomAccess {
    public final i[] b;
    public final int[] c;

    /* compiled from: Options.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static void a(long j, e eVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
            boolean z;
            int i4;
            int i5;
            boolean z2;
            int i6;
            int i7;
            e eVar2;
            long j2;
            boolean z3;
            int i8 = i;
            if (i2 < i3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                for (int i9 = i2; i9 < i3; i9++) {
                    if (((i) arrayList.get(i9)).c() >= i8) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                i iVar = (i) arrayList.get(i2);
                i iVar2 = (i) arrayList.get(i3 - 1);
                int i10 = -1;
                if (i8 == iVar.c()) {
                    int intValue = ((Number) arrayList2.get(i2)).intValue();
                    int i11 = i2 + 1;
                    i iVar3 = (i) arrayList.get(i11);
                    i4 = i11;
                    i5 = intValue;
                    iVar = iVar3;
                } else {
                    i4 = i2;
                    i5 = -1;
                }
                if (iVar.i(i8) != iVar2.i(i8)) {
                    int i12 = 1;
                    for (int i13 = i4 + 1; i13 < i3; i13++) {
                        if (((i) arrayList.get(i13 - 1)).i(i8) != ((i) arrayList.get(i13)).i(i8)) {
                            i12++;
                        }
                    }
                    long j3 = 4;
                    long j4 = (i12 * 2) + (eVar.c / j3) + j + 2;
                    eVar.O(i12);
                    eVar.O(i5);
                    for (int i14 = i4; i14 < i3; i14++) {
                        int i15 = ((i) arrayList.get(i14)).i(i8);
                        if (i14 == i4 || i15 != ((i) arrayList.get(i14 - 1)).i(i8)) {
                            eVar.O(i15 & 255);
                        }
                    }
                    e eVar3 = new e();
                    while (i4 < i3) {
                        byte i16 = ((i) arrayList.get(i4)).i(i8);
                        int i17 = i4 + 1;
                        int i18 = i17;
                        while (true) {
                            if (i18 < i3) {
                                if (i16 != ((i) arrayList.get(i18)).i(i8)) {
                                    i6 = i18;
                                    break;
                                }
                                i18++;
                            } else {
                                i6 = i3;
                                break;
                            }
                        }
                        if (i17 == i6 && i8 + 1 == ((i) arrayList.get(i4)).c()) {
                            eVar.O(((Number) arrayList2.get(i4)).intValue());
                            i7 = i6;
                            eVar2 = eVar3;
                            j2 = j3;
                        } else {
                            eVar.O(((int) ((eVar3.c / j3) + j4)) * i10);
                            i7 = i6;
                            eVar2 = eVar3;
                            j2 = j3;
                            a(j4, eVar3, i8 + 1, arrayList, i4, i7, arrayList2);
                        }
                        eVar3 = eVar2;
                        i4 = i7;
                        j3 = j2;
                        i10 = -1;
                    }
                    eVar.r(eVar3);
                    return;
                }
                int min = Math.min(iVar.c(), iVar2.c());
                int i19 = 0;
                for (int i20 = i8; i20 < min && iVar.i(i20) == iVar2.i(i20); i20++) {
                    i19++;
                }
                long j5 = 4;
                long j6 = (eVar.c / j5) + j + 2 + i19 + 1;
                eVar.O(-i19);
                eVar.O(i5);
                int i21 = i8 + i19;
                while (i8 < i21) {
                    eVar.O(iVar.i(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i3) {
                    if (i21 == ((i) arrayList.get(i4)).c()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        eVar.O(((Number) arrayList2.get(i4)).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                e eVar4 = new e();
                eVar.O(((int) ((eVar4.c / j5) + j6)) * (-1));
                a(j6, eVar4, i21, arrayList, i4, i3, arrayList2);
                eVar.r(eVar4);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* JADX WARN: Code restructure failed: missing block: B:57:0x00ef, code lost:
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.amazon.aps.iva.ef0.t b(com.amazon.aps.iva.ef0.i... r11) {
            /*
                Method dump skipped, instructions count: 312
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ef0.t.a.b(com.amazon.aps.iva.ef0.i[]):com.amazon.aps.iva.ef0.t");
        }
    }

    public t(i[] iVarArr, int[] iArr) {
        this.b = iVarArr;
        this.c = iArr;
    }

    @Override // com.amazon.aps.iva.lb0.a
    public final int b() {
        return this.b.length;
    }

    @Override // com.amazon.aps.iva.lb0.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        return super.contains((i) obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.b[i];
    }

    @Override // com.amazon.aps.iva.lb0.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof i)) {
            return -1;
        }
        return super.indexOf((i) obj);
    }

    @Override // com.amazon.aps.iva.lb0.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof i)) {
            return -1;
        }
        return super.lastIndexOf((i) obj);
    }
}
