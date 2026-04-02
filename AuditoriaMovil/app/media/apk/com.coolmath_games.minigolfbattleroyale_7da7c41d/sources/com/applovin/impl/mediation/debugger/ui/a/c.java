package com.applovin.impl.mediation.debugger.ui.a;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.mediation.debugger.ui.a;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class c extends com.applovin.impl.mediation.debugger.ui.a {
    private List<com.applovin.impl.mediation.debugger.a.a.a> a;
    private k b;
    private com.applovin.impl.mediation.debugger.ui.d.d c;
    private List<com.applovin.impl.mediation.debugger.ui.d.c> d;
    private ListView e;

    private List<com.applovin.impl.mediation.debugger.ui.d.c> a(List<com.applovin.impl.mediation.debugger.a.a.a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (com.applovin.impl.mediation.debugger.a.a.a aVar : list) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(aVar.a(), ViewCompat.MEASURED_STATE_MASK));
            spannableStringBuilder.append((CharSequence) new SpannedString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(aVar.c(), ViewCompat.MEASURED_STATE_MASK));
            arrayList.add(com.applovin.impl.mediation.debugger.ui.d.c.a(c.b.DETAIL).a(StringUtils.createSpannedString(aVar.b(), ViewCompat.MEASURED_STATE_MASK, 18, 1)).b(new SpannedString(spannableStringBuilder)).a(this).a(true).a());
        }
        return arrayList;
    }

    public void initialize(final List<com.applovin.impl.mediation.debugger.a.a.a> list, final k kVar) {
        this.a = list;
        this.b = kVar;
        this.d = a(list);
        com.applovin.impl.mediation.debugger.ui.d.d dVar = new com.applovin.impl.mediation.debugger.ui.d.d(this) { // from class: com.applovin.impl.mediation.debugger.ui.a.c.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected int a(int i) {
                return list.size();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected int b() {
                return 1;
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected com.applovin.impl.mediation.debugger.ui.d.c b(int i) {
                return new e("");
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected List<com.applovin.impl.mediation.debugger.ui.d.c> c(int i) {
                return c.this.d;
            }
        };
        this.c = dVar;
        dVar.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.a.c.2
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void a(final com.applovin.impl.mediation.debugger.ui.d.a aVar, com.applovin.impl.mediation.debugger.ui.d.c cVar) {
                c.this.startActivity(MaxDebuggerAdUnitDetailActivity.class, kVar.ad(), new a.InterfaceC0017a<MaxDebuggerAdUnitDetailActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.a.c.2.1
                    @Override // com.applovin.impl.mediation.debugger.ui.a.InterfaceC0017a
                    public void a(MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
                        maxDebuggerAdUnitDetailActivity.initialize((com.applovin.impl.mediation.debugger.a.a.a) list.get(aVar.b()), null, kVar);
                    }
                });
            }
        });
        this.c.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Ad Units");
        setContentView(R.layout.list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.e = listView;
        listView.setAdapter((ListAdapter) this.c);
    }
}
