package com.rovio.fusion;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class MultiThreadWrapper extends Updater {
    private int a;
    private UpdateThread b;

    public MultiThreadWrapper(NativeApplication nativeApplication) {
        super(nativeApplication);
        this.a = -1;
        this.b = new UpdateThread();
        this.b.start();
    }

    @Override // com.rovio.fusion.Updater
    public void initialize(int i, int i2) {
        Debug("initialize");
        this.b.initialize(i, i2);
    }

    @Override // com.rovio.fusion.Updater
    public boolean onFrame() {
        if (readyToRender()) {
            return this.mNative.nativeRender();
        }
        return false;
    }

    @Override // com.rovio.fusion.Updater
    public void onResize(int i, int i2) {
        Debug("onResize");
        this.b.onResize(i, i2);
    }

    @Override // com.rovio.fusion.Updater
    public void onPause() {
        Debug("onPause");
        this.b.onPause();
    }

    @Override // com.rovio.fusion.Updater
    public void onResume() {
        Debug("onResume");
        this.b.onResume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        this.mNative.queueGLEvent(new Runnable() { // from class: com.rovio.fusion.MultiThreadWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (this) {
                    MultiThreadWrapper.this.mNative.nativeFrameClear();
                    MultiThreadWrapper.this.mNative.doShutdown();
                }
            }
        });
        this.mNative.nativeInterruptRender();
    }

    /* loaded from: classes2.dex */
    private class UpdateThread extends Thread {
        private ArrayList<Runnable> b;

        private UpdateThread() {
            this.b = new ArrayList<>();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (InterruptedException e) {
            }
        }

        public synchronized void initialize(int i, int i2) {
            a(new Runnable() { // from class: com.rovio.fusion.MultiThreadWrapper.UpdateThread.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (this) {
                        EGLWrapper.registerThread(MultiThreadWrapper.this.a);
                    }
                }
            });
            MultiThreadWrapper.this.mNative.doInit(i, i2);
            int currentContext = EGLWrapper.getCurrentContext();
            MultiThreadWrapper.this.a = EGLWrapper.createSharedContext(currentContext);
        }

        public void onResize(final int i, final int i2) {
            b(new Runnable() { // from class: com.rovio.fusion.MultiThreadWrapper.UpdateThread.2
                @Override // java.lang.Runnable
                public void run() {
                    MultiThreadWrapper.this.mNative.doResize(i, i2);
                }
            });
        }

        public void onPause() {
            b(new Runnable() { // from class: com.rovio.fusion.MultiThreadWrapper.UpdateThread.3
                @Override // java.lang.Runnable
                public void run() {
                    MultiThreadWrapper.this.mNative.doPause();
                }
            });
        }

        public void onResume() {
            c(new Runnable() { // from class: com.rovio.fusion.MultiThreadWrapper.UpdateThread.4
                @Override // java.lang.Runnable
                public void run() {
                    MultiThreadWrapper.this.mNative.doResume();
                }
            });
        }

        private void a() {
            setName("UpdateThread " + getId());
            while (true) {
                b();
                if (!MultiThreadWrapper.this.mNative.isResumed()) {
                    c();
                } else if (!MultiThreadWrapper.this.mNative.doUpdate()) {
                    MultiThreadWrapper.this.a();
                }
            }
        }

        private void b() {
            synchronized (this.b) {
                if (!this.b.isEmpty()) {
                    Iterator<Runnable> it = this.b.iterator();
                    while (it.hasNext()) {
                        it.next().run();
                    }
                    this.b.clear();
                }
            }
        }

        private void c() {
            synchronized (this.b) {
                while (this.b.isEmpty()) {
                    this.b.wait();
                }
            }
        }

        private SyncToken a(final Runnable runnable) {
            final SyncToken syncToken = new SyncToken();
            synchronized (this.b) {
                this.b.add(new Runnable() { // from class: com.rovio.fusion.MultiThreadWrapper.UpdateThread.5
                    @Override // java.lang.Runnable
                    public void run() {
                        runnable.run();
                        syncToken.set();
                    }
                });
                this.b.notifyAll();
            }
            return syncToken;
        }

        private void b(Runnable runnable) {
            SyncToken a = a(runnable);
            MultiThreadWrapper.this.mNative.nativeFrameClear();
            a.waitFor();
        }

        private void c(Runnable runnable) {
            a(runnable).waitFor();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class SyncToken {
        private boolean b;

        private SyncToken() {
            this.b = false;
        }

        public synchronized void set() {
            this.b = true;
            notify();
        }

        public synchronized void waitFor() {
            while (!this.b) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
