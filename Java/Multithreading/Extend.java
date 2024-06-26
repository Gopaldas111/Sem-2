class PrintOddEven {
  private static int count = 1;
  private static final Object lock = new Object();

  private static class PrintOdd implements Runnable {
    public void run() {
      while (count <= 20) {
        synchronized (lock) {
          if (count % 2 != 0) {
            System.out.println("Odd: " + count);
            count++;
            lock.notify();
          } else {
            try {
              lock.wait();
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
        }
      }
    }
  }

  private static class PrintEven implements Runnable {
    public void run() {
      while (count <= 20) {
        synchronized (lock) {
          if (count % 2 == 0) {
            System.out.println("Even: " + count);
            count++;
            lock.notify();
          } else {
            try {
              lock.wait();
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    Thread oddThread = new Thread(new PrintOdd());
    Thread evenThread = new Thread(new PrintEven());
    oddThread.start();
    evenThread.start();
  }
}