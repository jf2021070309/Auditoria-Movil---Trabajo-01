package com.ellation.crunchyroll.cast;

import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.ye.b;
import com.ellation.crunchyroll.cast.session.SessionManagerProviderHolder;
import kotlin.Metadata;
/* compiled from: ChromecastMessengerImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/amazon/aps/iva/ye/b;", "invoke", "()Lcom/amazon/aps/iva/ye/b;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ChromecastMessengerInternal$Companion$create$1 extends l implements com.amazon.aps.iva.xb0.a<b> {
    public static final ChromecastMessengerInternal$Companion$create$1 INSTANCE = new ChromecastMessengerInternal$Companion$create$1();

    public ChromecastMessengerInternal$Companion$create$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.aps.iva.xb0.a
    public final b invoke() {
        return SessionManagerProviderHolder.get().getCastSession();
    }
}
