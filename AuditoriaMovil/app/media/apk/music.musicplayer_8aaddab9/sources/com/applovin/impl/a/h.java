package com.applovin.impl.a;

import android.net.Uri;
import android.webkit.URLUtil;
import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.q;
/* loaded from: classes.dex */
public class h {
    private a a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f3101b;

    /* renamed from: c  reason: collision with root package name */
    private String f3102c;

    /* loaded from: classes.dex */
    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private h() {
    }

    public static h a(q qVar, h hVar, com.applovin.impl.sdk.m mVar) {
        if (qVar != null) {
            if (mVar != null) {
                if (hVar == null) {
                    try {
                        hVar = new h();
                    } catch (Throwable th) {
                        mVar.B().b("VastNonVideoResource", "Error occurred while initializing", th);
                        return null;
                    }
                }
                if (hVar.f3101b == null && !StringUtils.isValidString(hVar.f3102c)) {
                    String a2 = a(qVar, "StaticResource");
                    if (URLUtil.isValidUrl(a2)) {
                        hVar.f3101b = Uri.parse(a2);
                        hVar.a = a.STATIC;
                        return hVar;
                    }
                    String a3 = a(qVar, "IFrameResource");
                    if (StringUtils.isValidString(a3)) {
                        hVar.a = a.IFRAME;
                        if (URLUtil.isValidUrl(a3)) {
                            hVar.f3101b = Uri.parse(a3);
                        } else {
                            hVar.f3102c = a3;
                        }
                        return hVar;
                    }
                    String a4 = a(qVar, "HTMLResource");
                    if (StringUtils.isValidString(a4)) {
                        hVar.a = a.HTML;
                        if (URLUtil.isValidUrl(a4)) {
                            hVar.f3101b = Uri.parse(a4);
                        } else {
                            hVar.f3102c = a4;
                        }
                    }
                }
                return hVar;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    private static String a(q qVar, String str) {
        q b2 = qVar.b(str);
        if (b2 != null) {
            return b2.c();
        }
        return null;
    }

    public a a() {
        return this.a;
    }

    public void a(Uri uri) {
        this.f3101b = uri;
    }

    public void a(String str) {
        this.f3102c = str;
    }

    public Uri b() {
        return this.f3101b;
    }

    public String c() {
        return this.f3102c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.a != hVar.a) {
                return false;
            }
            Uri uri = this.f3101b;
            if (uri == null ? hVar.f3101b == null : uri.equals(hVar.f3101b)) {
                String str = this.f3102c;
                String str2 = hVar.f3102c;
                return str != null ? str.equals(str2) : str2 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        a aVar = this.a;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.f3101b;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.f3102c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("VastNonVideoResource{type=");
        y.append(this.a);
        y.append(", resourceUri=");
        y.append(this.f3101b);
        y.append(", resourceContents='");
        y.append(this.f3102c);
        y.append(CoreConstants.SINGLE_QUOTE_CHAR);
        y.append('}');
        return y.toString();
    }
}
