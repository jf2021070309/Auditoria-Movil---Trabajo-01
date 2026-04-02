package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.ComponentActivity;
/* compiled from: ComponentActivity.java */
/* loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ IntentSender.SendIntentException c;
    public final /* synthetic */ ComponentActivity.a d;

    public b(ComponentActivity.a aVar, int i, IntentSender.SendIntentException sendIntentException) {
        this.d = aVar;
        this.b = i;
        this.c = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a(this.b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.c));
    }
}
