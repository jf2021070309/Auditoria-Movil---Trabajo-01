package com.fakerandroid.boot;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* loaded from: classes2.dex */
public class FakerActivity extends Activity implements JniBridge {
    static final int HANDLER_MSG_CALLJAVA = 1000;
    final Handler handler = new Handler(Looper.getMainLooper()) { // from class: com.fakerandroid.boot.FakerActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            if (msg.what == 1000) {
                String cmsg = (String) msg.obj;
                FakerActivity.this.callJava(cmsg);
            }
            super.handleMessage(msg);
        }
    };

    public native void registerCallBack(Object obj);

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(1);
        super.onCreate(savedInstanceState);
        registerCallBack(this);
    }

    @Override // com.fakerandroid.boot.JniBridge
    public void onJniCall(String msg) {
        Message message = new Message();
        message.what = 1000;
        message.obj = msg;
        this.handler.sendMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callJava(String msg) {
        Logger.log(msg);
    }
}
