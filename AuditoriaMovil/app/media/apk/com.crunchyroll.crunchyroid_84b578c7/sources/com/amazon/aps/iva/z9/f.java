package com.amazon.aps.iva.z9;

import com.airbnb.lottie.LottieAnimationView;
import com.amazon.aps.iva.ma.g;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements f0 {
    @Override // com.amazon.aps.iva.z9.f0
    public final void a(Object obj) {
        boolean z;
        Throwable th = (Throwable) obj;
        f fVar = LottieAnimationView.p;
        g.a aVar = com.amazon.aps.iva.ma.g.a;
        if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            com.amazon.aps.iva.ma.c.c("Unable to load composition.", th);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th);
    }
}
