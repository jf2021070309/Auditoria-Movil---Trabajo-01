package com.vungle.publisher;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import com.vungle.publisher.log.Logger;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class mq {

    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void b();

        void c();
    }

    public AlertDialog a(Context context, p pVar, a aVar) {
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, context.getApplicationInfo().theme));
        builder.setTitle(pVar.getIncentivizedCancelDialogTitle());
        builder.setMessage(pVar.getIncentivizedCancelDialogBodyText());
        builder.setPositiveButton(pVar.getIncentivizedCancelDialogKeepWatchingButtonText(), mr.a(aVar));
        builder.setNegativeButton(pVar.getIncentivizedCancelDialogCloseButtonText(), ms.a(aVar));
        builder.setOnCancelListener(mt.a(aVar));
        return builder.create();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(a aVar, DialogInterface dialogInterface, int i) {
        Logger.d(Logger.AD_TAG, "positive click");
        aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(a aVar, DialogInterface dialogInterface, int i) {
        Logger.d(Logger.AD_TAG, "negative click");
        aVar.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(a aVar, DialogInterface dialogInterface) {
        Logger.d(Logger.AD_TAG, "cancel click");
        aVar.c();
    }
}
