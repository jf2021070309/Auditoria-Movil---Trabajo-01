package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzabf extends zzxi {
    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        String str;
        String str2;
        String str3 = null;
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(zzacvVar.zzi(), "_");
        if (stringTokenizer.hasMoreElements()) {
            str = stringTokenizer.nextToken();
        } else {
            str = null;
        }
        if (stringTokenizer.hasMoreElements()) {
            str2 = stringTokenizer.nextToken();
        } else {
            str2 = null;
        }
        if (stringTokenizer.hasMoreElements()) {
            str3 = stringTokenizer.nextToken();
        }
        if (str2 == null && str3 == null) {
            return new Locale(str);
        }
        if (str3 == null) {
            return new Locale(str, str2);
        }
        return new Locale(str, str2, str3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        String locale;
        Locale locale2 = (Locale) obj;
        if (locale2 == null) {
            locale = null;
        } else {
            locale = locale2.toString();
        }
        zzacxVar.zzk(locale);
    }
}
