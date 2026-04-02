package com.amazon.aps.iva.lc;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: StreamAssetPathFetcher.java */
/* loaded from: classes.dex */
public final class j extends b<InputStream> {
    @Override // com.amazon.aps.iva.lc.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.amazon.aps.iva.lc.b
    public final void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.amazon.aps.iva.lc.b
    public final InputStream f(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
