package com.ss.android.downloadlib.ge;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.download.api.constant.BaseConstants;
import com.ss.android.download.api.model.DeepLink;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.downloadlib.rb.yk;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationManager;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class dr {
    public static boolean dr(com.ss.android.downloadlib.addownload.ge.q qVar) {
        boolean z;
        DeepLink deepLink = qVar.ge.getDeepLink();
        String openUrl = deepLink == null ? null : deepLink.getOpenUrl();
        JSONObject dr = com.ss.android.downloadlib.rb.bn.dr(new JSONObject(), qVar);
        yk.dr(dr, "applink_source", "click_by_sdk");
        com.ss.android.downloadlib.g.dr.dr().ge("applink_click", dr, qVar);
        com.ss.android.downloadlib.addownload.ge.rb dr2 = com.ss.android.downloadlib.rb.ll.dr(openUrl, qVar);
        if (dr2.getType() == 2) {
            if (!TextUtils.isEmpty(openUrl)) {
                ge("by_url", dr2, dr, qVar);
            }
            dr2 = com.ss.android.downloadlib.rb.ll.dr(com.ss.android.downloadlib.addownload.wb.getContext(), qVar.ge.getPackageName(), qVar);
        }
        boolean z2 = false;
        if (dr(qVar.dr) && com.ss.android.downloadlib.addownload.wb.ll().optInt("link_ad_click_event") == 1) {
            if (qVar.ge instanceof AdDownloadModel) {
                ((AdDownloadModel) qVar.ge).setFunnelType(4);
            }
            com.ss.android.downloadlib.g.dr.dr().dr(qVar.dr, 0);
            z = true;
        } else {
            z = false;
        }
        int type = dr2.getType();
        if (type == 1) {
            ge("by_url", dr, qVar);
            z2 = true;
        } else if (type == 3) {
            dr("by_package", dr, qVar);
            z2 = true;
        } else if (type == 4) {
            dr("by_package", dr2, dr, qVar);
        } else {
            com.ss.android.downloadlib.q.o.dr().ge("AppLinkClick default");
        }
        if (z2 && !z && ((com.ss.android.downloadlib.g.o.dr().ge() && !com.ss.android.downloadlib.g.o.dr().ge(qVar.dr, qVar.ge.getLogExtra())) || com.ss.android.downloadlib.g.o.dr().o())) {
            com.ss.android.downloadlib.g.dr.dr().dr(qVar.dr, 2);
        }
        return z2;
    }

    public static void dr(com.ss.android.downloadad.api.dr.ge geVar) {
        String bn = geVar.bn();
        JSONObject dr = com.ss.android.downloadlib.rb.bn.dr(new JSONObject(), geVar);
        yk.dr(dr, "applink_source", "notify_click_by_sdk");
        com.ss.android.downloadlib.g.dr.dr().ge("applink_click", dr, geVar);
        com.ss.android.downloadlib.addownload.ge.rb dr2 = com.ss.android.downloadlib.rb.ll.dr(bn, geVar);
        if (dr2.getType() == 2) {
            if (!TextUtils.isEmpty(bn)) {
                ge("notify_by_url", dr2, dr, geVar);
            }
            dr2 = com.ss.android.downloadlib.rb.ll.dr(com.ss.android.downloadlib.addownload.wb.getContext(), geVar.q(), geVar);
        }
        int type = dr2.getType();
        if (type == 1) {
            ge("notify_by_url", dr, geVar);
        } else if (type == 3) {
            dr("notify_by_package", dr, geVar);
        } else if (type == 4) {
            dr("notify_by_package", dr2, dr, geVar);
        } else {
            com.ss.android.downloadlib.q.o.dr().ge("AppLinkClickNotification default");
        }
    }

    public static void ge(com.ss.android.downloadad.api.dr.ge geVar) {
        if (geVar == null) {
            return;
        }
        String str = null;
        if (DownloadSetting.obtainGlobal().optInt("app_link_opt") == 1) {
            str = geVar.bn();
        }
        JSONObject dr = com.ss.android.downloadlib.rb.bn.dr(new JSONObject(), geVar);
        yk.dr(dr, "applink_source", "dialog_click_by_sdk");
        com.ss.android.downloadlib.g.dr.dr().ge("applink_click", dr, geVar);
        com.ss.android.downloadlib.addownload.ge.rb dr2 = com.ss.android.downloadlib.rb.ll.dr(str, geVar);
        if (dr2.getType() == 2) {
            if (!TextUtils.isEmpty(str)) {
                ge("dialog_by_url", dr2, dr, geVar);
            }
            dr2 = com.ss.android.downloadlib.rb.ll.dr(com.ss.android.downloadlib.addownload.wb.getContext(), geVar.q(), geVar);
        }
        int type = dr2.getType();
        if (type == 1) {
            ge("dialog_by_url", dr, geVar);
        } else if (type == 3) {
            dr("dialog_by_package", dr, geVar);
        } else if (type == 4) {
            dr("dialog_by_package", dr2, dr, geVar);
        } else {
            com.ss.android.downloadlib.q.o.dr().ge("AppLinkClickDialog default");
        }
    }

    public static boolean dr(String str, com.ss.android.downloadad.api.dr.ge geVar) {
        if (com.ss.android.downloadlib.addownload.xu.ge(geVar.oz())) {
            if (TextUtils.isEmpty(geVar.bn()) && TextUtils.isEmpty(str)) {
                return false;
            }
            DownloadNotificationManager.getInstance().cancelNotification(geVar.i());
            JSONObject jSONObject = new JSONObject();
            com.ss.android.downloadlib.rb.bn.dr(jSONObject, geVar);
            yk.dr(jSONObject, "applink_source", "auto_click");
            com.ss.android.downloadlib.g.dr.dr().ge("applink_click", geVar);
            com.ss.android.downloadlib.addownload.ge.rb dr = com.ss.android.downloadlib.rb.ll.dr(geVar, geVar.bn(), geVar.q());
            int type = dr.getType();
            if (type == 1) {
                ge("auto_by_url", jSONObject, geVar);
                return true;
            } else if (type == 2) {
                ge("auto_by_url", dr, jSONObject, geVar);
                return false;
            } else if (type == 3) {
                dr("auto_by_package", jSONObject, geVar);
                return true;
            } else if (type != 4) {
                return false;
            } else {
                dr("auto_by_package", dr, jSONObject, geVar);
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void dr(String str, final JSONObject jSONObject, final com.ss.android.downloadad.api.dr.dr drVar) {
        char c;
        yk.dr(jSONObject, "applink_source", str);
        yk.dr(jSONObject, "download_scene", Integer.valueOf(drVar.z()));
        com.ss.android.downloadlib.g.dr.dr().ge("deeplink_app_open", jSONObject, drVar);
        switch (str.hashCode()) {
            case -1282070764:
                if (str.equals("notify_by_package")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -441514770:
                if (str.equals("auto_by_package")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -185950114:
                if (str.equals("by_package")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 368401333:
                if (str.equals("dialog_by_package")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1 || c == 2 || c == 3) {
            if ((com.ss.android.downloadlib.addownload.wb.ll().optInt("check_applink_mode") & 1) != 0) {
                yk.dr(jSONObject, "check_applink_result_by_sdk", (Object) 1);
                q.dr().dr(new g() { // from class: com.ss.android.downloadlib.ge.dr.1
                    @Override // com.ss.android.downloadlib.ge.g
                    public void dr(boolean z) {
                        com.ss.android.downloadlib.g.dr.dr().ge(z ? "deeplink_success" : "deeplink_failed", jSONObject, drVar);
                        if (z) {
                            com.ss.android.downloadlib.addownload.wb.z().dr(com.ss.android.downloadlib.addownload.wb.getContext(), drVar.tb(), drVar.uq(), drVar.ii(), drVar.q(), 0);
                        }
                    }
                });
                return;
            }
            com.ss.android.downloadlib.addownload.wb.ge().dr(com.ss.android.downloadlib.addownload.wb.getContext(), drVar.tb(), drVar.uq(), drVar.ii(), drVar.q(), str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void ge(String str, final JSONObject jSONObject, final com.ss.android.downloadad.api.dr.dr drVar) {
        char c;
        yk.dr(jSONObject, "applink_source", str);
        yk.dr(jSONObject, "download_scene", Integer.valueOf(drVar.z()));
        com.ss.android.downloadlib.g.dr.dr().ge("deeplink_url_open", jSONObject, drVar);
        switch (str.hashCode()) {
            case -1721882089:
                if (str.equals("auto_by_url")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1374618233:
                if (str.equals("by_url")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -129544387:
                if (str.equals("notify_by_url")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 829750366:
                if (str.equals("dialog_by_url")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1 || c == 2 || c == 3) {
            if ((com.ss.android.downloadlib.addownload.wb.ll().optInt("check_applink_mode") & 1) != 0) {
                yk.dr(jSONObject, "check_applink_result_by_sdk", (Object) 1);
                q.dr().dr(new g() { // from class: com.ss.android.downloadlib.ge.dr.2
                    @Override // com.ss.android.downloadlib.ge.g
                    public void dr(boolean z) {
                        com.ss.android.downloadlib.g.dr.dr().ge(z ? "deeplink_success" : "deeplink_failed", jSONObject, drVar);
                        if (z) {
                            com.ss.android.downloadlib.addownload.wb.z().dr(com.ss.android.downloadlib.addownload.wb.getContext(), drVar.tb(), drVar.uq(), drVar.ii(), drVar.q(), 0);
                        }
                    }
                });
                return;
            }
            com.ss.android.downloadlib.addownload.wb.ge().dr(com.ss.android.downloadlib.addownload.wb.getContext(), drVar.tb(), drVar.uq(), drVar.ii(), drVar.q(), str);
        }
    }

    public static void dr(String str, com.ss.android.downloadlib.addownload.ge.rb rbVar, JSONObject jSONObject, com.ss.android.downloadad.api.dr.dr drVar) {
        yk.dr(jSONObject, "applink_source", str);
        yk.dr(jSONObject, "error_code", Integer.valueOf(rbVar.dr()));
        yk.dr(jSONObject, "download_scene", Integer.valueOf(drVar.z()));
        com.ss.android.downloadlib.g.dr.dr().ge("deeplink_app_open_fail", jSONObject, drVar);
    }

    public static void ge(String str, com.ss.android.downloadlib.addownload.ge.rb rbVar, JSONObject jSONObject, com.ss.android.downloadad.api.dr.dr drVar) {
        yk.dr(jSONObject, "applink_source", str);
        yk.dr(jSONObject, "error_code", Integer.valueOf(rbVar.dr()));
        yk.dr(jSONObject, "download_scene", Integer.valueOf(drVar.z()));
        com.ss.android.downloadlib.g.dr.dr().ge("deeplink_url_open_fail", jSONObject, drVar);
    }

    public static boolean dr(com.ss.android.downloadlib.addownload.ge.q qVar, int i) {
        JSONObject jSONObject = new JSONObject();
        yk.dr(jSONObject, "download_scene", Integer.valueOf(qVar.z()));
        com.ss.android.downloadlib.g.dr.dr().ge("market_click_open", jSONObject, qVar);
        com.ss.android.downloadlib.addownload.ge.rb dr = com.ss.android.downloadlib.rb.ll.dr(com.ss.android.downloadlib.addownload.wb.getContext(), qVar, qVar.ge.getPackageName());
        String dr2 = yk.dr(dr.ge(), "open_market");
        int type = dr.getType();
        if (type == 5) {
            dr(dr2, jSONObject, qVar, true);
        } else if (type == 6) {
            yk.dr(jSONObject, "error_code", Integer.valueOf(dr.dr()));
            yk.dr(jSONObject, "download_scene", Integer.valueOf(qVar.z()));
            com.ss.android.downloadlib.g.dr.dr().ge("market_open_failed", jSONObject, qVar);
            return false;
        } else if (type != 7) {
            return false;
        }
        com.ss.android.downloadlib.g.dr.dr().dr(qVar.dr, i);
        return true;
    }

    public static void dr(final String str, final JSONObject jSONObject, final com.ss.android.downloadlib.addownload.ge.q qVar, boolean z) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception e) {
                com.ss.android.downloadlib.q.o.dr().dr(e, "onMarketSuccess");
                return;
            }
        }
        yk.dr(jSONObject, "applink_source", str);
        yk.dr(jSONObject, "download_scene", Integer.valueOf(qVar.z()));
        if (z) {
            com.ss.android.downloadlib.g.dr.dr().ge("market_open_success", jSONObject, qVar);
        }
        if ((com.ss.android.downloadlib.addownload.wb.ll().optInt("check_applink_mode") & 4) != 0) {
            q.dr().ge(new g() { // from class: com.ss.android.downloadlib.ge.dr.3
                @Override // com.ss.android.downloadlib.ge.g
                public void dr(boolean z2) {
                    if (!z2 && !"open_market".equals(str)) {
                        Context context = com.ss.android.downloadlib.addownload.wb.getContext();
                        dr.dr(com.ss.android.downloadlib.rb.ll.dr(context, Uri.parse(BaseConstants.MARKET_PREFIX + qVar.q())), qVar, false);
                    }
                    com.ss.android.downloadlib.g.dr.dr().dr(z2 ? "market_delay_success" : "market_delay_failed", jSONObject, qVar);
                    if (z2) {
                        com.ss.android.downloadlib.addownload.wb.z().dr(com.ss.android.downloadlib.addownload.wb.getContext(), qVar.ge, qVar.g, qVar.o, qVar.ge.getPackageName(), 2);
                    }
                }
            });
        } else {
            com.ss.android.downloadlib.addownload.wb.ge().dr(com.ss.android.downloadlib.addownload.wb.getContext(), qVar.ge, qVar.g, qVar.o, qVar.ge.getPackageName(), str);
        }
        com.ss.android.downloadad.api.dr.ge geVar = new com.ss.android.downloadad.api.dr.ge(qVar.ge, qVar.o, qVar.g);
        geVar.q(2);
        geVar.bn(System.currentTimeMillis());
        geVar.xu(4);
        geVar.ll(2);
        com.ss.android.downloadlib.addownload.ge.bn.dr().dr(geVar);
    }

    public static void dr(com.ss.android.downloadlib.addownload.ge.rb rbVar, com.ss.android.downloadlib.addownload.ge.q qVar, boolean z) {
        String dr = yk.dr(rbVar.ge(), "open_market");
        JSONObject jSONObject = new JSONObject();
        yk.dr(jSONObject, "ttdownloader_type", "backup");
        int type = rbVar.getType();
        if (type == 5) {
            dr(dr, jSONObject, qVar, z);
        } else if (type == 6) {
            yk.dr(jSONObject, "error_code", Integer.valueOf(rbVar.dr()));
            yk.dr(jSONObject, "download_scene", Integer.valueOf(qVar.z()));
            com.ss.android.downloadlib.g.dr.dr().ge("market_open_failed", jSONObject, qVar);
        }
    }

    public static boolean dr(long j) {
        return com.ss.android.downloadlib.addownload.ge.bn.dr().g(j) == null;
    }
}
