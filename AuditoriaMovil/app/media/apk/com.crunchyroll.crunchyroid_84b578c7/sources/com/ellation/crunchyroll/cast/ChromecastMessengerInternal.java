package com.ellation.crunchyroll.cast;

import android.os.Handler;
import android.os.Looper;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ye.b;
import com.amazon.aps.iva.ye.g;
import com.amazon.aps.iva.ye.h;
import com.ellation.crunchyroll.api.GsonHolder;
import kotlin.Metadata;
/* compiled from: ChromecastMessengerImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/cast/ChromecastMessengerInternal;", "Lcom/amazon/aps/iva/ye/h;", "Companion", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface ChromecastMessengerInternal extends h {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: ChromecastMessengerImpl.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\r"}, d2 = {"Lcom/ellation/crunchyroll/cast/ChromecastMessengerInternal$Companion;", "", "", "channel", "Lkotlin/Function0;", "Lcom/amazon/aps/iva/ye/b;", "getCastSession", "Landroid/os/Handler;", "handler", "Lcom/ellation/crunchyroll/cast/ChromecastMessengerInternal;", "create", "<init>", "()V", "cast_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ChromecastMessengerInternal create$default(Companion companion, String str, com.amazon.aps.iva.xb0.a aVar, Handler handler, int i, Object obj) {
            if ((i & 2) != 0) {
                aVar = ChromecastMessengerInternal$Companion$create$1.INSTANCE;
            }
            if ((i & 4) != 0) {
                handler = new Handler(Looper.getMainLooper());
            }
            return companion.create(str, aVar, handler);
        }

        public final ChromecastMessengerInternal create(String str) {
            j.f(str, "channel");
            return create$default(this, str, null, null, 6, null);
        }

        public final ChromecastMessengerInternal create(String str, com.amazon.aps.iva.xb0.a<? extends b> aVar) {
            j.f(str, "channel");
            j.f(aVar, "getCastSession");
            return create$default(this, str, aVar, null, 4, null);
        }

        public final ChromecastMessengerInternal create(String str, com.amazon.aps.iva.xb0.a<? extends b> aVar, Handler handler) {
            j.f(str, "channel");
            j.f(aVar, "getCastSession");
            j.f(handler, "handler");
            return new ChromecastMessengerImpl(str, aVar, GsonHolder.getInstance(), handler);
        }
    }

    @Override // com.amazon.aps.iva.ye.h
    /* synthetic */ void sendMessage(g gVar);
}
