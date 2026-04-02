package com.amazon.aps.iva.y7;

import com.amazon.aps.iva.s5.a;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.v;
import com.amazon.aps.iva.y7.f;
import com.google.common.base.Charsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
/* compiled from: Mp4WebvttDecoder.java */
/* loaded from: classes.dex */
public final class a extends com.amazon.aps.iva.q7.c {
    public final v m = new v();

    @Override // com.amazon.aps.iva.q7.c
    public final com.amazon.aps.iva.q7.d g(int i, byte[] bArr, boolean z) throws com.amazon.aps.iva.q7.f {
        com.amazon.aps.iva.s5.a a;
        v vVar = this.m;
        vVar.D(i, bArr);
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i2 = vVar.c - vVar.b;
            if (i2 > 0) {
                if (i2 >= 8) {
                    int e = vVar.e();
                    if (vVar.e() == 1987343459) {
                        int i3 = e - 8;
                        CharSequence charSequence = null;
                        a.C0695a c0695a = null;
                        while (i3 > 0) {
                            if (i3 >= 8) {
                                int e2 = vVar.e();
                                int e3 = vVar.e();
                                int i4 = e2 - 8;
                                byte[] bArr2 = vVar.a;
                                int i5 = vVar.b;
                                int i6 = g0.a;
                                String str = new String(bArr2, i5, i4, Charsets.UTF_8);
                                vVar.G(i4);
                                i3 = (i3 - 8) - i4;
                                if (e3 == 1937011815) {
                                    f.d dVar = new f.d();
                                    f.e(str, dVar);
                                    c0695a = dVar.a();
                                } else if (e3 == 1885436268) {
                                    charSequence = f.f(null, str.trim(), Collections.emptyList());
                                }
                            } else {
                                throw new com.amazon.aps.iva.q7.f("Incomplete vtt cue box header found.");
                            }
                        }
                        if (charSequence == null) {
                            charSequence = "";
                        }
                        if (c0695a != null) {
                            c0695a.a = charSequence;
                            a = c0695a.a();
                        } else {
                            Pattern pattern = f.a;
                            f.d dVar2 = new f.d();
                            dVar2.c = charSequence;
                            a = dVar2.a().a();
                        }
                        arrayList.add(a);
                    } else {
                        vVar.G(e - 8);
                    }
                } else {
                    throw new com.amazon.aps.iva.q7.f("Incomplete Mp4Webvtt Top Level box header found.");
                }
            } else {
                return new b(arrayList);
            }
        }
    }
}
