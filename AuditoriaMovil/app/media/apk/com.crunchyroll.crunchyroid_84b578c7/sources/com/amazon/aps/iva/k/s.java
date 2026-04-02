package com.amazon.aps.iva.k;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.ads.AdRequest;
/* compiled from: AppLocalesMetadataHolderService.java */
/* loaded from: classes.dex */
public final class s extends Service {
    public static final /* synthetic */ int b = 0;

    /* compiled from: AppLocalesMetadataHolderService.java */
    /* loaded from: classes.dex */
    public static class a {
        public static int a() {
            return AdRequest.MAX_CONTENT_URL_LENGTH;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }
}
