package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.StringWriter;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public class zzwr {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            zzacx zzacxVar = new zzacx(stringWriter);
            zzacxVar.zzo(true);
            zzaby.zzV.write(zzacxVar, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
