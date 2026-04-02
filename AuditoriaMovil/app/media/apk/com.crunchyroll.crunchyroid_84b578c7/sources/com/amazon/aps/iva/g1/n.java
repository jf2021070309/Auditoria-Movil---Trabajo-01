package com.amazon.aps.iva.g1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.amazon.aps.iva.b8.v1;
import com.amazon.aps.iva.b8.z1;
import com.amazon.aps.iva.g6.f;
import com.amazon.aps.iva.i7.g;
import com.amazon.aps.iva.k6.s;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.k;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.q5.n0;
import com.amazon.aps.iva.q5.q0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.x6.f0;
import com.amazon.aps.iva.x6.j;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.regex.Pattern;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements j, k.a, f.b, s.f, j.a.InterfaceC0846a, g.a, com.amazon.aps.iva.t5.g, LibraryVersionComponent.VersionExtractor {
    public final /* synthetic */ int b;

    public /* synthetic */ n(int i) {
        this.b = i;
    }

    @Override // com.amazon.aps.iva.t5.g
    public final void a(Object obj) {
        switch (this.b) {
            case 9:
                ((v1) obj).N();
                return;
            default:
                ((v1) obj).v();
                return;
        }
    }

    @Override // com.amazon.aps.iva.x6.j.a.InterfaceC0846a
    public final Constructor b() {
        int[] iArr = com.amazon.aps.iva.x6.j.c;
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(com.amazon.aps.iva.x6.n.class).getConstructor(new Class[0]);
    }

    @Override // com.amazon.aps.iva.i7.g.a
    public final boolean c(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // com.amazon.aps.iva.k6.s.f
    public final int d(Object obj) {
        Pattern pattern = com.amazon.aps.iva.k6.s.a;
        String str = ((com.amazon.aps.iva.k6.n) obj).a;
        if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
            if (g0.a < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                return -1;
            }
            return 0;
        }
        return 1;
    }

    @Override // com.amazon.aps.iva.q5.k.a
    public final com.amazon.aps.iva.q5.k e(Bundle bundle) {
        l0.d dVar;
        boolean z;
        switch (this.b) {
            case 1:
                Uri uri = (Uri) bundle.getParcelable(b0.j.i);
                uri.getClass();
                String string = bundle.getString(b0.j.j);
                String string2 = bundle.getString(b0.j.k);
                int i = bundle.getInt(b0.j.l, 0);
                int i2 = bundle.getInt(b0.j.m, 0);
                String string3 = bundle.getString(b0.j.n);
                String string4 = bundle.getString(b0.j.o);
                b0.j.a aVar = new b0.j.a(uri);
                aVar.b = string;
                aVar.c = string2;
                aVar.d = i;
                aVar.e = i2;
                aVar.f = string3;
                aVar.g = string4;
                return new b0.j(aVar);
            case 2:
                String str = q0.f;
                if (bundle.getInt(n0.b, -1) == 3) {
                    z = true;
                } else {
                    z = false;
                }
                com.amazon.aps.iva.cq.b.t(z);
                if (bundle.getBoolean(q0.f, false)) {
                    return new q0(bundle.getBoolean(q0.g, false));
                }
                return new q0();
            default:
                Bundle bundle2 = bundle.getBundle(z1.n);
                if (bundle2 == null) {
                    dVar = z1.l;
                } else {
                    dVar = (l0.d) l0.d.r.e(bundle2);
                }
                return new z1(dVar, bundle.getBoolean(z1.o, false), bundle.getLong(z1.p, -9223372036854775807L), bundle.getLong(z1.q, -9223372036854775807L), bundle.getLong(z1.r, 0L), bundle.getInt(z1.s, 0), bundle.getLong(z1.t, 0L), bundle.getLong(z1.u, -9223372036854775807L), bundle.getLong(z1.v, -9223372036854775807L), bundle.getLong(z1.w, 0L));
        }
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public final String extract(Object obj) {
        String lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseCommonRegistrar.lambda$getComponents$0((Context) obj);
        return lambda$getComponents$0;
    }

    public final com.amazon.aps.iva.q6.d g(int i, com.amazon.aps.iva.q5.v vVar, boolean z, ArrayList arrayList, f0 f0Var) {
        boolean z2;
        com.amazon.aps.iva.x6.n eVar;
        String str = vVar.l;
        if (com.amazon.aps.iva.q5.g0.l(str)) {
            return null;
        }
        int i2 = 0;
        if (str == null || (!str.startsWith("video/webm") && !str.startsWith("audio/webm") && !str.startsWith("application/webm") && !str.startsWith("video/x-matroska") && !str.startsWith("audio/x-matroska") && !str.startsWith("application/x-matroska"))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            eVar = new com.amazon.aps.iva.m7.d(1);
        } else {
            if (z) {
                i2 = 4;
            }
            eVar = new com.amazon.aps.iva.o7.e(i2, null, arrayList, f0Var);
        }
        return new com.amazon.aps.iva.q6.d(eVar, i, vVar);
    }

    @Override // com.amazon.aps.iva.g6.f.b
    public final void release() {
    }

    @Override // com.amazon.aps.iva.g1.j
    public final double f(double d) {
        return d;
    }
}
