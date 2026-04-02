package com.sdk.ksdk.util;

import android.app.Activity;
import java.io.IOException;
/* loaded from: classes3.dex */
public class ClickUtil {
    private int width = 0;
    private int height = 0;

    public void autoClickRatio(Activity act, final double ratioX, final double ratioY) {
        this.width = act.getWindowManager().getDefaultDisplay().getWidth();
        this.height = act.getWindowManager().getDefaultDisplay().getHeight();
        new Thread(new Runnable() { // from class: com.sdk.ksdk.util.ClickUtil.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Thread.sleep(300L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int x = (int) (ClickUtil.this.width * ratioX);
                int y = (int) (ClickUtil.this.height * ratioY);
                String[] order = {"input", "tap", "" + x, "" + y};
                try {
                    new ProcessBuilder(order).start();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }).start();
    }
}
