package com.amazon.aps.iva.f00;

import com.amazon.aps.iva.b8.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ot.a;
import com.crunchyroll.downloading.presentation.download.button.DownloadButtonState;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.google.android.gms.ads.AdRequest;
import java.util.List;
import okhttp3.internal.http2.Http2;
/* compiled from: PlayableAssetUiModel.kt */
/* loaded from: classes2.dex */
public final class q implements a, com.amazon.aps.iva.qg.c<q> {
    public final String b;
    public final List<Image> c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final int k;
    public final String l;
    public final com.amazon.aps.iva.ot.a m;
    public final List<String> n;
    public final LabelUiModel o;
    public DownloadButtonState p;
    public final boolean q;
    public final com.amazon.aps.iva.x50.t r;
    public final com.amazon.aps.iva.ks.e s;
    public final String t;
    public final String u;
    public String v;

    public q(String str, List<Image> list, String str2, boolean z, String str3, String str4, String str5, String str6, int i, int i2, String str7, com.amazon.aps.iva.ot.a aVar, List<String> list2, LabelUiModel labelUiModel, DownloadButtonState downloadButtonState, boolean z2, com.amazon.aps.iva.x50.t tVar, com.amazon.aps.iva.ks.e eVar, String str8, String str9) {
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
        com.amazon.aps.iva.yb0.j.f(list, "thumbnails");
        com.amazon.aps.iva.yb0.j.f(str2, "title");
        com.amazon.aps.iva.yb0.j.f(str3, "episodeNumber");
        com.amazon.aps.iva.yb0.j.f(str4, "seasonAndEpisodeNumber");
        com.amazon.aps.iva.yb0.j.f(str5, "seasonId");
        com.amazon.aps.iva.yb0.j.f(str6, "duration");
        com.amazon.aps.iva.yb0.j.f(str7, "seasonTitle");
        com.amazon.aps.iva.yb0.j.f(aVar, "status");
        com.amazon.aps.iva.yb0.j.f(list2, "badgeStatuses");
        com.amazon.aps.iva.yb0.j.f(labelUiModel, "labelUiModel");
        com.amazon.aps.iva.yb0.j.f(downloadButtonState, "downloadButtonState");
        com.amazon.aps.iva.yb0.j.f(tVar, "resourceType");
        com.amazon.aps.iva.yb0.j.f(eVar, "contentMediaProperty");
        com.amazon.aps.iva.yb0.j.f(str8, "adapterId");
        com.amazon.aps.iva.yb0.j.f(str9, "parentId");
        this.b = str;
        this.c = list;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = i;
        this.k = i2;
        this.l = str7;
        this.m = aVar;
        this.n = list2;
        this.o = labelUiModel;
        this.p = downloadButtonState;
        this.q = z2;
        this.r = tVar;
        this.s = eVar;
        this.t = str8;
        this.u = str9;
        this.v = "";
    }

