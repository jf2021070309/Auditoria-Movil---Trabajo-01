package com.amazon.aps.iva.sj;

import com.amazon.aps.iva.sj.b;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.w5.d;
import com.amazon.aps.iva.w5.i;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.ImaSdkFactory;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
/* compiled from: ImaUtil.java */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: ImaUtil.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final long a;
        public final int b;
        public final int c;
        public final boolean d;
        public final boolean e;
        public final int f;
        public final AdErrorEvent.AdErrorListener g;
        public final AdEvent.AdEventListener h;

        public a(long j, int i, int i2, boolean z, boolean z2, int i3, AdErrorEvent.AdErrorListener adErrorListener, AdEvent.AdEventListener adEventListener) {
            this.a = j;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = z2;
            this.f = i3;
            this.g = adErrorListener;
            this.h = adEventListener;
        }
    }

    /* compiled from: ImaUtil.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public static long[] a(List<Float> list) {
        if (list.isEmpty()) {
            return new long[]{0};
        }
        int size = list.size();
        long[] jArr = new long[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            double floatValue = list.get(i2).floatValue();
            if (floatValue == -1.0d) {
                jArr[size - 1] = Long.MIN_VALUE;
            } else {
                jArr[i] = Math.round(floatValue * 1000000.0d);
                i++;
            }
        }
        Arrays.sort(jArr, 0, i);
        return jArr;
    }

    public static AdsRequest b(b bVar, i iVar) throws IOException {
        ((b.a) bVar).getClass();
        AdsRequest createAdsRequest = ImaSdkFactory.getInstance().createAdsRequest();
        if ("data".equals(iVar.a.getScheme())) {
            d dVar = new d();
            try {
                dVar.b(iVar);
                byte[] bArr = new byte[1024];
                int i = 0;
                int i2 = 0;
                while (i != -1) {
                    if (i2 == bArr.length) {
                        bArr = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    i = dVar.l(bArr, i2, bArr.length - i2);
                    if (i != -1) {
                        i2 += i;
                    }
                }
                createAdsRequest.setAdsResponse(g0.p(Arrays.copyOf(bArr, i2)));
            } finally {
                dVar.close();
            }
        } else {
            createAdsRequest.setAdTagUrl(iVar.a.toString());
        }
        return createAdsRequest;
    }
}
