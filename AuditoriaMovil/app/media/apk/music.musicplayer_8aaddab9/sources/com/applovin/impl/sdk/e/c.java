package com.applovin.impl.sdk.e;

import android.net.Uri;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.mediation.h;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class c extends a implements h.a {
    public final com.applovin.impl.sdk.ad.e a;

    /* renamed from: c  reason: collision with root package name */
    private AppLovinAdLoadListener f4025c;

    /* renamed from: d  reason: collision with root package name */
    private final com.applovin.impl.sdk.r f4026d;

    /* renamed from: e  reason: collision with root package name */
    private final Collection<Character> f4027e;

    /* renamed from: f  reason: collision with root package name */
    private final com.applovin.impl.sdk.d.e f4028f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f4029g;

    public c(String str, com.applovin.impl.sdk.ad.e eVar, com.applovin.impl.sdk.m mVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, mVar);
        if (eVar == null) {
            throw new IllegalArgumentException("No ad specified.");
        }
        this.a = eVar;
        this.f4025c = appLovinAdLoadListener;
        this.f4026d = mVar.aa();
        this.f4027e = j();
        this.f4028f = new com.applovin.impl.sdk.d.e();
    }

    private Uri a(Uri uri, String str) {
        StringBuilder sb;
        String str2;
        if (uri != null) {
            String uri2 = uri.toString();
            if (StringUtils.isValidString(uri2)) {
                a("Caching " + str + " image...");
                return g(uri2);
            }
            sb = new StringBuilder();
            sb.append("Failed to cache ");
            sb.append(str);
            str2 = " image";
        } else {
            sb = new StringBuilder();
            sb.append("No ");
            sb.append(str);
            str2 = " image to cache";
        }
        sb.append(str2);
        a(sb.toString());
        return null;
    }

    private Uri a(String str, String str2) {
        StringBuilder sb;
        String replace = str2.replace("/", "_");
        String G = this.a.G();
        if (StringUtils.isValidString(G)) {
            replace = e.a.d.a.a.k(G, replace);
        }
        File a = this.f4026d.a(replace, this.f4020b.L());
        if (a == null) {
            return null;
        }
        if (a.exists()) {
            this.f4028f.b(a.length());
            sb = new StringBuilder();
        } else if (!this.f4026d.a(a, e.a.d.a.a.k(str, str2), Arrays.asList(str), this.f4028f)) {
            return null;
        } else {
            sb = new StringBuilder();
        }
        sb.append("file://");
        sb.append(a.getAbsolutePath());
        return Uri.parse(sb.toString());
    }

    private Uri g(String str) {
        return b(str, this.a.F(), true);
    }

    private Collection<Character> j() {
        HashSet hashSet = new HashSet();
        for (char c2 : ((String) this.f4020b.a(com.applovin.impl.sdk.c.b.bs)).toCharArray()) {
            hashSet.add(Character.valueOf(c2));
        }
        hashSet.add(Character.valueOf(CoreConstants.DOUBLE_QUOTE_CHAR));
        return hashSet;
    }

    public Uri a(String str, List<String> list, boolean z) {
        String l2;
        if (StringUtils.isValidString(str)) {
            a("Caching video " + str + "...");
            String a = this.f4026d.a(f(), str, this.a.G(), list, z, this.f4028f);
            if (!StringUtils.isValidString(a)) {
                d("Failed to cache video");
                h();
                Bundle bundle = new Bundle();
                bundle.putLong("ad_id", this.a.getAdIdNumber());
                bundle.putInt("load_response_code", this.f4028f.j());
                Exception i2 = this.f4028f.i();
                if (i2 != null) {
                    bundle.putString("load_exception_message", i2.getMessage());
                }
                this.f4020b.ag().a(bundle, "video_caching_failed");
                return null;
            }
            File a2 = this.f4026d.a(a, f());
            if (a2 != null) {
                Uri fromFile = Uri.fromFile(a2);
                if (fromFile != null) {
                    StringBuilder y = e.a.d.a.a.y("Finish caching video for ad #");
                    y.append(this.a.getAdIdNumber());
                    y.append(". Updating ad with cachedVideoFilename = ");
                    y.append(a);
                    a(y.toString());
                    return fromFile;
                }
                l2 = "Unable to create URI from cached video file = " + a2;
            } else {
                l2 = e.a.d.a.a.l("Unable to cache video = ", str, "Video file was missing or null");
            }
            d(l2);
            return null;
        }
        return null;
    }

    public String a(String str, List<String> list) {
        if (StringUtils.isValidString(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                a("Nothing to cache, skipping...");
                return null;
            }
            String lastPathSegment = parse.getLastPathSegment();
            if (StringUtils.isValidString(this.a.G())) {
                lastPathSegment = this.a.G() + lastPathSegment;
            }
            File a = this.f4026d.a(lastPathSegment, f());
            ByteArrayOutputStream a2 = (a == null || !a.exists()) ? null : this.f4026d.a(a);
            if (a2 == null) {
                a2 = this.f4026d.a(str, list, true, this.f4028f);
                if (a2 != null) {
                    this.f4026d.a(a2, a);
                    this.f4028f.a(a2.size());
                }
            } else {
                this.f4028f.b(a2.size());
            }
            try {
                return a2.toString("UTF-8");
            } catch (UnsupportedEncodingException e2) {
                a("UTF-8 encoding not supported.", e2);
            } catch (Throwable th) {
                a("String resource at " + str + " failed to load.", th);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0032, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r11, java.util.List<java.lang.String> r12, com.applovin.impl.sdk.ad.e r13) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.e.c.a(java.lang.String, java.util.List, com.applovin.impl.sdk.ad.e):java.lang.String");
    }

    public void a() {
        this.f4020b.H().b(this);
    }

    @Override // com.applovin.impl.mediation.h.a
    public void a(com.applovin.impl.mediation.a.a aVar) {
        if (aVar.f().equalsIgnoreCase(this.a.I())) {
            d("Updating flag for timeout...");
            this.f4029g = true;
        }
        this.f4020b.H().b(this);
    }

    public void a(AppLovinAdBase appLovinAdBase) {
        com.applovin.impl.sdk.d.d.a(this.f4028f, appLovinAdBase, this.f4020b);
    }

    public Uri b(String str, List<String> list, boolean z) {
        String str2;
        try {
            String a = this.f4026d.a(f(), str, this.a.G(), list, z, this.f4028f);
            if (StringUtils.isValidString(a)) {
                File a2 = this.f4026d.a(a, f());
                if (a2 != null) {
                    Uri fromFile = Uri.fromFile(a2);
                    if (fromFile != null) {
                        return fromFile;
                    }
                    str2 = "Unable to extract Uri from image file";
                } else {
                    str2 = "Unable to retrieve File from cached image filename = " + a;
                }
                d(str2);
                return null;
            }
            return null;
        } catch (Throwable th) {
            a("Failed to cache image at url = " + str, th);
            return null;
        }
    }

    public boolean b() {
        return this.f4029g;
    }

    public void c() {
        a("Caching mute images...");
        Uri a = a(this.a.ay(), "mute");
        if (a != null) {
            this.a.c(a);
        }
        Uri a2 = a(this.a.az(), "unmute");
        if (a2 != null) {
            this.a.d(a2);
        }
        StringBuilder y = e.a.d.a.a.y("Ad updated with muteImageFilename = ");
        y.append(this.a.ay());
        y.append(", unmuteImageFilename = ");
        y.append(this.a.az());
        a(y.toString());
    }

    public Uri e(String str) {
        return a(str, this.a.F(), true);
    }

    public String f(final String str) {
        if (StringUtils.isValidString(str)) {
            com.applovin.impl.sdk.network.c a = com.applovin.impl.sdk.network.c.a(this.f4020b).a(str).b("GET").a((c.a) "").a(0).a();
            final AtomicReference atomicReference = new AtomicReference(null);
            this.f4020b.R().a(a, new b.a(), new b.c<String>() { // from class: com.applovin.impl.sdk.e.c.1
                @Override // com.applovin.impl.sdk.network.b.c
                public void a(int i2, String str2, String str3) {
                    c cVar = c.this;
                    StringBuilder y = e.a.d.a.a.y("Failed to load resource from '");
                    y.append(str);
                    y.append("'");
                    cVar.d(y.toString());
                }

                @Override // com.applovin.impl.sdk.network.b.c
                public void a(String str2, int i2) {
                    atomicReference.set(str2);
                }
            });
            String str2 = (String) atomicReference.get();
            if (str2 != null) {
                this.f4028f.a(str2.length());
            }
            return str2;
        }
        return null;
    }

    public void h() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f4025c;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            this.f4025c = null;
        }
    }

    public void i() {
        StringBuilder y = e.a.d.a.a.y("Rendered new ad:");
        y.append(this.a);
        a(y.toString());
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.e.c.2
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f4025c != null) {
                    c.this.f4025c.adReceived(c.this.a);
                    c.this.f4025c = null;
                }
            }
        });
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a.H()) {
            a("Subscribing to timeout events...");
            this.f4020b.H().a(this);
        }
    }
}
