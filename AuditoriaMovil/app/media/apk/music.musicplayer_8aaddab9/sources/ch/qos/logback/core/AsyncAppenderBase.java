package ch.qos.logback.core;

import ch.qos.logback.core.spi.AppenderAttachable;
import ch.qos.logback.core.spi.AppenderAttachableImpl;
import ch.qos.logback.core.util.InterruptUtil;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
/* loaded from: classes.dex */
public class AsyncAppenderBase<E> extends UnsynchronizedAppenderBase<E> implements AppenderAttachable<E> {
    public static final int DEFAULT_MAX_FLUSH_TIME = 1000;
    public static final int DEFAULT_QUEUE_SIZE = 256;
    public static final int UNDEFINED = -1;
    public BlockingQueue<E> blockingQueue;
    public AppenderAttachableImpl<E> aai = new AppenderAttachableImpl<>();
    public int queueSize = 256;
    public int appenderCount = 0;
    public int discardingThreshold = -1;
    public boolean neverBlock = false;
    public AsyncAppenderBase<E>.a worker = new a();
    public int maxFlushTime = 1000;

    /* loaded from: classes.dex */
    public class a extends Thread {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AsyncAppenderBase asyncAppenderBase = AsyncAppenderBase.this;
            AppenderAttachableImpl<E> appenderAttachableImpl = asyncAppenderBase.aai;
            while (asyncAppenderBase.isStarted()) {
                try {
                    appenderAttachableImpl.appendLoopOnAppenders(asyncAppenderBase.blockingQueue.take());
                } catch (InterruptedException unused) {
                }
            }
            AsyncAppenderBase.this.addInfo("Worker thread will flush remaining events before exiting.");
            for (Object obj : asyncAppenderBase.blockingQueue) {
                appenderAttachableImpl.appendLoopOnAppenders(obj);
                asyncAppenderBase.blockingQueue.remove(obj);
            }
            appenderAttachableImpl.detachAndStopAllAppenders();
        }
    }

    private boolean isQueueBelowDiscardingThreshold() {
        return this.blockingQueue.remainingCapacity() < this.discardingThreshold;
    }

    private void put(E e2) {
        if (this.neverBlock) {
            this.blockingQueue.offer(e2);
        } else {
            putUninterruptibly(e2);
        }
    }

    private void putUninterruptibly(E e2) {
        boolean z = false;
        while (true) {
            try {
                this.blockingQueue.put(e2);
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public void addAppender(Appender<E> appender) {
        int i2 = this.appenderCount;
        if (i2 == 0) {
            this.appenderCount = i2 + 1;
            StringBuilder y = e.a.d.a.a.y("Attaching appender named [");
            y.append(appender.getName());
            y.append("] to AsyncAppender.");
            addInfo(y.toString());
            this.aai.addAppender(appender);
            return;
        }
        addWarn("One and only one appender may be attached to AsyncAppender.");
        addWarn("Ignoring additional appender named [" + appender.getName() + "]");
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase
    public void append(E e2) {
        if (isQueueBelowDiscardingThreshold() && isDiscardable(e2)) {
            return;
        }
        preprocess(e2);
        put(e2);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public void detachAndStopAllAppenders() {
        this.aai.detachAndStopAllAppenders();
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(Appender<E> appender) {
        return this.aai.detachAppender(appender);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(String str) {
        return this.aai.detachAppender(str);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Appender<E> getAppender(String str) {
        return this.aai.getAppender(str);
    }

    public int getDiscardingThreshold() {
        return this.discardingThreshold;
    }

    public int getMaxFlushTime() {
        return this.maxFlushTime;
    }

    public int getNumberOfElementsInQueue() {
        return this.blockingQueue.size();
    }

    public int getQueueSize() {
        return this.queueSize;
    }

    public int getRemainingCapacity() {
        return this.blockingQueue.remainingCapacity();
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean isAttached(Appender<E> appender) {
        return this.aai.isAttached(appender);
    }

    public boolean isDiscardable(E e2) {
        return false;
    }

    public boolean isNeverBlock() {
        return this.neverBlock;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Iterator<Appender<E>> iteratorForAppenders() {
        return this.aai.iteratorForAppenders();
    }

    public void preprocess(E e2) {
    }

    public void setDiscardingThreshold(int i2) {
        this.discardingThreshold = i2;
    }

    public void setMaxFlushTime(int i2) {
        this.maxFlushTime = i2;
    }

    public void setNeverBlock(boolean z) {
        this.neverBlock = z;
    }

    public void setQueueSize(int i2) {
        this.queueSize = i2;
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (isStarted()) {
            return;
        }
        if (this.appenderCount == 0) {
            addError("No attached appenders found.");
        } else if (this.queueSize < 1) {
            StringBuilder y = e.a.d.a.a.y("Invalid queue size [");
            y.append(this.queueSize);
            y.append("]");
            addError(y.toString());
        } else {
            this.blockingQueue = new ArrayBlockingQueue(this.queueSize);
            if (this.discardingThreshold == -1) {
                this.discardingThreshold = this.queueSize / 5;
            }
            StringBuilder y2 = e.a.d.a.a.y("Setting discardingThreshold to ");
            y2.append(this.discardingThreshold);
            addInfo(y2.toString());
            this.worker.setDaemon(true);
            AsyncAppenderBase<E>.a aVar = this.worker;
            StringBuilder y3 = e.a.d.a.a.y("AsyncAppender-Worker-");
            y3.append(getName());
            aVar.setName(y3.toString());
            super.start();
            this.worker.start();
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        if (isStarted()) {
            super.stop();
            this.worker.interrupt();
            InterruptUtil interruptUtil = new InterruptUtil(this.context);
            try {
                try {
                    interruptUtil.maskInterruptFlag();
                    this.worker.join(this.maxFlushTime);
                    if (this.worker.isAlive()) {
                        addWarn("Max queue flush timeout (" + this.maxFlushTime + " ms) exceeded. " + this.blockingQueue.size() + " queued events were possibly discarded.");
                    } else {
                        addInfo("Queue flush finished successfully within timeout.");
                    }
                } catch (InterruptedException e2) {
                    int size = this.blockingQueue.size();
                    addError("Failed to join worker thread. " + size + " queued events may be discarded.", e2);
                }
            } finally {
                interruptUtil.unmaskInterruptFlag();
            }
        }
    }
}
