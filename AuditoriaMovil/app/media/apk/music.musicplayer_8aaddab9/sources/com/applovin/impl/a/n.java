package com.applovin.impl.a;

import android.net.Uri;
import android.webkit.URLUtil;
import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.q;
import java.util.Locale;
/* loaded from: classes.dex */
public class n {
    private Uri a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f3122b;

    /* renamed from: c  reason: collision with root package name */
    private a f3123c;

    /* renamed from: d  reason: collision with root package name */
    private String f3124d;

    /* renamed from: e  reason: collision with root package name */
    private int f3125e;

    /* renamed from: f  reason: collision with root package name */
    private int f3126f;

    /* renamed from: g  reason: collision with root package name */
    private int f3127g;

    /* loaded from: classes.dex */
    public enum a {
        Progressive,
        Streaming
    }

    private n() {
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

    public static n a(q qVar, com.applovin.impl.sdk.m mVar) {
        if (qVar != null) {
            if (mVar != null) {
                try {
                    String c2 = qVar.c();
                    if (!URLUtil.isValidUrl(c2)) {
                        mVar.B().e("VastVideoFile", "Unable to create video file. Could not find URL.");
                        return null;
                    }
                    Uri parse = Uri.parse(c2);
                    n nVar = new n();
                    nVar.a = parse;
                    nVar.f3122b = parse;
                    nVar.f3127g = StringUtils.parseInt(qVar.b().get("bitrate"));
                    nVar.f3123c = a(qVar.b().get("delivery"));
                    nVar.f3126f = StringUtils.parseInt(qVar.b().get("height"));
                    nVar.f3125e = StringUtils.parseInt(qVar.b().get("width"));
                    nVar.f3124d = qVar.b().get("type").toLowerCase(Locale.ENGLISH);
                    return nVar;
                } catch (Throwable th) {
                    mVar.B().b("VastVideoFile", "Error occurred while initializing", th);
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
        this.f3122b = uri;
    }

    public Uri b() {
        return this.f3122b;
    }

    public String c() {
        return this.f3124d;
    }

    public int d() {
        return this.f3127g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f3125e == nVar.f3125e && this.f3126f == nVar.f3126f && this.f3127g == nVar.f3127g) {
                Uri uri = this.a;
                if (uri == null ? nVar.a == null : uri.equals(nVar.a)) {
                    Uri uri2 = this.f3122b;
                    if (uri2 == null ? nVar.f3122b == null : uri2.equals(nVar.f3122b)) {
                        if (this.f3123c != nVar.f3123c) {
                            return false;
                        }
                        String str = this.f3124d;
                        String str2 = nVar.f3124d;
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
        Uri uri2 = this.f3122b;
        int hashCode2 = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.f3123c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f3124d;
        return ((((((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f3125e) * 31) + this.f3126f) * 31) + this.f3127g;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("VastVideoFile{sourceVideoUri=");
        y.append(this.a);
        y.append(", videoUri=");
        y.append(this.f3122b);
        y.append(", deliveryType=");
        y.append(this.f3123c);
        y.append(", fileType='");
        e.a.d.a.a.J(y, this.f3124d, CoreConstants.SINGLE_QUOTE_CHAR, ", width=");
        y.append(this.f3125e);
        y.append(", height=");
        y.append(this.f3126f);
        y.append(", bitrate=");
        y.append(this.f3127g);
        y.append('}');
        return y.toString();
    }
}
