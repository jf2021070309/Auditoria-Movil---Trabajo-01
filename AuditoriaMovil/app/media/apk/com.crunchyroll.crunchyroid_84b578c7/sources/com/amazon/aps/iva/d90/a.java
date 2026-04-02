package com.amazon.aps.iva.d90;

import android.media.UnsupportedSchemeException;
import com.amazon.aps.iva.g6.k;
import com.amazon.aps.iva.g6.m;
import com.amazon.aps.iva.g6.p;
import com.amazon.aps.iva.g6.y;
import com.amazon.aps.iva.o0.b3;
import com.amazon.aps.iva.o0.d;
import com.amazon.aps.iva.o0.u2;
import com.amazon.aps.iva.yb0.j;
import java.util.Objects;
import java.util.UUID;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements m.c {
    public static String b(int i, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static void c(d dVar, String str, b3 b3Var, String str2, u2 u2Var, String str3) {
        j.f(dVar, str);
        j.f(b3Var, str2);
        j.f(u2Var, str3);
    }

    @Override // com.amazon.aps.iva.g6.m.c
    public m a(UUID uuid) {
        try {
            try {
                try {
                    return new p(uuid);
                } catch (Exception e) {
                    throw new y(e);
                }
            } catch (UnsupportedSchemeException e2) {
                throw new y(e2);
            }
        } catch (y unused) {
            Objects.toString(uuid);
            com.amazon.aps.iva.t5.p.c();
            return new k();
        }
    }
}
