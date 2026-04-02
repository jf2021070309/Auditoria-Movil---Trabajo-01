package com.applovin.impl.a;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.p;
/* loaded from: classes.dex */
public class e {
    private a a;
    private Uri b;
    private String c;

    /* loaded from: classes.dex */
    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e a(p pVar, e eVar, com.applovin.impl.sdk.k kVar) {
        if (pVar != null) {
            if (kVar != null) {
                if (eVar == null) {
                    try {
                        eVar = new e();
                    } catch (Throwable th) {
                        kVar.z().b("VastNonVideoResource", "Error occurred while initializing", th);
                        return null;
                    }
                }
                if (eVar.b == null && !StringUtils.isValidString(eVar.c)) {
                    String a2 = a(pVar, "StaticResource");
                    if (URLUtil.isValidUrl(a2)) {
                        eVar.b = Uri.parse(a2);
                        eVar.a = a.STATIC;
                        return eVar;
                    }
                    String a3 = a(pVar, "IFrameResource");
                    if (StringUtils.isValidString(a3)) {
                        eVar.a = a.IFRAME;
                        if (URLUtil.isValidUrl(a3)) {
                            eVar.b = Uri.parse(a3);
                        } else {
                            eVar.c = a3;
                        }
                        return eVar;
                    }
                    String a4 = a(pVar, "HTMLResource");
                    if (StringUtils.isValidString(a4)) {
                        eVar.a = a.HTML;
                        if (URLUtil.isValidUrl(a4)) {
                            eVar.b = Uri.parse(a4);
                        } else {
                            eVar.c = a4;
                        }
                    }
                }
                return eVar;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    private static String a(p pVar, String str) {
        p b = pVar.b(str);
        if (b != null) {
            return b.c();
        }
        return null;
    }

    public a a() {
        return this.a;
    }

    public void a(Uri uri) {
        this.b = uri;
    }

    public void a(String str) {
        this.c = str;
    }

    public Uri b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.a != eVar.a) {
                return false;
            }
            Uri uri = this.b;
            if (uri == null ? eVar.b == null : uri.equals(eVar.b)) {
                String str = this.c;
                String str2 = eVar.c;
                return str != null ? str.equals(str2) : str2 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        a aVar = this.a;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.b;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "VastNonVideoResource{type=" + this.a + ", resourceUri=" + this.b + ", resourceContents='" + this.c + "'}";
    }
}
