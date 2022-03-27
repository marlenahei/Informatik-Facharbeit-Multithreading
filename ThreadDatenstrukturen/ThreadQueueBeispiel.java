class ThreadQueueBeispiel {
    public static void main(String[] args) {
        Queue<String> q = new Queue<String>();

        String[] arr1 = {"A", "B", "C"};
        FuelleQueueThread thread1 = new FuelleQueueThread(q, arr1);
        
        String[] arr2 = {"D"};
        FuelleQueueThread thread2 = new FuelleQueueThread(q, arr2);
        
        thread1.start();
        thread2.start();
    }
}

class FuelleQueueThread extends Thread {
    
    String[] content;
    Queue<String> queue;
    
    FuelleQueueThread(Queue<String> pQueue, String[] pContent) {
        queue = pQueue;
        content = pContent;
    }
    
    public void run() {
        for(int i = 0; i<content.length; i++) {
            queue.enqueue(content[i]);
        }
    }
}
