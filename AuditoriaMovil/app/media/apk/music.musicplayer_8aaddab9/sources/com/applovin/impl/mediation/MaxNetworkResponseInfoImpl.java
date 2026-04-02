package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
/* loaded from: classes.dex */
public class MaxNetworkResponseInfoImpl implements MaxNetworkResponseInfo {
    private final MaxNetworkResponseInfo.AdLoadState a;

    /* renamed from: b  reason: collision with root package name */
    private final MaxMediatedNetworkInfo f3296b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f3297c;

    /* renamed from: d  reason: collision with root package name */
    private final long f3298d;

    /* renamed from: e  reason: collision with root package name */
    private final MaxError f3299e;

    /* renamed from: com.applovin.impl.mediation.MaxNetworkResponseInfoImpl$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            MaxNetworkResponseInfo.AdLoadState.values();
            int[] iArr = new int[3];
            a = iArr;
            try {
                iArr[MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MaxNetworkResponseInfo.AdLoadState.AD_LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MaxNetworkResponseInfoImpl(MaxNetworkResponseInfo.AdLoadState adLoadState, Bundle bundle, MaxMediatedNetworkInfo maxMediatedNetworkInfo, long j2, MaxError maxError) {
        this.a = adLoadState;
        this.f3296b = maxMediatedNetworkInfo;
        this.f3297c = bundle;
        this.f3298d = j2;
        this.f3299e = maxError;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxNetworkResponseInfo.AdLoadState getAdLoadState() {
        return this.a;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public Bundle getCredentials() {
        return this.f3297c;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxError getError() {
        return this.f3299e;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public long getLatencyMillis() {
        return this.f3298d;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxMediatedNetworkInfo getMediatedNetwork() {
        return this.f3296b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0036, code lost:
        if (r1 != 2) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MaxResponseInfo{adLoadState="
            java.lang.StringBuilder r1 = e.a.d.a.a.y(r1)
            com.applovin.mediation.MaxNetworkResponseInfo$AdLoadState r2 = r4.a
            r1.append(r2)
            java.lang.String r2 = ", mediatedNetwork="
            r1.append(r2)
            com.applovin.mediation.MaxMediatedNetworkInfo r2 = r4.f3296b
            r1.append(r2)
            java.lang.String r2 = ", credentials="
            r1.append(r2)
            android.os.Bundle r2 = r4.f3297c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            int[] r1 = com.applovin.impl.mediation.MaxNetworkResponseInfoImpl.AnonymousClass1.a
            com.applovin.mediation.MaxNetworkResponseInfo$AdLoadState r2 = r4.a
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L39
            r2 = 2
            if (r1 == r2) goto L4b
            goto L5d
        L39:
            java.lang.String r1 = ", error="
            java.lang.StringBuilder r1 = e.a.d.a.a.y(r1)
            com.applovin.mediation.MaxError r2 = r4.f3299e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L4b:
            java.lang.String r1 = ", latencyMillis="
            java.lang.StringBuilder r1 = e.a.d.a.a.y(r1)
            long r2 = r4.f3298d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L5d:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.MaxNetworkResponseInfoImpl.toString():java.lang.String");
    }
}
