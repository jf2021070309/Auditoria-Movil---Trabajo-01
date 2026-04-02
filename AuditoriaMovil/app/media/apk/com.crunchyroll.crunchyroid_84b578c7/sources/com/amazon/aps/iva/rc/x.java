package com.amazon.aps.iva.rc;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.amazon.aps.iva.rc.o;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: UriLoader.java */
/* loaded from: classes.dex */
public final class x<Data> implements o<Uri, Data> {
    public static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", FirebaseAnalytics.Param.CONTENT, "android.resource")));
    public final c<Data> a;

    /* compiled from: UriLoader.java */
    /* loaded from: classes.dex */
    public interface c<Data> {
        com.amazon.aps.iva.lc.d<Data> a(Uri uri);
    }

    public x(c<Data> cVar) {
        this.a = cVar;
    }

    @Override // com.amazon.aps.iva.rc.o
    public final o.a buildLoadData(Uri uri, int i, int i2, com.amazon.aps.iva.kc.h hVar) {
        Uri uri2 = uri;
        return new o.a(new com.amazon.aps.iva.gd.b(uri2), this.a.a(uri2));
    }

    @Override // com.amazon.aps.iva.rc.o
    public final boolean handles(Uri uri) {
        return b.contains(uri.getScheme());
    }

    /* compiled from: UriLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements p<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
        public final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.amazon.aps.iva.rc.x.c
        public final com.amazon.aps.iva.lc.d<AssetFileDescriptor> a(Uri uri) {
            return new com.amazon.aps.iva.lc.a(this.a, uri);
        }

        @Override // com.amazon.aps.iva.rc.p
        public final o<Uri, AssetFileDescriptor> build(s sVar) {
            return new x(this);
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }

    /* compiled from: UriLoader.java */
    /* loaded from: classes.dex */
    public static class b implements p<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
        public final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.amazon.aps.iva.rc.x.c
        public final com.amazon.aps.iva.lc.d<ParcelFileDescriptor> a(Uri uri) {
            return new com.amazon.aps.iva.lc.g(this.a, uri);
        }

        @Override // com.amazon.aps.iva.rc.p
        public final o<Uri, ParcelFileDescriptor> build(s sVar) {
            return new x(this);
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }

    /* compiled from: UriLoader.java */
    /* loaded from: classes.dex */
    public static class d implements p<Uri, InputStream>, c<InputStream> {
        public final ContentResolver a;

        public d(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.amazon.aps.iva.rc.x.c
        public final com.amazon.aps.iva.lc.d<InputStream> a(Uri uri) {
            return new com.amazon.aps.iva.lc.k(this.a, uri);
        }

        @Override // com.amazon.aps.iva.rc.p
        public final o<Uri, InputStream> build(s sVar) {
            return new x(this);
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }
}
