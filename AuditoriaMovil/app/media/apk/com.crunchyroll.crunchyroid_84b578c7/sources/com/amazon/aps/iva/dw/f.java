package com.amazon.aps.iva.dw;

import com.ellation.crunchyroll.downloading.e0;
/* compiled from: ExoPlayerDownloadMapper.kt */
/* loaded from: classes2.dex */
public final class f implements e {
    public final com.amazon.aps.iva.nw.e a;

    public f(com.amazon.aps.iva.nw.e eVar) {
        this.a = eVar;
    }

    @Override // com.amazon.aps.iva.dw.e
    public final e0.c a(com.amazon.aps.iva.m6.c cVar) {
        e0.b bVar;
        com.amazon.aps.iva.yb0.j.f(cVar, "download");
        com.amazon.aps.iva.nw.e eVar = this.a;
        String str = cVar.a.b;
        com.amazon.aps.iva.yb0.j.e(str, "request.id");
        if (eVar.d(str)) {
            bVar = e0.b.STARTED;
        } else {
            int i = cVar.b;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    if (i == 7) {
                                        bVar = e0.b.NEW;
                                    } else {
                                        int i2 = cVar.b;
                                        String str2 = cVar.a.b;
                                        throw new IllegalStateException("Unexpected " + i2 + " state for " + str2 + " download");
                                    }
                                } else {
                                    bVar = e0.b.NEW;
                                }
                            } else {
                                bVar = e0.b.FAILED;
                            }
                        } else {
                            bVar = e0.b.COMPLETED;
                        }
                    } else {
                        bVar = e0.b.IN_PROGRESS;
                    }
                } else {
                    bVar = e0.b.PAUSED;
                }
            } else {
                bVar = e0.b.STARTED;
            }
        }
        e0.b bVar2 = bVar;
        String str3 = cVar.a.b;
        com.amazon.aps.iva.yb0.j.e(str3, "request.id");
        return new e0.c(str3, bVar2, cVar.h.a, cVar.e, 0, 0, cVar.h.b);
    }
}
