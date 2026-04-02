package com.fyber.inneractive.sdk.m;

import android.util.LruCache;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h<K> extends LruCache<K, j> {
    @Override // android.util.LruCache
    protected final /* synthetic */ int sizeOf(Object obj, j jVar) {
        String str;
        j jVar2 = jVar;
        int i = 0;
        for (String str2 : jVar2.b.keySet()) {
            if (str2 != null && (str = jVar2.b.get(str2)) != null) {
                i += str2.length() + str.length();
            }
        }
        return i + jVar2.a.length;
    }

    public h() {
        super(1048576);
    }
}
