package com.applovin.impl.mediation.debugger.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class a extends Activity implements AppLovinCommunicatorSubscriber {
    public List<String> communicatorTopics = new ArrayList();

    /* renamed from: com.applovin.impl.mediation.debugger.ui.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0078a<T extends Activity> {
        void a(T t);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return getClass().getSimpleName();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        if (!Utils.isPubInDebugMode(this)) {
            setTheme(R.style.com_applovin_mediation_MaxDebuggerActivity_Theme_Live);
        }
        super.onCreate(bundle);
        List<String> list = this.communicatorTopics;
        if (list == null || list.size() <= 0) {
            return;
        }
        AppLovinCommunicator.getInstance(this).subscribe(this, this.communicatorTopics);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        List<String> list = this.communicatorTopics;
        if (list == null || list.size() <= 0) {
            return;
        }
        AppLovinCommunicator.getInstance(this).unsubscribe(this, this.communicatorTopics);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
    }

    public void startActivity(final Class cls, final com.applovin.impl.sdk.a aVar, final InterfaceC0078a interfaceC0078a) {
        aVar.a(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.mediation.debugger.ui.a.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (cls.isInstance(activity)) {
                    interfaceC0078a.a(activity);
                    aVar.b(this);
                }
            }
        });
        startActivity(new Intent(this, cls));
    }
}
