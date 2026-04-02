package com.amazon.aps.iva.at;

import com.amazon.aps.iva.yb0.l;
import java.util.Date;
/* compiled from: MusicContentAvailabilityProvider.kt */
/* loaded from: classes2.dex */
public final class e extends l implements com.amazon.aps.iva.xb0.a<Date> {
    public static final e h = new e();

    public e() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Date invoke() {
        return new Date(System.currentTimeMillis());
    }
}
