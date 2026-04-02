package com.amazon.aps.iva.q5;

import android.net.Uri;
import android.os.Bundle;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.v1;
import com.amazon.aps.iva.b8.x1;
import com.amazon.aps.iva.b8.y1;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.k;
import com.amazon.aps.iva.q5.v0;
import com.amazon.aps.iva.t5.o;
import com.amazon.aps.iva.x6.j;
import com.google.common.base.MoreObjects;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.internal.PrimitiveConstructor;
import com.google.crypto.tink.mac.HmacKey;
import com.google.crypto.tink.mac.internal.ChunkedHmacImpl;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements k.a, o.b, com.amazon.aps.iva.t5.g, j.a.InterfaceC0846a, PrimitiveConstructor.PrimitiveConstructionFunction {
    public final /* synthetic */ int b;

    public /* synthetic */ e(int i) {
        this.b = i;
    }

    @Override // com.amazon.aps.iva.t5.g
    public final void a(Object obj) {
        switch (this.b) {
            case 7:
                ((e.a) obj).b();
                return;
            case 8:
            case 9:
            default:
                ((v1) obj).g();
                return;
            case 10:
                ((v1) obj).q();
                return;
            case 11:
                ((v1) obj).e0();
                return;
            case 12:
                int i = p1.i;
                ((v1) obj).d0();
                return;
            case 13:
                ((v1) obj).d();
                return;
        }
    }

    @Override // com.amazon.aps.iva.x6.j.a.InterfaceC0846a
    public final Constructor b() {
        int[] iArr = com.amazon.aps.iva.x6.j.c;
        if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return null;
        }
        return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(com.amazon.aps.iva.x6.n.class).getConstructor(Integer.TYPE);
    }

    @Override // com.amazon.aps.iva.t5.o.b
    public final void c(Object obj, u uVar) {
        com.amazon.aps.iva.b6.b bVar = (com.amazon.aps.iva.b6.b) obj;
    }

    @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
    public final Object constructPrimitive(Key key) {
        return new ChunkedHmacImpl((HmacKey) key);
    }

    @Override // com.amazon.aps.iva.q5.k.a
    public final k e(Bundle bundle) {
        int i;
        int i2;
        int i3;
        int i4 = 1;
        boolean z = true;
        boolean z2 = true;
        int i5 = 0;
        switch (this.b) {
            case 0:
                String str = f.i;
                if (bundle.containsKey(str)) {
                    i = bundle.getInt(str);
                } else {
                    i = 0;
                }
                String str2 = f.j;
                if (bundle.containsKey(str2)) {
                    i2 = bundle.getInt(str2);
                } else {
                    i2 = 0;
                }
                String str3 = f.k;
                if (bundle.containsKey(str3)) {
                    i3 = bundle.getInt(str3);
                } else {
                    i3 = 1;
                }
                String str4 = f.l;
                if (bundle.containsKey(str4)) {
                    i4 = bundle.getInt(str4);
                }
                int i6 = i4;
                String str5 = f.m;
                if (bundle.containsKey(str5)) {
                    i5 = bundle.getInt(str5);
                }
                return new f(i, i2, i3, i6, i5);
            case 1:
                String str6 = x.f;
                if (bundle.getInt(n0.b, -1) != 0) {
                    z2 = false;
                }
                com.amazon.aps.iva.cq.b.t(z2);
                if (bundle.getBoolean(x.f, false)) {
                    return new x(bundle.getBoolean(x.g, false));
                }
                return new x();
            case 2:
                b0.h.a aVar = new b0.h.a();
                aVar.a = (Uri) bundle.getParcelable(b0.h.f);
                aVar.b = bundle.getString(b0.h.g);
                aVar.c = bundle.getBundle(b0.h.h);
                return new b0.h(aVar);
            case 3:
                String str7 = o0.f;
                if (bundle.getInt(n0.b, -1) != 2) {
                    z = false;
                }
                com.amazon.aps.iva.cq.b.t(z);
                int i7 = bundle.getInt(o0.f, 5);
                float f = bundle.getFloat(o0.g, -1.0f);
                if (f == -1.0f) {
                    return new o0(i7);
                }
                return new o0(i7, f);
            case 4:
                String str8 = v0.a.g;
                p pVar = s0.i;
                Bundle bundle2 = bundle.getBundle(v0.a.g);
                bundle2.getClass();
                s0 s0Var = (s0) pVar.e(bundle2);
                return new v0.a(s0Var, bundle.getBoolean(v0.a.j, false), (int[]) MoreObjects.firstNonNull(bundle.getIntArray(v0.a.h), new int[s0Var.b]), (boolean[]) MoreObjects.firstNonNull(bundle.getBooleanArray(v0.a.i), new boolean[s0Var.b]));
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(y1.d);
                if (parcelableArrayList == null) {
                    com.amazon.aps.iva.t5.p.g();
                    return y1.c;
                }
                HashSet hashSet = new HashSet();
                while (i5 < parcelableArrayList.size()) {
                    x1 x1Var = (x1) x1.j.e((Bundle) parcelableArrayList.get(i5));
                    x1Var.getClass();
                    hashSet.add(x1Var);
                    i5++;
                }
                return new y1(hashSet);
            case 9:
                int i8 = bundle.getInt(com.amazon.aps.iva.b8.f.g, 0);
                int i9 = bundle.getInt(com.amazon.aps.iva.b8.f.k, 0);
                String string = bundle.getString(com.amazon.aps.iva.b8.f.h);
                string.getClass();
                String str9 = com.amazon.aps.iva.b8.f.i;
                com.amazon.aps.iva.cq.b.t(bundle.containsKey(str9));
                int i10 = bundle.getInt(str9);
                Bundle bundle3 = bundle.getBundle(com.amazon.aps.iva.b8.f.j);
                if (bundle3 == null) {
                    bundle3 = Bundle.EMPTY;
                }
                return new com.amazon.aps.iva.b8.f(i8, i9, string, i10, bundle3);
        }
    }
}
