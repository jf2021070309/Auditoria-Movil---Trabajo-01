package com.amazon.aps.iva.lw;

import android.content.Context;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.c;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.wv.e0;
import com.amazon.aps.iva.wv.f0;
import com.amazon.aps.iva.wv.j;
import com.amazon.aps.iva.wv.k;
import com.amazon.aps.iva.wv.q;
import com.amazon.aps.iva.wv.r;
import com.amazon.aps.iva.zv.b;
import java.util.List;
/* compiled from: DownloadedAssetsProviderImpl.kt */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.ug.a {
    public final j a;
    public final q b;
    public final e0 c;

    /* compiled from: DownloadedAssetsProviderImpl.kt */
    @e(c = "com.ellation.crunchyroll.downloading.providers.DownloadedAssetsProviderImpl", f = "DownloadedAssetsProviderImpl.kt", l = {16, 18, 22, 27}, m = "getAssets")
    /* renamed from: com.amazon.aps.iva.lw.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0494a extends c {
        public a h;
        public Object i;
        public Object j;
        public List k;
        public /* synthetic */ Object l;
        public int n;

        public C0494a(d<? super C0494a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.l = obj;
            this.n |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    public a(int i) {
        Context context = b.a.a;
        if (context != null) {
            k kVar = j.a.a;
            if (kVar == null) {
                Context applicationContext = context.getApplicationContext();
                com.amazon.aps.iva.yb0.j.e(applicationContext, "context.applicationContext");
                kVar = new k(applicationContext);
                j.a.a = kVar;
            }
            Context context2 = b.a.a;
            if (context2 != null) {
                r rVar = q.a.a;
                if (rVar == null) {
                    Context applicationContext2 = context2.getApplicationContext();
                    com.amazon.aps.iva.yb0.j.e(applicationContext2, "context.applicationContext");
                    rVar = new r(applicationContext2);
                    q.a.a = rVar;
                }
                Context context3 = b.a.a;
                if (context3 != null) {
                    f0 f0Var = e0.a.a;
                    if (f0Var == null) {
                        Context applicationContext3 = context3.getApplicationContext();
                        com.amazon.aps.iva.yb0.j.e(applicationContext3, "context.applicationContext");
                        f0Var = new f0(applicationContext3);
                        e0.a.a = f0Var;
                    }
                    this.a = kVar;
                    this.b = rVar;
                    this.c = f0Var;
                    return;
                }
                com.amazon.aps.iva.yb0.j.m("internalContext");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("internalContext");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("internalContext");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d5 -> B:37:0x00d6). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.ug.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, com.amazon.aps.iva.ob0.d<? super java.util.List<? extends com.ellation.crunchyroll.model.PlayableAsset>> r12) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.lw.a.a(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
