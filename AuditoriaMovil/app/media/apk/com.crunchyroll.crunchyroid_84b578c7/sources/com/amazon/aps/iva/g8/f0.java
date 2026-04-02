package com.amazon.aps.iva.g8;

import android.content.Intent;
import android.net.Uri;
/* compiled from: NavDeepLinkRequest.kt */
/* loaded from: classes.dex */
public final class f0 {
    public final Uri a;
    public final String b;
    public final String c;

    public f0(Uri uri, String str, String str2) {
        this.a = uri;
        this.b = str;
        this.c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
        Uri uri = this.a;
        if (uri != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(uri));
        }
        String str = this.b;
        if (str != null) {
            sb.append(" action=");
            sb.append(str);
        }
        String str2 = this.c;
        if (str2 != null) {
            sb.append(" mimetype=");
            sb.append(str2);
        }
        sb.append(" }");
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "sb.toString()");
        return sb2;
    }

    public f0(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
    }
}
