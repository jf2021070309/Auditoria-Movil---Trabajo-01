package com.amazon.aps.iva.vp;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.tp.l;
import com.amazon.aps.iva.tp.m;
import com.amazon.aps.iva.yb0.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: BatchFileDataReader.kt */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.sp.b {
    public final m a;
    public final com.amazon.aps.iva.sp.f b;
    public final l c;
    public final com.amazon.aps.iva.iq.a d;
    public final ArrayList e;

    public a(com.amazon.aps.iva.up.c cVar, com.amazon.aps.iva.sp.f fVar, l lVar, com.amazon.aps.iva.iq.a aVar) {
        j.f(fVar, "decoration");
        j.f(aVar, "internalLogger");
        this.a = cVar;
        this.b = fVar;
        this.c = lVar;
        this.d = aVar;
        this.e = new ArrayList();
    }

    public final void a(String str, boolean z) {
        Object obj;
        File file;
        synchronized (this.e) {
            Iterator it = this.e.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (j.a(((File) obj).getName(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            file = (File) obj;
        }
        if (file != null) {
            if (z && !this.c.delete(file)) {
                com.amazon.aps.iva.iq.a aVar = this.d;
                String format = String.format(Locale.US, "Unable to delete file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
                j.e(format, "format(locale, this, *args)");
                com.amazon.aps.iva.iq.a.e(aVar, format, null, 6);
            }
            synchronized (this.e) {
                this.e.remove(file);
            }
            return;
        }
        com.amazon.aps.iva.iq.a aVar2 = this.d;
        String format2 = String.format(Locale.US, "Attempting to unlock or delete an unknown file: %s", Arrays.copyOf(new Object[]{str}, 1));
        j.e(format2, "format(locale, this, *args)");
        com.amazon.aps.iva.iq.a.e(aVar2, format2, null, 6);
    }

    @Override // com.amazon.aps.iva.sp.b
    public final void b(com.amazon.aps.iva.sp.a aVar) {
        a(aVar.a, true);
    }

    @Override // com.amazon.aps.iva.sp.b
    public final void c(com.amazon.aps.iva.sp.a aVar) {
        j.f(aVar, "data");
        a(aVar.a, false);
    }

    @Override // com.amazon.aps.iva.sp.b
    public final com.amazon.aps.iva.sp.a d() {
        File h;
        synchronized (this.e) {
            h = this.a.h(x.c1(this.e));
            if (h != null) {
                this.e.add(h);
            }
        }
        if (h == null) {
            return null;
        }
        com.amazon.aps.iva.sp.f fVar = this.b;
        byte[] D = com.amazon.aps.iva.aq.j.D(this.c.c(h), fVar.d, fVar.e, fVar.f);
        String name = h.getName();
        j.e(name, "file.name");
        return new com.amazon.aps.iva.sp.a(name, D);
    }
}
