package com.applovin.impl.mediation.debugger.ui.e;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.a.b.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a {
    private k a;
    private List<b> b;
    private d c;
    private List<c> d;
    private ListView e;

    public a() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    private List<c> a(List<b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (final b bVar : list) {
            arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.a(bVar, this) { // from class: com.applovin.impl.mediation.debugger.ui.e.a.3
                @Override // com.applovin.impl.mediation.debugger.ui.b.a.a, com.applovin.impl.mediation.debugger.ui.d.c
                public int f() {
                    if (a.this.a.H().c() == null || !a.this.a.H().c().equals(bVar.g())) {
                        return 0;
                    }
                    return R.drawable.applovin_ic_check_mark_borderless;
                }

                @Override // com.applovin.impl.mediation.debugger.ui.b.a.a, com.applovin.impl.mediation.debugger.ui.d.c
                public int g() {
                    if (a.this.a.H().c() == null || !a.this.a.H().c().equals(bVar.g())) {
                        return super.g();
                    }
                    return -16776961;
                }

                @Override // com.applovin.impl.mediation.debugger.ui.d.c
                public String m() {
                    return "Please restart the app to show ads from the network: " + bVar.h() + ".";
                }
            });
        }
        return arrayList;
    }

    public void initialize(List<b> list, final k kVar) {
        this.a = kVar;
        this.b = list;
        this.d = a(list);
        d dVar = new d(this) { // from class: com.applovin.impl.mediation.debugger.ui.e.a.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected int a(int i) {
                return a.this.d.size();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected int b() {
                return 1;
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected c b(int i) {
                return new c.a(c.b.SECTION_CENTERED).a("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected List<c> c(int i) {
                return a.this.d;
            }
        };
        this.c = dVar;
        dVar.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.e.a.2
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar, c cVar) {
                if (StringUtils.isValidString(kVar.H().c())) {
                    kVar.H().a(((com.applovin.impl.mediation.debugger.ui.b.a.a) cVar).d().g());
                } else {
                    kVar.H().b(((com.applovin.impl.mediation.debugger.ui.b.a.a) cVar).d().g());
                    Utils.showAlert("Restart Required", cVar.m(), a.this);
                }
                a.this.c.notifyDataSetChanged();
            }
        });
        this.c.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(R.layout.list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.e = listView;
        listView.setAdapter((ListAdapter) this.c);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.d = a(this.b);
        this.c.i();
    }
}
