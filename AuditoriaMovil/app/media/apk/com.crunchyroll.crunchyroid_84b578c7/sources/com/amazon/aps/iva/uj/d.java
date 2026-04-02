package com.amazon.aps.iva.uj;

import com.amazon.aps.iva.a6.m;
import com.amazon.aps.iva.a6.m0;
import com.amazon.aps.iva.ik.f;
import com.amazon.aps.iva.nk.i;
import com.amazon.aps.iva.ve0.g0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: VideoPlayerSettingsController.kt */
/* loaded from: classes.dex */
public final class d implements c {
    public final m a;
    public final g0<i> b;
    public final com.amazon.aps.iva.ik.c c;
    public final com.amazon.aps.iva.ok.b d;

    /* compiled from: VideoPlayerSettingsController.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<i, i> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final i invoke(i iVar) {
            i iVar2 = iVar;
            j.f(iVar2, "$this$set");
            return i.a(iVar2, false, null, false, 62);
        }
    }

    /* compiled from: VideoPlayerSettingsController.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<i, i> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final i invoke(i iVar) {
            i iVar2 = iVar;
            j.f(iVar2, "$this$set");
            return i.a(iVar2, true, null, false, 62);
        }
    }

    public d(m0 m0Var, v0 v0Var, com.amazon.aps.iva.gk.b bVar, com.amazon.aps.iva.ok.b bVar2) {
        j.f(v0Var, "videoSettingState");
        j.f(bVar, "qualityTrackSelector");
        j.f(bVar2, "textTracksController");
        this.a = m0Var;
        this.b = v0Var;
        this.c = bVar;
        this.d = bVar2;
    }

    @Override // com.amazon.aps.iva.uj.c
    public final void a(boolean z) {
        this.d.a(z);
    }

    @Override // com.amazon.aps.iva.uj.c
    public final void b(String str) {
        j.f(str, "languageTag");
        this.d.b(str);
    }

    @Override // com.amazon.aps.iva.uj.c
    public final void c() {
        i.C(this.b, b.h);
        this.a.W(false);
    }

    @Override // com.amazon.aps.iva.uj.c
    public final void d() {
        i.C(this.b, a.h);
        this.a.W(true);
    }

    @Override // com.amazon.aps.iva.uj.c
    public final void e(f fVar) {
        this.c.G(fVar);
    }
}
