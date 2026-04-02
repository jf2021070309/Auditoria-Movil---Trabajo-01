package com.kwad.sdk.core.config;

import android.content.Context;
import android.text.TextUtils;
import com.ksad.annotation.invoker.ForInvoker;
import com.kwad.sdk.components.DevelopMangerComponents;
import com.kwad.sdk.core.config.item.e;
import com.kwad.sdk.core.config.item.f;
import com.kwad.sdk.core.config.item.k;
import com.kwad.sdk.core.config.item.m;
import com.kwad.sdk.core.config.item.p;
import com.kwad.sdk.core.response.model.SdkConfigData;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.aw;
import com.kwad.sdk.utils.g;
import com.kwad.sdk.utils.y;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d {
    private static final AtomicBoolean amF = new AtomicBoolean(false);
    private static volatile SdkConfigData amG;

    public static boolean Q(long j) {
        return (j & c.akI.getValue().longValue()) != 0;
    }

    public static double a(f fVar) {
        Double d = (Double) b(fVar);
        if (d == null) {
            d = fVar.zY();
        }
        return d.doubleValue();
    }

    public static int a(k kVar) {
        Integer num = (Integer) b((com.kwad.sdk.core.config.item.b<Object>) kVar);
        if (num == null) {
            num = kVar.zY();
        }
        return num.intValue();
    }

    public static long a(m mVar) {
        Long l = (Long) b(mVar);
        if (l == null) {
            l = mVar.zY();
        }
        return l.longValue();
    }

    public static String a(p pVar) {
        String str = (String) b(pVar);
        return str != null ? str : pVar.zY();
    }

    public static JSONObject a(e eVar) {
        JSONObject jSONObject = (JSONObject) b(eVar);
        return jSONObject != null ? jSONObject : eVar.zY();
    }

    public static boolean a(com.kwad.sdk.core.config.item.d dVar) {
        Boolean bool = (Boolean) b(dVar);
        if (bool == null) {
            bool = dVar.zY();
        }
        return bool.booleanValue();
    }

    public static synchronized void aS(Context context) {
        synchronized (d.class) {
            AtomicBoolean atomicBoolean = amF;
            if (atomicBoolean.get()) {
                return;
            }
            com.kwad.sdk.core.e.c.d("SdkConfigManager", "loadCache");
            c.init();
            yX();
            b.aR(context);
            zv();
            atomicBoolean.set(true);
        }
    }

    public static <T> T b(com.kwad.sdk.core.config.item.b<T> bVar) {
        if (!isLoaded()) {
            final Context HA = ServiceProvider.HA();
            b.a(HA, bVar);
            g.execute(new aw() { // from class: com.kwad.sdk.core.config.d.1
                @Override // com.kwad.sdk.utils.aw
                public final void doTask() {
                    d.aS(HA);
                }
            });
        }
        T value = bVar.getValue();
        return value != null ? value : bVar.zY();
    }

    public static boolean b(k kVar) {
        Integer num = (Integer) b((com.kwad.sdk.core.config.item.b<Object>) kVar);
        return num != null ? num.intValue() > 0 : kVar.zY().intValue() > 0;
    }

    public static void c(SdkConfigData sdkConfigData) {
        synchronized (d.class) {
            amG = sdkConfigData;
        }
    }

    public static boolean gH() {
        return c.alV.getValue().booleanValue();
    }

    public static String getLogObiwanData() {
        return c.ama.getValue();
    }

    public static String getUserAgent() {
        return c.alJ.getValue();
    }

    public static boolean isLoaded() {
        return amF.get();
    }

    public static boolean vN() {
        return c.ams.getValue().booleanValue();
    }

    public static boolean xA() {
        return c.alI.getValue().intValue() == 1;
    }

    public static boolean xB() {
        return c.alK.getValue().intValue() == 1;
    }

    public static boolean xD() {
        return c.ame.getValue().booleanValue();
    }

    public static boolean xE() {
        return c.amf.getValue().booleanValue();
    }

    public static int xF() {
        if (amG != null) {
            return amG.goodIdcThresholdMs;
        }
        return 200;
    }

    public static int xG() {
        return c.amh.getValue().intValue();
    }

    public static double xH() {
        return c.alR.getValue().floatValue();
    }

    public static boolean xI() {
        return c.amv.getValue().booleanValue();
    }

    public static boolean xM() {
        return c.amE.getValue().booleanValue();
    }

    public static int xq() {
        return c.akr.getValue().intValue();
    }

    public static boolean xr() {
        return false;
    }

    public static boolean xs() {
        com.kwad.sdk.components.c.f(DevelopMangerComponents.class);
        return c.akv.getValue().intValue() == 1;
    }

    public static boolean xt() {
        return c.ali.getValue().intValue() == 1;
    }

    public static boolean xu() {
        return c.alk.getValue().intValue() == 1;
    }

    public static boolean xv() {
        return c.alj.getValue().intValue() == 1;
    }

    public static boolean xw() {
        return c.alh.getValue().intValue() == 1;
    }

    public static String xx() {
        return c.alv.getImei();
    }

    public static String xy() {
        return c.alv.getOaid();
    }

    public static List<String> xz() {
        return c.akQ.getValue();
    }

    public static boolean yU() {
        return c.akz.getValue().intValue() == 1;
    }

    public static int yV() {
        return c.akA.getValue().intValue();
    }

    public static boolean yW() {
        return c.akC.getValue().intValue() == 1;
    }

    @ForInvoker(methodId = "initConfigList")
    private static void yX() {
        com.kwad.components.ad.d.a.init();
        com.kwad.components.ad.feed.a.a.init();
        com.kwad.components.ad.fullscreen.a.a.init();
        com.kwad.components.ad.interstitial.a.a.init();
        com.kwad.components.ad.reward.a.a.init();
        com.kwad.components.ad.splashscreen.b.a.init();
    }

    public static List<String> yY() {
        return c.akS.getValue();
    }

    public static String yZ() {
        return c.akP.getValue();
    }

    public static boolean zA() {
        return c.amd.getValue().intValue() == 1;
    }

    public static int zB() {
        return c.akF.getValue().intValue();
    }

    public static int zC() {
        return c.alM.getValue().intValue();
    }

    public static int zD() {
        return c.alL.getValue().intValue();
    }

    public static boolean zE() {
        return c.alN.getValue().intValue() == 1;
    }

    public static boolean zF() {
        return c.alO.getValue().booleanValue();
    }

    public static float zG() {
        float floatValue = c.alP.getValue().floatValue();
        if (floatValue <= 0.0f || floatValue > 1.0f) {
            return 0.3f;
        }
        return floatValue;
    }

    public static float zH() {
        return c.alQ.getValue().floatValue();
    }

    public static boolean zI() {
        return c.alS.getValue().booleanValue();
    }

    public static boolean zJ() {
        return c.alW.getValue().intValue() > 0;
    }

    public static boolean zK() {
        return c.amc.getValue().intValue() == 1;
    }

    public static long zL() {
        return c.amb.getValue().longValue();
    }

    public static boolean zM() {
        return c.amg.Ad();
    }

    public static com.kwad.sdk.core.network.idc.a.a zN() {
        return c.ami.getValue();
    }

    public static long zO() {
        return c.amj.getValue().longValue();
    }

    public static int zP() {
        return c.amk.getValue().intValue();
    }

    public static boolean zQ() {
        return c.aml.getValue().floatValue() == 1.0f;
    }

    public static boolean zR() {
        return c.amm.Ad();
    }

    public static boolean zS() {
        return c.amo.Ad();
    }

    public static String zT() {
        return c.amp.getValue();
    }

    public static String zU() {
        return c.amq.getValue();
    }

    public static String zV() {
        return c.amr.getValue();
    }

    public static int zW() {
        return c.amu.getValue().intValue();
    }

    public static boolean zX() {
        return c.amw.getValue().booleanValue();
    }

    public static List<String> za() {
        return c.akR.getValue();
    }

    public static int zb() {
        return c.amn.getValue().intValue();
    }

    public static boolean zc() {
        return c.akK.getValue().booleanValue();
    }

    public static String zd() {
        return c.akM.getValue();
    }

    public static String ze() {
        return c.akN.getValue();
    }

    public static boolean zf() {
        return c.akw.getValue().intValue() == 1;
    }

    public static int zg() {
        return c.akx.getValue().intValue();
    }

    public static boolean zh() {
        return c.aky.getValue().intValue() == 1;
    }

    public static int zi() {
        return c.akZ.getValue().intValue();
    }

    public static int zj() {
        return c.ala.getValue().intValue();
    }

    public static int zk() {
        return c.alb.getValue().intValue();
    }

    public static long zl() {
        return c.alc.getValue().intValue() * 60000;
    }

    public static boolean zm() {
        return c.all.getValue().intValue() == 1;
    }

    public static boolean zn() {
        return c.alm.getValue().intValue() == 1;
    }

    public static int zo() {
        return c.alt.getValue().intValue();
    }

    public static boolean zp() {
        return c.alu.getValue().booleanValue();
    }

    public static boolean zq() {
        return a(c.alx);
    }

    public static boolean zr() {
        return !c.alz.getValue().booleanValue();
    }

    public static boolean zs() {
        return a(c.aly);
    }

    public static boolean zt() {
        return c.alB.getValue().intValue() == 1;
    }

    public static int zu() {
        return c.alC.getValue().intValue();
    }

    public static SdkConfigData zv() {
        if (amG == null) {
            synchronized (d.class) {
                if (amG == null) {
                    amG = new SdkConfigData();
                    String ci = y.ci(ServiceProvider.HA());
                    if (TextUtils.isEmpty(ci)) {
                        com.kwad.sdk.core.e.c.d("SdkConfigManager", "configCache is empty");
                    } else {
                        try {
                            amG.parseJson(new JSONObject(ci));
                        } catch (Exception e) {
                            com.kwad.sdk.core.e.c.printStackTrace(e);
                        }
                    }
                }
            }
        }
        return amG;
    }

    public static boolean zw() {
        return c.akD.getValue().intValue() == 1;
    }

    public static boolean zx() {
        return c.akE.getValue().intValue() == 1;
    }

    public static int zy() {
        return c.akG.getValue().intValue();
    }

    public static boolean zz() {
        return c.akH.getValue().booleanValue();
    }
}
