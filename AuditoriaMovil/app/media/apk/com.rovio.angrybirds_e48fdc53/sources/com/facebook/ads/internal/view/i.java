package com.facebook.ads.internal.view;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.facebook.ads.internal.r.a;
import com.facebook.ads.internal.view.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class i extends RecyclerView.Adapter<b> {
    private final com.facebook.ads.internal.m.c a;
    private final com.facebook.ads.internal.q.a.s b;
    private final com.facebook.ads.internal.adapters.j c;
    private a.InterfaceC0118a d;
    private int e;
    private int f;
    private String g;
    private boolean h;
    private int i;
    private List<a> j;

    /* loaded from: classes2.dex */
    public static class a {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        private final int f;
        private final int g;
        private com.facebook.ads.internal.r.a h;
        private boolean i = false;

        public a(int i, int i2, String str, String str2, String str3, String str4, String str5) {
            this.f = i;
            this.g = i2;
            this.e = str;
            this.a = str2;
            this.b = str3;
            this.c = str4;
            this.d = str5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(final com.facebook.ads.internal.m.c cVar, final com.facebook.ads.internal.q.a.s sVar, final String str, h hVar) {
            if (this.i) {
                return;
            }
            if (this.h != null) {
                this.h.b();
                this.h = null;
            }
            this.h = new com.facebook.ads.internal.r.a(hVar, 10, new a.AbstractC0116a() { // from class: com.facebook.ads.internal.view.i.a.1
                @Override // com.facebook.ads.internal.r.a.AbstractC0116a
                public void a() {
                    if (!TextUtils.isEmpty(str)) {
                        Map<String, String> a = a.this.a();
                        if (a.this.h != null) {
                            a.this.h.a(a);
                        }
                        a.put("touch", com.facebook.ads.internal.q.a.j.a(sVar.e()));
                        cVar.a(str, a);
                    }
                    a.this.i = true;
                }
            });
            this.h.a(100);
            this.h.b(100);
            this.h.a();
        }

        public Map<String, String> a() {
            HashMap hashMap = new HashMap();
            hashMap.put("cardind", this.f + "");
            hashMap.put("cardcnt", this.g + "");
            return hashMap;
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends RecyclerView.ViewHolder {
        public h a;

        public b(h hVar) {
            super(hVar);
            this.a = hVar;
        }
    }

    public i(List<a> list, com.facebook.ads.internal.m.c cVar, com.facebook.ads.internal.q.a.s sVar, a.InterfaceC0118a interfaceC0118a, com.facebook.ads.internal.adapters.j jVar, String str, int i, int i2, int i3, boolean z) {
        this.a = cVar;
        this.b = sVar;
        this.d = interfaceC0118a;
        this.j = list;
        this.f = i;
        this.c = jVar;
        this.h = z;
        this.g = str;
        this.e = i3;
        this.i = i2;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: a */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(new h(viewGroup.getContext(), this.c, this.h, this.a, this.d, this.g));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: a */
    public void onBindViewHolder(b bVar, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.f, -2);
        marginLayoutParams.setMargins(i == 0 ? this.e : this.i, 0, i >= this.j.size() + (-1) ? this.e : this.i, 0);
        a aVar = this.j.get(i);
        bVar.a.setImageUrl(aVar.e);
        bVar.a.setLayoutParams(marginLayoutParams);
        bVar.a.a(aVar.a, aVar.b);
        bVar.a.a(aVar.c, aVar.d, aVar.a());
        aVar.a(this.a, this.b, this.g, bVar.a);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.j.size();
    }
}
