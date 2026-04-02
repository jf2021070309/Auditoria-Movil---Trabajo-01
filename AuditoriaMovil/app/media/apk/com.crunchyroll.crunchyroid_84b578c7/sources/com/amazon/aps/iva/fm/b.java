package com.amazon.aps.iva.fm;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.q3;
import com.amazon.aps.iva.v1.d1;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.assets.model.AssetType;
import com.google.android.gms.cast.MediaError;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: AssetUrlProvider.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final String b;

    public b(String str) {
        j.f(str, "assetsEndpoint");
        this.b = str;
    }

    public static String d(List list, float f, float f2, i iVar) {
        com.amazon.aps.iva.kb0.j jVar;
        e0.b bVar = e0.a;
        q3 q3Var = d1.e;
        int P0 = (int) ((com.amazon.aps.iva.o2.c) iVar.i(q3Var)).P0(f);
        int P02 = (int) ((com.amazon.aps.iva.o2.c) iVar.i(q3Var)).P0(f2);
        if (P0 > P02) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    int abs = Math.abs(((Number) ((com.amazon.aps.iva.kb0.j) next).b).intValue() - P0);
                    do {
                        Object next2 = it.next();
                        int abs2 = Math.abs(((Number) ((com.amazon.aps.iva.kb0.j) next2).b).intValue() - P0);
                        if (abs > abs2) {
                            next = next2;
                            abs = abs2;
                        }
                    } while (it.hasNext());
                    jVar = (com.amazon.aps.iva.kb0.j) next;
                } else {
                    jVar = (com.amazon.aps.iva.kb0.j) next;
                }
            } else {
                throw new NoSuchElementException();
            }
        } else {
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                Object next3 = it2.next();
                if (it2.hasNext()) {
                    int abs3 = Math.abs(((Number) ((com.amazon.aps.iva.kb0.j) next3).c).intValue() - P02);
                    do {
                        Object next4 = it2.next();
                        int abs4 = Math.abs(((Number) ((com.amazon.aps.iva.kb0.j) next4).c).intValue() - P02);
                        if (abs3 > abs4) {
                            next3 = next4;
                            abs3 = abs4;
                        }
                    } while (it2.hasNext());
                    jVar = (com.amazon.aps.iva.kb0.j) next3;
                } else {
                    jVar = (com.amazon.aps.iva.kb0.j) next3;
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        String str = jVar.b + "x" + jVar.c;
        e0.b bVar2 = e0.a;
        return str;
    }

    @Override // com.amazon.aps.iva.fm.a
    public final String a(String str, long j, i iVar, int i) {
        e0.b bVar = e0.a;
        return b(str, com.amazon.aps.iva.o2.g.c(j), com.amazon.aps.iva.o2.g.b(j), iVar, (i & 14) | ((i << 3) & 7168));
    }

    @Override // com.amazon.aps.iva.fm.a
    public final String b(String str, float f, float f2, i iVar, int i) {
        j.f(str, "assetId");
        e0.b bVar = e0.a;
        List K = f1.K(new com.amazon.aps.iva.kb0.j(360, 115), new com.amazon.aps.iva.kb0.j(720, 180), new com.amazon.aps.iva.kb0.j(1920, Integer.valueOf((int) MediaError.DetailedErrorCode.MANIFEST_UNKNOWN)));
        AssetType assetType = AssetType.WALLPAPER;
        String d = d(K, f, f2, iVar);
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append("/");
        sb.append(assetType);
        sb.append("/");
        return com.amazon.aps.iva.n4.a.a(sb, d, "/", str);
    }

    @Override // com.amazon.aps.iva.fm.a
    public final String c(String str, float f, i iVar, int i) {
        j.f(str, "assetId");
        e0.b bVar = e0.a;
        List K = f1.K(new com.amazon.aps.iva.kb0.j(60, 60), new com.amazon.aps.iva.kb0.j(80, 80), new com.amazon.aps.iva.kb0.j(120, 120), new com.amazon.aps.iva.kb0.j(170, 170), new com.amazon.aps.iva.kb0.j(510, 510));
        AssetType assetType = AssetType.AVATAR;
        String d = d(K, f, f, iVar);
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append("/");
        sb.append(assetType);
        sb.append("/");
        return com.amazon.aps.iva.n4.a.a(sb, d, "/", str);
    }
}
