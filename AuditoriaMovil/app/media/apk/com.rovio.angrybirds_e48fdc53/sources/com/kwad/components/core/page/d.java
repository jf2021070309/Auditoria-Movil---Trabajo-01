package com.kwad.components.core.page;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.kwad.components.core.o.f;
import com.kwad.sdk.R;
import com.kwad.sdk.api.proxy.app.BaseFragmentActivity;
import com.kwad.sdk.utils.aj;
import com.kwad.sdk.utils.ak;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
/* loaded from: classes.dex */
public class d extends f {
    private boolean MP;

    private void az(boolean z) {
        Intent intent = getIntent();
        if (z) {
            getActivity().startActivity((Intent) intent.getParcelableExtra(BaseGmsClient.KEY_PENDING_INTENT));
            return;
        }
        String stringExtra = intent.getStringExtra("filePath");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        ak.an(getActivity().getApplicationContext(), stringExtra);
    }

    private void oI() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.ksad_request_install_title);
        builder.setMessage(R.string.ksad_request_install_content);
        builder.setNegativeButton(R.string.ksad_request_install_nagative, new DialogInterface.OnClickListener() { // from class: com.kwad.components.core.page.d.1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                d.this.finish();
            }
        });
        builder.setPositiveButton(R.string.ksad_request_install_positive, new DialogInterface.OnClickListener() { // from class: com.kwad.components.core.page.d.2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                d.this.oJ();
            }
        });
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oJ() {
        if (Build.VERSION.SDK_INT < 26) {
            finish();
            return;
        }
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + getActivity().getApplicationInfo().packageName));
        intent.addFlags(DownloadExpSwitchCode.BACK_BUGFIX_SIGBUS);
        getActivity().startActivityForResult(intent, 100);
    }

    public static void register() {
        try {
            com.kwad.sdk.service.b.a(BaseFragmentActivity.RequestInstallPermissionActivity.class, d.class);
        } catch (Throwable th) {
        }
    }

    @Override // com.kwad.components.core.o.f
    public String getPageName() {
        return "RequestInstallPermissionImpl";
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 100 && i2 == -1) {
            az(this.MP);
        }
        finish();
    }

    @Override // com.kwad.components.core.o.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        this.MP = intent.getBooleanExtra("fromNotification", false);
        if (Build.VERSION.SDK_INT < 26) {
            az(this.MP);
            finish();
        } else if (this.MP) {
            if (aj.cq(getActivity())) {
                az(this.MP);
            } else {
                oJ();
            }
        } else if (intent.getBooleanExtra("needAllowDialog", false)) {
            oI();
        } else {
            oJ();
        }
    }
}
