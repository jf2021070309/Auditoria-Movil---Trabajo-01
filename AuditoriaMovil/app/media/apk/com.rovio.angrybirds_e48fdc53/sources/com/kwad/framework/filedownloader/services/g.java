package com.kwad.framework.filedownloader.services;

import com.kwad.framework.filedownloader.y;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g implements y {
    private final com.kwad.framework.filedownloader.b.a aeI;
    private final h aeJ;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g() {
        com.kwad.framework.filedownloader.download.b us = com.kwad.framework.filedownloader.download.b.us();
        this.aeI = us.uu();
        this.aeJ = new h(us.uv());
    }

    private boolean bD(int i) {
        return a(this.aeI.bf(i));
    }

    @Override // com.kwad.framework.filedownloader.y
    public final boolean a(com.kwad.framework.filedownloader.d.c cVar) {
        if (cVar == null) {
            return false;
        }
        boolean bF = this.aeJ.bF(cVar.getId());
        if (com.kwad.framework.filedownloader.d.d.bA(cVar.ta())) {
            if (!bF) {
                return false;
            }
        } else if (!bF) {
            com.kwad.framework.filedownloader.f.d.a(this, "%d status is[%s](not finish) & but not in the pool", Integer.valueOf(cVar.getId()), Byte.valueOf(cVar.ta()));
            return false;
        }
        return true;
    }

    public final boolean aY(int i) {
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "request pause the task %d", Integer.valueOf(i));
        }
        com.kwad.framework.filedownloader.d.c bf = this.aeI.bf(i);
        if (bf == null) {
            return false;
        }
        bf.d((byte) -2);
        this.aeJ.cancel(i);
        return true;
    }

    public final byte aZ(int i) {
        com.kwad.framework.filedownloader.d.c bf = this.aeI.bf(i);
        if (bf == null) {
            return (byte) 0;
        }
        return bf.ta();
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0180 A[Catch: all -> 0x01cb, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0010, B:7:0x0022, B:10:0x0031, B:12:0x0041, B:14:0x004b, B:16:0x004f, B:17:0x0062, B:21:0x006f, B:23:0x0075, B:25:0x0079, B:29:0x008a, B:31:0x0093, B:33:0x009c, B:35:0x00a0, B:40:0x00b3, B:43:0x00bc, B:45:0x00c5, B:47:0x00d4, B:49:0x00d8, B:51:0x00e9, B:55:0x00f7, B:57:0x00fe, B:59:0x0105, B:61:0x010b, B:63:0x0112, B:65:0x0118, B:67:0x011e, B:69:0x0138, B:70:0x013c, B:72:0x0142, B:81:0x0180, B:82:0x0185, B:73:0x0151, B:75:0x015b, B:77:0x0161, B:78:0x0166, B:44:0x00c1, B:30:0x008f), top: B:88:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b(java.lang.String r19, java.lang.String r20, boolean r21, int r22, int r23, int r24, boolean r25, com.kwad.framework.filedownloader.d.b r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.framework.filedownloader.services.g.b(java.lang.String, java.lang.String, boolean, int, int, int, boolean, com.kwad.framework.filedownloader.d.b, boolean):void");
    }

    public final long bE(int i) {
        com.kwad.framework.filedownloader.d.c bf = this.aeI.bf(i);
        if (bf == null) {
            return 0L;
        }
        int vs = bf.vs();
        if (vs <= 1) {
            return bf.vp();
        }
        List<com.kwad.framework.filedownloader.d.a> bg = this.aeI.bg(i);
        if (bg == null || bg.size() != vs) {
            return 0L;
        }
        return com.kwad.framework.filedownloader.d.a.o(bg);
    }

    public final boolean ba(int i) {
        if (i == 0) {
            com.kwad.framework.filedownloader.f.d.d(this, "The task[%d] id is invalid, can't clear it.", Integer.valueOf(i));
            return false;
        } else if (bD(i)) {
            com.kwad.framework.filedownloader.f.d.d(this, "The task[%d] is downloading, can't clear it.", Integer.valueOf(i));
            return false;
        } else {
            this.aeI.bi(i);
            this.aeI.bh(i);
            return true;
        }
    }

    public final synchronized boolean bs(int i) {
        return this.aeJ.bs(i);
    }

    public final long bu(int i) {
        com.kwad.framework.filedownloader.d.c bf = this.aeI.bf(i);
        if (bf == null) {
            return 0L;
        }
        return bf.getTotal();
    }

    public final boolean isIdle() {
        return this.aeJ.vK() <= 0;
    }

    @Override // com.kwad.framework.filedownloader.y
    public final int l(String str, int i) {
        return this.aeJ.l(str, i);
    }

    public final boolean p(String str, String str2) {
        return bD(com.kwad.framework.filedownloader.f.f.r(str, str2));
    }

    public final void uZ() {
        this.aeI.clear();
    }

    public final void vI() {
        List<Integer> vL = this.aeJ.vL();
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "pause all tasks %d", Integer.valueOf(vL.size()));
        }
        for (Integer num : vL) {
            aY(num.intValue());
        }
    }
}
