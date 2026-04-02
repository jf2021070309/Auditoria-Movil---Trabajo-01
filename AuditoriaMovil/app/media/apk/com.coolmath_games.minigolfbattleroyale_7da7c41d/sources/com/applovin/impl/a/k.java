package com.applovin.impl.a;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.p;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Locale;
/* loaded from: classes.dex */
public class k {
    private Uri a;
    private Uri b;
    private a c;
    private String d;
    private int e;
    private int f;
    private int g;

    /* loaded from: classes.dex */
    public enum a {
        Progressive,
        Streaming
    }

    private k() {
    }

    private static a a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }

    public static k a(p pVar, com.applovin.impl.sdk.k kVar) {
        if (pVar != null) {
            if (kVar != null) {
                try {
                    String c = pVar.c();
                    if (!URLUtil.isValidUrl(c)) {
                        kVar.z().e("VastVideoFile", "Unable to create video file. Could not find URL.");
                        return null;
                    }
                    Uri parse = Uri.parse(c);
                    k kVar2 = new k();
                    kVar2.a = parse;
                    kVar2.b = parse;
                    kVar2.g = StringUtils.parseInt(pVar.b().get("bitrate"));
                    kVar2.c = a(pVar.b().get("delivery"));
                    kVar2.f = StringUtils.parseInt(pVar.b().get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY));
                    kVar2.e = StringUtils.parseInt(pVar.b().get(ViewHierarchyConstants.DIMENSION_WIDTH_KEY));
                    kVar2.d = pVar.b().get("type").toLowerCase(Locale.ENGLISH);
                    return kVar2;
                } catch (Throwable th) {
                    kVar.z().b("VastVideoFile", "Error occurred while initializing", th);
                    return null;
                }
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    public Uri a() {
        return this.a;
    }

    public void a(Uri uri) {
        this.b = uri;
    }

    public Uri b() {
        return this.b;
    }

    public String c() {
        return this.d;
    }

    public int d() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.e == kVar.e && this.f == kVar.f && this.g == kVar.g) {
                Uri uri = this.a;
                if (uri == null ? kVar.a == null : uri.equals(kVar.a)) {
                    Uri uri2 = this.b;
                    if (uri2 == null ? kVar.b == null : uri2.equals(kVar.b)) {
                        if (this.c != kVar.c) {
                            return false;
                        }
                        String str = this.d;
                        String str2 = kVar.d;
                        return str != null ? str.equals(str2) : str2 == null;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Uri uri = this.a;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.b;
        int hashCode2 = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.d;
        return ((((((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.e) * 31) + this.f) * 31) + this.g;
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.a + ", videoUri=" + this.b + ", deliveryType=" + this.c + ", fileType='" + this.d + "', width=" + this.e + ", height=" + this.f + ", bitrate=" + this.g + '}';
    }
}
