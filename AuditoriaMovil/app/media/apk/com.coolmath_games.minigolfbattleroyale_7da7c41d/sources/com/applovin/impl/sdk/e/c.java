package com.applovin.impl.sdk.e;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.mediation.h;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.vungle.warren.analytics.AnalyticsEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.Typography;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class c extends a implements h.a {
    protected final com.applovin.impl.sdk.a.g a;
    private AppLovinAdLoadListener c;
    private final com.applovin.impl.sdk.p d;
    private final Collection<Character> e;
    private final com.applovin.impl.sdk.d.e f;
    private boolean g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(String str, com.applovin.impl.sdk.a.g gVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, kVar);
        if (gVar == null) {
            throw new IllegalArgumentException("No ad specified.");
        }
        this.a = gVar;
        this.c = appLovinAdLoadListener;
        this.d = kVar.Y();
        this.e = j();
        this.f = new com.applovin.impl.sdk.d.e();
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
        String K = this.a.K();
        if (StringUtils.isValidString(K)) {
            replace = K + replace;
        }
        File a = this.d.a(replace, this.b.J());
        if (a == null) {
            return null;
        }
        if (a.exists()) {
            this.f.b(a.length());
            sb = new StringBuilder();
        } else {
            if (!this.d.a(a, str + str2, Arrays.asList(str), this.f)) {
                return null;
            }
            sb = new StringBuilder();
        }
        sb.append("file://");
        sb.append(a.getAbsolutePath());
        return Uri.parse(sb.toString());
    }

    private Uri g(String str) {
        return b(str, this.a.J(), true);
    }

    private Collection<Character> j() {
        HashSet hashSet = new HashSet();
        for (char c : ((String) this.b.a(com.applovin.impl.sdk.c.b.bi)).toCharArray()) {
            hashSet.add(Character.valueOf(c));
        }
        hashSet.add(Character.valueOf(Typography.quote));
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Uri a(String str, List<String> list, boolean z) {
        String str2;
        if (StringUtils.isValidString(str)) {
            a("Caching video " + str + "...");
            String a = this.d.a(f(), str, this.a.K(), list, z, this.f);
            if (!StringUtils.isValidString(a)) {
                d("Failed to cache video");
                h();
                Bundle bundle = new Bundle();
                bundle.putLong("ad_id", this.a.getAdIdNumber());
                bundle.putInt("load_response_code", this.f.j());
                Exception i = this.f.i();
                if (i != null) {
                    bundle.putString("load_exception_message", i.getMessage());
                }
                this.b.af().a(bundle, "video_caching_failed");
                return null;
            }
            File a2 = this.d.a(a, f());
            if (a2 != null) {
                Uri fromFile = Uri.fromFile(a2);
                if (fromFile != null) {
                    a("Finish caching video for ad #" + this.a.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + a);
                    return fromFile;
                }
                str2 = "Unable to create URI from cached video file = " + a2;
            } else {
                str2 = "Unable to cache video = " + str + "Video file was missing or null";
            }
            d(str2);
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str, List<String> list) {
        if (StringUtils.isValidString(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                a("Nothing to cache, skipping...");
                return null;
            }
            String lastPathSegment = parse.getLastPathSegment();
            if (StringUtils.isValidString(this.a.K())) {
                lastPathSegment = this.a.K() + lastPathSegment;
            }
            File a = this.d.a(lastPathSegment, f());
            ByteArrayOutputStream a2 = (a == null || !a.exists()) ? null : this.d.a(a);
            if (a2 == null) {
                a2 = this.d.a(str, list, true, this.f);
                if (a2 != null) {
                    this.d.a(a2, a);
                    this.f.a(a2.size());
                }
            } else {
                this.f.b(a2.size());
            }
            try {
                return a2.toString("UTF-8");
            } catch (UnsupportedEncodingException e) {
                a("UTF-8 encoding not supported.", e);
            } catch (Throwable th) {
                a("String resource at " + str + " failed to load.", th);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x002e, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r10, java.util.List<java.lang.String> r11, com.applovin.impl.sdk.a.g r12) {
        /*
            r9 = this;
            boolean r0 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r10)
            if (r0 != 0) goto L7
            return r10
        L7:
            com.applovin.impl.sdk.k r0 = r9.b
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r1 = com.applovin.impl.sdk.c.b.bj
            java.lang.Object r0 = r0.a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1d
            java.lang.String r11 = "Resource caching is disabled, skipping cache..."
            r9.a(r11)
            return r10
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r10)
            boolean r1 = r12.shouldCancelHtmlCachingIfShown()
            boolean r2 = r12.aN()
            java.util.Iterator r11 = r11.iterator()
        L2e:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto Lf6
            java.lang.Object r3 = r11.next()
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            r5 = r4
        L3c:
            int r6 = r0.length()
            if (r4 >= r6) goto L2e
            boolean r4 = r9.b()
            if (r4 == 0) goto L49
            return r10
        L49:
            int r4 = r0.indexOf(r3, r5)
            r5 = -1
            if (r4 != r5) goto L51
            goto L2e
        L51:
            int r5 = r0.length()
            r6 = r4
        L56:
            java.util.Collection<java.lang.Character> r7 = r9.e
            char r8 = r0.charAt(r6)
            java.lang.Character r8 = java.lang.Character.valueOf(r8)
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L6b
            if (r6 >= r5) goto L6b
            int r6 = r6 + 1
            goto L56
        L6b:
            if (r6 <= r4) goto Lf0
            if (r6 == r5) goto Lf0
            int r5 = r3.length()
            int r5 = r5 + r4
            java.lang.String r5 = r0.substring(r5, r6)
            boolean r7 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r5)
            if (r7 == 0) goto Le2
            if (r1 == 0) goto L91
            boolean r7 = r12.hasShown()
            if (r7 == 0) goto L91
            java.lang.String r11 = "Cancelling HTML caching due to ad being shown already"
            r9.a(r11)
            com.applovin.impl.sdk.d.e r11 = r9.f
            r11.a()
            return r10
        L91:
            if (r2 == 0) goto Lc6
            java.lang.String r7 = r12.d()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r3)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto Lc6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Postponing caching for \""
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = "\" video resource"
        Lbb:
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r9.a(r5)
            goto Led
        Lc6:
            android.net.Uri r5 = r9.a(r3, r5)
            if (r5 == 0) goto Ldc
            java.lang.String r7 = r5.toString()
            r0.replace(r4, r6, r7)
            r12.b(r5)
            com.applovin.impl.sdk.d.e r5 = r9.f
            r5.e()
            goto Led
        Ldc:
            com.applovin.impl.sdk.d.e r5 = r9.f
            r5.f()
            goto Led
        Le2:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Skip caching of non-resource "
            r7.append(r8)
            goto Lbb
        Led:
            r5 = r6
            goto L3c
        Lf0:
            java.lang.String r11 = "Unable to cache resource; ad HTML is invalid."
            r9.d(r11)
            return r10
        Lf6:
            java.lang.String r10 = r0.toString()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.e.c.a(java.lang.String, java.util.List, com.applovin.impl.sdk.a.g):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        this.b.F().b(this);
    }

    @Override // com.applovin.impl.mediation.h.a
    public void a(com.applovin.impl.mediation.a.a aVar) {
        if (aVar.e().equalsIgnoreCase(this.a.M())) {
            d("Updating flag for timeout...");
            this.g = true;
        }
        this.b.F().b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AppLovinAdBase appLovinAdBase) {
        com.applovin.impl.sdk.d.d.a(this.f, appLovinAdBase, this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Uri b(String str, List<String> list, boolean z) {
        String str2;
        try {
            String a = this.d.a(f(), str, this.a.K(), list, z, this.f);
            if (StringUtils.isValidString(a)) {
                File a2 = this.d.a(a, f());
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

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        a("Caching mute images...");
        Uri a = a(this.a.aE(), AnalyticsEvent.Ad.mute);
        if (a != null) {
            this.a.c(a);
        }
        Uri a2 = a(this.a.aF(), AnalyticsEvent.Ad.unmute);
        if (a2 != null) {
            this.a.d(a2);
        }
        a("Ad updated with muteImageFilename = " + this.a.aE() + ", unmuteImageFilename = " + this.a.aF());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Uri e(String str) {
        return a(str, this.a.J(), true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String f(final String str) {
        if (StringUtils.isValidString(str)) {
            com.applovin.impl.sdk.network.c a = com.applovin.impl.sdk.network.c.a(this.b).a(str).b("GET").a((c.a) "").a(0).a();
            final AtomicReference atomicReference = new AtomicReference(null);
            this.b.P().a(a, new b.a(), new b.c<String>() { // from class: com.applovin.impl.sdk.e.c.1
                @Override // com.applovin.impl.sdk.network.b.c
                public void a(int i, String str2, String str3) {
                    c cVar = c.this;
                    cVar.d("Failed to load resource from '" + str + "'");
                }

                @Override // com.applovin.impl.sdk.network.b.c
                public void a(String str2, int i) {
                    atomicReference.set(str2);
                }
            });
            String str2 = (String) atomicReference.get();
            if (str2 != null) {
                this.f.a(str2.length());
            }
            return str2;
        }
        return null;
    }

    void h() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.c;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            this.c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        a("Rendered new ad:" + this.a);
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.e.c.2
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.c != null) {
                    c.this.c.adReceived(c.this.a);
                    c.this.c = null;
                }
            }
        });
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a.L()) {
            a("Subscribing to timeout events...");
            this.b.F().a(this);
        }
    }
}
