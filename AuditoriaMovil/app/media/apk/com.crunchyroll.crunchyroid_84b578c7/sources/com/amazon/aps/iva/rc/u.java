package com.amazon.aps.iva.rc;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import com.amazon.aps.iva.rc.o;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
/* compiled from: ResourceUriLoader.java */
/* loaded from: classes.dex */
public final class u<DataT> implements o<Uri, DataT> {
    public final Context a;
    public final o<Integer, DataT> b;

    public u(Context context, o<Integer, DataT> oVar) {
        this.a = context.getApplicationContext();
        this.b = oVar;
    }

    @Override // com.amazon.aps.iva.rc.o
    public final o.a buildLoadData(Uri uri, int i, int i2, com.amazon.aps.iva.kc.h hVar) {
        Uri uri2 = uri;
        List<String> pathSegments = uri2.getPathSegments();
        int size = pathSegments.size();
        o<Integer, DataT> oVar = this.b;
        o.a<DataT> aVar = null;
        if (size == 1) {
            try {
                int parseInt = Integer.parseInt(uri2.getPathSegments().get(0));
                if (parseInt == 0) {
                    if (Log.isLoggable("ResourceUriLoader", 5)) {
                        uri2.toString();
                    }
                } else {
                    aVar = oVar.buildLoadData(Integer.valueOf(parseInt), i, i2, hVar);
                }
                return aVar;
            } catch (NumberFormatException unused) {
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Objects.toString(uri2);
                    return aVar;
                }
                return aVar;
            }
        } else if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri2.getPathSegments();
            String str = pathSegments2.get(1);
            Context context = this.a;
            int identifier = context.getResources().getIdentifier(str, pathSegments2.get(0), context.getPackageName());
            if (identifier == 0) {
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                uri2.toString();
                return null;
            }
            return oVar.buildLoadData(Integer.valueOf(identifier), i, i2, hVar);
        } else if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        } else {
            uri2.toString();
            return null;
        }
    }

    @Override // com.amazon.aps.iva.rc.o
    public final boolean handles(Uri uri) {
        Uri uri2 = uri;
        if ("android.resource".equals(uri2.getScheme()) && this.a.getPackageName().equals(uri2.getAuthority())) {
            return true;
        }
        return false;
    }

    /* compiled from: ResourceUriLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements p<Uri, AssetFileDescriptor> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.amazon.aps.iva.rc.p
        public final o<Uri, AssetFileDescriptor> build(s sVar) {
            return new u(this.a, sVar.b(Integer.class, AssetFileDescriptor.class));
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }

    /* compiled from: ResourceUriLoader.java */
    /* loaded from: classes.dex */
    public static final class b implements p<Uri, InputStream> {
        public final Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // com.amazon.aps.iva.rc.p
        public final o<Uri, InputStream> build(s sVar) {
            return new u(this.a, sVar.b(Integer.class, InputStream.class));
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }
}
