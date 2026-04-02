package com.amazon.aps.iva.q5;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import com.amazon.aps.iva.b8.d2;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.b8.q1;
import com.amazon.aps.iva.b8.v1;
import com.amazon.aps.iva.b8.x1;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.k;
import com.amazon.aps.iva.s6.g;
import com.google.android.datatransport.Transformer;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements k.a, p1.c, p1.d, Transformer {
    public final /* synthetic */ int b;

    public /* synthetic */ p(int i) {
        this.b = i;
    }

    @Override // com.google.android.datatransport.Transformer
    public final Object apply(Object obj) {
        return DataTransportCrashlyticsReportSender.a((CrashlyticsReport) obj);
    }

    @Override // com.amazon.aps.iva.b8.p1.c
    public final void b(v1 v1Var, q.d dVar, List list) {
        int i = p1.i;
        v1Var.O0(list);
    }

    @Override // com.amazon.aps.iva.b8.p1.d
    public final void d(v1 v1Var, q.e eVar) {
        q1.k(v1Var, eVar);
    }

    @Override // com.amazon.aps.iva.q5.k.a
    public final k e(Bundle bundle) {
        ImmutableMap copyOf;
        ImmutableList a;
        x1 x1Var;
        x1 x1Var2;
        int i;
        boolean z = true;
        MediaSessionCompat.Token token = null;
        byte[] bArr = null;
        token = null;
        switch (this.b) {
            case 1:
                String string = bundle.getString(b0.e.j);
                string.getClass();
                UUID fromString = UUID.fromString(string);
                Uri uri = (Uri) bundle.getParcelable(b0.e.k);
                Bundle bundle2 = Bundle.EMPTY;
                Bundle bundle3 = bundle.getBundle(b0.e.l);
                if (bundle3 == null) {
                    bundle3 = bundle2;
                }
                if (bundle3 == bundle2) {
                    copyOf = ImmutableMap.of();
                } else {
                    HashMap hashMap = new HashMap();
                    if (bundle3 != bundle2) {
                        for (String str : bundle3.keySet()) {
                            String string2 = bundle3.getString(str);
                            if (string2 != null) {
                                hashMap.put(str, string2);
                            }
                        }
                    }
                    copyOf = ImmutableMap.copyOf((Map) hashMap);
                }
                boolean z2 = bundle.getBoolean(b0.e.m, false);
                boolean z3 = bundle.getBoolean(b0.e.n, false);
                boolean z4 = bundle.getBoolean(b0.e.o, false);
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(b0.e.p);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                ImmutableList copyOf2 = ImmutableList.copyOf((Collection) arrayList);
                byte[] byteArray = bundle.getByteArray(b0.e.q);
                b0.e.a aVar = new b0.e.a(fromString);
                aVar.b = uri;
                aVar.c = ImmutableMap.copyOf((Map) copyOf);
                aVar.d = z2;
                aVar.f = z4;
                aVar.e = z3;
                aVar.g = ImmutableList.copyOf((Collection) copyOf2);
                if (byteArray != null) {
                    bArr = Arrays.copyOf(byteArray, byteArray.length);
                }
                aVar.h = bArr;
                return new b0.e(aVar);
            case 2:
                return new k0(bundle.getFloat(k0.f, 1.0f), bundle.getFloat(k0.g, 1.0f));
            case 3:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(s0.g);
                if (parcelableArrayList == null) {
                    a = ImmutableList.of();
                } else {
                    a = com.amazon.aps.iva.t5.c.a(v.K0, parcelableArrayList);
                }
                return new s0(bundle.getString(s0.h, ""), (v[]) a.toArray(new v[0]));
            case 4:
                int i2 = bundle.getInt(g.d.e, -1);
                int[] intArray = bundle.getIntArray(g.d.f);
                int i3 = bundle.getInt(g.d.g, -1);
                com.amazon.aps.iva.cq.b.t((i2 < 0 || i3 < 0) ? false : false);
                intArray.getClass();
                return new g.d(i2, i3, intArray);
            case 5:
                Bundle bundle4 = bundle.getBundle(com.amazon.aps.iva.b8.b.h);
                if (bundle4 == null) {
                    x1Var = null;
                } else {
                    x1Var = (x1) x1.j.e(bundle4);
                }
                int i4 = bundle.getInt(com.amazon.aps.iva.b8.b.i, -1);
                int i5 = bundle.getInt(com.amazon.aps.iva.b8.b.j, 0);
                CharSequence charSequence = bundle.getCharSequence(com.amazon.aps.iva.b8.b.k, "");
                Bundle bundle5 = bundle.getBundle(com.amazon.aps.iva.b8.b.l);
                boolean z5 = bundle.getBoolean(com.amazon.aps.iva.b8.b.m, false);
                Bundle bundle6 = Bundle.EMPTY;
                if (x1Var != null) {
                    x1Var2 = x1Var;
                } else {
                    x1Var2 = null;
                }
                if (i4 != -1) {
                    if (x1Var2 != null) {
                        z = false;
                    }
                    com.amazon.aps.iva.cq.b.v(z, "sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.");
                    i = i4;
                } else {
                    i = -1;
                }
                if (bundle5 == null) {
                    bundle5 = bundle6;
                }
                return new com.amazon.aps.iva.b8.b(x1Var2, i, i5, charSequence, new Bundle(bundle5), z5);
            default:
                Bundle bundle7 = bundle.getBundle(d2.h);
                if (bundle7 != null) {
                    bundle7.setClassLoader(MediaSessionCompat.Token.class.getClassLoader());
                    android.support.v4.media.session.b o0 = b.a.o0(com.amazon.aps.iva.k3.d.a(bundle7, "android.support.v4.media.session.EXTRA_BINDER"));
                    com.amazon.aps.iva.c9.d a2 = com.amazon.aps.iva.c9.a.a(bundle7);
                    MediaSessionCompat.Token token2 = (MediaSessionCompat.Token) bundle7.getParcelable("android.support.v4.media.session.TOKEN");
                    if (token2 != null) {
                        token = new MediaSessionCompat.Token(token2.c, o0, a2);
                    }
                }
                MediaSessionCompat.Token token3 = token;
                String str2 = d2.i;
                com.amazon.aps.iva.cq.b.v(bundle.containsKey(str2), "uid should be set.");
                int i6 = bundle.getInt(str2);
                String str3 = d2.j;
                com.amazon.aps.iva.cq.b.v(bundle.containsKey(str3), "type should be set.");
                int i7 = bundle.getInt(str3);
                ComponentName componentName = (ComponentName) bundle.getParcelable(d2.k);
                String string3 = bundle.getString(d2.l);
                com.amazon.aps.iva.cq.b.y(string3, "package name should be set.");
                Bundle bundle8 = bundle.getBundle(d2.m);
                if (bundle8 == null) {
                    bundle8 = Bundle.EMPTY;
                }
                return new d2(token3, i6, i7, componentName, string3, bundle8);
        }
    }
}
