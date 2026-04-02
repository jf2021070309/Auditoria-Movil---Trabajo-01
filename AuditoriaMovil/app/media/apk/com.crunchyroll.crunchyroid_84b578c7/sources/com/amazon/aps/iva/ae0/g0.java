package com.amazon.aps.iva.ae0;

import com.amazon.aps.iva.oc0.b;
import com.amazon.aps.iva.oc0.q;
/* compiled from: ProtoEnumFlagsUtils.kt */
/* loaded from: classes4.dex */
public final class g0 {

    /* compiled from: ProtoEnumFlagsUtils.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.amazon.aps.iva.id0.i.values().length];
            try {
                iArr[com.amazon.aps.iva.id0.i.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.id0.i.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.amazon.aps.iva.id0.i.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.amazon.aps.iva.id0.i.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
            int[] iArr2 = new int[b.a.values().length];
            try {
                iArr2[b.a.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[b.a.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[b.a.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[b.a.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[com.amazon.aps.iva.id0.w.values().length];
            try {
                iArr3[com.amazon.aps.iva.id0.w.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[com.amazon.aps.iva.id0.w.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[com.amazon.aps.iva.id0.w.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[com.amazon.aps.iva.id0.w.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[com.amazon.aps.iva.id0.w.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[com.amazon.aps.iva.id0.w.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            b = iArr3;
        }
    }

    public static final com.amazon.aps.iva.oc0.p a(com.amazon.aps.iva.id0.w wVar) {
        int i;
        if (wVar == null) {
            i = -1;
        } else {
            i = a.b[wVar.ordinal()];
        }
        switch (i) {
            case 1:
                q.g gVar = com.amazon.aps.iva.oc0.q.d;
                com.amazon.aps.iva.yb0.j.e(gVar, "INTERNAL");
                return gVar;
            case 2:
                q.d dVar = com.amazon.aps.iva.oc0.q.a;
                com.amazon.aps.iva.yb0.j.e(dVar, "PRIVATE");
                return dVar;
            case 3:
                q.e eVar = com.amazon.aps.iva.oc0.q.b;
                com.amazon.aps.iva.yb0.j.e(eVar, "PRIVATE_TO_THIS");
                return eVar;
            case 4:
                q.f fVar = com.amazon.aps.iva.oc0.q.c;
                com.amazon.aps.iva.yb0.j.e(fVar, "PROTECTED");
                return fVar;
            case 5:
                q.h hVar = com.amazon.aps.iva.oc0.q.e;
                com.amazon.aps.iva.yb0.j.e(hVar, "PUBLIC");
                return hVar;
            case 6:
                q.i iVar = com.amazon.aps.iva.oc0.q.f;
                com.amazon.aps.iva.yb0.j.e(iVar, "LOCAL");
                return iVar;
            default:
                q.d dVar2 = com.amazon.aps.iva.oc0.q.a;
                com.amazon.aps.iva.yb0.j.e(dVar2, "PRIVATE");
                return dVar2;
        }
    }

    public static final b.a b(com.amazon.aps.iva.id0.i iVar) {
        int i;
        if (iVar == null) {
            i = -1;
        } else {
            i = a.a[iVar.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return b.a.DECLARATION;
                    }
                    return b.a.SYNTHESIZED;
                }
                return b.a.DELEGATION;
            }
            return b.a.FAKE_OVERRIDE;
        }
        return b.a.DECLARATION;
    }
}
