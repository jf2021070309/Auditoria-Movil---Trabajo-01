package com.amazon.aps.iva.vq;

import com.amazon.aps.iva.fr.c;
import com.amazon.aps.iva.fr.e;
import com.amazon.aps.iva.sp.f;
import com.amazon.aps.iva.sp.h;
import com.amazon.aps.iva.tp.l;
import com.amazon.aps.iva.tp.m;
import com.amazon.aps.iva.yb0.j;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: RumDataWriter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.vp.b<Object> {
    public final File e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m mVar, h<Object> hVar, f fVar, l lVar, com.amazon.aps.iva.iq.a aVar, File file) {
        super(mVar, hVar, fVar, lVar, aVar);
        j.f(mVar, "fileOrchestrator");
        j.f(hVar, "serializer");
        j.f(fVar, "decoration");
        j.f(lVar, "handler");
        j.f(aVar, "internalLogger");
        j.f(file, "lastViewEventFile");
        this.e = file;
    }

    public static void e(String str, com.amazon.aps.iva.ar.c cVar) {
        com.amazon.aps.iva.sq.f fVar = com.amazon.aps.iva.sq.c.c;
        if (fVar instanceof com.amazon.aps.iva.ar.a) {
            ((com.amazon.aps.iva.ar.a) fVar).g(str, cVar);
        }
    }

    @Override // com.amazon.aps.iva.vp.b
    public final void d(Object obj, byte[] bArr) {
        boolean z;
        j.f(obj, "data");
        if (obj instanceof e) {
            File file = this.e;
            File parentFile = file.getParentFile();
            if (parentFile != null && com.amazon.aps.iva.tp.b.b(parentFile)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.c.a(file, false, bArr);
                return;
            }
            com.amazon.aps.iva.iq.a aVar = com.amazon.aps.iva.dq.c.a;
            String format = String.format(Locale.US, "Directory structure %s for writing last view event doesn't exist.", Arrays.copyOf(new Object[]{file.getParent()}, 1));
            j.e(format, "format(locale, this, *args)");
            com.amazon.aps.iva.iq.a.b(aVar, format);
        } else if (obj instanceof com.amazon.aps.iva.fr.a) {
            e(((com.amazon.aps.iva.fr.a) obj).f.a, com.amazon.aps.iva.ar.c.ACTION);
        } else if (obj instanceof com.amazon.aps.iva.fr.d) {
            e(((com.amazon.aps.iva.fr.d) obj).f.a, com.amazon.aps.iva.ar.c.RESOURCE);
        } else if (obj instanceof com.amazon.aps.iva.fr.b) {
            com.amazon.aps.iva.fr.b bVar = (com.amazon.aps.iva.fr.b) obj;
            if (!j.a(bVar.o.e, Boolean.TRUE)) {
                e(bVar.f.a, com.amazon.aps.iva.ar.c.ERROR);
            }
        } else if (obj instanceof com.amazon.aps.iva.fr.c) {
            com.amazon.aps.iva.fr.c cVar = (com.amazon.aps.iva.fr.c) obj;
            boolean a = j.a(cVar.o.c, Boolean.TRUE);
            c.v vVar = cVar.f;
            if (a) {
                e(vVar.a, com.amazon.aps.iva.ar.c.FROZEN_FRAME);
            } else {
                e(vVar.a, com.amazon.aps.iva.ar.c.LONG_TASK);
            }
        }
    }
}
