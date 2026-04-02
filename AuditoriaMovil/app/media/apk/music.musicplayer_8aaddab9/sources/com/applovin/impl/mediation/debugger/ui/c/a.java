package com.applovin.impl.mediation.debugger.ui.c;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.a.b.b;
import com.applovin.impl.mediation.debugger.ui.a;
import com.applovin.impl.mediation.debugger.ui.c.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.R;
/* loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a {
    private b a;

    /* renamed from: b  reason: collision with root package name */
    private ListView f3592b;

    public a() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    public void initialize(final com.applovin.impl.mediation.debugger.a.b.b bVar) {
        setTitle(bVar.i());
        b bVar2 = new b(bVar, this);
        this.a = bVar2;
        bVar2.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.c.a.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar, c cVar) {
                if (aVar.a() == b.a.TEST_ADS.ordinal()) {
                    m v = bVar.v();
                    b.EnumC0077b c2 = bVar.c();
                    if (b.EnumC0077b.READY == c2) {
                        a.this.startActivity(MaxDebuggerMultiAdActivity.class, v.ae(), new a.InterfaceC0078a<MaxDebuggerMultiAdActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.c.a.1.1
                            @Override // com.applovin.impl.mediation.debugger.ui.a.InterfaceC0078a
                            public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                                maxDebuggerMultiAdActivity.initialize(bVar);
                            }
                        });
                        return;
                    } else if (b.EnumC0077b.DISABLED == c2) {
                        v.J().d();
                        Utils.showAlert("Restart Required", cVar.m(), a.this);
                        return;
                    }
                }
                Utils.showAlert("Instructions", cVar.m(), a.this);
            }
        });
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f3592b = listView;
        listView.setAdapter((ListAdapter) this.a);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.a.a().m().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.a.c();
            this.a.i();
        }
    }
}
