package com.segment.analytics;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
/* loaded from: classes4.dex */
abstract class PayloadQueue implements Closeable {

    /* loaded from: classes4.dex */
    public interface ElementVisitor {
        boolean read(InputStream inputStream, int i) throws IOException;
    }

    /* loaded from: classes4.dex */
    public static class PersistentQueue extends PayloadQueue {
        final QueueFile queueFile;

        public PersistentQueue(QueueFile queueFile) {
            this.queueFile = queueFile;
        }

        @Override // com.segment.analytics.PayloadQueue
        public void add(byte[] bArr) throws IOException {
            this.queueFile.add(bArr);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.queueFile.close();
        }

        @Override // com.segment.analytics.PayloadQueue
        public void forEach(ElementVisitor elementVisitor) throws IOException {
            this.queueFile.forEach(elementVisitor);
        }

        @Override // com.segment.analytics.PayloadQueue
        public void remove(int i) throws IOException {
            try {
                this.queueFile.remove(i);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new IOException(e);
            }
        }

        @Override // com.segment.analytics.PayloadQueue
        public int size() {
            return this.queueFile.size();
        }
    }

    public abstract void add(byte[] bArr) throws IOException;

    public abstract void forEach(ElementVisitor elementVisitor) throws IOException;

    public abstract void remove(int i) throws IOException;

    public abstract int size();

    /* loaded from: classes4.dex */
    public static class MemoryQueue extends PayloadQueue {
        final LinkedList<byte[]> queue = new LinkedList<>();

        @Override // com.segment.analytics.PayloadQueue
        public void add(byte[] bArr) throws IOException {
            this.queue.add(bArr);
        }

        @Override // com.segment.analytics.PayloadQueue
        public void forEach(ElementVisitor elementVisitor) throws IOException {
            for (int i = 0; i < this.queue.size(); i++) {
                byte[] bArr = this.queue.get(i);
                if (!elementVisitor.read(new ByteArrayInputStream(bArr), bArr.length)) {
                    return;
                }
            }
        }

        @Override // com.segment.analytics.PayloadQueue
        public void remove(int i) throws IOException {
            for (int i2 = 0; i2 < i; i2++) {
                this.queue.remove();
            }
        }

        @Override // com.segment.analytics.PayloadQueue
        public int size() {
            return this.queue.size();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }
}
