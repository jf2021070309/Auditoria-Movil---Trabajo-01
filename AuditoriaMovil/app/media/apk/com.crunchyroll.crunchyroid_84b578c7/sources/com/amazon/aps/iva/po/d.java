package com.amazon.aps.iva.po;

import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.oe0.m;
import com.ellation.crunchyroll.api.cms.model.streams.Streams;
import com.ellation.crunchyroll.api.model.Subtitle;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: PlayerStreamsDataMapper.kt */
/* loaded from: classes2.dex */
public final class d {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
        if (r11.a == true) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.amazon.aps.iva.kj.c.a a(java.lang.String r9, com.ellation.crunchyroll.api.cms.model.streams.Streams r10, com.amazon.aps.iva.fg.d r11) {
        /*
            boolean r0 = r11 instanceof com.amazon.aps.iva.fg.d.a
            r1 = 0
            if (r0 == 0) goto L8
            com.amazon.aps.iva.fg.d$a r11 = (com.amazon.aps.iva.fg.d.a) r11
            goto L9
        L8:
            r11 = r1
        L9:
            if (r11 == 0) goto L11
            boolean r0 = r11.a
            r2 = 1
            if (r0 != r2) goto L11
            goto L12
        L11:
            r2 = 0
        L12:
            if (r2 == 0) goto L15
            goto L16
        L15:
            r11 = r1
        L16:
            if (r11 == 0) goto L33
            com.amazon.aps.iva.o6.v r5 = r11.b
            java.util.List r11 = r10.getBifs()
            java.lang.Object r11 = com.amazon.aps.iva.lb0.x.v0(r11)
            r4 = r11
            java.lang.String r4 = (java.lang.String) r4
            java.util.ArrayList r7 = c(r10)
            com.amazon.aps.iva.kj.c$a r1 = new com.amazon.aps.iva.kj.c$a
            r6 = 1
            r8 = 34
            r2 = r1
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
        L33:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.po.d.a(java.lang.String, com.ellation.crunchyroll.api.cms.model.streams.Streams, com.amazon.aps.iva.fg.d):com.amazon.aps.iva.kj.c$a");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.amazon.aps.iva.kj.c.b b(java.lang.String r12, com.ellation.crunchyroll.api.cms.model.streams.Streams r13, com.amazon.aps.iva.fg.d r14) {
        /*
            boolean r0 = r14 instanceof com.amazon.aps.iva.fg.d.b
            r1 = 0
            if (r0 == 0) goto L8
            com.amazon.aps.iva.fg.d$b r14 = (com.amazon.aps.iva.fg.d.b) r14
            goto L9
        L8:
            r14 = r1
        L9:
            r0 = 0
            if (r14 == 0) goto L33
            boolean r2 = r14.a
            r3 = 1
            if (r2 == 0) goto L2f
            java.io.File r2 = r14.b
            if (r2 == 0) goto L1a
            java.lang.String r2 = r2.getAbsolutePath()
            goto L1b
        L1a:
            r2 = r1
        L1b:
            if (r2 == 0) goto L2a
            int r2 = r2.length()
            if (r2 != 0) goto L25
            r2 = r3
            goto L26
        L25:
            r2 = r0
        L26:
            if (r2 != 0) goto L2a
            r2 = r3
            goto L2b
        L2a:
            r2 = r0
        L2b:
            if (r2 == 0) goto L2f
            r2 = r3
            goto L30
        L2f:
            r2 = r0
        L30:
            if (r2 != r3) goto L33
            r0 = r3
        L33:
            if (r0 == 0) goto L36
            goto L37
        L36:
            r14 = r1
        L37:
            if (r14 == 0) goto L63
            java.io.File r14 = r14.b
            if (r14 == 0) goto L43
            java.lang.String r14 = r14.getAbsolutePath()
            r6 = r14
            goto L44
        L43:
            r6 = r1
        L44:
            if (r6 == 0) goto L63
            java.util.List r14 = r13.getBifs()
            java.lang.Object r14 = com.amazon.aps.iva.lb0.x.v0(r14)
            r4 = r14
            java.lang.String r4 = (java.lang.String) r4
            com.amazon.aps.iva.kj.b r5 = com.amazon.aps.iva.kj.b.HLS
            java.util.ArrayList r7 = c(r13)
            com.amazon.aps.iva.kj.c$b r1 = new com.amazon.aps.iva.kj.c$b
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 962(0x3c2, float:1.348E-42)
            r2 = r1
            r3 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.po.d.b(java.lang.String, com.ellation.crunchyroll.api.cms.model.streams.Streams, com.amazon.aps.iva.fg.d):com.amazon.aps.iva.kj.c$b");
    }

    public static final ArrayList c(Streams streams) {
        boolean z;
        String localFilePath;
        Collection<Subtitle> values = streams.getSubtitles().values();
        ArrayList arrayList = new ArrayList(r.Y(values));
        for (Subtitle subtitle : values) {
            String localFilePath2 = subtitle.getLocalFilePath();
            if (localFilePath2 != null && !m.b0(localFilePath2)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                localFilePath = subtitle.getUrl();
            } else {
                localFilePath = subtitle.getLocalFilePath();
            }
            String locale = subtitle.getLocale();
            if (localFilePath == null) {
                localFilePath = "";
            }
            arrayList.add(new com.amazon.aps.iva.kj.d(locale, localFilePath));
        }
        return arrayList;
    }
}
