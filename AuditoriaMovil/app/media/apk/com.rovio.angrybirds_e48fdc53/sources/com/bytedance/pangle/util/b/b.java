package com.bytedance.pangle.util.b;

import com.facebook.share.internal.ShareConstants;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b {
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:69:0x01cd
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static boolean a(java.lang.String r30, boolean r31, boolean r32, java.lang.String r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 1049
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.util.b.b.a(java.lang.String, boolean, boolean, java.lang.String, int, int):boolean");
    }

    private static void a(int i, String str, int i2, long j, Throwable th, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.putOpt(MonitorConstants.STATUS_CODE, com.bytedance.pangle.log.b.a(Integer.valueOf(i)));
            jSONObject.putOpt("plugin_package_name", com.bytedance.pangle.log.b.a(str));
            jSONObject.putOpt("version_code", com.bytedance.pangle.log.b.a(Integer.valueOf(i2)));
            jSONObject3.putOpt("duration", Integer.valueOf(com.bytedance.pangle.log.b.b(Long.valueOf(j))));
            jSONObject2.putOpt(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, str2 + com.bytedance.pangle.log.b.a(th));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.bytedance.pangle.c.b.a().a(com.bytedance.pangle.c.b.i, jSONObject, jSONObject3, jSONObject2);
    }
}
