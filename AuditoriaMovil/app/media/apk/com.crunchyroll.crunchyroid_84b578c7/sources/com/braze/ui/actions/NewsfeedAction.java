package com.braze.ui.actions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.aps.iva.yb0.j;
import com.braze.enums.Channel;
import com.braze.support.BrazeLogger;
import com.braze.ui.activities.BrazeFeedActivity;
import kotlin.Metadata;
/* compiled from: NewsfeedAction.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/braze/ui/actions/NewsfeedAction;", "Lcom/braze/ui/actions/IAction;", "Landroid/content/Context;", "context", "Lcom/amazon/aps/iva/kb0/q;", "execute", "Landroid/os/Bundle;", "extras", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "Lcom/braze/enums/Channel;", "channel", "Lcom/braze/enums/Channel;", "getChannel", "()Lcom/braze/enums/Channel;", "<init>", "(Landroid/os/Bundle;Lcom/braze/enums/Channel;)V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class NewsfeedAction implements IAction {
    private final Channel channel;
    private final Bundle extras;

    public NewsfeedAction(Bundle bundle, Channel channel) {
        j.f(channel, "channel");
        this.extras = bundle;
        this.channel = channel;
    }

    @Override // com.braze.ui.actions.IAction
    public void execute(Context context) {
        j.f(context, "context");
        try {
            Intent intent = new Intent(context, BrazeFeedActivity.class);
            Bundle bundle = this.extras;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            context.startActivity(intent);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, NewsfeedAction$execute$1.INSTANCE);
        }
    }
}
