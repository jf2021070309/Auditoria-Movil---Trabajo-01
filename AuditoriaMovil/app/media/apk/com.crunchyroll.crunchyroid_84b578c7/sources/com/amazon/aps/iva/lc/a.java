package com.amazon.aps.iva.lc;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: AssetFileDescriptorLocalUriFetcher.java */
/* loaded from: classes.dex */
public final class a extends i<AssetFileDescriptor> {
    @Override // com.amazon.aps.iva.lc.d
    public final Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }

    @Override // com.amazon.aps.iva.lc.i
    public final void c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.amazon.aps.iva.lc.i
    public final Object f(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
