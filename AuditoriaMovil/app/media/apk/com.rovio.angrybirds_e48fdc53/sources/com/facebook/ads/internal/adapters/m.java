package com.facebook.ads.internal.adapters;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAdActivity;
import com.facebook.ads.internal.settings.a;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import java.util.EnumSet;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes2.dex */
public class m extends InterstitialAdapter {
    private static final ConcurrentMap<String, com.facebook.ads.internal.view.a> a = new ConcurrentHashMap();
    private String c;
    private long d;
    private Context e;
    private w f;
    private InterstitialAdapterListener g;
    private r i;
    private v k;
    private a.EnumC0117a l;
    private final String b = UUID.randomUUID().toString();
    private boolean h = false;
    private a j = a.UNSPECIFIED;

    /* renamed from: com.facebook.ads.internal.adapters.m$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass1 implements com.facebook.ads.a.a {
        final /* synthetic */ n a;

        AnonymousClass1(n nVar) {
            this.a = nVar;
        }

        @Override // com.facebook.ads.a.a
        public void a(u uVar) {
            m.this.h = true;
            if (m.this.g == null) {
                return;
            }
            m.this.g.onInterstitialAdLoaded(m.this);
        }

        @Override // com.facebook.ads.a.a
        public void a(u uVar, View view) {
            m.this.j = this.a.k();
            m.b(m.this.b, this.a);
        }

        @Override // com.facebook.ads.a.a
        public void a(u uVar, AdError adError) {
            this.a.l();
            m.this.g.onInterstitialError(m.this, adError);
        }

        @Override // com.facebook.ads.a.a
        public void b(u uVar) {
            m.this.g.onInterstitialAdClicked(m.this, "", true);
        }

        @Override // com.facebook.ads.a.a
        public void c(u uVar) {
            m.this.g.onInterstitialLoggingImpression(m.this);
        }

        @Override // com.facebook.ads.a.a
        public void d(u uVar) {
        }
    }

    /* renamed from: com.facebook.ads.internal.adapters.m$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass2 implements com.facebook.ads.internal.d.a {
        AnonymousClass2() {
        }

        private void c() {
            m.this.h = true;
            m.this.g.onInterstitialAdLoaded(m.this);
        }

        @Override // com.facebook.ads.internal.d.a
        public void a() {
            c();
        }

        @Override // com.facebook.ads.internal.d.a
        public void b() {
            c();
        }
    }

    /* renamed from: com.facebook.ads.internal.adapters.m$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass3 implements com.facebook.ads.internal.d.a {
        final /* synthetic */ EnumSet a;
        final /* synthetic */ Context b;
        final /* synthetic */ com.facebook.ads.internal.m.c c;
        final /* synthetic */ com.facebook.ads.internal.d.b d;

        AnonymousClass3(EnumSet enumSet, Context context, com.facebook.ads.internal.m.c cVar, com.facebook.ads.internal.d.b bVar) {
            this.a = enumSet;
            this.b = context;
            this.c = cVar;
            this.d = bVar;
        }

        private void a(boolean z) {
            m.b(m.this.b, new com.facebook.ads.internal.view.l(this.b, this.c, m.this.k, z ? this.d : null));
            m.this.h = true;
            m.this.g.onInterstitialAdLoaded(m.this);
        }

        @Override // com.facebook.ads.internal.d.a
        public void a() {
            a(this.a.contains(CacheFlag.VIDEO));
        }

        @Override // com.facebook.ads.internal.d.a
        public void b() {
            a(false);
        }
    }

    /* renamed from: com.facebook.ads.internal.adapters.m$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass4 implements com.facebook.ads.internal.d.a {
        final /* synthetic */ Context a;
        final /* synthetic */ com.facebook.ads.internal.m.c b;

        AnonymousClass4(Context context, com.facebook.ads.internal.m.c cVar) {
            this.a = context;
            this.b = cVar;
        }

        private void c() {
            m.b(m.this.b, new com.facebook.ads.internal.view.k(this.a, m.this.k, this.b));
            m.this.h = true;
            m.this.g.onInterstitialAdLoaded(m.this);
        }

        @Override // com.facebook.ads.internal.d.a
        public void a() {
            c();
        }

        @Override // com.facebook.ads.internal.d.a
        public void b() {
            c();
        }
    }

    /* loaded from: classes2.dex */
    public enum a {
        UNSPECIFIED,
        VERTICAL,
        HORIZONTAL;

        public static a a(int i) {
            return i == 0 ? UNSPECIFIED : i == 2 ? HORIZONTAL : VERTICAL;
        }
    }

    private int a() {
        int rotation = ((WindowManager) this.e.getSystemService("window")).getDefaultDisplay().getRotation();
        if (this.j == a.UNSPECIFIED) {
            return -1;
        }
        if (this.j == a.HORIZONTAL) {
            switch (rotation) {
                case 2:
                case 3:
                    return 8;
                default:
                    return 0;
            }
        }
        switch (rotation) {
            case 2:
                return 9;
            default:
                return 1;
        }
    }

    public static com.facebook.ads.internal.view.a a(String str) {
        return a.get(str);
    }

    public static void a(com.facebook.ads.internal.view.a aVar) {
        for (Map.Entry<String, com.facebook.ads.internal.view.a> entry : a.entrySet()) {
            if (entry.getValue() == aVar) {
                a.remove(entry.getKey());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, com.facebook.ads.internal.view.a aVar) {
        a.put(str, aVar);
    }

    @Override // com.facebook.ads.internal.adapters.InterstitialAdapter
    public void loadInterstitialAd(Context context, InterstitialAdapterListener interstitialAdapterListener, Map<String, Object> map, com.facebook.ads.internal.m.c cVar, EnumSet<CacheFlag> enumSet) {
    }

    @Override // com.facebook.ads.internal.adapters.AdAdapter
    public void onDestroy() {
        if (this.f != null) {
            this.f.b();
        }
    }

    @Override // com.facebook.ads.internal.adapters.InterstitialAdapter
    public boolean show() {
        if (!this.h) {
            if (this.g != null) {
                this.g.onInterstitialError(this, AdError.INTERNAL_ERROR);
            }
            return false;
        }
        Intent intent = new Intent(this.e, AudienceNetworkActivity.class);
        intent.putExtra(AudienceNetworkActivity.PREDEFINED_ORIENTATION_KEY, a());
        intent.putExtra(AudienceNetworkActivity.AUDIENCE_NETWORK_UNIQUE_ID_EXTRA, this.b);
        intent.putExtra(AudienceNetworkActivity.PLACEMENT_ID, this.c);
        intent.putExtra(AudienceNetworkActivity.REQUEST_TIME, this.d);
        intent.putExtra(AudienceNetworkActivity.VIEW_TYPE, this.l);
        if (this.k != null) {
            intent.putExtra("ad_data_bundle", this.k);
        } else if (this.i != null) {
            this.i.a(intent);
        }
        intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        try {
            this.e.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            intent.setClass(this.e, InterstitialAdActivity.class);
            this.e.startActivity(intent);
        }
        return true;
    }
}
