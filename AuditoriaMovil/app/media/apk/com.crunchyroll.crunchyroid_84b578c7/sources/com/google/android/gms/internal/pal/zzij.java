package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzij {
    public static final CharSequence zza(Object obj) {
        obj.getClass();
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public static final Appendable zzb(Appendable appendable, Iterator it, String str) throws IOException {
        if (it.hasNext()) {
            appendable.append(zza(it.next()));
            while (it.hasNext()) {
                appendable.append(",");
                appendable.append(zza(it.next()));
            }
        }
        return appendable;
    }
}
