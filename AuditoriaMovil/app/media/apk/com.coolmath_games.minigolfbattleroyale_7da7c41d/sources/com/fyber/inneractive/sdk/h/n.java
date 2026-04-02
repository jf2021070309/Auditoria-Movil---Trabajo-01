package com.fyber.inneractive.sdk.h;

import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AppsFlyerProperties;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Track;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class n extends h {
    /* synthetic */ n(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7, byte b2) {
        this(str, str2, str3, l, str4, str5, str6, str7);
    }

    @Override // com.fyber.inneractive.sdk.h.h
    public final /* bridge */ /* synthetic */ String a() {
        return super.a();
    }

    @Override // com.fyber.inneractive.sdk.h.h
    public final /* bridge */ /* synthetic */ void a(String str) {
        super.a(str);
    }

    @Override // com.fyber.inneractive.sdk.h.h
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.fyber.inneractive.sdk.h.h
    public final /* bridge */ /* synthetic */ String c() {
        return super.c();
    }

    private n(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7) {
        super(com.fyber.inneractive.sdk.config.a.a());
        a("osn", "Android");
        a("osv", Build.VERSION.RELEASE);
        a("model", com.fyber.inneractive.sdk.util.k.e());
        a("sdkv", str7 == null ? "7.8.4" : str7);
        a("pkgn", com.fyber.inneractive.sdk.util.k.f());
        a("pkgv", com.fyber.inneractive.sdk.util.k.g());
        a(AppsFlyerProperties.APP_ID, str);
        a("session", str2);
        a("adnt", str3);
        a("anid", l);
        a("creative_id", str4);
        a("adomain", str5);
        a("campaign_id", str6);
    }

    /* loaded from: classes.dex */
    public static class a {
        private static final SimpleDateFormat h = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        InneractiveAdRequest a;
        l b;
        m c;
        JSONArray d;
        com.fyber.inneractive.sdk.j.e e;
        JSONArray f;
        boolean g;

        public a(l lVar) {
            this(lVar, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.j.e) null, (JSONArray) null);
        }

        public a(m mVar) {
            this(mVar, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.j.e) null, (JSONArray) null);
        }

        public a(l lVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.j.e eVar) {
            this(lVar, inneractiveAdRequest, eVar, (JSONArray) null);
        }

        public a(l lVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.j.e eVar, JSONArray jSONArray) {
            this(eVar);
            this.b = lVar;
            this.a = inneractiveAdRequest;
            this.d = jSONArray;
        }

        public a(m mVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.j.e eVar) {
            this(mVar, inneractiveAdRequest, eVar, (JSONArray) null);
        }

        public a(m mVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.j.e eVar, JSONArray jSONArray) {
            this(eVar);
            this.c = mVar;
            this.a = inneractiveAdRequest;
            this.d = jSONArray;
        }

        private a(com.fyber.inneractive.sdk.j.e eVar) {
            this.g = false;
            this.e = eVar;
            this.f = new JSONArray();
        }

        public final a a(b bVar) {
            this.f.put(bVar.a);
            return this;
        }

        public final a a(String str) {
            try {
                this.f.put(new JSONObject(str));
            } catch (Exception unused) {
            }
            return this;
        }

        public final a a(Object... objArr) {
            if (objArr.length > 0) {
                b bVar = new b();
                for (int i = 0; i < objArr.length - 1; i += 2) {
                    bVar.a(objArr[i].toString(), objArr[i + 1]);
                }
                a(bVar);
            }
            return this;
        }

        public final void b(String str) {
            Long l;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            com.fyber.inneractive.sdk.j.e eVar = this.e;
            if (eVar != null) {
                String impressionId = eVar.v != null ? eVar.v.getImpressionId() : null;
                com.fyber.inneractive.sdk.j.e eVar2 = this.e;
                String demandSource = eVar2.v != null ? eVar2.v.getDemandSource() : null;
                Long b = this.e.b();
                com.fyber.inneractive.sdk.j.e eVar3 = this.e;
                String creativeId = eVar3.v != null ? eVar3.v.getCreativeId() : null;
                String c = this.e.c();
                com.fyber.inneractive.sdk.j.e eVar4 = this.e;
                str2 = impressionId;
                str3 = demandSource;
                l = b;
                str4 = creativeId;
                str5 = c;
                str6 = eVar4.v != null ? eVar4.v.getCampaignId() : null;
            } else {
                l = null;
                str2 = "";
                str3 = str2;
                str4 = str3;
                str5 = str4;
                str6 = str5;
            }
            final n nVar = new n(IAConfigManager.n.d, str2, str3, l, str4, str5, str6, str, (byte) 0);
            InneractiveAdRequest inneractiveAdRequest = this.a;
            com.fyber.inneractive.sdk.config.u selectedUnitConfig = inneractiveAdRequest == null ? null : inneractiveAdRequest.getSelectedUnitConfig();
            if (selectedUnitConfig != null) {
                com.fyber.inneractive.sdk.config.q c2 = selectedUnitConfig.c();
                if (!(c2.a == null ? false : c2.a.contains(Track.ERRORS)) || selectedUnitConfig.f()) {
                    return;
                }
            }
            com.fyber.inneractive.sdk.j.e eVar5 = this.e;
            String str7 = eVar5 == null ? "" : eVar5.e;
            String str8 = TextUtils.isEmpty(IAConfigManager.n.m) ? "" : IAConfigManager.n.m;
            if (this.b == null && this.c == null) {
                IAlog.b("Sdk event dispatcher - error id or event id must be provided", new Object[0]);
                return;
            }
            InneractiveAdRequest inneractiveAdRequest2 = this.a;
            String spotId = inneractiveAdRequest2 == null ? null : inneractiveAdRequest2.getSpotId();
            StringBuilder sb = new StringBuilder();
            InneractiveAdRequest inneractiveAdRequest3 = this.a;
            if (inneractiveAdRequest3 != null && !TextUtils.isEmpty(inneractiveAdRequest3.getMediationName())) {
                sb.append(this.a.getMediationName());
                sb.append("_");
            }
            com.fyber.inneractive.sdk.j.e eVar6 = this.e;
            UnitDisplayType unitDisplayType = eVar6 != null ? eVar6.r : null;
            sb.append(unitDisplayType != null ? unitDisplayType.toString() : "unknown");
            final String sb2 = sb.toString();
            com.fyber.inneractive.sdk.j.e eVar7 = this.e;
            String valueOf = eVar7 == null ? "" : Integer.valueOf(eVar7.i);
            com.fyber.inneractive.sdk.j.e eVar8 = this.e;
            final String str9 = str7;
            final String str10 = str8;
            final String str11 = spotId;
            final Integer num = valueOf;
            final String str12 = eVar8 == null ? "" : eVar8.j;
            com.fyber.inneractive.sdk.util.m.a(new Runnable() { // from class: com.fyber.inneractive.sdk.h.n.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    String str13;
                    String valueOf2;
                    nVar.a("contentid", str9);
                    nVar.a("fairbidv", str10);
                    if (a.this.b != null) {
                        nVar.a(NotificationCompat.CATEGORY_ERROR, Integer.valueOf(a.this.b.N));
                        l lVar = a.this.b;
                        str13 = l.a();
                        IAlog.b("Event dispatcher - dispatching error: %s", a.this.b);
                        IAlog.a(IAlog.b, "%s %s", "DISPATCHED_SDK_ERROR", Integer.valueOf(a.this.b.N));
                    } else if (a.this.c != null) {
                        nVar.a(NotificationCompat.CATEGORY_EVENT, Integer.valueOf(a.this.c.v));
                        m mVar = a.this.c;
                        str13 = m.a();
                        IAlog.b("Event dispatcher - dispatching event: %s", a.this.c);
                        IAlog.a(IAlog.b, "%s %s", "DISPATCHED_SDK_EVENT", Integer.valueOf(a.this.c.v));
                    } else {
                        str13 = null;
                    }
                    if (!TextUtils.isEmpty(sb2)) {
                        nVar.a("placement_type", sb2);
                    }
                    if (!TextUtils.isEmpty(str11)) {
                        nVar.a("spot_id", str11);
                    }
                    nVar.a("ciso", com.fyber.inneractive.sdk.util.k.h());
                    nVar.a("ad_type", num);
                    if (a.this.g && !TextUtils.isEmpty(str12)) {
                        nVar.a(str12);
                    }
                    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                    nVar.a("n", com.fyber.inneractive.sdk.util.ac.a().f);
                    nVar.a("date_created", Long.valueOf(calendar.getTimeInMillis()));
                    nVar.a("day", a.h.format(calendar.getTime()));
                    nVar.a("hour", Integer.valueOf(calendar.get(11)));
                    n nVar2 = nVar;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str13);
                    if (a.this.b != null) {
                        valueOf2 = String.valueOf(a.this.b.N);
                    } else {
                        valueOf2 = String.valueOf(a.this.c.v);
                    }
                    sb3.append(valueOf2);
                    nVar2.a("table", sb3.toString());
                    if (a.this.d == null) {
                        a.this.d = new JSONArray();
                    }
                    nVar.a("experiments", a.this.d);
                    if (a.this.f != null && a.this.f.length() > 0) {
                        nVar.a("extra", a.this.f);
                    }
                    nVar.b();
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        JSONObject a = new JSONObject();

        public final b a(String str, Object obj) {
            try {
                this.a.put(str, obj);
            } catch (Exception unused) {
                IAlog.d("Got exception adding param to json object: %s, %s", str, obj);
            }
            return this;
        }
    }

    @Override // com.fyber.inneractive.sdk.h.h
    public final boolean d() {
        return (TextUtils.isEmpty(super.a()) || this.a == null || this.a.size() == 0) ? false : true;
    }
}
