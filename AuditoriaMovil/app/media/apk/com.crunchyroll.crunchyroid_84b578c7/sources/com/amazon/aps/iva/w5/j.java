package com.amazon.aps.iva.w5;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.w5.f;
import com.amazon.aps.iva.w5.k;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: DefaultDataSource.java */
/* loaded from: classes.dex */
public final class j implements f {
    public final Context a;
    public final ArrayList b;
    public final f c;
    public n d;
    public com.amazon.aps.iva.w5.a e;
    public c f;
    public f g;
    public z h;
    public d i;
    public v j;
    public f k;

    /* compiled from: DefaultDataSource.java */
    /* loaded from: classes.dex */
    public static final class a implements f.a {
        public final Context a;
        public final f.a b;

        public a(Context context) {
            k.a aVar = new k.a();
            this.a = context.getApplicationContext();
            this.b = aVar;
        }

        @Override // com.amazon.aps.iva.w5.f.a
        public final f a() {
            return new j(this.a, this.b.a());
        }
    }

    public j(Context context, f fVar) {
        this.a = context.getApplicationContext();
        fVar.getClass();
        this.c = fVar;
        this.b = new ArrayList();
    }

    public static void n(f fVar, y yVar) {
        if (fVar != null) {
            fVar.j(yVar);
        }
    }

    @Override // com.amazon.aps.iva.w5.f
    public final long b(i iVar) throws IOException {
        boolean z;
        boolean z2 = true;
        if (this.k == null) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        String scheme = iVar.a.getScheme();
        int i = g0.a;
        Uri uri = iVar.a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
            z2 = false;
        }
        Context context = this.a;
        if (z2) {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.e == null) {
                    com.amazon.aps.iva.w5.a aVar = new com.amazon.aps.iva.w5.a(context);
                    this.e = aVar;
                    m(aVar);
                }
                this.k = this.e;
            } else {
                if (this.d == null) {
                    n nVar = new n();
                    this.d = nVar;
                    m(nVar);
                }
                this.k = this.d;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                com.amazon.aps.iva.w5.a aVar2 = new com.amazon.aps.iva.w5.a(context);
                this.e = aVar2;
                m(aVar2);
            }
            this.k = this.e;
        } else if (FirebaseAnalytics.Param.CONTENT.equals(scheme)) {
            if (this.f == null) {
                c cVar = new c(context);
                this.f = cVar;
                m(cVar);
            }
            this.k = this.f;
        } else {
            boolean equals = "rtmp".equals(scheme);
            f fVar = this.c;
            if (equals) {
                if (this.g == null) {
                    try {
                        f fVar2 = (f) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.g = fVar2;
                        m(fVar2);
                    } catch (ClassNotFoundException unused) {
                        com.amazon.aps.iva.t5.p.g();
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.g == null) {
                        this.g = fVar;
                    }
                }
                this.k = this.g;
            } else if ("udp".equals(scheme)) {
                if (this.h == null) {
                    z zVar = new z();
                    this.h = zVar;
                    m(zVar);
                }
                this.k = this.h;
            } else if ("data".equals(scheme)) {
                if (this.i == null) {
                    d dVar = new d();
                    this.i = dVar;
                    m(dVar);
                }
                this.k = this.i;
            } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                this.k = fVar;
            } else {
                if (this.j == null) {
                    v vVar = new v(context);
                    this.j = vVar;
                    m(vVar);
                }
                this.k = this.j;
            }
        }
        return this.k.b(iVar);
    }

    @Override // com.amazon.aps.iva.w5.f
    public final void close() throws IOException {
        f fVar = this.k;
        if (fVar != null) {
            try {
                fVar.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // com.amazon.aps.iva.w5.f
    public final Map<String, List<String>> d() {
        f fVar = this.k;
        if (fVar == null) {
            return Collections.emptyMap();
        }
        return fVar.d();
    }

    @Override // com.amazon.aps.iva.w5.f
    public final Uri getUri() {
        f fVar = this.k;
        if (fVar == null) {
            return null;
        }
        return fVar.getUri();
    }

    @Override // com.amazon.aps.iva.w5.f
    public final void j(y yVar) {
        yVar.getClass();
        this.c.j(yVar);
        this.b.add(yVar);
        n(this.d, yVar);
        n(this.e, yVar);
        n(this.f, yVar);
        n(this.g, yVar);
        n(this.h, yVar);
        n(this.i, yVar);
        n(this.j, yVar);
    }

    @Override // com.amazon.aps.iva.q5.o
    public final int l(byte[] bArr, int i, int i2) throws IOException {
        f fVar = this.k;
        fVar.getClass();
        return fVar.l(bArr, i, i2);
    }

    public final void m(f fVar) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                fVar.j((y) arrayList.get(i));
                i++;
            } else {
                return;
            }
        }
    }
}
