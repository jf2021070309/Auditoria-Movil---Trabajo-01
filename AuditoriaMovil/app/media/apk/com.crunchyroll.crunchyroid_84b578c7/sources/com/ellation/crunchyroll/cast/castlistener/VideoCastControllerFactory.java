package com.ellation.crunchyroll.cast.castlistener;

import android.app.Activity;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ye.i;
import com.crunchyroll.cast.castlistener.VideoCastController;
import kotlin.Metadata;
/* compiled from: VideoCastControllerFactory.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\f"}, d2 = {"Lcom/ellation/crunchyroll/cast/castlistener/VideoCastControllerFactory;", "", "Landroid/app/Activity;", "activity", "Lcom/amazon/aps/iva/ye/i;", "playServicesStatusChecker", "Lkotlin/Function0;", "Lcom/crunchyroll/cast/castlistener/VideoCastController;", "createVideoCastController", "create", "<init>", "()V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class VideoCastControllerFactory {
    public static final int $stable = 0;
    public static final VideoCastControllerFactory INSTANCE = new VideoCastControllerFactory();

    private VideoCastControllerFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoCastController create$default(VideoCastControllerFactory videoCastControllerFactory, Activity activity, i iVar, a aVar, int i, Object obj) {
        if ((i & 4) != 0) {
            aVar = new VideoCastControllerFactory$create$1(activity);
        }
        return videoCastControllerFactory.create(activity, iVar, aVar);
    }

    public final VideoCastController create(Activity activity, i iVar, a<? extends VideoCastController> aVar) {
        j.f(activity, "activity");
        j.f(iVar, "playServicesStatusChecker");
        j.f(aVar, "createVideoCastController");
        if (iVar.isCastApiAvailable()) {
            return aVar.invoke();
        }
        return new VideoCastControllerEmpty();
    }
}
