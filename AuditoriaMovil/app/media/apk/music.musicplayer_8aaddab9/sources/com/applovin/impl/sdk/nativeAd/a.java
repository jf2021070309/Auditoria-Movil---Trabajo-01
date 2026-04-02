package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.File;
import java.util.Collections;
/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.e.a {
    private final r a;

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.sdk.d.e f4162c;

    /* renamed from: d  reason: collision with root package name */
    private final AppLovinNativeAdImpl f4163d;

    /* renamed from: e  reason: collision with root package name */
    private final InterfaceC0091a f4164e;

    /* renamed from: com.applovin.impl.sdk.nativeAd.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0091a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, m mVar, InterfaceC0091a interfaceC0091a) {
        super("TaskCacheNativeAd", mVar);
        this.f4162c = new com.applovin.impl.sdk.d.e();
        this.f4163d = appLovinNativeAdImpl;
        this.f4164e = interfaceC0091a;
        this.a = mVar.aa();
    }

    private Uri a(Uri uri) {
        String k2;
        if (uri == null) {
            return null;
        }
        a("Attempting to cache resource: " + uri);
        String a = this.a.a(f(), uri.toString(), null, Collections.emptyList(), false, this.f4162c);
        String cachePrefix = this.f4163d.getCachePrefix();
        if (StringUtils.isValidString(cachePrefix)) {
            a = e.a.d.a.a.k(cachePrefix, a);
        }
        if (StringUtils.isValidString(a)) {
            File a2 = this.a.a(a, f());
            if (a2 != null) {
                Uri fromFile = Uri.fromFile(a2);
                if (fromFile != null) {
                    return fromFile;
                }
                k2 = "Unable to extract Uri from image file";
            } else {
                k2 = e.a.d.a.a.k("Unable to retrieve File from cached image filename = ", a);
            }
            d(k2);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        StringBuilder y = e.a.d.a.a.y("Begin caching ad #");
        y.append(this.f4163d.getAdIdNumber());
        y.append("...");
        a(y.toString());
        Uri a = a(this.f4163d.getIconUri());
        if (a != null) {
            this.f4163d.setIconUri(a);
        }
        Uri a2 = a(this.f4163d.getMainImageUri());
        if (a2 != null) {
            this.f4163d.setMainImageUri(a2);
        }
        StringBuilder y2 = e.a.d.a.a.y("Finished caching ad #");
        y2.append(this.f4163d.getAdIdNumber());
        a(y2.toString());
        this.f4164e.a(this.f4163d);
    }
}