    public static q c(q qVar, int i, a.h hVar, DownloadButtonState downloadButtonState, int i2) {
        String str;
        List<Image> list;
        String str2;
        boolean z;
        String str3;
        String str4;
        String str5;
        String str6;
        int i3;
        int i4;
        String str7;
        com.amazon.aps.iva.ot.a aVar;
        List<String> list2;
        LabelUiModel labelUiModel;
        DownloadButtonState downloadButtonState2;
        int i5;
        boolean z2;
        com.amazon.aps.iva.x50.t tVar;
        boolean z3;
        com.amazon.aps.iva.ks.e eVar;
        com.amazon.aps.iva.ks.e eVar2;
        String str8;
        String str9;
        if ((i2 & 1) != 0) {
            str = qVar.b;
        } else {
            str = null;
        }
        if ((i2 & 2) != 0) {
            list = qVar.c;
        } else {
            list = null;
        }
        if ((i2 & 4) != 0) {
            str2 = qVar.d;
        } else {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            z = qVar.e;
        } else {
            z = false;
        }
        if ((i2 & 16) != 0) {
            str3 = qVar.f;
        } else {
            str3 = null;
        }
        if ((i2 & 32) != 0) {
            str4 = qVar.g;
        } else {
            str4 = null;
        }
        if ((i2 & 64) != 0) {
            str5 = qVar.h;
        } else {
            str5 = null;
        }
        if ((i2 & 128) != 0) {
            str6 = qVar.i;
        } else {
            str6 = null;
        }
        if ((i2 & 256) != 0) {
            i3 = qVar.j;
        } else {
            i3 = 0;
        }
        if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            i4 = qVar.k;
        } else {
            i4 = i;
        }
        if ((i2 & 1024) != 0) {
            str7 = qVar.l;
        } else {
            str7 = null;
        }
        if ((i2 & 2048) != 0) {
            aVar = qVar.m;
        } else {
            aVar = hVar;
        }
        if ((i2 & 4096) != 0) {
            list2 = qVar.n;
        } else {
            list2 = null;
        }
        if ((i2 & 8192) != 0) {
            labelUiModel = qVar.o;
        } else {
            labelUiModel = null;
        }
        int i6 = i4;
        if ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            downloadButtonState2 = qVar.p;
        } else {
            downloadButtonState2 = downloadButtonState;
        }
        if ((i2 & 32768) != 0) {
            i5 = i3;
            z2 = qVar.q;
        } else {
            i5 = i3;
            z2 = false;
        }
        if ((65536 & i2) != 0) {
            tVar = qVar.r;
        } else {
            tVar = null;
        }
        if ((i2 & 131072) != 0) {
            z3 = z;
            eVar = qVar.s;
        } else {
            z3 = z;
            eVar = null;
        }
        if ((i2 & 262144) != 0) {
            eVar2 = eVar;
            str8 = qVar.t;
        } else {
            eVar2 = eVar;
            str8 = null;
        }
        if ((i2 & 524288) != 0) {
            str9 = qVar.u;
        } else {
            str9 = null;
        }
        qVar.getClass();
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
        com.amazon.aps.iva.yb0.j.f(list, "thumbnails");
        com.amazon.aps.iva.yb0.j.f(str2, "title");
        com.amazon.aps.iva.yb0.j.f(str3, "episodeNumber");
        com.amazon.aps.iva.yb0.j.f(str4, "seasonAndEpisodeNumber");
        com.amazon.aps.iva.yb0.j.f(str5, "seasonId");
        com.amazon.aps.iva.yb0.j.f(str6, "duration");
        com.amazon.aps.iva.yb0.j.f(str7, "seasonTitle");
        com.amazon.aps.iva.yb0.j.f(aVar, "status");
        com.amazon.aps.iva.yb0.j.f(list2, "badgeStatuses");
        com.amazon.aps.iva.yb0.j.f(labelUiModel, "labelUiModel");
        com.amazon.aps.iva.yb0.j.f(downloadButtonState2, "downloadButtonState");
        com.amazon.aps.iva.yb0.j.f(tVar, "resourceType");
        com.amazon.aps.iva.x50.t tVar2 = tVar;
        com.amazon.aps.iva.ks.e eVar3 = eVar2;
        com.amazon.aps.iva.yb0.j.f(eVar3, "contentMediaProperty");
        com.amazon.aps.iva.yb0.j.f(str8, "adapterId");
        com.amazon.aps.iva.yb0.j.f(str9, "parentId");
        String str10 = str8;
        return new q(str, list, str2, z3, str3, str4, str5, str6, i5, i6, str7, aVar, list2, labelUiModel, downloadButtonState2, z2, tVar2, eVar3, str10, str9);
    }

    @Override // com.amazon.aps.iva.qg.c
    public final q a(DownloadButtonState downloadButtonState) {
        com.amazon.aps.iva.yb0.j.f(downloadButtonState, "downloadButtonState");
        return c(this, 0, null, downloadButtonState, 1032191);
    }

    @Override // com.amazon.aps.iva.qg.c
    public final String b() {
        return this.b;
    }

    public final Object clone() {
        return super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, qVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, qVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, qVar.d) && this.e == qVar.e && com.amazon.aps.iva.yb0.j.a(this.f, qVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, qVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, qVar.h) && com.amazon.aps.iva.yb0.j.a(this.i, qVar.i) && this.j == qVar.j && this.k == qVar.k && com.amazon.aps.iva.yb0.j.a(this.l, qVar.l) && com.amazon.aps.iva.yb0.j.a(this.m, qVar.m) && com.amazon.aps.iva.yb0.j.a(this.n, qVar.n) && com.amazon.aps.iva.yb0.j.a(this.o, qVar.o) && com.amazon.aps.iva.yb0.j.a(this.p, qVar.p) && this.q == qVar.q && this.r == qVar.r && com.amazon.aps.iva.yb0.j.a(this.s, qVar.s) && com.amazon.aps.iva.yb0.j.a(this.t, qVar.t) && com.amazon.aps.iva.yb0.j.a(this.u, qVar.u)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.f00.a
    public final String getAdapterId() {
        return this.t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int b = com.amazon.aps.iva.c80.a.b(this.d, defpackage.a.a(this.c, this.b.hashCode() * 31, 31), 31);
        int i = 1;
        boolean z = this.e;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int hashCode = (this.p.hashCode() + ((this.o.hashCode() + defpackage.a.a(this.n, (this.m.hashCode() + com.amazon.aps.iva.c80.a.b(this.l, com.amazon.aps.iva.a0.r.a(this.k, com.amazon.aps.iva.a0.r.a(this.j, com.amazon.aps.iva.c80.a.b(this.i, com.amazon.aps.iva.c80.a.b(this.h, com.amazon.aps.iva.c80.a.b(this.g, com.amazon.aps.iva.c80.a.b(this.f, (b + i2) * 31, 31), 31), 31), 31), 31), 31), 31)) * 31, 31)) * 31)) * 31;
        boolean z2 = this.q;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return this.u.hashCode() + com.amazon.aps.iva.c80.a.b(this.t, (this.s.hashCode() + l1.a(this.r, (hashCode + i) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        DownloadButtonState downloadButtonState = this.p;
        StringBuilder sb = new StringBuilder("PlayableAssetUiModel(assetId=");
        sb.append(this.b);
        sb.append(", thumbnails=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", isMature=");
        sb.append(this.e);
        sb.append(", episodeNumber=");
        sb.append(this.f);
        sb.append(", seasonAndEpisodeNumber=");
        sb.append(this.g);
        sb.append(", seasonId=");
        sb.append(this.h);
        sb.append(", duration=");
        sb.append(this.i);
        sb.append(", comments=");
        sb.append(this.j);
        sb.append(", watchProgress=");
        sb.append(this.k);
        sb.append(", seasonTitle=");
        sb.append(this.l);
        sb.append(", status=");
        sb.append(this.m);
        sb.append(", badgeStatuses=");
        sb.append(this.n);
        sb.append(", labelUiModel=");
        sb.append(this.o);
        sb.append(", downloadButtonState=");
        sb.append(downloadButtonState);
        sb.append(", showOverflowMenu=");
        sb.append(this.q);
        sb.append(", resourceType=");
        sb.append(this.r);
        sb.append(", contentMediaProperty=");
        sb.append(this.s);
        sb.append(", adapterId=");
        sb.append(this.t);
        sb.append(", parentId=");
        return defpackage.b.c(sb, this.u, ")");
    }

    public /* synthetic */ q(String str, List list, String str2, boolean z, String str3, String str4, String str5, String str6, int i, int i2, com.amazon.aps.iva.ot.a aVar, List list2, LabelUiModel labelUiModel, DownloadButtonState downloadButtonState, boolean z2, com.amazon.aps.iva.x50.t tVar, com.amazon.aps.iva.ks.e eVar, String str7, String str8, int i3) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? com.amazon.aps.iva.lb0.z.b : list, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? "" : str5, (i3 & 128) != 0 ? "" : str6, (i3 & 256) != 0 ? 0 : i, (i3 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? 0 : i2, (i3 & 1024) != 0 ? "" : null, (i3 & 2048) != 0 ? a.C0584a.d : aVar, (i3 & 4096) != 0 ? f1.J("available") : list2, (i3 & 8192) != 0 ? new LabelUiModel(null, false, false, false, null, null, null, null, 255, null) : labelUiModel, (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? DownloadButtonState.NotStarted.c : downloadButtonState, (32768 & i3) != 0 ? false : z2, (65536 & i3) != 0 ? com.amazon.aps.iva.x50.t.EPISODE : tVar, eVar, str7, (i3 & 524288) != 0 ? "" : str8);
    }
}
