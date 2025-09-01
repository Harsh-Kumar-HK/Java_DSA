package collectionFramework;

public class ThreadPriorityExample {
    static class MyRunnable implements Runnable {
        private String threadName;
        public MyRunnable(String name) {
            this.threadName = name;
        }
        @Override
        public void run() {
            System.out.println(threadName + " started with priority: " + Thread.currentThread().getPriority());
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("Thread is working : " +i);
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println(threadName + " finished.");
        }
    }

    public static void main(String[] args) {

        Thread highPriorityThread = new Thread(new MyRunnable("High Priority Thread"));
        Thread normalPriorityThread = new Thread(new MyRunnable("Normal Priority Thread"));
        Thread lowPriorityThread = new Thread(new MyRunnable("Low Priority Thread"));

        // maxpriority is already predefined in java as 10 , NORM_priority as 5 and MIN_PRIORITY as 1

        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        normalPriorityThread.setPriority(Thread.NORM_PRIORITY);
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);

        highPriorityThread.start();
        normalPriorityThread.start();
        lowPriorityThread.start();
    }
    }