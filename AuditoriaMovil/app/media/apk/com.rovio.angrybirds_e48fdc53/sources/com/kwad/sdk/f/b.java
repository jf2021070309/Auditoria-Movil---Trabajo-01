package com.kwad.sdk.f;

import java.util.HashMap;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class b implements a {
    private static volatile b aCf;
    private static c aCg;

    private b() {
    }

    private static String FA() {
        return a(false, "", 2);
    }

    public static synchronized b Fz() {
        b bVar;
        synchronized (b.class) {
            if (aCf == null) {
                synchronized (b.class) {
                    if (aCf == null) {
                        aCf = new b();
                    }
                }
            }
            bVar = aCf;
        }
        return bVar;
    }

    public static String a(boolean z, Object obj, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("userSet", String.valueOf(z));
        hashMap.put("value", obj);
        hashMap.put("errorCode", String.valueOf(i));
        return new JSONObject(hashMap).toString();
    }

    public static void a(c cVar) {
        aCg = cVar;
    }

    @Override // com.kwad.sdk.f.a
    public final String Fn() {
        c cVar = aCg;
        return cVar != null ? cVar.Fn() : FA();
    }

    @Override // com.kwad.sdk.f.a
    public final String Fo() {
        c cVar = aCg;
        return cVar != null ? cVar.Fo() : FA();
    }

    @Override // com.kwad.sdk.f.a
    public final String Fp() {
        c cVar = aCg;
        return cVar != null ? cVar.Fp() : FA();
    }

    @Override // com.kwad.sdk.f.a
    public final String Fq() {
        c cVar = aCg;
        return cVar != null ? cVar.Fq() : FA();
    }

    @Override // com.kwad.sdk.f.a
    public final String Fr() {
        c cVar = aCg;
        return cVar != null ? cVar.Fr() : FA();
    }

    @Override // com.kwad.sdk.f.a
    public final String Fs() {
        c cVar = aCg;
        return cVar != null ? cVar.Fs() : FA();
    }

    @Override // com.kwad.sdk.f.a
    public final String Ft() {
        c cVar = aCg;
        return cVar != null ? cVar.Ft() : FA();
    }

    @Override // com.kwad.sdk.f.a
    public final String Fu() {
        c cVar = aCg;
        return cVar != null ? cVar.Fu() : FA();
    }

    @Override // com.kwad.sdk.f.a
    public final String Fv() {
        c cVar = aCg;
        return cVar != null ? cVar.Fv() : FA();
    }

    @Override // com.kwad.sdk.f.a
    public final String Fw() {
        c cVar = aCg;
        return cVar != null ? cVar.Fw() : FA();
    }

    @Override // com.kwad.sdk.f.a
    public final String Fx() {
        c cVar = aCg;
        return cVar != null ? cVar.Fx() : FA();
    }

    @Override // com.kwad.sdk.f.a
    public final String Fy() {
        c cVar = aCg;
        return cVar != null ? cVar.Fy() : FA();
    }

    @Override // com.kwad.sdk.f.a
    public final String getAppId() {
        c cVar = aCg;
        return cVar != null ? cVar.getAppId() : FA();
    }

    @Override // com.kwad.sdk.f.a
    public final String getDeviceId() {
        c cVar = aCg;
        return cVar != null ? cVar.getDeviceId() : FA();
    }

    @Override // com.kwad.sdk.f.a
    public final String getIccId() {
        c cVar = aCg;
        return cVar != null ? cVar.getIccId() : FA();
    }

    @Override // com.kwad.sdk.f.a
    public final String getIp() {
        c cVar = aCg;
        return cVar != null ? cVar.getIp() : FA();
    }

    @Override // com.kwad.sdk.f.a
    public final String getLocation() {
        c cVar = aCg;
        return cVar != null ? cVar.getLocation() : FA();
    }

    @Override // com.kwad.sdk.f.a
    public final String getOaid() {
        c cVar = aCg;
        return cVar != null ? cVar.getOaid() : FA();
    }

    @Override // com.kwad.sdk.f.a
    public final String getSdkVersion() {
        c cVar = aCg;
        return cVar != null ? cVar.getSdkVersion() : FA();
    }
}
