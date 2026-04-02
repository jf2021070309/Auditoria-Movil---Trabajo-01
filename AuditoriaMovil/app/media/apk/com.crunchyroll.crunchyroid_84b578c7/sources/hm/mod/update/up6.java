package hm.mod.update;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
/* loaded from: classes5.dex */
public class up6 implements View.OnClickListener {
    private Context mContext;
    private final String mUrl;

    public up6(Context context, String str) {
        this.mContext = context;
        this.mUrl = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(this.mUrl));
            this.mContext.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
