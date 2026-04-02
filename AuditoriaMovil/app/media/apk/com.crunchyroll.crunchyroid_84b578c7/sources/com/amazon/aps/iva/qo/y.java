package com.amazon.aps.iva.qo;

import com.amazon.aps.iva.b8.l1;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.io.Serializable;
/* compiled from: WatchScreenViewModel.kt */
/* loaded from: classes2.dex */
public final class y implements Serializable {
    public final String b;
    public final PlayableAsset c;
    public final com.amazon.aps.iva.x50.t d;
    public final String e;
    public final Long f;
    public final boolean g;

    /* compiled from: WatchScreenViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static y a(com.amazon.aps.iva.ap.g gVar) {
            String str;
            String str2;
            Long l;
            long x;
            com.amazon.aps.iva.yb0.j.f(gVar, "input");
            com.amazon.aps.iva.ap.h hVar = gVar.c;
            PlayableAsset playableAsset = gVar.b;
            if (playableAsset != null) {
                str = playableAsset.getId();
            } else if (hVar != null) {
                str = hVar.c;
            } else {
                str = null;
            }
            PlayableAsset playableAsset2 = gVar.b;
            com.amazon.aps.iva.x50.t tVar = gVar.a().c;
            if (playableAsset != null) {
                str2 = playableAsset.getId();
            } else if (hVar != null) {
                str2 = hVar.c;
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = gVar.a().b;
            }
            String str3 = str2;
            Boolean bool = gVar.e;
            if (bool != null) {
                if (bool.booleanValue()) {
                    x = 0;
                } else {
                    Long l2 = gVar.d;
                    if (l2 != null) {
                        x = com.amazon.aps.iva.gr.n.x(l2.longValue());
                    }
                }
                l = Long.valueOf(x);
                return new y(str, playableAsset2, tVar, str3, l, true);
            }
            l = null;
            return new y(str, playableAsset2, tVar, str3, l, true);
        }

        public static y b(PlayableAsset playableAsset, Long l) {
            com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
            return y.a(a(new com.amazon.aps.iva.ap.g(playableAsset, 30)), null, l, 47);
        }
    }

    public y(String str, PlayableAsset playableAsset, com.amazon.aps.iva.x50.t tVar, String str2, Long l, boolean z) {
        com.amazon.aps.iva.yb0.j.f(tVar, "containerResourceType");
        com.amazon.aps.iva.yb0.j.f(str2, "inputId");
        this.b = str;
        this.c = playableAsset;
        this.d = tVar;
        this.e = str2;
        this.f = l;
        this.g = z;
    }

    public static y a(y yVar, String str, Long l, int i) {
        PlayableAsset playableAsset;
        com.amazon.aps.iva.x50.t tVar;
        String str2;
        boolean z;
        if ((i & 1) != 0) {
            str = yVar.b;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            playableAsset = yVar.c;
        } else {
            playableAsset = null;
        }
        if ((i & 4) != 0) {
            tVar = yVar.d;
        } else {
            tVar = null;
        }
        if ((i & 8) != 0) {
            str2 = yVar.e;
        } else {
            str2 = null;
        }
        if ((i & 16) != 0) {
            l = yVar.f;
        }
        Long l2 = l;
        if ((i & 32) != 0) {
            z = yVar.g;
        } else {
            z = false;
        }
        yVar.getClass();
        com.amazon.aps.iva.yb0.j.f(tVar, "containerResourceType");
        com.amazon.aps.iva.yb0.j.f(str2, "inputId");
        return new y(str3, playableAsset, tVar, str2, l2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, yVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, yVar.c) && this.d == yVar.d && com.amazon.aps.iva.yb0.j.a(this.e, yVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, yVar.f) && this.g == yVar.g) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        PlayableAsset playableAsset = this.c;
        if (playableAsset == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = playableAsset.hashCode();
        }
        int b = com.amazon.aps.iva.c80.a.b(this.e, l1.a(this.d, (i2 + hashCode2) * 31, 31), 31);
        Long l = this.f;
        if (l != null) {
            i = l.hashCode();
        }
        int i3 = (b + i) * 31;
        boolean z = this.g;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        return i3 + i4;
    }

    public final String toString() {
        return "WatchScreenViewModelState(assetId=" + this.b + ", asset=" + this.c + ", containerResourceType=" + this.d + ", inputId=" + this.e + ", playheadToStartSec=" + this.f + ", reloadStreams=" + this.g + ")";
    }
}
