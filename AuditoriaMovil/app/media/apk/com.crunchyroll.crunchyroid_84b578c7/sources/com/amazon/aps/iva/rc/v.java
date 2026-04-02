package com.amazon.aps.iva.rc;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.amazon.aps.iva.rc.o;
import java.io.File;
import java.io.InputStream;
/* compiled from: StringLoader.java */
/* loaded from: classes.dex */
public final class v<Data> implements o<String, Data> {
    public final o<Uri, Data> a;

    public v(o<Uri, Data> oVar) {
        this.a = oVar;
    }

    @Override // com.amazon.aps.iva.rc.o
    public final o.a buildLoadData(String str, int i, int i2, com.amazon.aps.iva.kc.h hVar) {
        Uri uri;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            uri = null;
        } else if (str2.charAt(0) == '/') {
            uri = Uri.fromFile(new File(str2));
        } else {
            Uri parse = Uri.parse(str2);
            if (parse.getScheme() == null) {
                uri = Uri.fromFile(new File(str2));
            } else {
                uri = parse;
            }
        }
        if (uri == null) {
            return null;
        }
        o<Uri, Data> oVar = this.a;
        if (!oVar.handles(uri)) {
            return null;
        }
        return oVar.buildLoadData(uri, i, i2, hVar);
    }

    @Override // com.amazon.aps.iva.rc.o
    public final /* bridge */ /* synthetic */ boolean handles(String str) {
        return true;
    }

    /* compiled from: StringLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements p<String, AssetFileDescriptor> {
        @Override // com.amazon.aps.iva.rc.p
        public final o<String, AssetFileDescriptor> build(s sVar) {
            return new v(sVar.b(Uri.class, AssetFileDescriptor.class));
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }

    /* compiled from: StringLoader.java */
    /* loaded from: classes.dex */
    public static class b implements p<String, ParcelFileDescriptor> {
        @Override // com.amazon.aps.iva.rc.p
        public final o<String, ParcelFileDescriptor> build(s sVar) {
            return new v(sVar.b(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }

    /* compiled from: StringLoader.java */
    /* loaded from: classes.dex */
    public static class c implements p<String, InputStream> {
        @Override // com.amazon.aps.iva.rc.p
        public final o<String, InputStream> build(s sVar) {
            return new v(sVar.b(Uri.class, InputStream.class));
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }
}
