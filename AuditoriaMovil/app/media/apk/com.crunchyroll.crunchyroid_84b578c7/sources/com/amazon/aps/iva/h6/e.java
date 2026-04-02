package com.amazon.aps.iva.h6;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: FullSegmentEncryptionKeyCache.java */
/* loaded from: classes.dex */
public final class e extends LinkedHashMap<Uri, byte[]> {
    public final /* synthetic */ int b = 4;

    public e(int i) {
        super(i, 1.0f, false);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
        if (size() > this.b) {
            return true;
        }
        return false;
    }
}
