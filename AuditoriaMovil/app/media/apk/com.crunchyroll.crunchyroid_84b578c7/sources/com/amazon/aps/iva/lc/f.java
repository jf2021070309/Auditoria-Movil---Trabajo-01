package com.amazon.aps.iva.lc;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
/* compiled from: FileDescriptorAssetPathFetcher.java */
/* loaded from: classes.dex */
public final class f extends b<AssetFileDescriptor> {
    @Override // com.amazon.aps.iva.lc.d
    public final Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }

    @Override // com.amazon.aps.iva.lc.b
    public final void c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.amazon.aps.iva.lc.b
    public final AssetFileDescriptor f(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }
}
