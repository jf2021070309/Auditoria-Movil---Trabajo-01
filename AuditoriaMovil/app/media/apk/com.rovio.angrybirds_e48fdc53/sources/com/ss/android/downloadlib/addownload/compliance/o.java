package com.ss.android.downloadlib.addownload.compliance;

import com.ss.android.socialbase.downloader.utils.LruCache;
/* loaded from: classes3.dex */
public class o extends LruCache<Long, com.ss.android.downloadlib.addownload.ge.ge> {

    /* loaded from: classes3.dex */
    private static class dr {
        private static o dr = new o();
    }

    public static o dr() {
        return dr.dr;
    }

    private o() {
        super(16, 16);
    }

    public void dr(com.ss.android.downloadlib.addownload.ge.ge geVar) {
        if (geVar == null) {
            return;
        }
        put(Long.valueOf(geVar.dr()), geVar);
    }

    public com.ss.android.downloadlib.addownload.ge.ge dr(long j, long j2) {
        return (com.ss.android.downloadlib.addownload.ge.ge) get(get(Long.valueOf(j)) != null ? Long.valueOf(j) : Long.valueOf(j2));
    }

    public com.ss.android.downloadlib.addownload.ge.ge dr(long j) {
        return (com.ss.android.downloadlib.addownload.ge.ge) get(Long.valueOf(j));
    }
}
