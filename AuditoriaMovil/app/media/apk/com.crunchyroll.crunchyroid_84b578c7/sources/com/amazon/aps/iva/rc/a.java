package com.amazon.aps.iva.rc;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import com.amazon.aps.iva.rc.o;
import java.io.InputStream;
/* compiled from: AssetUriLoader.java */
/* loaded from: classes.dex */
public final class a<Data> implements o<Uri, Data> {
    public final AssetManager a;
    public final InterfaceC0672a<Data> b;

    /* compiled from: AssetUriLoader.java */
    /* renamed from: com.amazon.aps.iva.rc.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0672a<Data> {
        com.amazon.aps.iva.lc.d<Data> a(AssetManager assetManager, String str);
    }

    public a(AssetManager assetManager, InterfaceC0672a<Data> interfaceC0672a) {
        this.a = assetManager;
        this.b = interfaceC0672a;
    }

    @Override // com.amazon.aps.iva.rc.o
    public final o.a buildLoadData(Uri uri, int i, int i2, com.amazon.aps.iva.kc.h hVar) {
        Uri uri2 = uri;
        return new o.a(new com.amazon.aps.iva.gd.b(uri2), this.b.a(this.a, uri2.toString().substring(22)));
    }

    @Override // com.amazon.aps.iva.rc.o
    public final boolean handles(Uri uri) {
        Uri uri2 = uri;
        if (!"file".equals(uri2.getScheme()) || uri2.getPathSegments().isEmpty() || !"android_asset".equals(uri2.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    /* compiled from: AssetUriLoader.java */
    /* loaded from: classes.dex */
    public static class b implements p<Uri, AssetFileDescriptor>, InterfaceC0672a<AssetFileDescriptor> {
        public final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // com.amazon.aps.iva.rc.a.InterfaceC0672a
        public final com.amazon.aps.iva.lc.d<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new com.amazon.aps.iva.lc.f(assetManager, str);
        }

        @Override // com.amazon.aps.iva.rc.p
        public final o<Uri, AssetFileDescriptor> build(s sVar) {
            return new a(this.a, this);
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }

    /* compiled from: AssetUriLoader.java */
    /* loaded from: classes.dex */
    public static class c implements p<Uri, InputStream>, InterfaceC0672a<InputStream> {
        public final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // com.amazon.aps.iva.rc.a.InterfaceC0672a
        public final com.amazon.aps.iva.lc.d<InputStream> a(AssetManager assetManager, String str) {
            return new com.amazon.aps.iva.lc.j(assetManager, str);
        }

        @Override // com.amazon.aps.iva.rc.p
        public final o<Uri, InputStream> build(s sVar) {
            return new a(this.a, this);
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }
}
