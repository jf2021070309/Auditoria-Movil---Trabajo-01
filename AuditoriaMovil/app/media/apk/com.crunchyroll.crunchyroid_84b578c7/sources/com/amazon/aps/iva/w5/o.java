package com.amazon.aps.iva.w5;

import com.google.android.gms.cast.CastStatusCodes;
import java.io.IOException;
/* compiled from: HttpDataSource.java */
/* loaded from: classes.dex */
public final class o extends p {
    public o(IOException iOException, i iVar) {
        super("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, iVar, (int) CastStatusCodes.MESSAGE_SEND_BUFFER_TOO_FULL);
    }
}
