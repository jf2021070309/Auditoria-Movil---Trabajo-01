package com.amazon.aps.iva.hl;

import com.amazon.aps.iva.nf.c;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: RestrictionOverlayMapperImpl.kt */
/* loaded from: classes2.dex */
public final class s implements r, v {
    public final v a;
    public final com.amazon.aps.iva.ij.g b;
    public final com.amazon.aps.iva.aj.a c;
    public final com.amazon.aps.iva.vs.a d;

    /* compiled from: RestrictionOverlayMapperImpl.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.x50.t.values().length];
            try {
                iArr[com.amazon.aps.iva.x50.t.MUSIC_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.x50.t.CONCERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public s(v vVar, com.amazon.aps.iva.ij.g gVar, com.amazon.aps.iva.aj.a aVar) {
        com.amazon.aps.iva.e.w wVar = com.amazon.aps.iva.e.w.d;
        com.amazon.aps.iva.yb0.j.f(vVar, "restrictionOverlayProvider");
        com.amazon.aps.iva.yb0.j.f(gVar, "availabilityProvider");
        com.amazon.aps.iva.yb0.j.f(aVar, "maturityRestriction");
        this.a = vVar;
        this.b = gVar;
        this.c = aVar;
        this.d = wVar;
    }

    @Override // com.amazon.aps.iva.hl.v
    public final c.j a() {
        return this.a.a();
    }

    @Override // com.amazon.aps.iva.hl.v
    public final com.amazon.aps.iva.nf.c b(PlayableAsset playableAsset) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
        return this.a.b(playableAsset);
    }

    @Override // com.amazon.aps.iva.hl.r
    public final com.amazon.aps.iva.nf.c c(com.amazon.aps.iva.kj.e eVar) {
        com.amazon.aps.iva.aj.a aVar = this.c;
        String str = eVar.x;
        boolean b = aVar.b(str);
        com.amazon.aps.iva.x50.t tVar = eVar.e;
        if (b) {
            String a2 = aVar.a();
            String str2 = "";
            if (a2 == null) {
                a2 = "";
            }
            if (str == null) {
                str = "";
            }
            String str3 = eVar.y;
            if (str3 == null) {
                str3 = "";
            }
            com.amazon.aps.iva.ks.p pVar = new com.amazon.aps.iva.ks.p(a2, str, str3);
            String str4 = eVar.c;
            if (str4 != null) {
                str2 = str4;
            }
            return new c.i(pVar, this.d.c(eVar.a, str2, com.amazon.aps.iva.dj.c.a(tVar)));
        }
        String a3 = this.b.a(eVar);
        switch (a3.hashCode()) {
            case -665462704:
                if (a3.equals("unavailable")) {
                    return c.k.a;
                }
                break;
            case -318452137:
                if (a3.equals("premium")) {
                    int i = a.a[tVar.ordinal()];
                    if (i != 1 && i != 2) {
                        return x.a(eVar.s, eVar.w);
                    }
                    return new c.f(true);
                }
                break;
            case -108217148:
                if (a3.equals("matureBlocked")) {
                    return c.d.a;
                }
                break;
            case 1894333340:
                if (a3.equals("comingSoon")) {
                    return c.a.a;
                }
                break;
        }
        return null;
    }
}
