package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.b.c;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.h.n;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class c implements com.fyber.inneractive.sdk.a.a<IAConfigManager.a> {
    private boolean a = false;

    @Override // com.fyber.inneractive.sdk.a.a
    public final String a() {
        return "IALastModifiedFromHeader";
    }

    @Override // com.fyber.inneractive.sdk.a.a
    public final String b() {
        return "inneractive.config";
    }

    @Override // com.fyber.inneractive.sdk.a.a
    public final /* synthetic */ void a(IAConfigManager.a aVar) {
        IAConfigManager.a aVar2 = aVar;
        if (aVar2 == null || aVar2.a == null) {
            return;
        }
        com.fyber.inneractive.sdk.util.l.p().getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("cached.config.appid", aVar2.a).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fyber.inneractive.sdk.a.a
    /* renamed from: b */
    public IAConfigManager.a a(String str) throws Exception {
        com.fyber.inneractive.sdk.config.b.d dVar;
        try {
            IAConfigManager.g().a();
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("updateHash", null);
            if (TextUtils.isEmpty(optString)) {
                dVar = null;
            } else {
                dVar = new com.fyber.inneractive.sdk.config.b.d();
                dVar.c = optString;
                JSONObject optJSONObject = jSONObject.optJSONObject("app");
                int optInt = optJSONObject.optInt("id", -1);
                if (optJSONObject == null || optInt == -1) {
                    throw new InvalidAppIdException();
                }
                com.fyber.inneractive.sdk.config.b.a aVar = new com.fyber.inneractive.sdk.config.b.a();
                aVar.a = String.valueOf(optInt);
                aVar.b = optJSONObject.optString("publisherId", null);
                aVar.c = com.fyber.inneractive.sdk.config.b.e.a(optJSONObject.optJSONObject("monitor"));
                aVar.d = com.fyber.inneractive.sdk.config.b.i.a(optJSONObject.optJSONObject("video"));
                aVar.e = com.fyber.inneractive.sdk.config.b.b.a(optJSONObject.optJSONObject(ServerProtocol.DIALOG_PARAM_DISPLAY));
                aVar.f = com.fyber.inneractive.sdk.config.b.j.a(optJSONObject.optJSONObject("viewability"));
                aVar.h = optJSONObject.optString("isActive", null);
                aVar.g = com.fyber.inneractive.sdk.config.b.f.a(optJSONObject.optJSONObject(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE));
                dVar.a = aVar;
                dVar.b = com.fyber.inneractive.sdk.config.b.d.a(jSONObject);
            }
            String str2 = IAConfigManager.n.d;
            if (dVar == null || !str2.equals(dVar.a.a)) {
                IAlog.e("internal error while parsing local configuration", new Object[0]);
                if (dVar != null && !str2.equals(dVar.a.a)) {
                    throw new InvalidAppIdException();
                }
                a((Throwable) null, str);
                return null;
            }
            dVar.d = str;
            return a(dVar);
        } catch (Throwable th) {
            a(th, str);
            IAlog.e("Exception Error while parsing local configuration", new Object[0]);
            throw th;
        }
    }

    private void a(Throwable th, String str) {
        String str2;
        String str3;
        String str4;
        if (this.a) {
            return;
        }
        this.a = true;
        if (TextUtils.isEmpty(str)) {
            str2 = "Empty Json Data";
        } else {
            str2 = str.substring(0, str.length() > 501 ? 500 : str.length() - 1);
        }
        if (th != null) {
            str3 = th.getClass().getName();
            str4 = th.getLocalizedMessage();
        } else {
            str3 = "Bad remote configuration";
            str4 = "Internal error";
        }
        String str5 = IAConfigManager.n.d;
        n.a aVar = new n.a(com.fyber.inneractive.sdk.h.l.FATAL_CONFIGURATION_ERROR);
        Object[] objArr = new Object[8];
        objArr[0] = "exception";
        if (str3 == null) {
            str3 = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
        objArr[1] = str3;
        objArr[2] = "message";
        if (str4 == null) {
            str4 = "No message";
        }
        objArr[3] = str4;
        objArr[4] = "data";
        objArr[5] = str2;
        objArr[6] = "appId";
        if (TextUtils.isEmpty(str5)) {
            str5 = "EMPTY_APP_ID";
        }
        objArr[7] = str5;
        aVar.a(objArr).b(null);
    }

    @Override // com.fyber.inneractive.sdk.a.a
    public final boolean d() {
        String string = com.fyber.inneractive.sdk.util.l.p().getSharedPreferences("IAConfigurationPreferences", 0).getString("cached.config.appid", null);
        return string != null && string.equalsIgnoreCase(IAConfigManager.p());
    }

    private static IAConfigManager.a a(com.fyber.inneractive.sdk.config.b.d dVar) {
        boolean z;
        IAConfigManager.a aVar;
        Iterator<com.fyber.inneractive.sdk.config.b.g> it;
        Iterator<com.fyber.inneractive.sdk.config.b.h> it2;
        Map<String, s> map;
        char c;
        Set<Vendor> set;
        char c2;
        Set<Vendor> set2;
        int i;
        TapAction tapAction;
        String b;
        com.fyber.inneractive.sdk.config.b.d dVar2 = dVar;
        IAConfigManager.a aVar2 = new IAConfigManager.a();
        aVar2.c = dVar2.c;
        aVar2.b = dVar2.a.b;
        aVar2.d = dVar2.d;
        aVar2.a = dVar2.a.a;
        Iterator<com.fyber.inneractive.sdk.config.b.g> it3 = dVar2.b.iterator();
        while (it3.hasNext()) {
            com.fyber.inneractive.sdk.config.b.g next = it3.next();
            Map<String, s> map2 = aVar2.e;
            String str = next.a;
            com.fyber.inneractive.sdk.config.b.a aVar3 = dVar2.a;
            Map<String, t> map3 = aVar2.f;
            IAConfigManager.c cVar = aVar2.g;
            s sVar = new s();
            sVar.a = next.a;
            int i2 = 2;
            c.a[] aVarArr = {aVar3, next};
            int i3 = 0;
            while (true) {
                if (i3 < i2) {
                    c.a aVar4 = aVarArr[i3];
                    if (aVar4 != null && (b = aVar4.b()) != null && b.equals("false")) {
                        z = false;
                        break;
                    }
                    i3++;
                    i2 = 2;
                } else {
                    z = true;
                    break;
                }
            }
            sVar.c = z;
            Iterator<com.fyber.inneractive.sdk.config.b.h> it4 = next.h.iterator();
            while (it4.hasNext()) {
                com.fyber.inneractive.sdk.config.b.h next2 = it4.next();
                t tVar = new t();
                if (next2.a != null && next2.b != null) {
                    tVar.a = next2.a;
                    tVar.b = next2.b;
                    if (next2.e != null) {
                        r rVar = new r();
                        if (next2.e.a == UnitDisplayType.DEFAULT) {
                            rVar.a = next2.e.a;
                            tVar.e = rVar;
                        }
                    }
                    if (next2.c != null) {
                        com.fyber.inneractive.sdk.config.b.b bVar = next2.c;
                        com.fyber.inneractive.sdk.config.b.b bVar2 = next.c;
                        com.fyber.inneractive.sdk.config.b.b bVar3 = aVar3.e;
                        n nVar = new n();
                        it = it3;
                        it2 = it4;
                        if (bVar.a == UnitDisplayType.BANNER || bVar.a == UnitDisplayType.MRECT || bVar.a.isFullscreenUnit()) {
                            nVar.b = bVar.a;
                            Object[] objArr = new Object[3];
                            objArr[0] = bVar.c;
                            objArr[1] = bVar2 != null ? bVar2.c : null;
                            objArr[2] = bVar3 != null ? bVar3.c : null;
                            Integer num = (Integer) a((Object) null, objArr);
                            aVar = aVar2;
                            if (num != null && num.intValue() >= 5 && num.intValue() <= 60) {
                                nVar.a = num;
                            }
                            Object[] objArr2 = new Object[3];
                            objArr2[0] = bVar.b;
                            objArr2[1] = bVar2 != null ? bVar2.b : null;
                            objArr2[2] = bVar3 != null ? bVar3.b : null;
                            nVar.a(((Boolean) a((Object) true, objArr2)).booleanValue());
                            Object[] objArr3 = new Object[3];
                            objArr3[0] = bVar.d;
                            objArr3[1] = bVar2 != null ? bVar2.d : null;
                            objArr3[2] = bVar3 != null ? bVar3.d : null;
                            Integer num2 = (Integer) a((Object) null, objArr3);
                            if (num2 != null && num2.intValue() >= 5 && num2.intValue() <= 60) {
                                nVar.d = num2;
                            }
                            if (nVar.d == null && !nVar.c.booleanValue() && (bVar.a == UnitDisplayType.INTERSTITIAL || bVar.a == UnitDisplayType.REWARDED)) {
                                nVar.a(true);
                            }
                            tVar.c = nVar;
                        } else {
                            it3 = it;
                            it4 = it2;
                        }
                    } else {
                        aVar = aVar2;
                        it = it3;
                        it2 = it4;
                    }
                    if (next2.f != null) {
                        if (next2.f.j == UnitDisplayType.REWARDED && next2.c == null) {
                            tVar.c = new n();
                            tVar.c.a(false);
                            tVar.c.d = -1;
                            tVar.c.b = UnitDisplayType.REWARDED;
                            tVar.c.a = -1;
                        }
                        v vVar = new v();
                        com.fyber.inneractive.sdk.config.b.i iVar = next2.f;
                        com.fyber.inneractive.sdk.config.b.i iVar2 = next.f;
                        com.fyber.inneractive.sdk.config.b.i iVar3 = aVar3.d;
                        if (iVar.j == UnitDisplayType.LANDSCAPE || iVar.j == UnitDisplayType.SQUARE || iVar.j == UnitDisplayType.INTERSTITIAL || iVar.j == UnitDisplayType.VERTICAL || iVar.j == UnitDisplayType.REWARDED || iVar.j == UnitDisplayType.MRECT) {
                            vVar.j = iVar.j;
                        } else {
                            if (tVar.e != null) {
                                vVar.j = UnitDisplayType.INTERSTITIAL;
                            }
                            it3 = it;
                            it4 = it2;
                            aVar2 = aVar;
                        }
                        Object[] objArr4 = new Object[3];
                        objArr4[0] = iVar.a;
                        objArr4[1] = iVar2 != null ? iVar2.a : null;
                        objArr4[2] = iVar3 != null ? iVar3.a : null;
                        Object a = a((Object) null, objArr4);
                        if (a != null) {
                            vVar.a = (Boolean) a;
                            Object[] objArr5 = new Object[3];
                            objArr5[0] = iVar.b;
                            objArr5[1] = iVar2 != null ? iVar2.b : null;
                            objArr5[2] = iVar3 != null ? iVar3.b : null;
                            vVar.b = (Integer) a((Object) 5000, objArr5);
                            map = map2;
                            Object[] objArr6 = new Object[3];
                            objArr6[0] = iVar.c;
                            objArr6[1] = iVar2 != null ? iVar2.c : null;
                            objArr6[2] = iVar3 != null ? iVar3.c : null;
                            Integer num3 = (Integer) a((Object) 0, objArr6);
                            vVar.c = Integer.valueOf(num3.intValue() < 0 ? 0 : num3.intValue());
                            Object[] objArr7 = new Object[3];
                            objArr7[0] = iVar.e;
                            objArr7[1] = iVar2 != null ? iVar2.e : null;
                            objArr7[2] = iVar3 != null ? iVar3.e : null;
                            vVar.d = (Boolean) a((Object) true, objArr7);
                            Orientation orientation = Orientation.USER;
                            Object[] objArr8 = new Object[3];
                            objArr8[0] = iVar.g;
                            objArr8[1] = iVar2 != null ? iVar2.g : null;
                            objArr8[2] = iVar3 != null ? iVar3.g : null;
                            vVar.e = (Orientation) a(orientation, objArr8);
                            Object[] objArr9 = new Object[3];
                            objArr9[0] = iVar.i;
                            objArr9[1] = iVar2 != null ? iVar2.i : null;
                            objArr9[2] = iVar3 != null ? iVar3.i : null;
                            Integer num4 = (Integer) a((Object) 0, objArr9);
                            vVar.f = Integer.valueOf(num4.intValue() < 0 ? 0 : num4.intValue());
                            Object[] objArr10 = new Object[3];
                            objArr10[0] = iVar.h;
                            objArr10[1] = iVar2 != null ? iVar2.h : null;
                            objArr10[2] = iVar3 != null ? iVar3.h : null;
                            Integer num5 = (Integer) a((Object) 2048, objArr10);
                            if (num5.intValue() > vVar.b.intValue()) {
                                num5 = vVar.b;
                            }
                            vVar.g = num5;
                            Skip skip = Skip._0;
                            Object[] objArr11 = new Object[3];
                            objArr11[0] = iVar.d;
                            objArr11[1] = iVar2 != null ? iVar2.d : null;
                            objArr11[2] = iVar3 != null ? iVar3.d : null;
                            vVar.h = (Skip) a(skip, objArr11);
                            TapAction tapAction2 = TapAction.DO_NOTHING;
                            Object[] objArr12 = new Object[3];
                            objArr12[0] = iVar.f;
                            if (iVar2 != null) {
                                tapAction = iVar2.f;
                                i = 1;
                            } else {
                                i = 1;
                                tapAction = null;
                            }
                            objArr12[i] = tapAction;
                            objArr12[2] = iVar3 != null ? iVar3.f : null;
                            vVar.i = (TapAction) a(tapAction2, objArr12);
                            ArrayList arrayList = new ArrayList();
                            c.b[] bVarArr = new c.b[i];
                            bVarArr[0] = next2;
                            vVar.a(arrayList, bVarArr);
                            tVar.f = vVar;
                        }
                        it3 = it;
                        it4 = it2;
                        aVar2 = aVar;
                    } else {
                        map = map2;
                    }
                    q qVar = new q();
                    HashSet hashSet = new HashSet();
                    Object[] objArr13 = new Object[3];
                    objArr13[0] = next2.d != null ? next2.d.a : null;
                    objArr13[1] = next.d != null ? next.d.a : null;
                    objArr13[2] = aVar3.c != null ? aVar3.c.a : null;
                    qVar.a = (Set) a(hashSet, objArr13);
                    tVar.d = qVar;
                    x xVar = new x();
                    com.fyber.inneractive.sdk.config.b.j jVar = next2.g;
                    com.fyber.inneractive.sdk.config.b.j jVar2 = next.g;
                    com.fyber.inneractive.sdk.config.b.j jVar3 = aVar3.f;
                    Object[] objArr14 = new Object[3];
                    objArr14[0] = jVar != null ? jVar.a : null;
                    objArr14[1] = jVar2 != null ? jVar2.a : null;
                    objArr14[2] = jVar3 != null ? jVar3.a : null;
                    Integer num6 = (Integer) a((Object) 1, objArr14);
                    if (num6.intValue() > 0 || num6.intValue() <= 100) {
                        xVar.a = num6;
                    } else {
                        xVar.a = 1;
                    }
                    Object[] objArr15 = new Object[3];
                    objArr15[0] = jVar != null ? jVar.b : null;
                    objArr15[1] = jVar2 != null ? jVar2.b : null;
                    objArr15[2] = jVar3 != null ? jVar3.b : null;
                    Integer num7 = (Integer) a((Object) 0, objArr15);
                    if (num7.intValue() >= 0 || num7.intValue() <= 100) {
                        xVar.b = num7;
                    } else {
                        xVar.b = 0;
                    }
                    HashSet hashSet2 = new HashSet();
                    Object[] objArr16 = new Object[3];
                    objArr16[0] = jVar != null ? jVar.c : null;
                    if (jVar2 != null) {
                        set = jVar2.c;
                        c = 1;
                    } else {
                        c = 1;
                        set = null;
                    }
                    objArr16[c] = set;
                    if (jVar3 != null) {
                        set2 = jVar3.c;
                        c2 = 2;
                    } else {
                        c2 = 2;
                        set2 = null;
                    }
                    objArr16[c2] = set2;
                    xVar.c = (Set) a(hashSet2, objArr16);
                    tVar.g = xVar;
                    if (cVar != null) {
                        cVar.a(xVar.c);
                    }
                    sVar.b.add(tVar);
                    map3.put(tVar.a, tVar);
                    it3 = it;
                    it4 = it2;
                    map2 = map;
                    aVar2 = aVar;
                }
            }
            map2.put(str, sVar);
            dVar2 = dVar;
        }
        return aVar2;
    }

    private static Object a(Object obj, Object... objArr) {
        for (int i = 0; i < 3; i++) {
            Object obj2 = objArr[i];
            if (obj2 != null) {
                return obj2;
            }
        }
        return obj;
    }

    @Override // com.fyber.inneractive.sdk.a.a
    public final String c() {
        String str = IAConfigManager.n.d;
        StringBuilder sb = new StringBuilder("https://");
        String g = f.g();
        if (TextUtils.isEmpty(g)) {
            sb.append("cdn2.inner-active.mobi/ia-sdk-config/apps/");
        } else {
            sb.append(g);
        }
        sb.append(str);
        sb.append('/');
        sb.append(str);
        sb.append(".json");
        String sb2 = sb.toString();
        IAlog.a(IAlog.b, "%s: %s", "APP_CONFIG_REQUEST", sb2);
        return sb2;
    }
}
