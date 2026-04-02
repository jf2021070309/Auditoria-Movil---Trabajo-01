package com.amazon.aps.iva.dw;

import android.annotation.SuppressLint;
import android.database.Cursor;
import com.amazon.aps.iva.m6.a;
import com.amazon.aps.iva.m6.v;
import com.amazon.aps.iva.sv.j2;
import com.amazon.aps.iva.sv.q1;
import com.ellation.crunchyroll.downloading.e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okhttp3.internal.Util;
/* compiled from: ExoDownloadsProvider.kt */
@SuppressLint({"UnsafeOptInUsageError"})
/* loaded from: classes2.dex */
public final class d implements q1 {
    public final v a;
    public final com.amazon.aps.iva.xb0.a<List<com.amazon.aps.iva.m6.c>> b;
    public final e c;
    public final com.amazon.aps.iva.ew.i d;
    public final k e;
    public final i f;
    public final b g = new b(this);

    public d(v vVar, j2 j2Var, f fVar, com.amazon.aps.iva.ew.j jVar, l lVar, j jVar2) {
        this.a = vVar;
        this.b = j2Var;
        this.c = fVar;
        this.d = jVar;
        this.e = lVar;
        this.f = jVar2;
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final ArrayList a(int... iArr) {
        com.amazon.aps.iva.yb0.j.f(iArr, "states");
        try {
            a.C0503a a = this.a.a(Arrays.copyOf(iArr, iArr.length));
            com.amazon.aps.iva.yb0.j.e(a, "downloadIndex.getDownloads(*states)");
            Cursor cursor = a.b;
            ArrayList arrayList = new ArrayList();
            while (cursor.moveToPosition(cursor.getPosition() + 1)) {
                arrayList.add(this.c.a(com.amazon.aps.iva.m6.a.k(cursor)));
            }
            Util.closeQuietly(a);
            return arrayList;
        } catch (com.amazon.aps.iva.v5.a e) {
            com.amazon.aps.iva.mf0.a.a.k(e, "ExoPlayer failed to get downloads - database error", new Object[0]);
            return new ArrayList();
        }
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final e0 b(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "itemId");
        com.amazon.aps.iva.m6.c g = g(str);
        if (g != null) {
            return this.c.a(g);
        }
        return null;
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final void c(String str, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        com.amazon.aps.iva.yb0.j.f(aVar, "onNoItemFound");
        com.amazon.aps.iva.yb0.j.f(aVar2, "onRemoved");
        if (b(str) == null) {
            aVar.invoke();
            return;
        }
        this.f.h(str);
        aVar2.invoke();
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final ArrayList d() {
        return a(7, 0, 2, 1, 3, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (((java.lang.Boolean) r8).booleanValue() == false) goto L13;
     */
    @Override // com.amazon.aps.iva.sv.q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.fg.d e(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "downloadId"
            com.amazon.aps.iva.yb0.j.f(r8, r0)
            com.amazon.aps.iva.m6.v r0 = r7.a
            com.amazon.aps.iva.m6.c r0 = r0.b(r8)
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            com.amazon.aps.iva.dw.e r2 = r7.c
            com.ellation.crunchyroll.downloading.e0$c r2 = r2.a(r0)
            com.amazon.aps.iva.fg.d$a r3 = new com.amazon.aps.iva.fg.d$a
            boolean r4 = r2.i()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L27
            boolean r2 = r2.j()
            if (r2 != 0) goto L27
            r2 = r5
            goto L28
        L27:
            r2 = r6
        L28:
            if (r2 == 0) goto L3c
            com.amazon.aps.iva.dw.c r2 = new com.amazon.aps.iva.dw.c
            r2.<init>(r7, r8, r1)
            java.lang.Object r8 = com.amazon.aps.iva.se0.i.f(r2)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L3c
            goto L3d
        L3c:
            r5 = r6
        L3d:
            com.amazon.aps.iva.m6.m r8 = r0.a
            java.lang.String r0 = "download.request"
            com.amazon.aps.iva.yb0.j.e(r8, r0)
            com.amazon.aps.iva.dw.k r0 = r7.e
            com.amazon.aps.iva.o6.v r8 = r0.a(r8)
            r3.<init>(r8, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.dw.d.e(java.lang.String):com.amazon.aps.iva.fg.d");
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final void f(com.amazon.aps.iva.m6.c cVar, com.amazon.aps.iva.m6.m mVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "download");
        com.amazon.aps.iva.yb0.j.f(mVar, "newDownloadRequest");
        v vVar = this.a;
        if (!(vVar instanceof v)) {
            vVar = null;
        }
        if (vVar != null) {
            com.amazon.aps.iva.m6.m mVar2 = cVar.a;
            com.amazon.aps.iva.m6.m mVar3 = new com.amazon.aps.iva.m6.m(mVar2.b, mVar2.c, mVar2.d, mVar2.e, mVar.f, mVar2.g, mVar2.h);
            int i = cVar.b;
            long j = cVar.c;
            long j2 = cVar.d;
            long j3 = cVar.e;
            int i2 = cVar.f;
            int i3 = cVar.g;
            com.amazon.aps.iva.m6.l lVar = new com.amazon.aps.iva.m6.l();
            lVar.b = cVar.h.b;
            lVar.a = cVar.h.a;
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            vVar.c(new com.amazon.aps.iva.m6.c(mVar3, i, j, j2, j3, i2, i3, lVar));
        }
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final com.amazon.aps.iva.m6.c g(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "itemId");
        try {
            return this.a.b(str);
        } catch (com.amazon.aps.iva.v5.a e) {
            com.amazon.aps.iva.mf0.a.a.k(e, "ExoPlayer failed to get download - database error", new Object[0]);
            return null;
        }
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final com.amazon.aps.iva.xb0.a<List<e0>> h() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final void r() {
        this.f.r();
    }
}
