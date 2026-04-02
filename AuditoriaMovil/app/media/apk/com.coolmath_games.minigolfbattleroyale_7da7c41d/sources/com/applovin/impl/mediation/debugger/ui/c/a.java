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
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.R;
/* loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a {
    private b a;
    private ListView b;

    public a() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    public void initialize(final com.applovin.impl.mediation.debugger.a.b.b bVar) {
        setTitle(bVar.h());
        b bVar2 = new b(bVar, this);
        this.a = bVar2;
        bVar2.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.c.a.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar, c cVar) {
                if (aVar.a() == b.a.TEST_ADS.ordinal()) {
                    k s = bVar.s();
                    b.EnumC0016b c = bVar.c();
                    if (b.EnumC0016b.READY == c) {
                        a.this.startActivity(MaxDebuggerMultiAdActivity.class, s.ad(), new a.InterfaceC0017a<MaxDebuggerMultiAdActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.c.a.1.1
                            @Override // com.applovin.impl.mediation.debugger.ui.a.InterfaceC0017a
                            public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                                maxDebuggerMultiAdActivity.initialize(bVar);
                            }
                        });
                        return;
                    } else if (b.EnumC0016b.DISABLED == c) {
                        s.H().d();
                        Utils.showAlert("Restart Required", cVar.m(), a.this);
                        return;
                    }
                }
                Utils.showAlert("Instructions", cVar.m(), a.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.b = listView;
        listView.setAdapter((ListAdapter) this.a);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.a.a().l().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.a.c();
            this.a.i();
        }
    }
}
