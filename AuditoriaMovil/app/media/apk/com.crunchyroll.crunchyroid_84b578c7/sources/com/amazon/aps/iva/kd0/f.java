package com.amazon.aps.iva.kd0;

import com.amazon.aps.iva.id0.m;
import com.amazon.aps.iva.id0.p;
import com.amazon.aps.iva.id0.t;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.AdRequest;
/* compiled from: protoTypeTableUtil.kt */
/* loaded from: classes4.dex */
public final class f {
    public static final p a(p pVar, g gVar) {
        boolean z;
        j.f(pVar, "<this>");
        j.f(gVar, "typeTable");
        int i = pVar.d;
        boolean z2 = true;
        if ((i & 256) == 256) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return pVar.n;
        }
        if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) != 512) {
            z2 = false;
        }
        if (z2) {
            return gVar.a(pVar.o);
        }
        return null;
    }

    public static final p b(com.amazon.aps.iva.id0.h hVar, g gVar) {
        boolean z;
        j.f(hVar, "<this>");
        j.f(gVar, "typeTable");
        int i = hVar.d;
        boolean z2 = true;
        if ((i & 32) == 32) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return hVar.k;
        }
        if ((i & 64) != 64) {
            z2 = false;
        }
        if (z2) {
            return gVar.a(hVar.l);
        }
        return null;
    }

    public static final p c(com.amazon.aps.iva.id0.h hVar, g gVar) {
        boolean z;
        j.f(hVar, "<this>");
        j.f(gVar, "typeTable");
        int i = hVar.d;
        boolean z2 = true;
        if ((i & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            p pVar = hVar.h;
            j.e(pVar, "returnType");
            return pVar;
        }
        if ((i & 16) != 16) {
            z2 = false;
        }
        if (z2) {
            return gVar.a(hVar.i);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
    }

    public static final p d(m mVar, g gVar) {
        boolean z;
        j.f(mVar, "<this>");
        j.f(gVar, "typeTable");
        int i = mVar.d;
        boolean z2 = true;
        if ((i & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            p pVar = mVar.h;
            j.e(pVar, "returnType");
            return pVar;
        }
        if ((i & 16) != 16) {
            z2 = false;
        }
        if (z2) {
            return gVar.a(mVar.i);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
    }

    public static final p e(t tVar, g gVar) {
        boolean z;
        j.f(gVar, "typeTable");
        int i = tVar.d;
        boolean z2 = true;
        if ((i & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            p pVar = tVar.g;
            j.e(pVar, "type");
            return pVar;
        }
        if ((i & 8) != 8) {
            z2 = false;
        }
        if (z2) {
            return gVar.a(tVar.h);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
    }
}
