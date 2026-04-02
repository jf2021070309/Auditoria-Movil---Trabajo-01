package com.amazon.aps.iva.b8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import java.util.HashMap;
import java.util.concurrent.Callable;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g2 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String lambda$getHeartBeatsHeader$2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                byte[] bArr = (byte[]) obj;
                boolean z = false;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                if (decodeByteArray != null) {
                    z = true;
                }
                com.amazon.aps.iva.cq.b.v(z, "Could not decode image data");
                return decodeByteArray;
            case 1:
                HashMap hashMap = com.amazon.aps.iva.z9.p.a;
                return new com.amazon.aps.iva.z9.i0((com.amazon.aps.iva.z9.h) obj);
            default:
                lambda$getHeartBeatsHeader$2 = ((DefaultHeartBeatController) obj).lambda$getHeartBeatsHeader$2();
                return lambda$getHeartBeatsHeader$2;
        }
    }
}
