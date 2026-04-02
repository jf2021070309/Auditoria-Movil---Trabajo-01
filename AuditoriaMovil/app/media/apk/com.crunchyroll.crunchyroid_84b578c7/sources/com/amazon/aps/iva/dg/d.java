package com.amazon.aps.iva.dg;

import android.net.Uri;
import com.amazon.aps.iva.cg.a0;
import com.amazon.aps.iva.cg.c0;
import com.amazon.aps.iva.cg.d0;
import com.amazon.aps.iva.cg.e0;
import com.amazon.aps.iva.cg.u;
import com.amazon.aps.iva.cg.y;
import com.amazon.aps.iva.cg.z;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.drm.DrmProxyServiceImpl;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
/* compiled from: NativeDeepLinkParser.kt */
/* loaded from: classes.dex */
public final class d implements c {
    public static String b(a aVar, int i) {
        String str;
        if (i >= 0) {
            List<String> list = aVar.d;
            if (i <= f1.B(list)) {
                str = list.get(i);
                return str;
            }
        }
        str = "";
        return str;
    }

    @Override // com.amazon.aps.iva.cg.w
    public final e0 a(a aVar) {
        com.amazon.aps.iva.cg.c cVar;
        String str;
        d0 d0Var;
        boolean z;
        y yVar = null;
        if (!j.a(aVar.b, DrmProxyServiceImpl.ACCOUNTING_ID)) {
            return null;
        }
        String str2 = aVar.c;
        if (str2 != null) {
            int hashCode = str2.hashCode();
            boolean z2 = true;
            String str3 = aVar.a;
            switch (hashCode) {
                case -1844055567:
                    if (str2.equals("upsell_menu")) {
                        return new e0(u.a.UPSELL_MENU, aVar);
                    }
                    break;
                case -1380604278:
                    if (str2.equals("browse")) {
                        String b = b(aVar, 0);
                        if (j.a(b, "popular")) {
                            cVar = com.amazon.aps.iva.cg.c.POPULAR;
                        } else if (j.a(b, "genres")) {
                            cVar = com.amazon.aps.iva.cg.c.GENRES;
                        } else {
                            throw new IllegalArgumentException("Invalid destination '" + b + "' in deep link: '" + aVar + "'");
                        }
                        return new com.amazon.aps.iva.cg.b(aVar, cVar, b(aVar, 1));
                    }
                    break;
                case -1337121374:
                    if (str2.equals("upgrade_menu")) {
                        return new e0(u.a.UPGRADE_MENU, aVar);
                    }
                    break;
                case -1290479578:
                    if (str2.equals("simulcasts")) {
                        return new e0(u.a.SIMULCAST, aVar);
                    }
                    break;
                case -906336856:
                    if (str2.equals(FirebaseAnalytics.Event.SEARCH)) {
                        return new e0(u.a.SEARCH, aVar);
                    }
                    break;
                case -906335517:
                    if (str2.equals("season")) {
                        String b2 = b(aVar, 0);
                        if (!m.b0(b2)) {
                            return new a0(u.a.SEASON, aVar, b2);
                        }
                        throw new IllegalArgumentException(("Invalid seasonId ID '" + b2 + "' in deep link: '" + aVar + "'").toString());
                    }
                    break;
                case -905838985:
                    if (str2.equals("series")) {
                        String b3 = b(aVar, 0);
                        if (!m.b0(b3)) {
                            return new a0(u.a.SHOW_PAGE, aVar, b3);
                        }
                        throw new IllegalArgumentException(("Invalid asset ID '" + b3 + "' in deep link: '" + aVar + "'").toString());
                    }
                    break;
                case -902467678:
                    if (str2.equals("signin")) {
                        return new e0(u.a.SIGN_IN, aVar);
                    }
                    break;
                case -902467304:
                    if (str2.equals("signup")) {
                        return new e0(u.a.SIGN_UP, aVar);
                    }
                    break;
                case -279939603:
                    if (str2.equals("watchlist")) {
                        return new e0(u.a.WATCHLIST, aVar);
                    }
                    break;
                case -259376374:
                    if (str2.equals("crunchylist")) {
                        return new e0(u.a.CRUNCHYLIST, aVar);
                    }
                    break;
                case 3208415:
                    if (str2.equals("home")) {
                        if (str3 != null) {
                            Uri parse = Uri.parse(str3);
                            j.e(parse, "parse(this)");
                            str = parse.getQueryParameter("carousel");
                        } else {
                            str = null;
                        }
                        if (j.a(str, "game_vault")) {
                            yVar = y.GAME_VAULT;
                        }
                        return new z(aVar, yVar);
                    }
                    break;
                case 112903375:
                    if (str2.equals("watch")) {
                        String b4 = b(aVar, 0);
                        if (!m.b0(b4)) {
                            return new a0(u.a.WATCH_SCREEN, aVar, b4);
                        }
                        throw new IllegalArgumentException(("Invalid asset ID '" + b4 + "' in deep link: '" + aVar + "'").toString());
                    }
                    break;
                case 144507445:
                    if (str2.equals("persistent_message_center")) {
                        return new c0(aVar, d0.PERSISTENT_MESSAGE_CENTER_NOTIFICATIONS);
                    }
                    break;
                case 1434631203:
                    if (str2.equals("settings")) {
                        String b5 = b(aVar, 0);
                        int hashCode2 = b5.hashCode();
                        if (hashCode2 != 237256269) {
                            if (hashCode2 != 1272354024) {
                                if (hashCode2 == 1686769128 && b5.equals("connected_apps")) {
                                    if (str3 != null && q.i0(str3, "oauth_error=access_denied", false)) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        d0Var = d0.CONNECTED_APPS;
                                    } else {
                                        if (str3 == null || !q.i0(str3, "oauth_error", false)) {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            d0Var = d0.CONNECTED_APPS_ERROR;
                                        } else {
                                            d0Var = d0.CONNECTED_APPS_SUCCESS;
                                        }
                                    }
                                    return new c0(aVar, d0Var);
                                }
                                throw new IllegalArgumentException("Invalid settingsDestination '" + b5 + "' in deep link: '" + aVar + "'");
                            }
                            if (b5.equals("notifications")) {
                                d0Var = d0.NOTIFICATIONS;
                                return new c0(aVar, d0Var);
                            }
                            throw new IllegalArgumentException("Invalid settingsDestination '" + b5 + "' in deep link: '" + aVar + "'");
                        }
                        if (b5.equals("change_email")) {
                            d0Var = d0.CHANGE_EMAIL;
                            return new c0(aVar, d0Var);
                        }
                        throw new IllegalArgumentException("Invalid settingsDestination '" + b5 + "' in deep link: '" + aVar + "'");
                    }
                    break;
                case 1518028383:
                    if (str2.equals("offline_library")) {
                        return new e0(u.a.OFFLINE_LIBRARY, aVar);
                    }
                    break;
            }
        }
        throw new IllegalArgumentException("Invalid deep link: '" + aVar + "'");
    }
}
