package com.amazon.aps.iva.rc;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import com.amazon.aps.iva.rc.o;
import java.io.InputStream;
/* compiled from: ResourceLoader.java */
/* loaded from: classes.dex */
public final class t<Data> implements o<Integer, Data> {
    public final o<Uri, Data> a;
    public final Resources b;

    public t(Resources resources, o<Uri, Data> oVar) {
        this.b = resources;
        this.a = oVar;
    }

    @Override // com.amazon.aps.iva.rc.o
    public final o.a buildLoadData(Integer num, int i, int i2, com.amazon.aps.iva.kc.h hVar) {
        Uri uri;
        Integer num2 = num;
        Resources resources = this.b;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException unused) {
            Log.isLoggable("ResourceLoader", 5);
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.a.buildLoadData(uri, i, i2, hVar);
    }

    @Override // com.amazon.aps.iva.rc.o
    public final /* bridge */ /* synthetic */ boolean handles(Integer num) {
        return true;
    }

    /* compiled from: ResourceLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements p<Integer, AssetFileDescriptor> {
        public final Resources a;

        public a(Resources resources) {
            this.a = resources;
        }

        @Override // com.amazon.aps.iva.rc.p
        public final o<Integer, AssetFileDescriptor> build(s sVar) {
            return new t(this.a, sVar.b(Uri.class, AssetFileDescriptor.class));
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }

    /* compiled from: ResourceLoader.java */
    /* loaded from: classes.dex */
    public static class b implements p<Integer, InputStream> {
        public final Resources a;

        public b(Resources resources) {
            this.a = resources;
        }

        @Override // com.amazon.aps.iva.rc.p
        public final o<Integer, InputStream> build(s sVar) {
            return new t(this.a, sVar.b(Uri.class, InputStream.class));
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }

    /* compiled from: ResourceLoader.java */
    /* loaded from: classes.dex */
    public static class c implements p<Integer, Uri> {
        public final Resources a;

        public c(Resources resources) {
            this.a = resources;
        }

        @Override // com.amazon.aps.iva.rc.p
        public final o<Integer, Uri> build(s sVar) {
            return new t(this.a, w.a);
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }
}
