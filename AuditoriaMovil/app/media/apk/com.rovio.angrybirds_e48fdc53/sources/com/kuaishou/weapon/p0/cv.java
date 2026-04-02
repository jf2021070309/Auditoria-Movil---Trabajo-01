package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class cv implements Runnable {
    private Context a;

    public cv(Context context) {
        this.a = context;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:69:0x03e6
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private com.kuaishou.weapon.p0.y b(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 1277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.cv.b(java.lang.String):com.kuaishou.weapon.p0.y");
    }

    public void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("result", 0) == 1) {
                String a = new bm(this.a).a(jSONObject.getString("antispamPluginRsp"));
                if (TextUtils.isEmpty(a)) {
                    return;
                }
                y b = b(a);
                if (b != null) {
                    de.a(this.a).a(str, b);
                } else {
                    de.a(this.a).b(System.currentTimeMillis());
                }
            }
        } catch (Exception e) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            String str = ct.a + ct.d;
            String a = cu.a(this.a);
            if (!TextUtils.isEmpty(a)) {
                str = str + "?" + a;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject b = cu.b(this.a);
            if (b != null) {
                jSONObject.put(ShareConstants.WEB_DIALOG_PARAM_DATA, new bm(this.a).c(b.toString()));
            }
            l a2 = l.a(this.a);
            m mVar = new m(str, jSONObject);
            mVar.a(WeaponHI.cookieData);
            mVar.b(WeaponHI.encryENV);
            a2.b(mVar, new j() { // from class: com.kuaishou.weapon.p0.cv.1
                @Override // com.kuaishou.weapon.p0.j
                public void a(String str2) {
                    try {
                        cv.this.a(str2);
                    } catch (Exception e) {
                    }
                }

                @Override // com.kuaishou.weapon.p0.j
                public void b(String str2) {
                }
            });
        } catch (Exception e) {
        }
    }
}
