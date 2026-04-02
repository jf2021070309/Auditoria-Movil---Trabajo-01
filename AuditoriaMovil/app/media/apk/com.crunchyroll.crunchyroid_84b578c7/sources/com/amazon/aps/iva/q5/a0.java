package com.amazon.aps.iva.q5;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import com.amazon.aps.iva.b8.b2;
import com.amazon.aps.iva.b8.v1;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.k;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.s5.a;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.ArrayList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements k.a, com.amazon.aps.iva.x5.g, com.amazon.aps.iva.t5.g, LibraryVersionComponent.VersionExtractor {
    public final /* synthetic */ int b;

    public /* synthetic */ a0(int i) {
        this.b = i;
    }

    @Override // com.amazon.aps.iva.t5.g
    public final void a(Object obj) {
        ((v1) obj).J();
    }

    public final String b(com.amazon.aps.iva.w5.i iVar) {
        String str = iVar.h;
        if (str == null) {
            return iVar.a.toString();
        }
        return str;
    }

    @Override // com.amazon.aps.iva.q5.k.a
    public final k e(Bundle bundle) {
        c cVar;
        boolean z = true;
        switch (this.b) {
            case 0:
                Uri uri = (Uri) bundle.getParcelable(b0.a.d);
                uri.getClass();
                return new b0.a(new b0.a.C0635a(uri));
            case 1:
                String str = i0.e;
                if (bundle.getInt(n0.b, -1) != 1) {
                    z = false;
                }
                com.amazon.aps.iva.cq.b.t(z);
                float f = bundle.getFloat(i0.e, -1.0f);
                if (f == -1.0f) {
                    return new i0();
                }
                return new i0(f);
            case 2:
                int i = bundle.getInt(r0.b.i, 0);
                long j = bundle.getLong(r0.b.j, -9223372036854775807L);
                long j2 = bundle.getLong(r0.b.k, 0L);
                boolean z2 = bundle.getBoolean(r0.b.l, false);
                Bundle bundle2 = bundle.getBundle(r0.b.m);
                if (bundle2 != null) {
                    cVar = (c) c.n.e(bundle2);
                } else {
                    cVar = c.h;
                }
                c cVar2 = cVar;
                r0.b bVar = new r0.b();
                bVar.j(null, null, i, j, j2, cVar2, z2);
                return bVar;
            case 3:
                com.amazon.aps.iva.s5.a aVar = com.amazon.aps.iva.s5.a.s;
                a.C0695a c0695a = new a.C0695a();
                CharSequence charSequence = bundle.getCharSequence(com.amazon.aps.iva.s5.a.t);
                if (charSequence != null) {
                    c0695a.a = charSequence;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(com.amazon.aps.iva.s5.a.u);
                if (alignment != null) {
                    c0695a.c = alignment;
                }
                Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(com.amazon.aps.iva.s5.a.v);
                if (alignment2 != null) {
                    c0695a.d = alignment2;
                }
                Bitmap bitmap = (Bitmap) bundle.getParcelable(com.amazon.aps.iva.s5.a.w);
                if (bitmap != null) {
                    c0695a.b = bitmap;
                }
                String str2 = com.amazon.aps.iva.s5.a.x;
                if (bundle.containsKey(str2)) {
                    String str3 = com.amazon.aps.iva.s5.a.y;
                    if (bundle.containsKey(str3)) {
                        float f2 = bundle.getFloat(str2);
                        int i2 = bundle.getInt(str3);
                        c0695a.e = f2;
                        c0695a.f = i2;
                    }
                }
                String str4 = com.amazon.aps.iva.s5.a.z;
                if (bundle.containsKey(str4)) {
                    c0695a.g = bundle.getInt(str4);
                }
                String str5 = com.amazon.aps.iva.s5.a.A;
                if (bundle.containsKey(str5)) {
                    c0695a.h = bundle.getFloat(str5);
                }
                String str6 = com.amazon.aps.iva.s5.a.B;
                if (bundle.containsKey(str6)) {
                    c0695a.i = bundle.getInt(str6);
                }
                String str7 = com.amazon.aps.iva.s5.a.D;
                if (bundle.containsKey(str7)) {
                    String str8 = com.amazon.aps.iva.s5.a.C;
                    if (bundle.containsKey(str8)) {
                        float f3 = bundle.getFloat(str7);
                        int i3 = bundle.getInt(str8);
                        c0695a.k = f3;
                        c0695a.j = i3;
                    }
                }
                String str9 = com.amazon.aps.iva.s5.a.E;
                if (bundle.containsKey(str9)) {
                    c0695a.l = bundle.getFloat(str9);
                }
                String str10 = com.amazon.aps.iva.s5.a.F;
                if (bundle.containsKey(str10)) {
                    c0695a.m = bundle.getFloat(str10);
                }
                String str11 = com.amazon.aps.iva.s5.a.G;
                if (bundle.containsKey(str11)) {
                    c0695a.o = bundle.getInt(str11);
                    c0695a.n = true;
                }
                if (!bundle.getBoolean(com.amazon.aps.iva.s5.a.H, false)) {
                    c0695a.n = false;
                }
                String str12 = com.amazon.aps.iva.s5.a.I;
                if (bundle.containsKey(str12)) {
                    c0695a.p = bundle.getInt(str12);
                }
                String str13 = com.amazon.aps.iva.s5.a.J;
                if (bundle.containsKey(str13)) {
                    c0695a.q = bundle.getFloat(str13);
                }
                return c0695a.a();
            case 4:
            default:
                return new b2(bundle);
            case 5:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(com.amazon.aps.iva.o6.o0.f);
                if (parcelableArrayList == null) {
                    return new com.amazon.aps.iva.o6.o0(new s0[0]);
                }
                return new com.amazon.aps.iva.o6.o0((s0[]) com.amazon.aps.iva.t5.c.a(s0.i, parcelableArrayList).toArray(new s0[0]));
        }
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public final String extract(Object obj) {
        return FirebaseCommonRegistrar.d((Context) obj);
    }
}
