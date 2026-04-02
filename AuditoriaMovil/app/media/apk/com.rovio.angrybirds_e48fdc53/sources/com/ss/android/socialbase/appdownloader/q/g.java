package com.ss.android.socialbase.appdownloader.q;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.support.v4.app.NotificationManagerCompat;
import android.view.KeyEvent;
import com.ss.android.socialbase.appdownloader.ll;
import com.ss.android.socialbase.appdownloader.o.v;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class g {
    private static AlertDialog g;
    private static com.ss.android.socialbase.appdownloader.view.dr o;
    private static final String dr = g.class.getSimpleName();
    private static List<v> ge = new ArrayList();

    public static boolean dr() {
        try {
            return NotificationManagerCompat.from(DownloadComponentManager.getAppContext()).areNotificationsEnabled();
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    public static synchronized void dr(boolean z) {
        synchronized (g.class) {
            try {
                AlertDialog alertDialog = g;
                if (alertDialog != null) {
                    alertDialog.cancel();
                    g = null;
                }
                for (v vVar : ge) {
                    if (vVar != null) {
                        if (z) {
                            vVar.dr();
                        } else {
                            vVar.ge();
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static synchronized void dr(final Activity activity, final v vVar) {
        synchronized (g.class) {
            if (vVar == null) {
                return;
            }
            if (activity != null) {
                try {
                } catch (Throwable th) {
                    th.printStackTrace();
                    dr(false);
                }
                if (!activity.isFinishing()) {
                    int dr2 = ll.dr(DownloadComponentManager.getAppContext(), "tt_appdownloader_notification_request_title");
                    int dr3 = ll.dr(DownloadComponentManager.getAppContext(), "tt_appdownloader_notification_request_message");
                    int dr4 = ll.dr(DownloadComponentManager.getAppContext(), "tt_appdownloader_notification_request_btn_yes");
                    int dr5 = ll.dr(DownloadComponentManager.getAppContext(), "tt_appdownloader_notification_request_btn_no");
                    ge.add(vVar);
                    AlertDialog alertDialog = g;
                    if (alertDialog == null || !alertDialog.isShowing()) {
                        g = new AlertDialog.Builder(activity).setTitle(dr2).setMessage(dr3).setPositiveButton(dr4, new DialogInterface.OnClickListener() { // from class: com.ss.android.socialbase.appdownloader.q.g.3
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                g.ge(activity, vVar);
                                dialogInterface.cancel();
                                AlertDialog unused = g.g = null;
                            }
                        }).setNegativeButton(dr5, new DialogInterface.OnClickListener() { // from class: com.ss.android.socialbase.appdownloader.q.g.2
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                g.dr(false);
                            }
                        }).setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.ss.android.socialbase.appdownloader.q.g.1
                            @Override // android.content.DialogInterface.OnKeyListener
                            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                                if (i != 4) {
                                    return false;
                                }
                                if (keyEvent.getAction() == 1) {
                                    g.dr(false);
                                }
                                return true;
                            }
                        }).setCancelable(false).show();
                    }
                    return;
                }
            }
            vVar.ge();
        }
    }

    public static void ge(Activity activity, v vVar) {
        if (activity != null) {
            try {
                if (!activity.isFinishing()) {
                    FragmentManager fragmentManager = activity.getFragmentManager();
                    String str = dr;
                    com.ss.android.socialbase.appdownloader.view.dr drVar = (com.ss.android.socialbase.appdownloader.view.dr) fragmentManager.findFragmentByTag(str);
                    o = drVar;
                    if (drVar == null) {
                        o = new com.ss.android.socialbase.appdownloader.view.dr();
                        fragmentManager.beginTransaction().add(o, str).commitAllowingStateLoss();
                        fragmentManager.executePendingTransactions();
                    }
                    o.dr();
                    return;
                }
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    vVar.dr();
                    return;
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return;
                }
            }
        }
        vVar.dr();
    }
}
