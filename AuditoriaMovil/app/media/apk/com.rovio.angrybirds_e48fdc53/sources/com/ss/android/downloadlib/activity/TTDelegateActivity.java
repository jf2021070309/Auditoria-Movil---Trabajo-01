package com.ss.android.downloadlib.activity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.ss.android.download.api.config.z;
import com.ss.android.download.api.constant.BaseConstants;
import com.ss.android.download.api.model.ge;
import com.ss.android.downloadad.api.dr.ge;
import com.ss.android.downloadlib.addownload.dr.g;
import com.ss.android.downloadlib.addownload.ge.bn;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.downloadlib.addownload.yk;
import com.ss.android.downloadlib.guide.install.dr;
import com.ss.android.downloadlib.xu;
import com.ss.android.socialbase.appdownloader.o;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import com.umeng.analytics.pro.bg;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class TTDelegateActivity extends Activity implements ActivityCompat.OnRequestPermissionsResultCallback {
    private static dr g;
    protected Intent dr = null;
    private boolean ge;
    private ge o;

    public static void dr(String str, String[] strArr) {
        Intent intent = new Intent(wb.getContext(), TTDelegateActivity.class);
        intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        intent.putExtra("type", 1);
        intent.putExtra(com.bytedance.msdk.api.activity.TTDelegateActivity.PERMISSION_ID_KEY, str);
        intent.putExtra(com.bytedance.msdk.api.activity.TTDelegateActivity.PERMISSION_CONTENT_KEY, strArr);
        if (wb.getContext() != null) {
            wb.getContext().startActivity(intent);
        }
    }

    public static void dr(String str, com.ss.android.downloadad.api.dr.dr drVar) {
        Intent o = o(drVar);
        o.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        o.putExtra("type", 2);
        o.putExtra("open_url", str);
        if (wb.getContext() != null) {
            wb.getContext().startActivity(o);
        }
    }

    public static void ge(String str, com.ss.android.downloadad.api.dr.dr drVar) {
        Intent o = o(drVar);
        o.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        o.putExtra("type", 11);
        o.putExtra(bg.o, str);
        if (wb.getContext() != null) {
            wb.getContext().startActivity(o);
        }
    }

    public static void dr(com.ss.android.downloadad.api.dr.dr drVar) {
        Intent o = o(drVar);
        o.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        o.putExtra("type", 4);
        o.putExtra("model_id", drVar.ge());
        if (wb.getContext() != null) {
            wb.getContext().startActivity(o);
        }
    }

    public static void dr(com.ss.android.downloadad.api.dr.dr drVar, dr drVar2) {
        Intent o = o(drVar);
        o.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        o.putExtra("type", 9);
        g = drVar2;
        if (wb.getContext() != null) {
            wb.getContext().startActivity(o);
        }
    }

    public static void dr(long j) {
        Intent intent = new Intent(wb.getContext(), TTDelegateActivity.class);
        intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        intent.putExtra("type", 10);
        intent.putExtra("app_info_id", j);
        if (wb.getContext() != null) {
            wb.getContext().startActivity(intent);
        }
    }

    public static void dr(String str, long j, String str2, JSONObject jSONObject) {
        Intent intent = new Intent(wb.getContext(), TTDelegateActivity.class);
        intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        intent.putExtra("type", 12);
        intent.putExtra(bg.o, str);
        intent.putExtra("model_id", j);
        intent.putExtra("param", str2);
        intent.putExtra("ext_json", jSONObject.toString());
        if (wb.getContext() != null) {
            wb.getContext().startActivity(intent);
        }
    }

    private static Intent o(com.ss.android.downloadad.api.dr.dr drVar) {
        return new Intent(wb.getContext(), TTDelegateActivity.class);
    }

    public static void ge(com.ss.android.downloadad.api.dr.dr drVar) {
        dr(drVar, 5, "", "", "");
    }

    public static void dr(com.ss.android.downloadad.api.dr.dr drVar, String str, String str2, String str3) {
        dr(drVar, 8, str, str2, str3);
    }

    public static void ge(com.ss.android.downloadad.api.dr.dr drVar, String str, String str2, String str3) {
        dr(drVar, 7, str, str2, str3);
    }

    private static void dr(com.ss.android.downloadad.api.dr.dr drVar, int i, String str, String str2, String str3) {
        Intent o = o(drVar);
        o.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        o.putExtra("type", i);
        if (!TextUtils.isEmpty(str2)) {
            o.putExtra("positive_button_text", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            o.putExtra("negative_button_text", str3);
        }
        if (!TextUtils.isEmpty(str)) {
            o.putExtra("message_text", str);
        }
        o.putExtra("model_id", drVar.ge());
        if (wb.getContext() != null) {
            wb.getContext().startActivity(o);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ge();
        this.dr = getIntent();
        wb.ge(this);
        dr();
    }

    private void ge() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        this.dr = intent;
        wb.ge(this);
        dr();
    }

    @Override // android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        wb.q().dr(this, i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onStop() {
        DownloadInfo ge;
        super.onStop();
        if (this.ge && this.o != null && (ge = xu.dr((Context) null).ge(this.o.dr())) != null && ge.getCurBytes() >= ge.getTotalBytes() && !isFinishing()) {
            finish();
        }
    }

    protected void dr() {
        Intent intent = this.dr;
        if (intent != null) {
            switch (intent.getIntExtra("type", 0)) {
                case 1:
                    ge(this.dr.getStringExtra(com.bytedance.msdk.api.activity.TTDelegateActivity.PERMISSION_ID_KEY), this.dr.getStringArrayExtra(com.bytedance.msdk.api.activity.TTDelegateActivity.PERMISSION_CONTENT_KEY));
                    break;
                case 2:
                    dr(this.dr.getStringExtra("open_url"));
                    break;
                case 3:
                case 6:
                default:
                    o.dr((Activity) this);
                    break;
                case 4:
                    o(this.dr.getLongExtra("model_id", 0L));
                    break;
                case 5:
                    ge(this.dr.getLongExtra("model_id", 0L));
                    break;
                case 7:
                case 8:
                    o();
                    break;
                case 9:
                    dr drVar = g;
                    if (drVar != null) {
                        drVar.dr();
                    }
                    o.dr((Activity) this);
                    break;
                case 10:
                    g(this.dr.getLongExtra("app_info_id", 0L));
                    break;
                case 11:
                    ge(this.dr.getStringExtra(bg.o));
                    break;
                case 12:
                    com.ss.android.downloadlib.rb.xu.dr(this, this.dr.getStringExtra(bg.o), this.dr.getLongExtra("model_id", 0L), this.dr.getStringExtra("param"), this.dr.getStringExtra("ext_json"));
                    o.dr((Activity) this);
                    break;
            }
            this.dr = null;
        }
    }

    private void o() {
        String str;
        long longExtra = this.dr.getLongExtra("model_id", 0L);
        String stringExtra = this.dr.getStringExtra("message_text");
        String stringExtra2 = this.dr.getStringExtra("positive_button_text");
        String stringExtra3 = this.dr.getStringExtra("negative_button_text");
        int intExtra = this.dr.getIntExtra("type", 0);
        ge g2 = bn.dr().g(longExtra);
        g.dr o = new g.dr(this).dr(false).dr(stringExtra).ge(stringExtra2).o(stringExtra3);
        if (intExtra == 7) {
            if (com.ss.android.downloadlib.addownload.g.ge.dr() == null) {
                return;
            }
            o.dr(com.ss.android.downloadlib.addownload.g.ge.dr());
            o.dr().show();
            str = "download_percent";
        } else if (intExtra != 8) {
            str = "";
        } else if (com.ss.android.downloadlib.addownload.g.dr.dr() == null) {
            return;
        } else {
            o.dr(com.ss.android.downloadlib.addownload.g.dr.dr());
            o.dr().show();
            str = "apk_size";
        }
        if (!TextUtils.isEmpty(str)) {
            this.ge = true;
            this.o = g2;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("pause_optimise_type", str);
                jSONObject.putOpt("pause_optimise_action", "show_dialog");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            com.ss.android.downloadlib.g.dr.dr().dr("pause_optimise", jSONObject, g2);
        }
    }

    private void ge(long j) {
        if (yk.dr() == null) {
            return;
        }
        ge g2 = bn.dr().g(j);
        if (g2 != null) {
            DownloadInfo downloadInfo = Downloader.getInstance(wb.getContext()).getDownloadInfo(g2.i());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("time_after_click", Long.valueOf(System.currentTimeMillis() - g2.ed()));
                jSONObject.putOpt("click_download_size", Long.valueOf(g2.p()));
                if (downloadInfo != null) {
                    jSONObject.putOpt("download_length", Long.valueOf(downloadInfo.getCurBytes()));
                    jSONObject.putOpt("download_percent", Long.valueOf(downloadInfo.getCurBytes() / downloadInfo.getTotalBytes()));
                    jSONObject.putOpt("download_apk_size", Long.valueOf(downloadInfo.getTotalBytes()));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            com.ss.android.downloadlib.g.dr.dr().ge("pause_reserve_wifi_dialog_show", jSONObject, g2);
        }
        new g.dr(this).dr(false).dr(yk.dr()).dr().show();
        this.ge = true;
        this.o = g2;
    }

    private void ge(final String str, String[] strArr) {
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            o.dr((Activity) this);
            return;
        }
        z zVar = new z() { // from class: com.ss.android.downloadlib.activity.TTDelegateActivity.1
            private WeakReference<Activity> o;

            {
                this.o = new WeakReference<>(TTDelegateActivity.this);
            }

            @Override // com.ss.android.download.api.config.z
            public void dr() {
                com.ss.android.downloadlib.rb.wb.dr(str);
                o.dr(this.o.get());
            }

            @Override // com.ss.android.download.api.config.z
            public void dr(String str2) {
                com.ss.android.downloadlib.rb.wb.dr(str, str2);
                o.dr(this.o.get());
            }
        };
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                wb.q().dr(this, strArr, zVar);
                return;
            } catch (Exception e) {
                wb.i().dr(e, "requestPermission");
                zVar.dr();
                return;
            }
        }
        zVar.dr();
    }

    private void dr(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                Uri parse = Uri.parse(str);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                intent.putExtra("open_url", str);
                intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
                if (DownloadSetting.obtainGlobal().optBugFix("fix_app_link_flag")) {
                    intent.addFlags(DownloadExpSwitchCode.BACK_BUGFIX_SIGBUS);
                }
                intent.putExtra(BaseConstants.START_ONLY_FOR_ANDROID, true);
                startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            o.dr((Activity) this);
        }
    }

    private void ge(String str) {
        Intent bn = com.ss.android.downloadlib.rb.yk.bn(this, str);
        if (bn == null) {
            return;
        }
        try {
            try {
                bn.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
                bn.putExtra(BaseConstants.START_ONLY_FOR_ANDROID, true);
                startActivity(bn);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            o.dr((Activity) this);
        }
    }

    private void o(long j) {
        final ge g2 = bn.dr().g(j);
        if (g2 == null) {
            com.ss.android.downloadlib.q.o.dr().dr("showOpenAppDialogInner nativeModel null");
            o.dr((Activity) this);
            return;
        }
        com.ss.android.download.api.config.yk o = wb.o();
        ge.dr dr = new ge.dr(this).dr("已安装完成");
        Object[] objArr = new Object[1];
        objArr[0] = TextUtils.isEmpty(g2.nn()) ? "刚刚下载的应用" : g2.nn();
        o.ge(dr.ge(String.format("%1$s已安装完成，是否立即打开？", objArr)).o("打开").g("取消").dr(false).dr(com.ss.android.downloadlib.rb.yk.o(this, g2.q())).dr(new ge.InterfaceC0290ge() { // from class: com.ss.android.downloadlib.activity.TTDelegateActivity.2
            @Override // com.ss.android.download.api.model.ge.InterfaceC0290ge
            public void dr(DialogInterface dialogInterface) {
                com.ss.android.downloadlib.ge.dr.ge(g2);
                TTDelegateActivity tTDelegateActivity = TTDelegateActivity.this;
                if (tTDelegateActivity != null && !tTDelegateActivity.isFinishing()) {
                    dialogInterface.dismiss();
                }
                o.dr((Activity) TTDelegateActivity.this);
            }

            @Override // com.ss.android.download.api.model.ge.InterfaceC0290ge
            public void ge(DialogInterface dialogInterface) {
                com.ss.android.downloadlib.g.dr.dr().ge("market_openapp_cancel", g2);
                TTDelegateActivity tTDelegateActivity = TTDelegateActivity.this;
                if (tTDelegateActivity != null && !tTDelegateActivity.isFinishing()) {
                    dialogInterface.dismiss();
                }
                o.dr((Activity) TTDelegateActivity.this);
            }

            @Override // com.ss.android.download.api.model.ge.InterfaceC0290ge
            public void o(DialogInterface dialogInterface) {
                o.dr((Activity) TTDelegateActivity.this);
            }
        }).dr(2).dr());
        com.ss.android.downloadlib.g.dr.dr().ge("market_openapp_window_show", g2);
    }

    private void g(long j) {
        new com.ss.android.downloadlib.addownload.compliance.dr(this, j).show();
    }
}
