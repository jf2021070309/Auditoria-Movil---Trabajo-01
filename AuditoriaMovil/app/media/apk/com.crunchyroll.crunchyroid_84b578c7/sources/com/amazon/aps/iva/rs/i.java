package com.amazon.aps.iva.rs;

import android.app.Activity;
import com.android.billingclient.api.b;
import com.android.billingclient.api.d;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: BillingExtensions.kt */
/* loaded from: classes2.dex */
public final class i {

    /* compiled from: BillingExtensions.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.billing.BillingExtensionsKt", f = "BillingExtensions.kt", l = {111}, m = "getProductDetails")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public String h;
        public /* synthetic */ Object i;
        public int j;

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.j |= Integer.MIN_VALUE;
            return i.e(null, null, this);
        }
    }

    /* compiled from: BillingExtensions.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.billing.BillingExtensionsKt", f = "BillingExtensions.kt", l = {61}, m = "launchBillingFlow")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public com.amazon.aps.iva.ab.a h;
        public Activity i;
        public String j;
        public b.a k;
        public int l;
        public /* synthetic */ Object m;
        public int n;

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.m = obj;
            this.n |= Integer.MIN_VALUE;
            return i.h(null, null, null, null, 0, false, this);
        }
    }

    public static final d.b a(d.C0933d c0933d) {
        Object obj;
        ArrayList arrayList = c0933d.c.a;
        com.amazon.aps.iva.yb0.j.e(arrayList, "pricingPhases.pricingPhaseList");
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                boolean z = true;
                if (((d.b) obj).f != 1) {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (d.b) obj;
    }

    public static final d.C0933d b(com.android.billingclient.api.d dVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "<this>");
        ArrayList arrayList = dVar.h;
        Object obj = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((d.C0933d) next).d.isEmpty()) {
                obj = next;
                break;
            }
        }
        return (d.C0933d) obj;
    }

    public static final d.b c(d.C0933d c0933d) {
        Object obj;
        boolean z;
        ArrayList arrayList = c0933d.c.a;
        com.amazon.aps.iva.yb0.j.e(arrayList, "pricingPhases.pricingPhaseList");
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((d.b) obj).b == 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (d.b) obj;
    }

    public static final String d(com.android.billingclient.api.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        int i = cVar.a;
        String str = cVar.b;
        return i + " " + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(com.amazon.aps.iva.ab.a r9, java.lang.String r10, com.amazon.aps.iva.ob0.d<? super com.android.billingclient.api.d> r11) throws com.amazon.aps.iva.rs.h {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.rs.i.e(com.amazon.aps.iva.ab.a, java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.amazon.aps.iva.rs.m$a] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.amazon.aps.iva.rs.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.amazon.aps.iva.rs.m f(com.android.billingclient.api.d r11, boolean r12, com.amazon.aps.iva.ss.c r13) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.rs.i.f(com.android.billingclient.api.d, boolean, com.amazon.aps.iva.ss.c):com.amazon.aps.iva.rs.m");
    }

    public static final d.C0933d g(com.android.billingclient.api.d dVar, String str) {
        ArrayList arrayList = dVar.h;
        Object obj = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((d.C0933d) next).d.contains(str)) {
                obj = next;
                break;
            }
        }
        return (d.C0933d) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(com.amazon.aps.iva.ab.a r17, android.app.Activity r18, com.android.billingclient.api.d r19, java.lang.String r20, int r21, boolean r22, com.amazon.aps.iva.ob0.d<? super com.android.billingclient.api.c> r23) throws com.amazon.aps.iva.rs.h {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.rs.i.h(com.amazon.aps.iva.ab.a, android.app.Activity, com.android.billingclient.api.d, java.lang.String, int, boolean, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r8 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.amazon.aps.iva.rs.n i(com.android.billingclient.api.d.b r7, com.amazon.aps.iva.ss.c r8) {
        /*
            long r2 = r7.b
            if (r8 == 0) goto L11
            java.lang.String r0 = r7.d
            java.lang.String r1 = "billingPeriod"
            com.amazon.aps.iva.yb0.j.e(r0, r1)
            com.amazon.aps.iva.ss.b r8 = r8.a(r0)
            if (r8 != 0) goto L1a
        L11:
            com.amazon.aps.iva.ss.b r8 = new com.amazon.aps.iva.ss.b
            r0 = 14
            com.amazon.aps.iva.ss.a r1 = com.amazon.aps.iva.ss.a.DAY
            r8.<init>(r0, r1)
        L1a:
            r5 = r8
            int r6 = r7.e
            com.amazon.aps.iva.rs.n r8 = new com.amazon.aps.iva.rs.n
            java.lang.String r1 = r7.a
            java.lang.String r0 = "formattedPrice"
            com.amazon.aps.iva.yb0.j.e(r1, r0)
            java.lang.String r4 = r7.c
            java.lang.String r7 = "priceCurrencyCode"
            com.amazon.aps.iva.yb0.j.e(r4, r7)
            r0 = r8
            r0.<init>(r1, r2, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.rs.i.i(com.android.billingclient.api.d$b, com.amazon.aps.iva.ss.c):com.amazon.aps.iva.rs.n");
    }
}
