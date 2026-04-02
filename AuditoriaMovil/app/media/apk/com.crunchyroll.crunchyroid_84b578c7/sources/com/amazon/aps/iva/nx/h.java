package com.amazon.aps.iva.nx;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.cj.k0;
import com.amazon.aps.iva.cj.m;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.application.a;
import com.google.android.gms.cast.MediaError;
/* compiled from: PlayerFeatureConfigurationImpl.kt */
/* loaded from: classes2.dex */
public final class h implements m {
    public final int a;
    public final int b;
    public final k0 c;

    public h(int i, k0 k0Var) {
        j.f(k0Var, "subtitlesRenderingQuality");
        this.a = i;
        this.b = MediaError.DetailedErrorCode.SEGMENT_UNKNOWN;
        this.c = k0Var;
    }

    @Override // com.amazon.aps.iva.cj.m
    public final void a() {
        com.amazon.aps.iva.ts.b.a.getClass();
    }

    @Override // com.amazon.aps.iva.cj.m
    public final boolean b() {
        int i = com.ellation.crunchyroll.application.a.a;
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c = aVar.c().c(com.amazon.aps.iva.cx.f.class, "cronet_transport");
            if (c != null) {
                return ((com.amazon.aps.iva.cx.f) c).a();
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.CronetTransportConfig");
        }
        j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.cj.m
    public final String c() {
        com.amazon.aps.iva.ts.a aVar = com.amazon.aps.iva.ts.b.a;
        com.amazon.aps.iva.ts.b.a.getClass();
        return com.amazon.aps.iva.ts.a.f;
    }

    @Override // com.amazon.aps.iva.cj.m
    public final boolean d() {
        int i = com.ellation.crunchyroll.application.a.a;
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c = aVar.c().c(a.class, "decoder_fallback");
            if (c != null) {
                return ((a) c).a();
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.player.DecoderFallbackConfig");
        }
        j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.cj.m
    public final int e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.a == hVar.a && this.b == hVar.b && this.c == hVar.c) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.cj.m
    public final k0 f() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.cj.m
    public final int g() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.cj.m
    public final String h() {
        com.amazon.aps.iva.ts.a aVar = com.amazon.aps.iva.ts.b.a;
        com.amazon.aps.iva.ts.b.a.getClass();
        return com.amazon.aps.iva.ts.a.o;
    }

    public final int hashCode() {
        return this.c.hashCode() + r.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "PlayerFeatureConfigurationImpl(subtitlesRenderingFps=" + this.a + ", subtitlesPrerenderMs=" + this.b + ", subtitlesRenderingQuality=" + this.c + ")";
    }
}
