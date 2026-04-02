package com.amazon.aps.iva.hw;

import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.downloading.e0;
/* compiled from: KalturaDownloadItem.kt */
/* loaded from: classes2.dex */
public final class b {

    /* compiled from: KalturaDownloadItem.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.INFO_LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.IN_PROGRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.COMPLETED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    public static e0.c a(com.amazon.aps.iva.hw.a aVar) {
        e0.b bVar;
        j.f(aVar, "<this>");
        String str = aVar.a;
        switch (a.a[aVar.c.ordinal()]) {
            case 1:
                bVar = e0.b.NEW;
                break;
            case 2:
                bVar = e0.b.INFO_LOADED;
                break;
            case 3:
                bVar = e0.b.PAUSED;
                break;
            case 4:
                bVar = e0.b.IN_PROGRESS;
                break;
            case 5:
                bVar = e0.b.COMPLETED;
                break;
            case 6:
                bVar = e0.b.FAILED;
                break;
            default:
                throw new h();
        }
        long j = aVar.e;
        long max = Math.max(j, aVar.d);
        return new e0.c(str, bVar, j, max, 0, 0, (((float) j) * 100.0f) / ((float) max));
    }
}
