package com.amazon.aps.iva.ql;

import androidx.lifecycle.m;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
/* compiled from: PlayerSettingsSynchronizer.kt */
/* loaded from: classes2.dex */
public final class i {
    public final com.amazon.aps.iva.jh.i a;
    public final com.amazon.aps.iva.jh.i b;
    public final c c;
    public final g0 d;
    public final com.amazon.aps.iva.pm.b e;

    /* compiled from: PlayerSettingsSynchronizer.kt */
    /* loaded from: classes2.dex */
    public static final class a implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public a(h hVar) {
            this.a = hVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return com.amazon.aps.iva.yb0.j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    public i(com.amazon.aps.iva.pm.d dVar, m mVar, CrunchyrollApplication.g gVar, com.amazon.aps.iva.jh.i iVar, com.amazon.aps.iva.jh.i iVar2, g gVar2, com.amazon.aps.iva.xe0.d dVar2, com.amazon.aps.iva.pm.b bVar) {
        com.amazon.aps.iva.yb0.j.f(mVar, "lifecycleOwner");
        com.amazon.aps.iva.yb0.j.f(iVar2, "audioLanguageOptionsStore");
        this.a = iVar;
        this.b = iVar2;
        this.c = gVar2;
        this.d = dVar2;
        this.e = bVar;
        dVar.b().e(mVar, new a(new h(gVar, this)));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(1:17))(2:20|(2:22|(2:24|25))(8:26|(3:36|(3:39|(1:41)|37)|42)|30|(1:32)|33|(1:35)|12|13))|18|12|13))|45|6|7|(0)(0)|18|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
        com.amazon.aps.iva.ab.x.H(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.amazon.aps.iva.ql.i r5, java.lang.String r6, com.amazon.aps.iva.ob0.d r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof com.amazon.aps.iva.ql.l
            if (r0 == 0) goto L16
            r0 = r7
            com.amazon.aps.iva.ql.l r0 = (com.amazon.aps.iva.ql.l) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.j = r1
            goto L1b
        L16:
            com.amazon.aps.iva.ql.l r0 = new com.amazon.aps.iva.ql.l
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            com.amazon.aps.iva.ab.x.i0(r7)
            goto La2
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            com.amazon.aps.iva.ab.x.i0(r7)     // Catch: java.lang.Throwable -> L59
            goto L56
        L3a:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.amazon.aps.iva.ql.c r7 = r5.c
            if (r6 != 0) goto L5e
            com.amazon.aps.iva.pm.b r5 = r5.e     // Catch: java.lang.Throwable -> L59
            com.amazon.aps.iva.yy.a r6 = r7.h()     // Catch: java.lang.Throwable -> L59
            java.lang.Object r6 = r6.d()     // Catch: java.lang.Throwable -> L59
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L59
            r0.j = r4     // Catch: java.lang.Throwable -> L59
            java.lang.Object r5 = r5.C0(r6, r0)     // Catch: java.lang.Throwable -> L59
            if (r5 != r1) goto L56
            goto La4
        L56:
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a     // Catch: java.lang.Throwable -> L59
            goto La2
        L59:
            r5 = move-exception
            com.amazon.aps.iva.ab.x.H(r5)
            goto La2
        L5e:
            com.amazon.aps.iva.yy.a r7 = r7.h()
            com.amazon.aps.iva.jh.i r5 = r5.a
            java.util.List r5 = r5.read()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r2 = r5 instanceof java.util.Collection
            if (r2 == 0) goto L78
            r2 = r5
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L78
            goto L93
        L78:
            java.util.Iterator r5 = r5.iterator()
        L7c:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L93
            java.lang.Object r2 = r5.next()
            com.amazon.aps.iva.jh.f r2 = (com.amazon.aps.iva.jh.f) r2
            java.lang.String r2 = r2.a()
            boolean r2 = com.amazon.aps.iva.yb0.j.a(r2, r6)
            if (r2 == 0) goto L7c
            goto L94
        L93:
            r4 = 0
        L94:
            if (r4 == 0) goto L97
            goto L99
        L97:
            java.lang.String r6 = "off"
        L99:
            r0.j = r3
            java.lang.Object r5 = r7.a(r6, r0)
            if (r5 != r1) goto La2
            goto La4
        La2:
            com.amazon.aps.iva.kb0.q r1 = com.amazon.aps.iva.kb0.q.a
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ql.i.a(com.amazon.aps.iva.ql.i, java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
