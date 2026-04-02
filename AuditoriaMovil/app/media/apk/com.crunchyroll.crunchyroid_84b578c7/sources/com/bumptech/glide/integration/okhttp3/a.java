package com.bumptech.glide.integration.okhttp3;

import com.amazon.aps.iva.kc.h;
import com.amazon.aps.iva.rc.g;
import com.amazon.aps.iva.rc.o;
import com.amazon.aps.iva.rc.p;
import com.amazon.aps.iva.rc.s;
import java.io.InputStream;
import okhttp3.Call;
import okhttp3.OkHttpClient;
/* compiled from: OkHttpUrlLoader.java */
/* loaded from: classes.dex */
public final class a implements o<g, InputStream> {
    public final Call.Factory a;

    public a(Call.Factory factory) {
        this.a = factory;
    }

    @Override // com.amazon.aps.iva.rc.o
    public final o.a<InputStream> buildLoadData(g gVar, int i, int i2, h hVar) {
        g gVar2 = gVar;
        return new o.a<>(gVar2, new com.amazon.aps.iva.jc.a(this.a, gVar2));
    }

    @Override // com.amazon.aps.iva.rc.o
    public final /* bridge */ /* synthetic */ boolean handles(g gVar) {
        return true;
    }

    /* compiled from: OkHttpUrlLoader.java */
    /* renamed from: com.bumptech.glide.integration.okhttp3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0944a implements p<g, InputStream> {
        public static volatile OkHttpClient b;
        public final Call.Factory a;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C0944a() {
            this(b);
            if (b == null) {
                synchronized (C0944a.class) {
                    if (b == null) {
                        b = new OkHttpClient();
                    }
                }
            }
        }

        @Override // com.amazon.aps.iva.rc.p
        public final o<g, InputStream> build(s sVar) {
            return new a(this.a);
        }

        public C0944a(OkHttpClient okHttpClient) {
            this.a = okHttpClient;
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }
}
