package com.applovin.impl.mediation.debugger.ui.e;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.a.b.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a {
    private m a;

    /* renamed from: b  reason: collision with root package name */
    private List<b> f3648b;

    /* renamed from: c  reason: collision with root package name */
    private d f3649c;

    /* renamed from: d  reason: collision with root package name */
    private List<c> f3650d;

    /* renamed from: e  reason: collision with root package name */
    private ListView f3651e;

    public a() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    private List<c> a(List<b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (final b bVar : list) {
            arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.a(bVar, this) { // from class: com.applovin.impl.mediation.debugger.ui.e.a.3
                @Override // com.applovin.impl.mediation.debugger.ui.b.a.a, com.applovin.impl.mediation.debugger.ui.d.c
                public int f() {
                    if (a.this.a.J().c() == null || !a.this.a.J().c().equals(bVar.h())) {
                        return 0;
                    }
                    return R.drawable.applovin_ic_check_mark_borderless;
                }

                @Override // com.applovin.impl.mediation.debugger.ui.b.a.a, com.applovin.impl.mediation.debugger.ui.d.c
                public int g() {
                    if (a.this.a.J().c() == null || !a.this.a.J().c().equals(bVar.h())) {
                        return super.g();
                    }
                    return -16776961;
                }

                @Override // com.applovin.impl.mediation.debugger.ui.d.c
                public String m() {
                    StringBuilder y = e.a.d.a.a.y("Please restart the app to show ads from the network: ");
                    y.append(bVar.i());
                    y.append(".");
                    return y.toString();
                }
            });
        }
        return arrayList;
    }

    public void initialize(List<b> list, final m mVar) {
        this.a = mVar;
        this.f3648b = list;
        this.f3650d = a(list);
        d dVar = new d(this) { // from class: com.applovin.impl.mediation.debugger.ui.e.a.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public int a(int i2) {
                return a.this.f3650d.size();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public int b() {
                return 1;
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public c b(int i2) {
                return new c.a(c.b.SECTION_CENTERED).a("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            public List<c> c(int i2) {
                return a.this.f3650d;
            }
        };
        this.f3649c = dVar;
        dVar.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.e.a.2
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar, c cVar) {
                if (StringUtils.isValidString(mVar.J().c())) {
                    mVar.J().a(((com.applovin.impl.mediation.debugger.ui.b.a.a) cVar).d().h());
                } else {
                    mVar.J().b(((com.applovin.impl.mediation.debugger.ui.b.a.a) cVar).d().h());
                    Utils.showAlert("Restart Required", cVar.m(), a.this);
                }
                a.this.f3649c.notifyDataSetChanged();
            }
        });
        this.f3649c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(R.layout.list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f3651e = listView;
        listView.setAdapter((ListAdapter) this.f3649c);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f3650d = a(this.f3648b);
        this.f3649c.i();
    }
}
